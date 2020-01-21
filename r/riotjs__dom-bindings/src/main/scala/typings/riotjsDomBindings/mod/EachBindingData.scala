package typings.riotjsDomBindings.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EachBindingData
  extends BaseBindingData
     with BindingData {
  var condition: js.UndefOr[(js.Function1[/* scope */ js.Any, _]) | Null] = js.undefined
  var getKey: js.UndefOr[(js.Function1[/* scope */ js.Any, _]) | Null] = js.undefined
  var indexName: js.UndefOr[Double] = js.undefined
  var itemName: String
  var template: TemplateChunk[_, _]
}

object EachBindingData {
  @scala.inline
  def apply(
    itemName: String,
    template: TemplateChunk[_, _],
    condition: /* scope */ js.Any => _ = null,
    evaluate: /* scope */ js.Any => _ = null,
    getKey: /* scope */ js.Any => _ = null,
    indexName: Int | Double = null,
    redundantAttribute: String = null,
    selector: String = null,
    `type`: BindingType = null
  ): EachBindingData = {
    val __obj = js.Dynamic.literal(itemName = itemName.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(js.Any.fromFunction1(condition))
    if (evaluate != null) __obj.updateDynamic("evaluate")(js.Any.fromFunction1(evaluate))
    if (getKey != null) __obj.updateDynamic("getKey")(js.Any.fromFunction1(getKey))
    if (indexName != null) __obj.updateDynamic("indexName")(indexName.asInstanceOf[js.Any])
    if (redundantAttribute != null) __obj.updateDynamic("redundantAttribute")(redundantAttribute.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EachBindingData]
  }
}

