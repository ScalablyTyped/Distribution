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

