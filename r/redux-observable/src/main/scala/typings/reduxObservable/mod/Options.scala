package typings.reduxObservable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[D] extends js.Object {
  var dependencies: js.UndefOr[D] = js.native
}

object Options {
  @scala.inline
  def apply[D](): Options[D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[D]]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options[_], D] (val x: Self with Options[D]) extends AnyVal {
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
    def setDependencies(value: D): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
  }
  
}

