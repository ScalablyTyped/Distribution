package typings.sentryUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object supportsMod {
  
  @JSImport("@sentry/utils/types/supports", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isNativeFetch(func: js.Function): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNativeFetch")(func.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def supportsDOMError(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsDOMError")().asInstanceOf[Boolean]
  
  inline def supportsDOMException(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsDOMException")().asInstanceOf[Boolean]
  
  inline def supportsErrorEvent(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsErrorEvent")().asInstanceOf[Boolean]
  
  inline def supportsFetch(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsFetch")().asInstanceOf[Boolean]
  
  inline def supportsHistory(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsHistory")().asInstanceOf[Boolean]
  
  inline def supportsNativeFetch(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsNativeFetch")().asInstanceOf[Boolean]
  
  inline def supportsReferrerPolicy(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsReferrerPolicy")().asInstanceOf[Boolean]
  
  inline def supportsReportingObserver(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsReportingObserver")().asInstanceOf[Boolean]
}
