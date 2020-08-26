package typings.rxjs.ajaxObservableMod

import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/observable/dom/AjaxObservable", "AjaxError")
@js.native
class AjaxErrorCls protected () extends AjaxError {
  def this(message: String, xhr: XMLHttpRequest, request: AjaxRequest) = this()
}

