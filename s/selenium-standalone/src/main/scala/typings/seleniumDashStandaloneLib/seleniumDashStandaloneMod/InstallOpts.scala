package typings
package seleniumDashStandaloneLib.seleniumDashStandaloneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstallOpts extends js.Object {
  var basePath: js.UndefOr[java.lang.String] = js.undefined
  var baseURL: js.UndefOr[java.lang.String] = js.undefined
  var cb: js.UndefOr[js.Function1[/* error */ stdLib.Error, scala.Unit]] = js.undefined
  var drivers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[seleniumDashStandaloneLib.Anon_Arch]] = js.undefined
  var logger: js.UndefOr[js.Function1[/* message */ java.lang.String, scala.Unit]] = js.undefined
  var progressCb: js.UndefOr[
    js.Function3[
      /* totalLength */ scala.Double, 
      /* progressLength */ scala.Double, 
      /* chunkLength */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var requestOpts: js.UndefOr[nodeLib.httpMod.RequestOptions | java.lang.String | nodeLib.urlMod.URL] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object InstallOpts {
  @scala.inline
  def apply(
    basePath: java.lang.String = null,
    baseURL: java.lang.String = null,
    cb: /* error */ stdLib.Error => scala.Unit = null,
    drivers: org.scalablytyped.runtime.StringDictionary[seleniumDashStandaloneLib.Anon_Arch] = null,
    logger: /* message */ java.lang.String => scala.Unit = null,
    progressCb: (/* totalLength */ scala.Double, /* progressLength */ scala.Double, /* chunkLength */ scala.Double) => scala.Unit = null,
    requestOpts: nodeLib.httpMod.RequestOptions | java.lang.String | nodeLib.urlMod.URL = null,
    version: java.lang.String = null
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

