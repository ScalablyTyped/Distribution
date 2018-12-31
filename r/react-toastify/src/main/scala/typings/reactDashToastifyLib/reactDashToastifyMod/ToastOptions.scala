package typings
package reactDashToastifyLib.reactDashToastifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastOptions extends ToastAndToastContainerOptions {
  /**
    * Add optional classes to the toast.
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Called inside componentWillUnmount.
    */
  var onClose: js.UndefOr[js.Function1[/* childrenProps */ reactLib.reactMod.ReactNs.Props[_], scala.Unit]] = js.undefined
  /**
    * Called inside componentDidMount.
    */
  var onOpen: js.UndefOr[js.Function1[/* childrenProps */ reactLib.reactMod.ReactNs.Props[_], scala.Unit]] = js.undefined
  /**
    * String or React Element, only available when calling update.
    */
  var render: js.UndefOr[java.lang.String | reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
    * Kind of notification.
    * @default 'default'
    */
  var `type`: js.UndefOr[
    reactDashToastifyLib.reactDashToastifyLibStrings.default | reactDashToastifyLib.reactDashToastifyLibStrings.success | reactDashToastifyLib.reactDashToastifyLibStrings.info | reactDashToastifyLib.reactDashToastifyLibStrings.warning | reactDashToastifyLib.reactDashToastifyLibStrings.error
  ] = js.undefined
}

