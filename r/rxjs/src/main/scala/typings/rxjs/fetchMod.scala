package typings.rxjs

import typings.rxjs.anon.Selector
import typings.rxjs.distTypesInternalObservableMod.Observable
import typings.std.Request
import typings.std.RequestInit
import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object fetchMod {
  
  @JSImport("rxjs/fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromFetch(input: String): Observable[Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFetch")(input.asInstanceOf[js.Any]).asInstanceOf[Observable[Response]]
  inline def fromFetch(input: String, init: RequestInit): Observable[Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Observable[Response]]
  inline def fromFetch(input: Request): Observable[Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFetch")(input.asInstanceOf[js.Any]).asInstanceOf[Observable[Response]]
  inline def fromFetch(input: Request, init: RequestInit): Observable[Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Observable[Response]]
  inline def fromFetch[T](input: String, init: RequestInit & Selector[T]): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
  inline def fromFetch[T](input: Request, init: RequestInit & Selector[T]): Observable[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFetch")(input.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Observable[T]]
}
