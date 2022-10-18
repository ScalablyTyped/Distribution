package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibConfigApiUrlMod {
  
  @JSImport("snyk/dist/lib/config/api-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBaseApiUrl(defaultUrl: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBaseApiUrl")(defaultUrl.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getBaseApiUrl(defaultUrl: String, envvarDefinedApiUrl: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBaseApiUrl")(defaultUrl.asInstanceOf[js.Any], envvarDefinedApiUrl.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getBaseApiUrl(defaultUrl: String, envvarDefinedApiUrl: String, configDefinedApiUrl: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBaseApiUrl")(defaultUrl.asInstanceOf[js.Any], envvarDefinedApiUrl.asInstanceOf[js.Any], configDefinedApiUrl.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getBaseApiUrl(defaultUrl: String, envvarDefinedApiUrl: Unit, configDefinedApiUrl: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBaseApiUrl")(defaultUrl.asInstanceOf[js.Any], envvarDefinedApiUrl.asInstanceOf[js.Any], configDefinedApiUrl.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getRestApiUrl(baseApiUrl: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRestApiUrl")(baseApiUrl.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getRestApiUrl(baseApiUrl: String, envvarDefinedRestApiUrl: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getRestApiUrl")(baseApiUrl.asInstanceOf[js.Any], envvarDefinedRestApiUrl.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getRestApiUrl(baseApiUrl: String, envvarDefinedRestApiUrl: String, envvarDefinedRestV3Url: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getRestApiUrl")(baseApiUrl.asInstanceOf[js.Any], envvarDefinedRestApiUrl.asInstanceOf[js.Any], envvarDefinedRestV3Url.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getRestApiUrl(baseApiUrl: String, envvarDefinedRestApiUrl: Unit, envvarDefinedRestV3Url: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getRestApiUrl")(baseApiUrl.asInstanceOf[js.Any], envvarDefinedRestApiUrl.asInstanceOf[js.Any], envvarDefinedRestV3Url.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getV1ApiUrl(baseApiUrl: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getV1ApiUrl")(baseApiUrl.asInstanceOf[js.Any]).asInstanceOf[String]
}
