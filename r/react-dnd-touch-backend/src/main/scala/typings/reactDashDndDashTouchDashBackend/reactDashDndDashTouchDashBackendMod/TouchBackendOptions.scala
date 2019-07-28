package typings.reactDashDndDashTouchDashBackend.reactDashDndDashTouchDashBackendMod

import typings.reactDashDndDashTouchDashBackend.Anon_End
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchBackendOptions extends js.Object {
  /**
    * Number of milliseconds delay before the touch/click is considered a drag.
    * @deprecated replaced by delayTouchStart and delayMouseStart, but is still supported at present.
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * Number of milliseconds that the item needs to be clicked on before the click is considered the start of a drag.
    */
  var delayMouseStart: js.UndefOr[Double] = js.undefined
  /**
    * Number of milliseconds that the item needs to be touched before the touch is considered the start of a drag.
    * This is used to allow both flick-to-scroll and drag-n-drop on objects in a list.
    */
  var delayTouchStart: js.UndefOr[Double] = js.undefined
  /**
    * Can cancel drag by hitting Escape if enableKeyboardEvents option is set to true
    */
  var enableKeyboardEvents: js.UndefOr[Boolean] = js.undefined
  /**
    * Support mouse events as well as touch events.
    */
  var enableMouseEvents: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, prevents the contextmenu event from canceling a drag. Default false.
    */
  var ignoreContextMenu: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies ranges of angles in degrees that drag events should be ignored. This is useful when you want to allow
    * the user to scroll in a particular direction instead of dragging. Degrees move clockwise, 0/360 pointing to the
    * left. Default: undefined
    */
  var scrollAngleRanges: js.UndefOr[js.Array[Anon_End]] = js.undefined
  /**
    * Specifies the pixel distance moved before a drag is signaled. Default 0.
    */
  var touchSlop: js.UndefOr[Double] = js.undefined
}

object TouchBackendOptions {
  @scala.inline
  def apply(
    delay: Int | Double = null,
    delayMouseStart: Int | Double = null,
    delayTouchStart: Int | Double = null,
    enableKeyboardEvents: js.UndefOr[Boolean] = js.undefined,
    enableMouseEvents: js.UndefOr[Boolean] = js.undefined,
    ignoreContextMenu: js.UndefOr[Boolean] = js.undefined,
    scrollAngleRanges: js.Array[Anon_End] = null,
    touchSlop: Int | Double = null
  ): TouchBackendOptions = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (delayMouseStart != null) __obj.updateDynamic("delayMouseStart")(delayMouseStart.asInstanceOf[js.Any])
    if (delayTouchStart != null) __obj.updateDynamic("delayTouchStart")(delayTouchStart.asInstanceOf[js.Any])
    if (!js.isUndefined(enableKeyboardEvents)) __obj.updateDynamic("enableKeyboardEvents")(enableKeyboardEvents)
    if (!js.isUndefined(enableMouseEvents)) __obj.updateDynamic("enableMouseEvents")(enableMouseEvents)
    if (!js.isUndefined(ignoreContextMenu)) __obj.updateDynamic("ignoreContextMenu")(ignoreContextMenu)
    if (scrollAngleRanges != null) __obj.updateDynamic("scrollAngleRanges")(scrollAngleRanges)
    if (touchSlop != null) __obj.updateDynamic("touchSlop")(touchSlop.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBackendOptions]
  }
}

