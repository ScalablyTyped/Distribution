package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavState
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var canGoBack: js.UndefOr[scala.Boolean] = js.undefined
  var canGoForward: js.UndefOr[scala.Boolean] = js.undefined
  var loading: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object NavState {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    canGoBack: js.UndefOr[scala.Boolean] = js.undefined,
    canGoForward: js.UndefOr[scala.Boolean] = js.undefined,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    url: java.lang.String = null
  ): NavState = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(canGoBack)) __obj.updateDynamic("canGoBack")(canGoBack)
    if (!js.isUndefined(canGoForward)) __obj.updateDynamic("canGoForward")(canGoForward)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[NavState]
  }
}

