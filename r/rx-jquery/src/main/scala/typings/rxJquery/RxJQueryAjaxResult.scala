package typings.rxJquery

import typings.jquery.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RxJQueryAjaxResult[T] extends js.Object {
  var data: T = js.native
  var jqXHR: JQueryXHR = js.native
  var textStatus: String = js.native
}

object RxJQueryAjaxResult {
  @scala.inline
  def apply[T](data: T, jqXHR: JQueryXHR, textStatus: String): RxJQueryAjaxResult[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], jqXHR = jqXHR.asInstanceOf[js.Any], textStatus = textStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[RxJQueryAjaxResult[T]]
  }
  @scala.inline
  implicit class RxJQueryAjaxResultOps[Self <: RxJQueryAjaxResult[_], T] (val x: Self with RxJQueryAjaxResult[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setData(value: T): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setJqXHR(value: JQueryXHR): Self = this.set("jqXHR", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextStatus(value: String): Self = this.set("textStatus", value.asInstanceOf[js.Any])
  }
  
}

