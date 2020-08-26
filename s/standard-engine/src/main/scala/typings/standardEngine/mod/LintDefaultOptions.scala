package typings.standardEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LintDefaultOptions extends js.Object {
  /**
    * use options from nearest package.json?
    * @default true
    */
  var usePackageJson: js.UndefOr[Boolean] = js.native
}

object LintDefaultOptions {
  @scala.inline
  def apply(): LintDefaultOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LintDefaultOptions]
  }
  @scala.inline
  implicit class LintDefaultOptionsOps[Self <: LintDefaultOptions] (val x: Self) extends AnyVal {
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
    def setUsePackageJson(value: Boolean): Self = this.set("usePackageJson", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsePackageJson: Self = this.set("usePackageJson", js.undefined)
  }
  
}

