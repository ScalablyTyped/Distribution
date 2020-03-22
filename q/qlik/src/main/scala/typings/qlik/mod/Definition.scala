package typings.qlik.mod

import typings.qlik.AnonData
import typings.qlik.qlikStrings.accordion
import typings.qlik.qlikStrings.items
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Definition extends js.Object {
  var component: accordion
  var items: AnonData
  var `type`: items
}

object Definition {
  @scala.inline
  def apply(component: accordion, items: AnonData, `type`: items): Definition = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
}

