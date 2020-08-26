package typings.rdflib.nodeInternalMod

import typings.rdflib.typesMod.FromValueReturns
import typings.rdflib.typesMod.ValueType
import typings.rdflib.typesMod._ValueType
import typings.std.Date
import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rdflib/lib/node-internal", JSImport.Default)
@js.native
abstract class default protected ()
  extends Node
     with _ValueType {
  protected def this(value: String) = this()
}

/* static members */
@JSImport("rdflib/lib/node-internal", JSImport.Default)
@js.native
object default extends js.Object {
  def fromValue[T /* <: FromValueReturns[_] */](value: ValueType): T = js.native
  def toJS(term: js.Any): Date | Number | String | Boolean | js.Object | (js.Array[Date | Number | String | Boolean | js.Object]) = js.native
}

