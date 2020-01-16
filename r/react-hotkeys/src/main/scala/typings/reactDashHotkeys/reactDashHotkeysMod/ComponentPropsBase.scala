package typings.reactDashHotkeys.reactDashHotkeysMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentPropsBase extends js.Object {
  /**
    * The value of the HTML tabindex attribute the root node will have
    */
  var tabIndex: TabIndex
  /**
    * Function to bind to root node, in order for react-hotkeys to work
    */
  def onBlur(): Unit
  /**
    * Function to bind to root node, in order for react-hotkeys to work
    */
  def onFocus(): Unit
}

object ComponentPropsBase {
  @scala.inline
  def apply(onBlur: () => Unit, onFocus: () => Unit, tabIndex: TabIndex): ComponentPropsBase = {
    val __obj = js.Dynamic.literal(onBlur = js.Any.fromFunction0(onBlur), onFocus = js.Any.fromFunction0(onFocus), tabIndex = tabIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ComponentPropsBase]
  }
}

