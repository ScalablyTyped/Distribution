package typings.rdfjsTraverser

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.rdfjsTraverser.anon.OmitOptionsfactory
import typings.rdfjsTraverser.rdfjsTraverserStrings.traverser
import typings.rdfjsTraverser.traverserMod.TraversePredicate
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.datasetMod.DatasetCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object factoryMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@rdfjs/traverser/Factory", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with TraverserFactory
  @JSImport("@rdfjs/traverser/Factory", JSImport.Default)
  @js.native
  val default: TraverserFactoryCtor = js.native
  
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
    This extends @rdfjs/traverser.@rdfjs/traverser/Factory.DatasetFactory ? std.ReturnType<This['dataset']> : never
    }}}
    */
  @js.native
  trait ExtractDataset[This] extends StObject
  
  @js.native
  trait TraverserFactory extends StObject {
    
    def traverser[D /* <: DatasetCore[Quad, Quad] */](filter: TraversePredicate[D]): typings.rdfjsTraverser.traverserMod.default[D] = js.native
    def traverser[D /* <: DatasetCore[Quad, Quad] */](filter: TraversePredicate[D], options: OmitOptionsfactory): typings.rdfjsTraverser.traverserMod.default[D] = js.native
  }
  
  @js.native
  trait TraverserFactoryCtor
    extends StObject
       with Instantiable0[TraverserFactory] {
    
    var exports: js.Array[traverser] = js.native
  }
  
  type _To = TraverserFactoryCtor
  
  /* This means you don't have to write `default`, but can instead just say `factoryMod.foo` */
  override def _to: TraverserFactoryCtor = default
}
