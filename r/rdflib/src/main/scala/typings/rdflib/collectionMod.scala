package typings.rdflib

import typings.rdflib.factoryTypesMod._Comparable
import typings.rdflib.factoryTypesMod._TFIDFactoryTypes
import typings.rdflib.tfTypesMod.QuadObject
import typings.rdflib.typesMod.FromValueReturns
import typings.rdflib.typesMod.ValueType
import typings.rdflib.typesMod._FromValueReturns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib/lib/collection", JSImport.Namespace)
@js.native
object collectionMod extends js.Object {
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.rdflib.typesMod._ValueType because Already inherited
  - typings.rdflib.tfTypesMod.Term because var conflicts: termType, value. Inlined  */ @js.native
  trait Collection[T /* <: typings.rdflib.nodeInternalMod.default */]
    extends typings.rdflib.nodeInternalMod.default
       with QuadObject
       with _Comparable
       with _FromValueReturns[js.Any]
       with _TFIDFactoryTypes {
    var closed: Boolean = js.native
    /**
      * The nodes in this collection
      */
    var elements: js.Array[T] = js.native
    var isVar: Double = js.native
    @JSName("termType")
    var termType_Collection: typings.rdflib.rdflibStrings.Collection = js.native
    /**
      * Appends an element to this collection
      * @param element - The new element
      */
    def append(element: T): Double = js.native
    /**
      * Closes this collection
      */
    def close(): Boolean = js.native
    def compareTerm(other: typings.rdflib.blankNodeMod.default): Double = js.native
    def id: String = js.native
    def id_=(value: String): Unit = js.native
    /**
      * Removes the first element from the collection (and return it)
      */
    def shift(): js.UndefOr[T] = js.native
    /**
      * Prepends the specified element to the collection's front
      * @param element - The element to prepend
      */
    def unshift(element: T): Double = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.rdflib.typesMod._FromValueReturns because Already inherited */ @js.native
  class default[T /* <: typings.rdflib.nodeInternalMod.default */] () extends Collection[T] {
    def this(initial: js.Array[ValueType]) = this()
  }
  
  def fromValue[T /* <: FromValueReturns[C] */, C /* <: typings.rdflib.nodeInternalMod.default */](value: ValueType): T = js.native
  /* static members */
  @js.native
  object default extends js.Object {
    var termType: typings.rdflib.rdflibStrings.Collection = js.native
    def toNT(collection: js.Any): String = js.native
  }
  
}

