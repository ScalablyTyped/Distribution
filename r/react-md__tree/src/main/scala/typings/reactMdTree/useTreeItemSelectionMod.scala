package typings.reactMdTree

import typings.reactMdTree.anon.RequiredTreeItemSelection
import typings.reactMdTree.typesMod.SelectedIds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useTreeItemSelectionMod {
  
  @JSImport("@react-md/tree/types/useTreeItemSelection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useTreeItemSelection(defaultSelectedIds: js.Function0[SelectedIds]): RequiredTreeItemSelection = ^.asInstanceOf[js.Dynamic].applyDynamic("useTreeItemSelection")(defaultSelectedIds.asInstanceOf[js.Any]).asInstanceOf[RequiredTreeItemSelection]
  @scala.inline
  def useTreeItemSelection(defaultSelectedIds: js.Function0[SelectedIds], multiSelect: Boolean): RequiredTreeItemSelection = (^.asInstanceOf[js.Dynamic].applyDynamic("useTreeItemSelection")(defaultSelectedIds.asInstanceOf[js.Any], multiSelect.asInstanceOf[js.Any])).asInstanceOf[RequiredTreeItemSelection]
  @scala.inline
  def useTreeItemSelection(defaultSelectedIds: SelectedIds): RequiredTreeItemSelection = ^.asInstanceOf[js.Dynamic].applyDynamic("useTreeItemSelection")(defaultSelectedIds.asInstanceOf[js.Any]).asInstanceOf[RequiredTreeItemSelection]
  @scala.inline
  def useTreeItemSelection(defaultSelectedIds: SelectedIds, multiSelect: Boolean): RequiredTreeItemSelection = (^.asInstanceOf[js.Dynamic].applyDynamic("useTreeItemSelection")(defaultSelectedIds.asInstanceOf[js.Any], multiSelect.asInstanceOf[js.Any])).asInstanceOf[RequiredTreeItemSelection]
}
