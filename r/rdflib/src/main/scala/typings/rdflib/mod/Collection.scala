package typings.rdflib.mod

import typings.rdflib.nodeInternalMod.default
import typings.rdflib.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "Collection")
@js.native
class Collection[T /* <: default */] ()
  extends typings.rdflib.collectionMod.default[T] {
  def this(initial: js.Array[ValueType]) = this()
}

/* static members */
@JSImport("rdflib", "Collection")
@js.native
object Collection extends js.Object {
  var termType: typings.rdflib.rdflibStrings.Collection = js.native
  def toNT(collection: js.Any): String = js.native
}

