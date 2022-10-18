package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibApiTokenMod {
  
  @JSImport("snyk/dist/lib/api-token", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def api(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("api")().asInstanceOf[js.UndefOr[String]]
  
  inline def apiOrOAuthTokenExists(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("apiOrOAuthTokenExists")().asInstanceOf[String]
  
  inline def apiTokenExists(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("apiTokenExists")().asInstanceOf[String]
  
  inline def getAuthHeader(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuthHeader")().asInstanceOf[String]
  
  inline def getDockerToken(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDockerToken")().asInstanceOf[js.UndefOr[String]]
  
  inline def getOAuthToken(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOAuthToken")().asInstanceOf[js.UndefOr[String]]
  
  inline def someTokenExists(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("someTokenExists")().asInstanceOf[Boolean]
}
