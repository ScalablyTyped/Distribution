package typings.reactMdTree

import typings.reactMdTree.typesMod.ExpandedIds
import typings.reactMdTree.typesMod.TreeItemExpansion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useTreeItemExpansionMod {
  
  @JSImport("@react-md/tree/types/useTreeItemExpansion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useTreeItemExpansion(defaultExpandedIds: js.Function0[ExpandedIds]): TreeItemExpansion = ^.asInstanceOf[js.Dynamic].applyDynamic("useTreeItemExpansion")(defaultExpandedIds.asInstanceOf[js.Any]).asInstanceOf[TreeItemExpansion]
  @scala.inline
  def useTreeItemExpansion(defaultExpandedIds: ExpandedIds): TreeItemExpansion = ^.asInstanceOf[js.Dynamic].applyDynamic("useTreeItemExpansion")(defaultExpandedIds.asInstanceOf[js.Any]).asInstanceOf[TreeItemExpansion]
}
