package typings
package select2Lib.select2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataParams extends js.Object {
  var data: OptionData
   // TODO: must be data source
  var originalEvent: jqueryLib.BaseJQueryEventObject
}

object DataParams {
  @scala.inline
  def apply(data: OptionData, originalEvent: jqueryLib.BaseJQueryEventObject): DataParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("originalEvent")(originalEvent)
    __obj.asInstanceOf[DataParams]
  }
}

