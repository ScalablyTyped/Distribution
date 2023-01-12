package typings.serverless.pluginsAwsProviderAwsProviderMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpRequestParametersValidation extends StObject {
  
  var headers: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  
  var paths: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  
  var querystrings: js.UndefOr[StringDictionary[Boolean]] = js.undefined
}
object HttpRequestParametersValidation {
  
  inline def apply(): HttpRequestParametersValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpRequestParametersValidation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HttpRequestParametersValidation] (val x: Self) extends AnyVal {
    
    inline def setHeaders(value: StringDictionary[Boolean]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setPaths(value: StringDictionary[Boolean]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    inline def setQuerystrings(value: StringDictionary[Boolean]): Self = StObject.set(x, "querystrings", value.asInstanceOf[js.Any])
    
    inline def setQuerystringsUndefined: Self = StObject.set(x, "querystrings", js.undefined)
  }
}
