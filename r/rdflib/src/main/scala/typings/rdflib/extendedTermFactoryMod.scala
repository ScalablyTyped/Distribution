package typings.rdflib

import typings.rdflib.collectionMod.Collection
import typings.rdflib.factoryTypesMod.DataFactory
import typings.rdflib.factoryTypesMod.DefaultFactoryTypes
import typings.rdflib.factoryTypesMod.Indexable
import typings.rdflib.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib/lib/factories/extended-term-factory", JSImport.Namespace)
@js.native
object extendedTermFactoryMod extends js.Object {
  @js.native
  trait CollectionFactory extends DataFactory[DefaultFactoryTypes, Indexable] {
    def collection(elements: js.Array[ValueType]): typings.rdflib.collectionMod.default[
        typings.rdflib.nodeInternalMod.default | typings.rdflib.blankNodeMod.default | Collection[_] | typings.rdflib.literalMod.default | typings.rdflib.variableMod.default
      ] = js.native
  }
  
  /**
    * Data factory which also supports Collections
    *
    * Necessary for preventing circular dependencies.
    */
  val default: CollectionFactory = js.native
}

