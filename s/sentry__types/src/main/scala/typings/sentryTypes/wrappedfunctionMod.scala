package typings.sentryTypes

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sentry/types/dist/wrappedfunction", JSImport.Namespace)
@js.native
object wrappedfunctionMod extends js.Object {
  
  @js.native
  trait WrappedFunction
    extends js.Function
       with /* key */ StringDictionary[js.Any] {
    
    var __sentry__ : js.UndefOr[Boolean] = js.native
    
    var __sentry_original__ : js.UndefOr[WrappedFunction] = js.native
    
    var __sentry_wrapped__ : js.UndefOr[WrappedFunction] = js.native
  }
}
