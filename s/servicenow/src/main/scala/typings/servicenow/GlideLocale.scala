package typings.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlideLocale extends js.Object {
  def getDecimalSeparator(): String = js.native
  def getGroupingSeparator(): String = js.native
}

object GlideLocale {
  @scala.inline
  def apply(getDecimalSeparator: () => String, getGroupingSeparator: () => String): GlideLocale = {
    val __obj = js.Dynamic.literal(getDecimalSeparator = js.Any.fromFunction0(getDecimalSeparator), getGroupingSeparator = js.Any.fromFunction0(getGroupingSeparator))
    __obj.asInstanceOf[GlideLocale]
  }
  @scala.inline
  implicit class GlideLocaleOps[Self <: GlideLocale] (val x: Self) extends AnyVal {
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
    def setGetDecimalSeparator(value: () => String): Self = this.set("getDecimalSeparator", js.Any.fromFunction0(value))
    @scala.inline
    def setGetGroupingSeparator(value: () => String): Self = this.set("getGroupingSeparator", js.Any.fromFunction0(value))
  }
  
}

