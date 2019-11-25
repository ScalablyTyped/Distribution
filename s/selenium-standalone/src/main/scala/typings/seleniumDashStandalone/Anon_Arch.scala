package typings.seleniumDashStandalone

import typings.seleniumDashStandalone.seleniumDashStandaloneStrings.ia32
import typings.seleniumDashStandalone.seleniumDashStandaloneStrings.x64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arch extends js.Object {
  var arch: String | ia32 | x64
  var baseURL: String
  var version: js.UndefOr[String] = js.undefined
}

object Anon_Arch {
  @scala.inline
  def apply(arch: String | ia32 | x64, baseURL: String, version: String = null): Anon_Arch = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], baseURL = baseURL.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Arch]
  }
}

