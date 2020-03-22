package typings.rcTable

import typings.rcTable.interfaceMod.GetRowKey
import typings.rcTable.interfaceMod.Key
import typings.rcTable.interfaceMod.RenderExpandIconProps
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rc-table/lib/utils/expandUtil", JSImport.Namespace)
@js.native
object expandUtilMod extends js.Object {
  def findAllChildrenKeys[RecordType](data: js.Array[RecordType], getRowKey: GetRowKey[RecordType]): js.Array[Key] = js.native
  def renderExpandIcon[RecordType](hasPrefixClsRecordOnExpandExpandedExpandable: RenderExpandIconProps[RecordType]): Element = js.native
}

