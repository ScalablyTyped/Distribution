package typings.seleniumStandalone

import typings.seleniumStandalone.seleniumStandaloneStrings.ia32
import typings.seleniumStandalone.seleniumStandaloneStrings.x64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArch extends js.Object {
  var arch: String | ia32 | x64
  var baseURL: String
  var version: js.UndefOr[String] = js.undefined
}

object AnonArch {
  @scala.inline
  def apply(arch: String | ia32 | x64, baseURL: String, version: String = null): AnonArch = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], baseURL = baseURL.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArch]
  }
}

