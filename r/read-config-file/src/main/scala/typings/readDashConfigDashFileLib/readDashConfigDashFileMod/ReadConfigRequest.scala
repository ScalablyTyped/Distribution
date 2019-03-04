package typings
package readDashConfigDashFileLib.readDashConfigDashFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadConfigRequest extends js.Object {
  var configFilename: java.lang.String
  var packageKey: java.lang.String
  var packageMetadata: (lazyDashValLib.lazyDashValMod.Lazy[org.scalablytyped.runtime.StringDictionary[_] | scala.Null]) | scala.Null
  var projectDir: java.lang.String
}

object ReadConfigRequest {
  @scala.inline
  def apply(
    configFilename: java.lang.String,
    packageKey: java.lang.String,
    projectDir: java.lang.String,
    packageMetadata: lazyDashValLib.lazyDashValMod.Lazy[org.scalablytyped.runtime.StringDictionary[_] | scala.Null] = null
  ): ReadConfigRequest = {
    val __obj = js.Dynamic.literal(configFilename = configFilename, packageKey = packageKey, projectDir = projectDir)
    if (packageMetadata != null) __obj.updateDynamic("packageMetadata")(packageMetadata)
    __obj.asInstanceOf[ReadConfigRequest]
  }
}

