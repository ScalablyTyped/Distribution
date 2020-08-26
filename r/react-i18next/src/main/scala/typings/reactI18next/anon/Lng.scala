package typings.reactI18next.anon

import typings.i18next.mod.i18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lng extends js.Object {
  var i18n: typings.i18next.mod.i18n = js.native
  var lng: String = js.native
}

object Lng {
  @scala.inline
  def apply(i18n: i18n, lng: String): Lng = {
    val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lng]
  }
  @scala.inline
  implicit class LngOps[Self <: Lng] (val x: Self) extends AnyVal {
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
    def setI18n(value: i18n): Self = this.set("i18n", value.asInstanceOf[js.Any])
    @scala.inline
    def setLng(value: String): Self = this.set("lng", value.asInstanceOf[js.Any])
  }
  
}

