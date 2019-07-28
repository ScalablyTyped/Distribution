package typings.rxDashJquery

import typings.jquery.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RxJQueryAjaxResult[T] extends js.Object {
  var data: T
  var jqXHR: JQueryXHR
  var textStatus: String
}

object RxJQueryAjaxResult {
  @scala.inline
  def apply[T](data: T, jqXHR: JQueryXHR, textStatus: String): RxJQueryAjaxResult[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], jqXHR = jqXHR, textStatus = textStatus)
  
    __obj.asInstanceOf[RxJQueryAjaxResult[T]]
  }
}

