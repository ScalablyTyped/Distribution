package typings.queryStringParams

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("query-string-params", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def propertyToUrl(obj: SearchParamOptions): String = js.native
  
  def urlToList(url: String): js.Array[SearchParamOptions] = js.native
  
  def urlToProperty(url: String): SearchParamOptions = js.native
  
  type SearchParamOptions = StringDictionary[js.Array[String]]
}
