package typings.riot

import typings.atRiotjsDomDashBindings.atRiotjsDomDashBindingsMod.AttributeExpressionData
import typings.atRiotjsDomDashBindings.atRiotjsDomDashBindingsMod.SlotBindingData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AttributesSlots extends js.Object {
  var attributes: js.Array[AttributeExpressionData]
  var slots: js.Array[SlotBindingData]
}

object Anon_AttributesSlots {
  @scala.inline
  def apply(attributes: js.Array[AttributeExpressionData], slots: js.Array[SlotBindingData]): Anon_AttributesSlots = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AttributesSlots]
  }
}

