package typings.atRiotjsDomDashBindings.atRiotjsDomDashBindingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagBindingData
  extends BaseBindingData
     with BindingData {
  var attributes: js.Array[AttributeExpressionData]
  var slots: js.Array[SlotBindingData]
  def getComponent(name: String): TemplateChunk[_, _]
}

object TagBindingData {
  @scala.inline
  def apply(
    attributes: js.Array[AttributeExpressionData],
    getComponent: String => TemplateChunk[_, _],
    slots: js.Array[SlotBindingData],
    evaluate: /* scope */ js.Any => _ = null,
    redundantAttribute: String = null,
    selector: String = null,
    `type`: BindingType = null
  ): TagBindingData = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], getComponent = js.Any.fromFunction1(getComponent), slots = slots.asInstanceOf[js.Any])
    if (evaluate != null) __obj.updateDynamic("evaluate")(js.Any.fromFunction1(evaluate))
    if (redundantAttribute != null) __obj.updateDynamic("redundantAttribute")(redundantAttribute.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagBindingData]
  }
}

