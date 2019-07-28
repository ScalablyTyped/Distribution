package typings.readDashConfigDashFile.readDashConfigDashFileMod

import org.scalablytyped.runtime.StringDictionary
import typings.lazyDashVal.lazyDashValMod.Lazy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadConfigRequest extends js.Object {
  var configFilename: String
  var packageKey: String
  var packageMetadata: (Lazy[StringDictionary[_] | Null]) | Null
  var projectDir: String
}

object ReadConfigRequest {
  @scala.inline
  def apply(
    configFilename: String,
    packageKey: String,
    projectDir: String,
    packageMetadata: Lazy[StringDictionary[_] | Null] = null
  ): ReadConfigRequest = {
    val __obj = js.Dynamic.literal(configFilename = configFilename, packageKey = packageKey, projectDir = projectDir)
    if (packageMetadata != null) __obj.updateDynamic("packageMetadata")(packageMetadata)
    __obj.asInstanceOf[ReadConfigRequest]
  }
}

