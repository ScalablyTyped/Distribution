package typings.qlik.qlikMod

import typings.qlik.Anon_DataDimensions
import typings.qlik.qlikStrings.accordion
import typings.qlik.qlikStrings.items
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Definition extends js.Object {
  var component: accordion
  var items: Anon_DataDimensions
  var `type`: items
}

object Definition {
  @scala.inline
  def apply(component: accordion, items: Anon_DataDimensions, `type`: items): Definition = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
}

