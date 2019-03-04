package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Definition extends js.Object {
  var component: qlikLib.qlikLibStrings.accordion
  var items: qlikLib.Anon_DataDimensions
  var `type`: qlikLib.qlikLibStrings.items
}

object Definition {
  @scala.inline
  def apply(
    component: qlikLib.qlikLibStrings.accordion,
    items: qlikLib.Anon_DataDimensions,
    `type`: qlikLib.qlikLibStrings.items
  ): Definition = {
    val __obj = js.Dynamic.literal(component = component, items = items)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Definition]
  }
}

