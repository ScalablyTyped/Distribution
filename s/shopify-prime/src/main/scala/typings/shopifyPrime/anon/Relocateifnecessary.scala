package typings.shopifyPrime.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Relocateifnecessary extends js.Object {
  var relocate_if_necessary: js.UndefOr[Boolean] = js.native
}

object Relocateifnecessary {
  @scala.inline
  def apply(): Relocateifnecessary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Relocateifnecessary]
  }
  @scala.inline
  implicit class RelocateifnecessaryOps[Self <: Relocateifnecessary] (val x: Self) extends AnyVal {
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
    def setRelocate_if_necessary(value: Boolean): Self = this.set("relocate_if_necessary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelocate_if_necessary: Self = this.set("relocate_if_necessary", js.undefined)
  }
  
}

