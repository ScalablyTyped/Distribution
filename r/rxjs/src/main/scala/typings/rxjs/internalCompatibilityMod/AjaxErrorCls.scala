package typings.rxjs.internalCompatibilityMod

import typings.rxjs.ajaxObservableMod.AjaxRequest
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal-compatibility", "AjaxError")
@js.native
class AjaxErrorCls protected ()
  extends typings.rxjs.ajaxObservableMod.AjaxError {
  def this(message: String, xhr: XMLHttpRequest, request: AjaxRequest) = this()
}

