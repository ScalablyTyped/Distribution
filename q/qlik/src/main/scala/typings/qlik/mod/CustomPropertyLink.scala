package typings.qlik.mod

import typings.qlik.qlikStrings.link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomPropertyLink
  extends CustomPropertyCommon
     with CustomProperty {
  var component: link = js.native
  var url: js.UndefOr[String] = js.native
}

object CustomPropertyLink {
  @scala.inline
  def apply(component: link): CustomPropertyLink = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyLink]
  }
  @scala.inline
  implicit class CustomPropertyLinkOps[Self <: CustomPropertyLink] (val x: Self) extends AnyVal {
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
    def setComponent(value: link): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

