package typings
package reactDashDndDashTouchDashBackendLib.reactDashDndDashTouchDashBackendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchBackendOptions extends js.Object {
  /**
    * Number of milliseconds delay before the touch/click is considered a drag.
    * @deprecated replaced by delayTouchStart and delayMouseStart, but is still supported at present.
    */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /**
    * Number of milliseconds that the item needs to be clicked on before the click is considered the start of a drag.
    */
  var delayMouseStart: js.UndefOr[scala.Double] = js.undefined
  /**
    * Number of milliseconds that the item needs to be touched before the touch is considered the start of a drag.
    * This is used to allow both flick-to-scroll and drag-n-drop on objects in a list.
    */
  var delayTouchStart: js.UndefOr[scala.Double] = js.undefined
  /**
    * Can cancel drag by hitting Escape if enableKeyboardEvents option is set to true
    */
  var enableKeyboardEvents: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Support mouse events as well as touch events.
    */
  var enableMouseEvents: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, prevents the contextmenu event from canceling a drag. Default false.
    */
  var ignoreContextMenu: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specifies ranges of angles in degrees that drag events should be ignored. This is useful when you want to allow
    * the user to scroll in a particular direction instead of dragging. Degrees move clockwise, 0/360 pointing to the
    * left. Default: undefined
    */
  var scrollAngleRanges: js.UndefOr[js.Array[reactDashDndDashTouchDashBackendLib.Anon_Start]] = js.undefined
  /**
    * Specifies the pixel distance moved before a drag is signaled. Default 0.
    */
  var touchSlop: js.UndefOr[scala.Double] = js.undefined
}

