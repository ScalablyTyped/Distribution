package typings
package rxDashJqueryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RxJQueryAjaxResult[T] extends js.Object {
  var data: T
  var jqXHR: jqueryLib.JQueryXHR
  var textStatus: java.lang.String
}

object RxJQueryAjaxResult {
  @scala.inline
  def apply[T](data: T, jqXHR: jqueryLib.JQueryXHR, textStatus: java.lang.String): RxJQueryAjaxResult[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.updateDynamic("jqXHR")(jqXHR)
    __obj.updateDynamic("textStatus")(textStatus)
    __obj.asInstanceOf[RxJQueryAjaxResult[T]]
  }
}

