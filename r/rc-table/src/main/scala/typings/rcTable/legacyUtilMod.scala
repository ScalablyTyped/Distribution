package typings.rcTable

import typings.rcTable.anon.Expandable
import typings.rcTable.interfaceMod.ExpandableConfig
import typings.rcTable.interfaceMod.LegacyExpandableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legacyUtilMod {
  
  @JSImport("rc-table/lib/utils/legacyUtil", "INTERNAL_COL_DEFINE")
  @js.native
  val INTERNAL_COL_DEFINE: /* "RC_TABLE_INTERNAL_COL_DEFINE" */ String = js.native
  
  @JSImport("rc-table/lib/utils/legacyUtil", "getDataAndAriaProps")
  @js.native
  def getDataAndAriaProps(props: js.Object): js.Object = js.native
  
  @JSImport("rc-table/lib/utils/legacyUtil", "getExpandableProps")
  @js.native
  def getExpandableProps[RecordType](props: LegacyExpandableProps[RecordType] with Expandable[RecordType]): ExpandableConfig[RecordType] = js.native
}
