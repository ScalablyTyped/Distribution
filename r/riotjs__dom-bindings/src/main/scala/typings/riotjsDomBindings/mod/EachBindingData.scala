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
    condition: js.UndefOr[Null | (/* scope */ js.Any => _)] = js.undefined,
    evaluate: /* scope */ js.Any => _ = null,
    getKey: js.UndefOr[Null | (/* scope */ js.Any => _)] = js.undefined,
    indexName: js.UndefOr[Double] = js.undefined,
    redundantAttribute: String = null,
    selector: String = null,
    `type`: BindingType = null
  ): EachBindingData = {
    val __obj = js.Dynamic.literal(itemName = itemName.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    if (!js.isUndefined(condition)) __obj.updateDynamic("condition")(if (condition != null) js.Any.fromFunction1(condition.asInstanceOf[/* scope */ js.Any => _]) else null)
    if (evaluate != null) __obj.updateDynamic("evaluate")(js.Any.fromFunction1(evaluate))
    if (!js.isUndefined(getKey)) __obj.updateDynamic("getKey")(if (getKey != null) js.Any.fromFunction1(getKey.asInstanceOf[/* scope */ js.Any => _]) else null)
    if (!js.isUndefined(indexName)) __obj.updateDynamic("indexName")(indexName.get.asInstanceOf[js.Any])
    if (redundantAttribute != null) __obj.updateDynamic("redundantAttribute")(redundantAttribute.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EachBindingData]
  }
}

