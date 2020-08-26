package typings.seleniumStandalone.anon

import typings.seleniumStandalone.seleniumStandaloneStrings.ia32
import typings.seleniumStandalone.seleniumStandaloneStrings.x64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arch extends js.Object {
  var arch: String | ia32 | x64 = js.native
  var baseURL: String = js.native
  var version: js.UndefOr[String] = js.native
}

object Arch {
  @scala.inline
  def apply(arch: String | ia32 | x64, baseURL: String): Arch = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], baseURL = baseURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arch]
  }
  @scala.inline
  implicit class ArchOps[Self <: Arch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArch(value: String | ia32 | x64): Self = this.set("arch", value.asInstanceOf[js.Any])
    @scala.inline
    def setBaseURL(value: String): Self = this.set("baseURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

