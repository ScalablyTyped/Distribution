package typings.rxDom.mod.rxAugmentingMod.DOM

import typings.rx.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rx", "DOM.jsonpRequest")
@js.native
object jsonpRequest extends js.Object {
  
  def apply(settings: JsonpSettings): Observable[JsonpSuccessResponse] = js.native
  def apply(url: String): Observable[String] = js.native
}
