package typings.rcTreeSelect

import typings.rcTreeSelect.esInterfaceMod.DataNode
import typings.rcTreeSelect.esInterfaceMod.SimpleModeConfig
import typings.rcTreeSelect.esTreeSelectMod.DefaultOptionType
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseTreeDataMod {
  
  @JSImport("rc-tree-select/es/hooks/useTreeData", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(treeData: js.Array[DataNode], children: ReactNode, simpleMode: Boolean): js.Array[DefaultOptionType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(treeData.asInstanceOf[js.Any], children.asInstanceOf[js.Any], simpleMode.asInstanceOf[js.Any])).asInstanceOf[js.Array[DefaultOptionType]]
  inline def default(treeData: js.Array[DataNode], children: ReactNode, simpleMode: SimpleModeConfig): js.Array[DefaultOptionType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(treeData.asInstanceOf[js.Any], children.asInstanceOf[js.Any], simpleMode.asInstanceOf[js.Any])).asInstanceOf[js.Array[DefaultOptionType]]
}
