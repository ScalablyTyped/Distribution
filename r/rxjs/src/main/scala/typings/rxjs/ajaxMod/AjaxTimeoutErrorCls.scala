package typings.rxjs.ajaxMod

import typings.rxjs.ajaxObservableMod.AjaxRequest
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/ajax", "AjaxTimeoutError")
@js.native
class AjaxTimeoutErrorCls protected ()
  extends typings.rxjs.ajaxObservableMod.AjaxError {
  def this(xhr: XMLHttpRequest, request: AjaxRequest) = this()
}

