package typings.rdflib

import org.scalablytyped.runtime.Shortcut
import typings.rdflib.collectionMod.Collection
import typings.rdflib.factoryTypesMod.DataFactory
import typings.rdflib.factoryTypesMod.DefaultFactoryTypes
import typings.rdflib.factoryTypesMod.Indexable
import typings.rdflib.typesMod.ValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extendedTermFactoryMod extends Shortcut {
  
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
    
    def collection(elements: js.Array[ValueType]): typings.rdflib.collectionMod.default[
        typings.rdflib.nodeInternalMod.default | typings.rdflib.blankNodeMod.default | Collection[Any] | typings.rdflib.literalMod.default | typings.rdflib.variableMod.default
      ] = js.native
  }
  
  type _To = CollectionFactory
  
  /* This means you don't have to write `default`, but can instead just say `extendedTermFactoryMod.foo` */
  override def _to: CollectionFactory = default
}
