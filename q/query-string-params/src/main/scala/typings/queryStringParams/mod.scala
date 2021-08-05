package typings.queryStringParams

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("query-string-params", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def propertyToUrl(obj: SearchParamOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("propertyToUrl")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def urlToList(url: String): js.Array[SearchParamOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("urlToList")(url.asInstanceOf[js.Any]).asInstanceOf[js.Array[SearchParamOptions]]
  
  inline def urlToProperty(url: String): SearchParamOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("urlToProperty")(url.asInstanceOf[js.Any]).asInstanceOf[SearchParamOptions]
  
  type SearchParamOptions = StringDictionary[js.Array[String]]
}
