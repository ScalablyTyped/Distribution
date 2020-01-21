package typings.reactBootstrapTable.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowSelectedButtonProps extends js.Object {
  /**
  	 * Bootstrap css style class for the button, e.g. 'btn-warning'
  	 */
  var btnContextual: js.UndefOr[String] = js.undefined
  /**
  	 * Glyphicon glyph string for the button, e.g. 'glyphicon-edit'
  	 */
  var btnGlyphicon: js.UndefOr[String] = js.undefined
  /**
  	 * Custom class for the button
  	 */
  var className: js.UndefOr[String] = js.undefined
  /**
  	 * Function to be called to activate the normal onClick functionality for this button.
  	 */
  var onClick: js.UndefOr[js.Function1[/* e */ MouseEvent[_, NativeMouseEvent], Unit]] = js.undefined
  /**
  	 * Label for when clicking the button will toggle the table back into "show all rows" mode.
  	 */
  var showAllText: js.UndefOr[String] = js.undefined
  /**
  	 * Label for when clicking the button will toggle the table into "show only selected rows" mode.
  	 */
  var showOnlySelectText: js.UndefOr[String] = js.undefined
}

object ShowSelectedButtonProps {
  @scala.inline
  def apply(
    btnContextual: String = null,
    btnGlyphicon: String = null,
    className: String = null,
    onClick: /* e */ MouseEvent[_, NativeMouseEvent] => Unit = null,
    showAllText: String = null,
    showOnlySelectText: String = null
  ): ShowSelectedButtonProps = {
    val __obj = js.Dynamic.literal()
    if (btnContextual != null) __obj.updateDynamic("btnContextual")(btnContextual.asInstanceOf[js.Any])
    if (btnGlyphicon != null) __obj.updateDynamic("btnGlyphicon")(btnGlyphicon.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (showAllText != null) __obj.updateDynamic("showAllText")(showAllText.asInstanceOf[js.Any])
    if (showOnlySelectText != null) __obj.updateDynamic("showOnlySelectText")(showOnlySelectText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowSelectedButtonProps]
  }
}

