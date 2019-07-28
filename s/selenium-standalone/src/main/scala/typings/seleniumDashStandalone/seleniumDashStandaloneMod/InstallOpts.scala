package typings.seleniumDashStandalone.seleniumDashStandaloneMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.httpMod.RequestOptions
import typings.node.urlMod.URL
import typings.seleniumDashStandalone.Anon_Arch
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstallOpts extends js.Object {
  var basePath: js.UndefOr[String] = js.undefined
  var baseURL: js.UndefOr[String] = js.undefined
  var cb: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
  var drivers: js.UndefOr[StringDictionary[Anon_Arch]] = js.undefined
  var logger: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.undefined
  var progressCb: js.UndefOr[
    js.Function3[/* totalLength */ Double, /* progressLength */ Double, /* chunkLength */ Double, Unit]
  ] = js.undefined
  var requestOpts: js.UndefOr[RequestOptions | String | URL] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object InstallOpts {
  @scala.inline
  def apply(
    basePath: String = null,
    baseURL: String = null,
    cb: /* error */ Error => Unit = null,
    drivers: StringDictionary[Anon_Arch] = null,
    logger: /* message */ String => Unit = null,
    progressCb: (/* totalLength */ Double, /* progressLength */ Double, /* chunkLength */ Double) => Unit = null,
    requestOpts: RequestOptions | String | URL = null,
    version: String = null
  ): InstallOpts = {
    val __obj = js.Dynamic.literal()
    if (basePath != null) __obj.updateDynamic("basePath")(basePath)
    if (baseURL != null) __obj.updateDynamic("baseURL")(baseURL)
    if (cb != null) __obj.updateDynamic("cb")(js.Any.fromFunction1(cb))
    if (drivers != null) __obj.updateDynamic("drivers")(drivers)
    if (logger != null) __obj.updateDynamic("logger")(js.Any.fromFunction1(logger))
    if (progressCb != null) __obj.updateDynamic("progressCb")(js.Any.fromFunction3(progressCb))
    if (requestOpts != null) __obj.updateDynamic("requestOpts")(requestOpts.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[InstallOpts]
  }
}

