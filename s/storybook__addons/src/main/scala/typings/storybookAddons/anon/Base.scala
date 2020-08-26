package typings.storybookAddons.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Base extends js.Object {
  var base: String = js.native
  var brandTitle: js.UndefOr[String] = js.native
}

object Base {
  @scala.inline
  def apply(base: String): Base = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
  @scala.inline
  implicit class BaseOps[Self <: Base] (val x: Self) extends AnyVal {
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
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrandTitle(value: String): Self = this.set("brandTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrandTitle: Self = this.set("brandTitle", js.undefined)
  }
  
}

