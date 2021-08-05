package typings.rcTable

import typings.rcTable.anon.Expandable
import typings.rcTable.interfaceMod.ExpandableConfig
import typings.rcTable.interfaceMod.LegacyExpandableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legacyUtilMod {
  
  @JSImport("rc-table/lib/utils/legacyUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rc-table/lib/utils/legacyUtil", "INTERNAL_COL_DEFINE")
  @js.native
  val INTERNAL_COL_DEFINE: /* "RC_TABLE_INTERNAL_COL_DEFINE" */ String = js.native
  
  inline def getDataAndAriaProps(props: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getDataAndAriaProps")(props.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def getExpandableProps[RecordType](props: LegacyExpandableProps[RecordType] & Expandable[RecordType]): ExpandableConfig[RecordType] = ^.asInstanceOf[js.Dynamic].applyDynamic("getExpandableProps")(props.asInstanceOf[js.Any]).asInstanceOf[ExpandableConfig[RecordType]]
}
