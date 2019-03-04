package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToolBarProps extends js.Object {
  /**
  	 * Rendered components to use in the toolbar.
  	 */
  var components: ButtonGroupProps with reactDashBootstrapDashTableLib.Anon_BtnGroup
  /**
  	 * Event callbacks to use with a custom toolbar.
  	 */
  var event: reactDashBootstrapDashTableLib.Anon_CloseInsertModal
}

object ToolBarProps {
  @scala.inline
  def apply(
    components: ButtonGroupProps with reactDashBootstrapDashTableLib.Anon_BtnGroup,
    event: reactDashBootstrapDashTableLib.Anon_CloseInsertModal
  ): ToolBarProps = {
    val __obj = js.Dynamic.literal(components = components, event = event)
  
    __obj.asInstanceOf[ToolBarProps]
  }
}

