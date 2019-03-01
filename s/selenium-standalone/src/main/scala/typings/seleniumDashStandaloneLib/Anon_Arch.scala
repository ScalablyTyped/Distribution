package typings
package seleniumDashStandaloneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arch extends js.Object {
  var arch: java.lang.String | seleniumDashStandaloneLib.seleniumDashStandaloneLibStrings.ia32 | seleniumDashStandaloneLib.seleniumDashStandaloneLibStrings.x64
  var baseURL: java.lang.String
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Arch {
  @scala.inline
  def apply(
    arch: java.lang.String | seleniumDashStandaloneLib.seleniumDashStandaloneLibStrings.ia32 | seleniumDashStandaloneLib.seleniumDashStandaloneLibStrings.x64,
    baseURL: java.lang.String,
    version: java.lang.String = null
  ): Anon_Arch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arch")(arch.asInstanceOf[js.Any])
    __obj.updateDynamic("baseURL")(baseURL)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_Arch]
  }
}

