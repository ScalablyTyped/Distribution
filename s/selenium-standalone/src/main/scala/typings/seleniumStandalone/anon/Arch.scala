package typings.seleniumStandalone.anon

import typings.seleniumStandalone.seleniumStandaloneStrings.ia32
import typings.seleniumStandalone.seleniumStandaloneStrings.x64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arch extends js.Object {
  var arch: String | ia32 | x64
  var baseURL: String
  var version: js.UndefOr[String] = js.undefined
}

object Arch {
  @scala.inline
  def apply(arch: String | ia32 | x64, baseURL: String, version: String = null): Arch = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], baseURL = baseURL.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arch]
  }
}

