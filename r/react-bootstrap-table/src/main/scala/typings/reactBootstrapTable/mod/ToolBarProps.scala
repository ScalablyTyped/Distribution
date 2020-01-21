package typings.reactBootstrapTable.mod

import typings.reactBootstrapTable.AnonBtnGroup
import typings.reactBootstrapTable.AnonCloseInsertModal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolBarProps extends js.Object {
  /**
  	 * Rendered components to use in the toolbar.
  	 */
  var components: ButtonGroupProps with AnonBtnGroup
  /**
  	 * Event callbacks to use with a custom toolbar.
  	 */
  var event: AnonCloseInsertModal
}

object ToolBarProps {
  @scala.inline
  def apply(components: ButtonGroupProps with AnonBtnGroup, event: AnonCloseInsertModal): ToolBarProps = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ToolBarProps]
  }
}

