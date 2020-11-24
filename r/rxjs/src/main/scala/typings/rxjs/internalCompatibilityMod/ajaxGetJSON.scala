package typings.rxjs.internalCompatibilityMod

import typings.rxjs.internalObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal-compatibility", "ajaxGetJSON")
@js.native
object ajaxGetJSON extends js.Object {
  
  def apply[T](url: String): Observable[T] = js.native
  def apply[T](url: String, headers: js.Object): Observable[T] = js.native
}
