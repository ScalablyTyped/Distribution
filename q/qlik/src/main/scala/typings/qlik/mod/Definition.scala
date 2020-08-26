package typings.qlik.mod

import typings.qlik.anon.Data
import typings.qlik.qlikStrings.accordion
import typings.qlik.qlikStrings.items
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Definition extends js.Object {
  var component: accordion = js.native
  var items: Data = js.native
  var `type`: items = js.native
}

object Definition {
  @scala.inline
  def apply(component: accordion, items: Data, `type`: items): Definition = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
  @scala.inline
  implicit class DefinitionOps[Self <: Definition] (val x: Self) extends AnyVal {
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
    def setComponent(value: accordion): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def setItems(value: Data): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: items): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

