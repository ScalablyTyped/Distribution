package typings.readConfigFile.mod

import org.scalablytyped.runtime.StringDictionary
import typings.lazyVal.mod.Lazy
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
    val __obj = js.Dynamic.literal(configFilename = configFilename.asInstanceOf[js.Any], packageKey = packageKey.asInstanceOf[js.Any], projectDir = projectDir.asInstanceOf[js.Any], packageMetadata = packageMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadConfigRequest]
  }
}

