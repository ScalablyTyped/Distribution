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
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], jqXHR = jqXHR, textStatus = textStatus)
  
    __obj.asInstanceOf[RxJQueryAjaxResult[T]]
  }
}

