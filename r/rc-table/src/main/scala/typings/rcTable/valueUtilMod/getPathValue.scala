package typings.rcTable.valueUtilMod

import typings.rcTable.interfaceMod.DataIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-table/lib/utils/valueUtil", "getPathValue")
@js.native
object getPathValue extends js.Object {
  def apply[ValueType, ObjectType /* <: js.Object */](record: ObjectType, path: DataIndex): ValueType = js.native
}

