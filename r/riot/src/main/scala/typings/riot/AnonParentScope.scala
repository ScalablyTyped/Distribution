package typings.riot

import typings.riotjsDomBindings.mod.AttributeExpressionData
import typings.riotjsDomBindings.mod.SlotBindingData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParentScope extends js.Object {
  var attributes: js.Array[AttributeExpressionData]
  var parentScope: js.Any
  var slots: js.Array[SlotBindingData]
}

object AnonParentScope {
  @scala.inline
  def apply(
    attributes: js.Array[AttributeExpressionData],
    parentScope: js.Any,
    slots: js.Array[SlotBindingData]
  ): AnonParentScope = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], parentScope = parentScope.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParentScope]
  }
}

