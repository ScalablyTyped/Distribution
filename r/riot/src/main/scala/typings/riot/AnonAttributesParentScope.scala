package typings.riot

import typings.riotjsDomBindings.mod.AttributeExpressionData
import typings.riotjsDomBindings.mod.SlotBindingData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAttributesParentScope extends js.Object {
  var attributes: js.Array[AttributeExpressionData]
  var parentScope: js.Any
  var slots: js.Array[SlotBindingData]
}

object AnonAttributesParentScope {
  @scala.inline
  def apply(
    attributes: js.Array[AttributeExpressionData],
    parentScope: js.Any,
    slots: js.Array[SlotBindingData]
  ): AnonAttributesParentScope = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], parentScope = parentScope.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAttributesParentScope]
  }
}

