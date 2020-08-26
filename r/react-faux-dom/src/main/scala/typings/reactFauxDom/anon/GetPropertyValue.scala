package typings.reactFauxDom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPropertyValue extends js.Object {
  def getPropertyValue(name: String): String = js.native
}

object GetPropertyValue {
  @scala.inline
  def apply(getPropertyValue: String => String): GetPropertyValue = {
    val __obj = js.Dynamic.literal(getPropertyValue = js.Any.fromFunction1(getPropertyValue))
    __obj.asInstanceOf[GetPropertyValue]
  }
  @scala.inline
  implicit class GetPropertyValueOps[Self <: GetPropertyValue] (val x: Self) extends AnyVal {
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
    def setGetPropertyValue(value: String => String): Self = this.set("getPropertyValue", js.Any.fromFunction1(value))
  }
  
}

