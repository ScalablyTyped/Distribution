package typings.rcTreeSelect

import typings.rcTreeSelect.anon.FieldNames
import typings.rcTreeSelect.treeSelectMod.DefaultOptionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useFilterTreeDataMod {
  
  @JSImport("rc-tree-select/es/hooks/useFilterTreeData", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    treeData: js.Array[DefaultOptionType],
    searchValue: String,
    hasTreeNodeFilterPropFilterTreeNodeFieldNames: FieldNames
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(treeData.asInstanceOf[js.Any], searchValue.asInstanceOf[js.Any], hasTreeNodeFilterPropFilterTreeNodeFieldNames.asInstanceOf[js.Any])).asInstanceOf[Any]
}
