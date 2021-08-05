package typings.sharepoint.global.SP

import typings.sharepoint.anon.High
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.PageContextInfo")
@js.native
class PageContextInfo ()
  extends StObject
     with typings.sharepoint.SP.PageContextInfo
object PageContextInfo {
  
  @JSGlobal("SP.PageContextInfo")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getClientServerTimeDelta(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("get_clientServerTimeDelta")().asInstanceOf[Double]
  
  /* static member */
  inline def getCurrentCultureName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get_currentCultureName")().asInstanceOf[String]
  
  /* static member */
  inline def getCurrentLanguage(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("get_currentLanguage")().asInstanceOf[Double]
  
  /* static member */
  inline def getCurrentUICultureName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get_currentUICultureName")().asInstanceOf[String]
  
  /* static member */
  inline def getIsAppWeb(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("get_isAppWeb")().asInstanceOf[Boolean]
  
  /* static member */
  inline def getPageItemId(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("get_pageItemId")().asInstanceOf[Double]
  
  /* static member */
  inline def getPageListId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get_pageListId")().asInstanceOf[String]
  
  /* static member */
  inline def getPagePersonalizationScope(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get_pagePersonalizationScope")().asInstanceOf[String]
  
  /* static member */
  inline def getServerRequestPath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get_serverRequestPath")().asInstanceOf[String]
  
  /* static member */
  inline def getSiteAbsoluteUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get_siteAbsoluteUrl")().asInstanceOf[String]
  
  /* static member */
  inline def getSiteServerRelativeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get_siteServerRelativeUrl")().asInstanceOf[String]
  
  /* static member */
  inline def getTenantAppVersion(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get_tenantAppVersion")().asInstanceOf[String]
  
  /* static member */
  inline def getUserLoginName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get_userLoginName")().asInstanceOf[String]
  
  /* static member */
  inline def getWebAbsoluteUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get_webAbsoluteUrl")().asInstanceOf[String]
  
  /* static member */
  inline def getWebLanguage(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("get_webLanguage")().asInstanceOf[Double]
  
  /* static member */
  inline def getWebLogoUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get_webLogoUrl")().asInstanceOf[String]
  
  /* static member */
  inline def getWebPermMasks(): High = ^.asInstanceOf[js.Dynamic].applyDynamic("get_webPermMasks")().asInstanceOf[High]
  
  /* static member */
  inline def getWebServerRelativeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get_webServerRelativeUrl")().asInstanceOf[String]
  
  /* static member */
  inline def getWebTemplate(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get_webTemplate")().asInstanceOf[String]
  
  /* static member */
  inline def getWebTitle(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("get_webTitle")().asInstanceOf[String]
}
