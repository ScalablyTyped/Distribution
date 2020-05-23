package typings.riot.anon

import typings.riotjsDomBindings.mod.AttributeExpressionData
import typings.riotjsDomBindings.mod.SlotBindingData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParentScope extends js.Object {
  var attributes: js.Array[AttributeExpressionData]
  var parentScope: js.Any
  var slots: js.Array[SlotBindingData]
}

object ParentScope {
  @scala.inline
  def apply(
    attributes: js.Array[AttributeExpressionData],
    parentScope: js.Any,
    slots: js.Array[SlotBindingData]
  ): ParentScope = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], parentScope = parentScope.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentScope]
  }
}

