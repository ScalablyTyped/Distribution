package typings
package reactDashBootstrapDashTableLib.reactDashBootstrapDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps extends js.Object {
  /**
  	 * Bootstrap css style class for the button, e.g. 'btn-warning'
  	 */
  var btnContextual: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Glyphicon glyph string for the button, e.g. 'glyphicon-edit'
  	 */
  var btnGlyphicon: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Label for the button
  	 */
  var btnText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Custom class for the button
  	 */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Function to be called to activate the normal onClick functionality for this button.
  	 */
  var onClick: js.UndefOr[
    js.Function1[/* e */ reactLib.reactMod.MouseEvent[_, reactLib.NativeMouseEvent], scala.Unit]
  ] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    btnContextual: java.lang.String = null,
    btnGlyphicon: java.lang.String = null,
    btnText: java.lang.String = null,
    className: java.lang.String = null,
    onClick: /* e */ reactLib.reactMod.MouseEvent[_, reactLib.NativeMouseEvent] => scala.Unit = null
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

