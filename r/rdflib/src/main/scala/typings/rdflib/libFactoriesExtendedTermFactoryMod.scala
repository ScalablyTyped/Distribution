package typings.rdflib

import org.scalablytyped.runtime.Shortcut
import typings.rdflib.libCollectionMod.Collection
import typings.rdflib.libFactoriesFactoryTypesMod.DataFactory
import typings.rdflib.libFactoriesFactoryTypesMod.DefaultFactoryTypes
import typings.rdflib.libFactoriesFactoryTypesMod.Indexable
import typings.rdflib.libTypesMod.ValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFactoriesExtendedTermFactoryMod extends Shortcut {
  
  /**
    * Data factory which also supports Collections
    *
    * Necessary for preventing circular dependencies.
    */
  @JSImport("rdflib/lib/factories/extended-term-factory", JSImport.Default)
  @js.native
  val default: CollectionFactory = js.native
  
  @js.native
  trait CollectionFactory
    extends StObject
       with DataFactory[DefaultFactoryTypes, Indexable] {
    
    def collection(elements: js.Array[ValueType]): typings.rdflib.libCollectionMod.default[
        typings.rdflib.libNodeInternalMod.default | typings.rdflib.libBlankNodeMod.default | Collection[Any] | typings.rdflib.libLiteralMod.default | typings.rdflib.libVariableMod.default
      ] = js.native
  }
  
  type _To = CollectionFactory
  
  /* This means you don't have to write `default`, but can instead just say `libFactoriesExtendedTermFactoryMod.foo` */
  override def _to: CollectionFactory = default
}
