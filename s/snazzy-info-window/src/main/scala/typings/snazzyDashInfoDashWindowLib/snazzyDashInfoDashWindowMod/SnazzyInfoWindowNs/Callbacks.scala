package typings
package snazzyDashInfoDashWindowLib.snazzyDashInfoDashWindowMod.SnazzyInfoWindowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callbacks extends js.Object {
  /**
    * Called after the info window has closed.
    * This occurs at the end of the OverlayView onRemove() implementation.
    * At this point the info window should be removed from the DOM.
    */
  var afterClose: js.UndefOr[js.Function0[scala.Boolean | scala.Unit]] = js.undefined
  /**
    * Called when the info window has opened.
    * This occurs at the end of the OverlayView draw() implementation.
    * At this point the info window is added to the DOM and should be visible.
    */
  var afterOpen: js.UndefOr[js.Function0[scala.Boolean | scala.Unit]] = js.undefined
  /**
    * Called before the info window attempts to close.
    * Return false to cancel the close.
    */
  var beforeClose: js.UndefOr[js.Function0[scala.Boolean | scala.Unit]] = js.undefined
  /**
    * Called before the info window attempts to open.
    * Return false to cancel the open.
    */
  var beforeOpen: js.UndefOr[js.Function0[scala.Boolean | scala.Unit]] = js.undefined
  /**
    * Called when the info window is closing.
    * This occurs at the beginning of the OverlayView onRemove() implementation.
    * At this point the info window is still in the DOM.
    */
  var close: js.UndefOr[js.Function0[scala.Boolean | scala.Unit]] = js.undefined
  /**
    * Called when the info window is opening.
    * This occurs at the end of the OverlayView onAdd() implementation.
    * At this point the info window is added to the DOM but is not drawn yet.
    */
  var open: js.UndefOr[js.Function0[scala.Boolean | scala.Unit]] = js.undefined
}

object Callbacks {
  @scala.inline
  def apply(
    afterClose: js.Function0[scala.Boolean | scala.Unit] = null,
    afterOpen: js.Function0[scala.Boolean | scala.Unit] = null,
    beforeClose: js.Function0[scala.Boolean | scala.Unit] = null,
    beforeOpen: js.Function0[scala.Boolean | scala.Unit] = null,
    close: js.Function0[scala.Boolean | scala.Unit] = null,
    open: js.Function0[scala.Boolean | scala.Unit] = null
  ): Callbacks = {
    val __obj = js.Dynamic.literal()
    if (afterClose != null) __obj.updateDynamic("afterClose")(afterClose)
    if (afterOpen != null) __obj.updateDynamic("afterOpen")(afterOpen)
    if (beforeClose != null) __obj.updateDynamic("beforeClose")(beforeClose)
    if (beforeOpen != null) __obj.updateDynamic("beforeOpen")(beforeOpen)
    if (close != null) __obj.updateDynamic("close")(close)
    if (open != null) __obj.updateDynamic("open")(open)
    __obj.asInstanceOf[Callbacks]
  }
}

