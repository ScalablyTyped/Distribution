package typings
package reactDashInlinesvgLib.reactDashInlinesvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var baseURL: js.UndefOr[java.lang.String] = js.undefined
  var cacheGetRequests: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ RequestError | InlineSVGError, scala.Unit]] = js.undefined
  var onLoad: js.UndefOr[
    js.Function2[/* src */ stdLib.URL | java.lang.String, /* isCached */ scala.Boolean, scala.Unit]
  ] = js.undefined
  var preloader: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var src: stdLib.URL | java.lang.String
  var style: js.UndefOr[js.Object] = js.undefined
  var supportTest: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var uniqueHash: js.UndefOr[java.lang.String] = js.undefined
  var uniquifyIDs: js.UndefOr[scala.Boolean] = js.undefined
  var wrapper: js.UndefOr[js.Function0[reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    src: stdLib.URL | java.lang.String,
    baseURL: java.lang.String = null,
    cacheGetRequests: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    onError: js.Function1[/* error */ RequestError | InlineSVGError, scala.Unit] = null,
    onLoad: js.Function2[/* src */ stdLib.URL | java.lang.String, /* isCached */ scala.Boolean, scala.Unit] = null,
    preloader: reactLib.reactMod.ReactNs.ReactNode = null,
    style: js.Object = null,
    supportTest: js.Function0[scala.Unit] = null,
    uniqueHash: java.lang.String = null,
    uniquifyIDs: js.UndefOr[scala.Boolean] = js.undefined,
    wrapper: js.Function0[reactLib.reactMod.ReactNs.ReactNode] = null
  ): Props = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (baseURL != null) __obj.updateDynamic("baseURL")(baseURL)
    if (!js.isUndefined(cacheGetRequests)) __obj.updateDynamic("cacheGetRequests")(cacheGetRequests)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad)
    if (preloader != null) __obj.updateDynamic("preloader")(preloader.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (supportTest != null) __obj.updateDynamic("supportTest")(supportTest)
    if (uniqueHash != null) __obj.updateDynamic("uniqueHash")(uniqueHash)
    if (!js.isUndefined(uniquifyIDs)) __obj.updateDynamic("uniquifyIDs")(uniquifyIDs)
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper)
    __obj.asInstanceOf[Props]
  }
}

