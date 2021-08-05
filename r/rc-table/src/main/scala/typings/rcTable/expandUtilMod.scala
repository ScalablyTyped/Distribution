package typings.rcTable

import typings.rcTable.interfaceMod.GetRowKey
import typings.rcTable.interfaceMod.Key
import typings.rcTable.interfaceMod.RenderExpandIconProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expandUtilMod {
  
  @JSImport("rc-table/lib/utils/expandUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findAllChildrenKeys[RecordType](data: js.Array[RecordType], getRowKey: GetRowKey[RecordType], childrenColumnName: String): js.Array[Key] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAllChildrenKeys")(data.asInstanceOf[js.Any], getRowKey.asInstanceOf[js.Any], childrenColumnName.asInstanceOf[js.Any])).asInstanceOf[js.Array[Key]]
  
  inline def renderExpandIcon[RecordType](hasPrefixClsRecordOnExpandExpandedExpandable: RenderExpandIconProps[RecordType]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("renderExpandIcon")(hasPrefixClsRecordOnExpandExpandedExpandable.asInstanceOf[js.Any]).asInstanceOf[Element]
}
