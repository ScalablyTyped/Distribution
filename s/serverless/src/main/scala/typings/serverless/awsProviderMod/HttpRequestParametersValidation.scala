package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpRequestParametersValidation extends StObject {
  
  var headers: js.UndefOr[StringDictionary[Boolean]] = js.native
  
  var paths: js.UndefOr[StringDictionary[Boolean]] = js.native
  
  var querystrings: js.UndefOr[StringDictionary[Boolean]] = js.native
}
object HttpRequestParametersValidation {
  
  @scala.inline
  def apply(): HttpRequestParametersValidation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpRequestParametersValidation]
  }
  
  @scala.inline
  implicit class HttpRequestParametersValidationMutableBuilder[Self <: HttpRequestParametersValidation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: StringDictionary[Boolean]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setPaths(value: StringDictionary[Boolean]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    @scala.inline
    def setQuerystrings(value: StringDictionary[Boolean]): Self = StObject.set(x, "querystrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuerystringsUndefined: Self = StObject.set(x, "querystrings", js.undefined)
  }
}
