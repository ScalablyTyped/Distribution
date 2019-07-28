package typings.select2.select2Mod

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
    val __obj = js.Dynamic.literal(data = data, originalEvent = originalEvent)
  
    __obj.asInstanceOf[DataParams]
  }
}

