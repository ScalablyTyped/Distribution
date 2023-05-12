package typings.staticKdtree

import typings.staticKdtree.anon.FnCall
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[D /* <: Double */](points: js.Array[TupleOf[Double, D]]): KDTree[D] = ^.asInstanceOf[js.Dynamic].apply(points.asInstanceOf[js.Any]).asInstanceOf[KDTree[D]]
  inline def apply[D /* <: Double */](points: TNdarray): KDTree[D] = ^.asInstanceOf[js.Dynamic].apply(points.asInstanceOf[js.Any]).asInstanceOf[KDTree[D]]
  
  @JSImport("static-kdtree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserialize[D /* <: Double */](data: ISerialized[D]): KDTree[D] = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(data.asInstanceOf[js.Any]).asInstanceOf[KDTree[D]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.staticKdtree.anon.I[D]
    - typings.staticKdtree.anon.D
  */
  trait ISerialized[D /* <: Double */] extends StObject
  object ISerialized {
    
    inline def D(d: Double): typings.staticKdtree.anon.D = {
      val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.staticKdtree.anon.D]
    }
    
    inline def I[D /* <: Double */](i: js.Array[Double], p: js.Array[TupleOf[Double, D]]): typings.staticKdtree.anon.I[D] = {
      val __obj = js.Dynamic.literal(i = i.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.staticKdtree.anon.I[D]]
    }
  }
  
  @js.native
  trait KDTree[D /* <: Double */] extends StObject {
    
    val dimension: Double = js.native
    
    def dispose(): Unit = js.native
    
    def knn(point: TupleOf[Double, D]): js.Array[Double] = js.native
    def knn(point: TupleOf[Double, D], maxPoints: Double): js.Array[Double] = js.native
    def knn(point: TupleOf[Double, D], maxPoints: Double, maxDistance: Double): js.Array[Double] = js.native
    def knn(point: TupleOf[Double, D], maxPoints: Unit, maxDistance: Double): js.Array[Double] = js.native
    
    val length: Double = js.native
    
    def nn(point: TupleOf[Double, D]): Double = js.native
    def nn(point: TupleOf[Double, D], maxDistance: Double): Double = js.native
    
    def range(lo: js.Array[Double], hi: js.Array[Double], visit: TVisitor): Double = js.native
    
    def rnn(point: TupleOf[Double, D], radius: Double, visit: TVisitor): Unit = js.native
    
    def serialize(): ISerialized[D] = js.native
  }
  
  type TNdarray = ReturnType[FnCall]
  
  type TVisitor = js.Function1[/* id */ Double, Any]
  
  // ref: https://github.com/microsoft/TypeScript/pull/40002
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    N extends N ? number extends N ? std.Array<T> : static-kdtree.static-kdtree._TupleOf<T, N, []> : never
    }}}
    */
  type TupleOf[T, N /* <: Double */] = js.Array[T]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    R['length'] extends N ? R : static-kdtree.static-kdtree._TupleOf<T, N, [T, ...R]>
    }}}
    */
  type _TupleOf[T, N /* <: Double */, R /* <: js.Array[Any] */] = R
}
