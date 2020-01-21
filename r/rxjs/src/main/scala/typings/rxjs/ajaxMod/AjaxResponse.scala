package typings.rxjs.ajaxMod

import typings.rxjs.ajaxObservableMod.AjaxRequest
import typings.std.Event_
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/ajax", "AjaxResponse")
@js.native
class AjaxResponse protected ()
  extends typings.rxjs.ajaxObservableMod.AjaxResponse {
  def this(originalEvent: Event_, xhr: XMLHttpRequest, request: AjaxRequest) = this()
}

