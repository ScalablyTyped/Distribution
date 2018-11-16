package typings
package seleniumDashStandaloneLib.seleniumDashStandaloneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait InstallOpts extends js.Object {
  var basePath: js.UndefOr[java.lang.String] = js.undefined
  var baseURL: js.UndefOr[java.lang.String] = js.undefined
  var cb: js.UndefOr[js.Function1[/* error */ nodeLib.Error, scala.Unit]] = js.undefined
  var drivers: js.UndefOr[ScalablyTyped.runtime.StringDictionary[seleniumDashStandaloneLib.Anon_Arch]] = js.undefined
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

