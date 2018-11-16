package typings
package seleniumDashStandaloneLib.seleniumDashStandaloneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StartOpts extends js.Object {
  var basePath: js.UndefOr[java.lang.String] = js.undefined
  var cb: js.UndefOr[
    js.Function2[
      /* error */ nodeLib.Error, 
      /* child */ nodeLib.childUnderscoreProcessMod.ChildProcess, 
      scala.Unit
    ]
  ] = js.undefined
  var drivers: js.UndefOr[ScalablyTyped.runtime.StringDictionary[seleniumDashStandaloneLib.Anon_Arch]] = js.undefined
  var javaArgs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var javaPath: js.UndefOr[java.lang.String] = js.undefined
  var requestOpts: js.UndefOr[nodeLib.httpMod.RequestOptions | java.lang.String | nodeLib.urlMod.URL] = js.undefined
  var seleniumArgs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var spawnCb: js.UndefOr[
    js.Function1[
      /* selenium */ js.UndefOr[nodeLib.childUnderscoreProcessMod.ChildProcess], 
      scala.Unit
    ]
  ] = js.undefined
  var spawnOptions: js.UndefOr[nodeLib.childUnderscoreProcessMod.SpawnOptions] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

