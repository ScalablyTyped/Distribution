package typings.sentryBrowser

import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.Response
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTransportsUtilsMod {
  
  @JSImport("@sentry/browser/types/transports/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearCachedFetchImplementation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCachedFetchImplementation")().asInstanceOf[Unit]
  
  inline def getNativeFetchImplementation(): FetchImpl = ^.asInstanceOf[js.Dynamic].applyDynamic("getNativeFetchImplementation")().asInstanceOf[FetchImpl]
  
  @js.native
  trait FetchImpl extends StObject {
    
    def apply(input: RequestInfo): js.Promise[Response] = js.native
    def apply(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
    def apply(input: URL): js.Promise[Response] = js.native
    def apply(input: URL, init: RequestInit): js.Promise[Response] = js.native
  }
}
