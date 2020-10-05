package typings.rxjs.internalCompatibilityMod

import typings.rxjs.ajaxObservableMod.AjaxRequest
import typings.std.Event
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal-compatibility", "AjaxResponse")
@js.native
class AjaxResponse protected ()
  extends typings.rxjs.ajaxObservableMod.AjaxResponse {
  def this(originalEvent: Event, xhr: XMLHttpRequest, request: AjaxRequest) = this()
}

