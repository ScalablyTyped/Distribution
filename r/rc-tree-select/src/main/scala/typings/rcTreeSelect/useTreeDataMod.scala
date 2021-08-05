package typings.rcTreeSelect

import typings.rcTreeSelect.anon.GetLabelProp
import typings.rcTreeSelect.interfaceMod.DataNode
import typings.rcTreeSelect.interfaceMod.InnerDataNode
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useTreeDataMod {
  
  @JSImport("rc-tree-select/es/hooks/useTreeData", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(treeData: js.Array[DataNode], children: ReactNode, hasGetLabelPropSimpleMode: GetLabelProp): js.Array[InnerDataNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(treeData.asInstanceOf[js.Any], children.asInstanceOf[js.Any], hasGetLabelPropSimpleMode.asInstanceOf[js.Any])).asInstanceOf[js.Array[InnerDataNode]]
}
