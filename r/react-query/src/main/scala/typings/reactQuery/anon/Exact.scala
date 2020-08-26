package typings.reactQuery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exact extends js.Object {
  var exact: js.UndefOr[Boolean] = js.native
  var force: js.UndefOr[Boolean] = js.native
  var throwOnError: js.UndefOr[Boolean] = js.native
}

object Exact {
  @scala.inline
  def apply(): Exact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Exact]
  }
  @scala.inline
  implicit class ExactOps[Self <: Exact] (val x: Self) extends AnyVal {
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
    def setExact(value: Boolean): Self = this.set("exact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExact: Self = this.set("exact", js.undefined)
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    @scala.inline
    def setThrowOnError(value: Boolean): Self = this.set("throwOnError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrowOnError: Self = this.set("throwOnError", js.undefined)
  }
  
}

