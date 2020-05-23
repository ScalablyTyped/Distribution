package typings.rdflib.mod

import typings.rdflib.nodeMod.default
import typings.rdflib.typesMod.FromValueReturns
import typings.rdflib.typesMod.ValueType
import typings.std.Date
import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib", "Node")
@js.native
abstract class Node protected () extends default {
  protected def this(value: String) = this()
}

/* static members */
@JSImport("rdflib", "Node")
@js.native
object Node extends js.Object {
  def fromValue[T /* <: FromValueReturns[_] */](value: ValueType): T = js.native
  def toJS(term: js.Any): Date | Number | String | Boolean | js.Object | (js.Array[Date | Number | String | Boolean | js.Object]) = js.native
}

