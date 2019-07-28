package typings.reactDashBootstrapDashTable.reactDashBootstrapDashTableMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps extends js.Object {
  /**
  	 * Bootstrap css style class for the button, e.g. 'btn-warning'
  	 */
  var btnContextual: js.UndefOr[String] = js.undefined
  /**
  	 * Glyphicon glyph string for the button, e.g. 'glyphicon-edit'
  	 */
  var btnGlyphicon: js.UndefOr[String] = js.undefined
  /**
  	 * Label for the button
  	 */
  var btnText: js.UndefOr[String] = js.undefined
  /**
  	 * Custom class for the button
  	 */
  var className: js.UndefOr[String] = js.undefined
  /**
  	 * Function to be called to activate the normal onClick functionality for this button.
  	 */
  var onClick: js.UndefOr[js.Function1[/* e */ MouseEvent[_, NativeMouseEvent], Unit]] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    btnContextual: String = null,
    btnGlyphicon: String = null,
    btnText: String = null,
    className: String = null,
    onClick: /* e */ MouseEvent[_, NativeMouseEvent] => Unit = null
  ): ButtonProps = {
    val __obj = js.Dynamic.literal()
    if (btnContextual != null) __obj.updateDynamic("btnContextual")(btnContextual)
    if (btnGlyphicon != null) __obj.updateDynamic("btnGlyphicon")(btnGlyphicon)
    if (btnText != null) __obj.updateDynamic("btnText")(btnText)
    if (className != null) __obj.updateDynamic("className")(className)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[ButtonProps]
  }
}

