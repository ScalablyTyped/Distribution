package typings.sentryTypes

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wrappedfunctionMod {
  
  @js.native
  trait WrappedFunction
    extends js.Function
       with /* key */ StringDictionary[Any] {
    
    var __sentry_original__ : js.UndefOr[WrappedFunction] = js.native
    
    var __sentry_wrapped__ : js.UndefOr[WrappedFunction] = js.native
  }
}
