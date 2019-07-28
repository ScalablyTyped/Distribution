package typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod

import typings.reactDashBootstrapDashTable.Anon_BtnGroup
import typings.reactDashBootstrapDashTable.Anon_CloseInsertModal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolBarProps extends js.Object {
  /**
  	 * Rendered components to use in the toolbar.
  	 */
  var components: ButtonGroupProps with Anon_BtnGroup
  /**
  	 * Event callbacks to use with a custom toolbar.
  	 */
  var event: Anon_CloseInsertModal
}

object ToolBarProps {
  @scala.inline
  def apply(components: ButtonGroupProps with Anon_BtnGroup, event: Anon_CloseInsertModal): ToolBarProps = {
    val __obj = js.Dynamic.literal(components = components, event = event)
  
    __obj.asInstanceOf[ToolBarProps]
  }
}

