package typings.seleniumDashStandalone.seleniumDashStandaloneMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.childUnderscoreProcessMod.ChildProcess
import typings.node.childUnderscoreProcessMod.SpawnOptions
import typings.node.httpMod.RequestOptions
import typings.node.urlMod.URL
import typings.seleniumDashStandalone.Anon_Arch
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartOpts extends js.Object {
  var basePath: js.UndefOr[String] = js.undefined
  var cb: js.UndefOr[js.Function2[/* error */ Error, /* child */ ChildProcess, Unit]] = js.undefined
  var drivers: js.UndefOr[StringDictionary[Anon_Arch]] = js.undefined
  var javaArgs: js.UndefOr[js.Array[String]] = js.undefined
  var javaPath: js.UndefOr[String] = js.undefined
  var requestOpts: js.UndefOr[RequestOptions | String | URL] = js.undefined
  var seleniumArgs: js.UndefOr[js.Array[String]] = js.undefined
  var spawnCb: js.UndefOr[js.Function1[/* selenium */ js.UndefOr[ChildProcess], Unit]] = js.undefined
  var spawnOptions: js.UndefOr[SpawnOptions] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object StartOpts {
  @scala.inline
  def apply(
    basePath: String = null,
    cb: (/* error */ Error, /* child */ ChildProcess) => Unit = null,
    drivers: StringDictionary[Anon_Arch] = null,
    javaArgs: js.Array[String] = null,
    javaPath: String = null,
    requestOpts: RequestOptions | String | URL = null,
    seleniumArgs: js.Array[String] = null,
    spawnCb: /* selenium */ js.UndefOr[ChildProcess] => Unit = null,
    spawnOptions: SpawnOptions = null,
    version: String = null
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

