package typings
package reactDashToastifyLib.reactDashToastifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastContainerProps extends ToastAndToastContainerOptions {
  /**
    * Add optional classes to the container.
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Display newest toast on top.
    * @default false
    */
  var newestOnTop: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Pause on document visibility change (resizing the window, for
    * instance).
    * @default true
    */
  var pauseOnVisibilityChange: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Support right to left content.
    * @default false
    */
  var rtl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Add optional inline style to the container.
    */
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
    * Add optional classes to the toast.
    */
  var toastClassName: js.UndefOr[java.lang.String] = js.undefined
}

