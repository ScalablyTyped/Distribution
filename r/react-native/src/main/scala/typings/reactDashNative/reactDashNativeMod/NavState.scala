package typings.reactDashNative.reactDashNativeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavState
  extends /* key */ StringDictionary[js.Any] {
  var canGoBack: js.UndefOr[Boolean] = js.undefined
  var canGoForward: js.UndefOr[Boolean] = js.undefined
  var loading: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object NavState {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    canGoBack: js.UndefOr[Boolean] = js.undefined,
    canGoForward: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    url: String = null
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

