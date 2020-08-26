package typings.reactNavigationStack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TintColor extends js.Object {
  var tintColor: js.UndefOr[String] = js.native
}

object TintColor {
  @scala.inline
  def apply(): TintColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TintColor]
  }
  @scala.inline
  implicit class TintColorOps[Self <: TintColor] (val x: Self) extends AnyVal {
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
    def setTintColor(value: String): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTintColor: Self = this.set("tintColor", js.undefined)
  }
  
}

