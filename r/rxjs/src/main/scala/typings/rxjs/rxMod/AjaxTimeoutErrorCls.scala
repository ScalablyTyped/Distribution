package typings.rxjs.rxMod

import typings.rxjs.ajaxObservableMod.AjaxRequest
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/Rx", "AjaxTimeoutError")
@js.native
class AjaxTimeoutErrorCls protected ()
  extends typings.rxjs.ajaxObservableMod.AjaxError {
  def this(xhr: XMLHttpRequest, request: AjaxRequest) = this()
}

