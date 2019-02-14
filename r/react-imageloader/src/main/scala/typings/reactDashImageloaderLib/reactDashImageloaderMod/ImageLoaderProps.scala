package typings
package reactDashImageloaderLib.reactDashImageloaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageLoaderProps
  extends reactLib.reactMod.ReactNs.Props[ImageLoader] {
  /** An optional class name for the wrapper component. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** An optional object containing props for the underlying img component. */
  var imgProps: js.UndefOr[js.Any] = js.undefined
  /** An optional handler for the error event. */
  var onError: js.UndefOr[js.Function1[/* event */ js.Any, scala.Unit]] = js.undefined
  /** An optional handler for the load event. */
  var onLoad: js.UndefOr[js.Function1[/* event */ js.Any, scala.Unit]] = js.undefined
  /** An optional function that returns a React element to be shown while the image loads. */
  var preloader: js.UndefOr[js.Function1[/* params */ js.Any, reactLib.reactMod.ReactNs.ReactElement]] = js.undefined
  /** The URL of the image to be loaded. */
  var src: java.lang.String
  /** An optional object containing styles for the wrapper component. */
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /** A function that takes a props argument and returns a React element to be used as the wrapper component. Defaults to React.DOM.span. */
  var wrapper: js.UndefOr[js.Function1[/* props */ js.Any, reactLib.reactMod.ReactNs.ReactElement]] = js.undefined
}

