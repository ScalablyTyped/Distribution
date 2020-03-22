package typings.rcTreeSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilterOption extends js.Object {
  var filterOption: Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterFunc<LegacyDataNode> */ js.Any)
  var optionFilterProp: String
}

object AnonFilterOption {
  @scala.inline
  def apply(
    filterOption: Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FilterFunc<LegacyDataNode> */ js.Any),
    optionFilterProp: String
  ): AnonFilterOption = {
    val __obj = js.Dynamic.literal(filterOption = filterOption.asInstanceOf[js.Any], optionFilterProp = optionFilterProp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFilterOption]
  }
}

