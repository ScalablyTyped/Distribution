package typings.riotjsDomBindings.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.riotjsDomBindings.mod.IfBindingData
  - typings.riotjsDomBindings.mod.EachBindingData
  - typings.riotjsDomBindings.mod.SimpleBindingData
  - typings.riotjsDomBindings.mod.SlotBindingData
  - typings.riotjsDomBindings.mod.TagBindingData
*/
trait BindingData extends js.Object

object BindingData {
  @scala.inline
  def TagBindingData(
    attributes: js.Array[AttributeExpressionData],
    getComponent: String => TemplateChunk[_, _],
    slots: js.Array[SlotBindingData],
    evaluate: /* scope */ js.Any => _ = null,
    redundantAttribute: String = null,
    selector: String = null,
    `type`: BindingType = null
  ): BindingData = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], getComponent = js.Any.fromFunction1(getComponent), slots = slots.asInstanceOf[js.Any])
    if (evaluate != null) __obj.updateDynamic("evaluate")(js.Any.fromFunction1(evaluate))
    if (redundantAttribute != null) __obj.updateDynamic("redundantAttribute")(redundantAttribute.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingData]
  }
  @scala.inline
  def SlotBindingData(
    bindings: BindingData,
    html: String,
    id: String,
    evaluate: /* scope */ js.Any => _ = null,
    redundantAttribute: String = null,
    selector: String = null,
    `type`: BindingType = null
  ): BindingData = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (evaluate != null) __obj.updateDynamic("evaluate")(js.Any.fromFunction1(evaluate))
    if (redundantAttribute != null) __obj.updateDynamic("redundantAttribute")(redundantAttribute.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingData]
  }
  @scala.inline
  def IfBindingData(
    template: TemplateChunk[_, _],
    evaluate: /* scope */ js.Any => _ = null,
    redundantAttribute: String = null,
    selector: String = null,
    `type`: BindingType = null
  ): BindingData = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    if (evaluate != null) __obj.updateDynamic("evaluate")(js.Any.fromFunction1(evaluate))
    if (redundantAttribute != null) __obj.updateDynamic("redundantAttribute")(redundantAttribute.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingData]
  }
  @scala.inline
  def EachBindingData(
    itemName: String,
    template: TemplateChunk[_, _],
    condition: /* scope */ js.Any => _ = null,
    evaluate: /* scope */ js.Any => _ = null,
    getKey: /* scope */ js.Any => _ = null,
    indexName: Int | Double = null,
    redundantAttribute: String = null,
    selector: String = null,
    `type`: BindingType = null
  ): BindingData = {
    val __obj = js.Dynamic.literal(itemName = itemName.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(js.Any.fromFunction1(condition))
    if (evaluate != null) __obj.updateDynamic("evaluate")(js.Any.fromFunction1(evaluate))
    if (getKey != null) __obj.updateDynamic("getKey")(js.Any.fromFunction1(getKey))
    if (indexName != null) __obj.updateDynamic("indexName")(indexName.asInstanceOf[js.Any])
    if (redundantAttribute != null) __obj.updateDynamic("redundantAttribute")(redundantAttribute.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingData]
  }
  @scala.inline
  def SimpleBindingData(
    expressions: js.Array[ExpressionData],
    evaluate: /* scope */ js.Any => _ = null,
    redundantAttribute: String = null,
    selector: String = null,
    `type`: BindingType = null
  ): BindingData = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any])
    if (evaluate != null) __obj.updateDynamic("evaluate")(js.Any.fromFunction1(evaluate))
    if (redundantAttribute != null) __obj.updateDynamic("redundantAttribute")(redundantAttribute.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingData]
  }
}

