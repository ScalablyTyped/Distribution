package typings.rxDom.mod.rxAugmentingMod.DOM

import typings.rx.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx", "DOM.jsonpRequest")
@js.native
object jsonpRequest extends js.Object {
  def apply(settings: JsonpSettings): Observable[JsonpSuccessResponse] = js.native
  def apply(url: String): Observable[String] = js.native
}

