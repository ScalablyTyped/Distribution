package typings.semver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var includePrerelease: js.UndefOr[Boolean] = js.native
  var loose: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setIncludePrerelease(value: Boolean): Self = this.set("includePrerelease", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludePrerelease: Self = this.set("includePrerelease", js.undefined)
    @scala.inline
    def setLoose(value: Boolean): Self = this.set("loose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoose: Self = this.set("loose", js.undefined)
  }
  
}

