package typings.queryStringParams

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("query-string-params", "propertyToUrl")
  @js.native
  def propertyToUrl(obj: SearchParamOptions): String = js.native
  
  @JSImport("query-string-params", "urlToList")
  @js.native
  def urlToList(url: String): js.Array[SearchParamOptions] = js.native
  
  @JSImport("query-string-params", "urlToProperty")
  @js.native
  def urlToProperty(url: String): SearchParamOptions = js.native
  
  type SearchParamOptions = StringDictionary[js.Array[String]]
}
