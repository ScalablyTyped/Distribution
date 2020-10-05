package typings.rxjs

import typings.rxjs.anon.Selector
import typings.rxjs.internalObservableMod.Observable
import typings.std.Request
import typings.std.RequestInit
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/observable/dom/fetch", JSImport.Namespace)
@js.native
object domFetchMod extends js.Object {
  def fromFetch(input: String): Observable[Response] = js.native
  def fromFetch(input: String, init: RequestInit): Observable[Response] = js.native
  def fromFetch(input: Request): Observable[Response] = js.native
  def fromFetch(input: Request, init: RequestInit): Observable[Response] = js.native
  @JSName("fromFetch")
  def fromFetch_T[T](input: String, init: RequestInit with Selector[T]): Observable[T] = js.native
  @JSName("fromFetch")
  def fromFetch_T[T](input: Request, init: RequestInit with Selector[T]): Observable[T] = js.native
}

