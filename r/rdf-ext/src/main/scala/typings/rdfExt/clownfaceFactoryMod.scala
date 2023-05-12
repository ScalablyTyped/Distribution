package typings.rdfExt

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.clownface.mod.AnyContext
import typings.clownface.mod.AnyPointer
import typings.clownface.mod.ClownfaceInit
import typings.clownface.mod.ClownfaceInitWithTerms
import typings.clownface.mod.ClownfaceInitWithValue
import typings.clownface.mod.ClownfaceInitWithValues
import typings.rdfExt.rdfExtStrings.clownface
import typings.rdfjsTypes.dataModelMod.Literal
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.dataModelMod.Term
import typings.rdfjsTypes.datasetMod.DatasetCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clownfaceFactoryMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rdf-ext/ClownfaceFactory", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ClownfaceFactory
  @JSImport("rdf-ext/ClownfaceFactory", JSImport.Default)
  @js.native
  val default: ClownfaceFactoryCtor = js.native
  
  @js.native
  trait ClownfaceFactory extends StObject {
    
    def clownface[D /* <: DatasetCore[Quad, Quad] */](): AnyPointer[AnyContext, D] = js.native
    def clownface[D /* <: DatasetCore[Quad, Quad] */](options: ClownfaceInit[D]): AnyPointer[AnyContext, D] = js.native
    def clownface[D /* <: DatasetCore[Quad, Quad] */](options: ClownfaceInitWithValue[D]): AnyPointer[Literal, D] = js.native
    def clownface[D /* <: DatasetCore[Quad, Quad] */](options: ClownfaceInitWithValues[D]): AnyPointer[js.Array[Literal], D] = js.native
    def clownface[T /* <: Term | js.Array[Term] */, D /* <: DatasetCore[Quad, Quad] */](options: ClownfaceInitWithTerms[T, D]): AnyPointer[T, D] = js.native
    def clownface[T /* <: AnyContext */, D /* <: DatasetCore[Quad, Quad] */](other: AnyPointer[T, D]): AnyPointer[T, D] = js.native
  }
  
  @js.native
  trait ClownfaceFactoryCtor
    extends StObject
       with Instantiable0[ClownfaceFactory] {
    
    var exports: js.Array[clownface] = js.native
  }
  
  trait DatasetFactory extends StObject {
    
    def dataset(): DatasetCore[Quad, Quad]
  }
  object DatasetFactory {
    
    inline def apply(dataset: () => DatasetCore[Quad, Quad]): DatasetFactory = {
      val __obj = js.Dynamic.literal(dataset = js.Any.fromFunction0(dataset))
      __obj.asInstanceOf[DatasetFactory]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DatasetFactory] (val x: Self) extends AnyVal {
      
      inline def setDataset(value: () => DatasetCore[Quad, Quad]): Self = StObject.set(x, "dataset", js.Any.fromFunction0(value))
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    This extends rdf-ext.rdf-ext/ClownfaceFactory.DatasetFactory ? std.ReturnType<This['dataset']> : never
    }}}
    */
  @js.native
  trait ExtractDataset[This] extends StObject
  
  type _To = ClownfaceFactoryCtor
  
  /* This means you don't have to write `default`, but can instead just say `clownfaceFactoryMod.foo` */
  override def _to: ClownfaceFactoryCtor = default
}
