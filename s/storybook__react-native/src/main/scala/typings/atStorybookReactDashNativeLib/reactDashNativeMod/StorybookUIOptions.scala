package typings
package atStorybookReactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorybookUIOptions extends js.Object {
  /**
    * allows to display stories without running storybook server. Should be used with onDeviceUI
    *
    * @default false
    */
  var disableWebsockets: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * host to use
    *
    * @default NativeModules.SourceCode.scriptURL
    */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /**
    * initialize storybook with a specific story.
    * In case a valid object is passed, it will take precedence over `shouldPersistSelection`.
    * ex: `{ kind: 'Knobs', story: 'with knobs' }`
    *
    * @default null
    */
  var initialSelection: js.UndefOr[js.Object] = js.undefined
  /**
    * should the ui be closed initialy.
    *
    * @default false
    */
  var isUIHidden: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * this will set the keyboardverticaloffset (https://facebook.github.io/react-native/docs/keyboardavoidingview#keyboardverticaloffset) value for KeyboardAvoidingView wrapping Storybook's view
    *
    * @default 0
    */
  var keyboardAvoidingViewVerticalOffset: js.UndefOr[scala.Double] = js.undefined
  /**
    * display navigator and addons on the device
    *
    * @default true
    */
  var onDeviceUI: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * port to use
    *
    * @default 7007
    */
  var port: js.UndefOr[scala.Double] = js.undefined
  /**
    * additional query string to pass to websockets
    *
    * @default ""
    */
  var query: js.UndefOr[java.lang.String] = js.undefined
  /**
    * use wss/https instead of ws/http
    *
    * @default false
    */
  var secured: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * disable KeyboardAvoidingView wrapping Storybook's view
    *
    * @default false
    */
  var shouldDisableKeyboardAvoidingView: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * initialize storybook with the last selected story.
    *
    * @default true
    */
  var shouldPersistSelection: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * which tab should be open. -1 Navigator, 0 Preview, 1 Addons
    *
    * @default 0
    */
  var tabOpen: js.UndefOr[scala.Double] = js.undefined
}

