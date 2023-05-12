package typings.rdfExt

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.rdfExt.libDatasetMod.DatasetExt
import typings.rdfExt.rdfExtStrings.dataset
import typings.rdfjsTypes.dataModelMod.DefaultGraph
import typings.rdfjsTypes.dataModelMod.NamedNode
import typings.rdfjsTypes.dataModelMod.Quad
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datasetFactoryMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rdf-ext/DatasetFactory", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with DatasetFactory
  @JSImport("rdf-ext/DatasetFactory", JSImport.Default)
  @js.native
  val default: DatasetFactoryCtor = js.native
  
  @js.native
  trait DatasetFactory extends StObject {
    
    def dataset(): DatasetExt = js.native
    def dataset(quads: js.Array[Quad]): DatasetExt = js.native
    def dataset(quads: js.Array[Quad], graph: DefaultGraph): DatasetExt = js.native
    def dataset(quads: js.Array[Quad], graph: NamedNode[String]): DatasetExt = js.native
    def dataset(quads: Unit, graph: DefaultGraph): DatasetExt = js.native
    def dataset(quads: Unit, graph: NamedNode[String]): DatasetExt = js.native
  }
  
  @js.native
  trait DatasetFactoryCtor
    extends StObject
       with Instantiable0[DatasetFactory] {
    
    var exports: js.Array[dataset] = js.native
  }
  
  type _To = DatasetFactoryCtor
  
  /* This means you don't have to write `default`, but can instead just say `datasetFactoryMod.foo` */
  override def _to: DatasetFactoryCtor = default
}
