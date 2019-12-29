package typings.atRiotjsDomDashBindings.atRiotjsDomDashBindingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlotBindingData
  extends BaseBindingData
     with BindingData {
  var bindings: BindingData
  var html: String
  var id: String
}

object SlotBindingData {
  @scala.inline
  def apply(
    bindings: BindingData,
    html: String,
    id: String,
    evaluate: /* scope */ js.Any => _ = null,
    redundantAttribute: String = null,
    selector: String = null,
    `type`: BindingType = null
  ): SlotBindingData = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (evaluate != null) __obj.updateDynamic("evaluate")(js.Any.fromFunction1(evaluate))
    if (redundantAttribute != null) __obj.updateDynamic("redundantAttribute")(redundantAttribute.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotBindingData]
  }
}

