package typings
package reactDashShareLib.reactDashShareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonShareButtonProps extends js.Object {
  /**
    * An object to pass any additional properties, such as `aria-*` attributes.
    */
  var additionalProps: js.UndefOr[reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement]] = js.undefined
  /**
    *  Takes a function that returns a Promise to be fulfilled before calling
    * `onClick`. If you do not return promise, `onClick` is called immediately.
    */
  var beforeOnClick: js.UndefOr[js.Function0[js.Promise[scala.Unit]]] = js.undefined
  /** Disables click action and adds `disabled` class */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Style when button is disabled
    * @default { opacity: 0.6 }
    */
  var disabledStyle: js.UndefOr[reactLib.reactMod.ReactNs.StyleHTMLAttributes[reactLib.HTMLDivElement]] = js.undefined
  /**
    * Takes a function to be called after closing share dialog.
    */
  var onShareWindowClose: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * URL of the shared page
    */
  var url: java.lang.String
  var windowHeight: js.UndefOr[scala.Double] = js.undefined
  var windowWidth: js.UndefOr[scala.Double] = js.undefined
}

