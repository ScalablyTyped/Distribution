package typings.sentryUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEnvMod {
  
  @JSImport("@sentry/utils/types/env", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSDKSource(): SdkSource = ^.asInstanceOf[js.Dynamic].applyDynamic("getSDKSource")().asInstanceOf[SdkSource]
  
  inline def isBrowserBundle(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBrowserBundle")().asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.sentryUtils.sentryUtilsStrings.npm
    - typings.sentryUtils.sentryUtilsStrings.cdn
    - typings.sentryUtils.sentryUtilsStrings.loader
  */
  trait SdkSource extends StObject
  object SdkSource {
    
    inline def cdn: typings.sentryUtils.sentryUtilsStrings.cdn = "cdn".asInstanceOf[typings.sentryUtils.sentryUtilsStrings.cdn]
    
    inline def loader: typings.sentryUtils.sentryUtilsStrings.loader = "loader".asInstanceOf[typings.sentryUtils.sentryUtilsStrings.loader]
    
    inline def npm: typings.sentryUtils.sentryUtilsStrings.npm = "npm".asInstanceOf[typings.sentryUtils.sentryUtilsStrings.npm]
  }
}
