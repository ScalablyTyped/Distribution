package typings.promiseAbortable

import typings.std.Promise
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("promise-abortable", JSImport.Namespace)
  @js.native
  open class ^[T] protected ()
    extends StObject
       with AbortablePromise[T] {
    def this(executor: Executor[T]) = this()
  }
  @JSImport("promise-abortable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def all[T](values: js.Array[T | PromiseLike[T]]): AbortablePromise[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[AbortablePromise[js.Array[T]]]
  /* static member */
  inline def all[T1, T2](values: js.Tuple2[T1 | PromiseLike[T1], T2 | PromiseLike[T2]]): AbortablePromise[js.Tuple2[T1, T2]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[AbortablePromise[js.Tuple2[T1, T2]]]
  /* static member */
  inline def all[T1, T2, T3](values: js.Tuple3[T1 | PromiseLike[T1], T2 | PromiseLike[T2], T3 | PromiseLike[T3]]): AbortablePromise[js.Tuple3[T1, T2, T3]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[AbortablePromise[js.Tuple3[T1, T2, T3]]]
  /* static member */
  inline def all[T1, T2, T3, T4](
    values: js.Tuple4[T1 | PromiseLike[T1], T2 | PromiseLike[T2], T3 | PromiseLike[T3], T4 | PromiseLike[T4]]
  ): AbortablePromise[js.Tuple4[T1, T2, T3, T4]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[AbortablePromise[js.Tuple4[T1, T2, T3, T4]]]
  /* static member */
  inline def all[T1, T2, T3, T4, T5](
    values: js.Tuple5[
      T1 | PromiseLike[T1], 
      T2 | PromiseLike[T2], 
      T3 | PromiseLike[T3], 
      T4 | PromiseLike[T4], 
      T5 | PromiseLike[T5]
    ]
  ): AbortablePromise[js.Tuple5[T1, T2, T3, T4, T5]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[AbortablePromise[js.Tuple5[T1, T2, T3, T4, T5]]]
  /* static member */
  inline def all[T1, T2, T3, T4, T5, T6](
    values: js.Tuple6[
      T1 | PromiseLike[T1], 
      T2 | PromiseLike[T2], 
      T3 | PromiseLike[T3], 
      T4 | PromiseLike[T4], 
      T5 | PromiseLike[T5], 
      T6 | PromiseLike[T6]
    ]
  ): AbortablePromise[js.Tuple6[T1, T2, T3, T4, T5, T6]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[AbortablePromise[js.Tuple6[T1, T2, T3, T4, T5, T6]]]
  /* static member */
  inline def all[T1, T2, T3, T4, T5, T6, T7](
    values: js.Tuple7[
      T1 | PromiseLike[T1], 
      T2 | PromiseLike[T2], 
      T3 | PromiseLike[T3], 
      T4 | PromiseLike[T4], 
      T5 | PromiseLike[T5], 
      T6 | PromiseLike[T6], 
      T7 | PromiseLike[T7]
    ]
  ): AbortablePromise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[AbortablePromise[js.Tuple7[T1, T2, T3, T4, T5, T6, T7]]]
  /* static member */
  inline def all[T1, T2, T3, T4, T5, T6, T7, T8](
    values: js.Tuple8[
      T1 | PromiseLike[T1], 
      T2 | PromiseLike[T2], 
      T3 | PromiseLike[T3], 
      T4 | PromiseLike[T4], 
      T5 | PromiseLike[T5], 
      T6 | PromiseLike[T6], 
      T7 | PromiseLike[T7], 
      T8 | PromiseLike[T8]
    ]
  ): AbortablePromise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[AbortablePromise[js.Tuple8[T1, T2, T3, T4, T5, T6, T7, T8]]]
  /* static member */
  inline def all[T1, T2, T3, T4, T5, T6, T7, T8, T9](
    values: js.Tuple9[
      T1 | PromiseLike[T1], 
      T2 | PromiseLike[T2], 
      T3 | PromiseLike[T3], 
      T4 | PromiseLike[T4], 
      T5 | PromiseLike[T5], 
      T6 | PromiseLike[T6], 
      T7 | PromiseLike[T7], 
      T8 | PromiseLike[T8], 
      T9 | PromiseLike[T9]
    ]
  ): AbortablePromise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[AbortablePromise[js.Tuple9[T1, T2, T3, T4, T5, T6, T7, T8, T9]]]
  /* static member */
  inline def all[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10](
    values: js.Tuple10[
      T1 | PromiseLike[T1], 
      T2 | PromiseLike[T2], 
      T3 | PromiseLike[T3], 
      T4 | PromiseLike[T4], 
      T5 | PromiseLike[T5], 
      T6 | PromiseLike[T6], 
      T7 | PromiseLike[T7], 
      T8 | PromiseLike[T8], 
      T9 | PromiseLike[T9], 
      T10 | PromiseLike[T10]
    ]
  ): AbortablePromise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[AbortablePromise[js.Tuple10[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10]]]
  
  /* static member */
  inline def race[T](values: js.Array[T]): AbortablePromise[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends std.PromiseLike<infer U> ? U : T */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("race")(values.asInstanceOf[js.Any]).asInstanceOf[AbortablePromise[
    /* import warning: importer.ImportType#apply Failed type conversion: T extends std.PromiseLike<infer U> ? U : T */ js.Any
  ]]
  
  trait AbortSignal extends StObject {
    
    val aborted: Boolean
    
    def onabort(reason: Any): Unit
  }
  object AbortSignal {
    
    inline def apply(aborted: Boolean, onabort: Any => Unit): AbortSignal = {
      val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], onabort = js.Any.fromFunction1(onabort))
      __obj.asInstanceOf[AbortSignal]
    }
    
    extension [Self <: AbortSignal](x: Self) {
      
      inline def setAborted(value: Boolean): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
      
      inline def setOnabort(value: Any => Unit): Self = StObject.set(x, "onabort", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait AbortablePromise[T]
    extends StObject
       with Promise[T] {
    
    def abort(): AbortablePromise[T] = js.native
    def abort(reason: Any): AbortablePromise[T] = js.native
  }
  
  type Executor[T] = js.Function3[
    /* resolve */ js.Function1[/* value */ js.UndefOr[T | PromiseLike[T]], Unit], 
    /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
    /* signal */ typings.std.AbortSignal, 
    Unit
  ]
}
