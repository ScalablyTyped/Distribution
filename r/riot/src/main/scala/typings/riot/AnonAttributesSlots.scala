package typings.riot

import typings.riotjsDomBindings.mod.AttributeExpressionData
import typings.riotjsDomBindings.mod.SlotBindingData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttributesSlots extends js.Object {
  var attributes: js.Array[AttributeExpressionData]
  var slots: js.Array[SlotBindingData]
}

object AnonAttributesSlots {
  @scala.inline
  def apply(attributes: js.Array[AttributeExpressionData], slots: js.Array[SlotBindingData]): AnonAttributesSlots = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAttributesSlots]
  }
}

