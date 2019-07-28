package typings.reactDashInlinesvg.reactDashInlinesvgMod

import typings.react.reactMod.ReactNode
import typings.std.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var baseURL: js.UndefOr[String] = js.undefined
  var cacheGetRequests: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ RequestError | InlineSVGError, Unit]] = js.undefined
  var onLoad: js.UndefOr[js.Function2[/* src */ URL | String, /* isCached */ Boolean, Unit]] = js.undefined
  var preloader: js.UndefOr[ReactNode] = js.undefined
  var processSVG: js.UndefOr[js.Function1[/* svgText */ String, String]] = js.undefined
  var src: URL | String
  var style: js.UndefOr[js.Object] = js.undefined
  var supportTest: js.UndefOr[js.Function0[Unit]] = js.undefined
  var uniqueHash: js.UndefOr[String] = js.undefined
  var uniquifyIDs: js.UndefOr[Boolean] = js.undefined
  var wrapper: js.UndefOr[js.Function0[ReactNode]] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    src: URL | String,
    baseURL: String = null,
    cacheGetRequests: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    onError: /* error */ RequestError | InlineSVGError => Unit = null,
    onLoad: (/* src */ URL | String, /* isCached */ Boolean) => Unit = null,
    preloader: ReactNode = null,
    processSVG: /* svgText */ String => String = null,
    style: js.Object = null,
    supportTest: () => Unit = null,
    uniqueHash: String = null,
    uniquifyIDs: js.UndefOr[Boolean] = js.undefined,
    wrapper: () => ReactNode = null
  ): Props = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (baseURL != null) __obj.updateDynamic("baseURL")(baseURL)
    if (!js.isUndefined(cacheGetRequests)) __obj.updateDynamic("cacheGetRequests")(cacheGetRequests)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction2(onLoad))
    if (preloader != null) __obj.updateDynamic("preloader")(preloader.asInstanceOf[js.Any])
    if (processSVG != null) __obj.updateDynamic("processSVG")(js.Any.fromFunction1(processSVG))
    if (style != null) __obj.updateDynamic("style")(style)
    if (supportTest != null) __obj.updateDynamic("supportTest")(js.Any.fromFunction0(supportTest))
    if (uniqueHash != null) __obj.updateDynamic("uniqueHash")(uniqueHash)
    if (!js.isUndefined(uniquifyIDs)) __obj.updateDynamic("uniquifyIDs")(uniquifyIDs)
    if (wrapper != null) __obj.updateDynamic("wrapper")(js.Any.fromFunction0(wrapper))
    __obj.asInstanceOf[Props]
  }
}

