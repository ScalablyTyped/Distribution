package typings
package seleniumDashStandaloneLib.seleniumDashStandaloneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartOpts extends js.Object {
  var basePath: js.UndefOr[java.lang.String] = js.undefined
  var cb: js.UndefOr[
    js.Function2[
      /* error */ stdLib.Error, 
      /* child */ nodeLib.childUnderscoreProcessMod.ChildProcess, 
      scala.Unit
    ]
  ] = js.undefined
  var drivers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[seleniumDashStandaloneLib.Anon_Arch]] = js.undefined
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

object StartOpts {
  @scala.inline
  def apply(
    basePath: java.lang.String = null,
    cb: (/* error */ stdLib.Error, /* child */ nodeLib.childUnderscoreProcessMod.ChildProcess) => scala.Unit = null,
    drivers: org.scalablytyped.runtime.StringDictionary[seleniumDashStandaloneLib.Anon_Arch] = null,
    javaArgs: js.Array[java.lang.String] = null,
    javaPath: java.lang.String = null,
    requestOpts: nodeLib.httpMod.RequestOptions | java.lang.String | nodeLib.urlMod.URL = null,
    seleniumArgs: js.Array[java.lang.String] = null,
    spawnCb: /* selenium */ js.UndefOr[nodeLib.childUnderscoreProcessMod.ChildProcess] => scala.Unit = null,
    spawnOptions: nodeLib.childUnderscoreProcessMod.SpawnOptions = null,
    version: java.lang.String = null
  ): StartOpts = {
    val __obj = js.Dynamic.literal()
    if (basePath != null) __obj.updateDynamic("basePath")(basePath)
    if (cb != null) __obj.updateDynamic("cb")(js.Any.fromFunction2(cb))
    if (drivers != null) __obj.updateDynamic("drivers")(drivers)
    if (javaArgs != null) __obj.updateDynamic("javaArgs")(javaArgs)
    if (javaPath != null) __obj.updateDynamic("javaPath")(javaPath)
    if (requestOpts != null) __obj.updateDynamic("requestOpts")(requestOpts.asInstanceOf[js.Any])
    if (seleniumArgs != null) __obj.updateDynamic("seleniumArgs")(seleniumArgs)
    if (spawnCb != null) __obj.updateDynamic("spawnCb")(js.Any.fromFunction1(spawnCb))
    if (spawnOptions != null) __obj.updateDynamic("spawnOptions")(spawnOptions)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[StartOpts]
  }
}

