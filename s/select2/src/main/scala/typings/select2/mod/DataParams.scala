package typings.select2.mod

import typings.jquery.BaseJQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataParams extends js.Object {
  var data: OptionData
   // TODO: must be data source
  var originalEvent: BaseJQueryEventObject
}

object DataParams {
  @scala.inline
  def apply(data: OptionData, originalEvent: BaseJQueryEventObject): DataParams = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataParams]
  }
}

