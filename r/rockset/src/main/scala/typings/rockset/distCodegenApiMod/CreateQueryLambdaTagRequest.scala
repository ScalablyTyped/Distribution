package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateQueryLambdaTagRequest extends StObject {
  
  /**
    * name of Query Lambda tag
    * @type {string}
    * @memberof CreateQueryLambdaTagRequest
    */
  var tag_name: js.UndefOr[String] = js.undefined
  
  /**
    * hash identifying a Query Lambda tag
    * @type {string}
    * @memberof CreateQueryLambdaTagRequest
    */
  var version: js.UndefOr[String] = js.undefined
}
object CreateQueryLambdaTagRequest {
  
  inline def apply(): CreateQueryLambdaTagRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateQueryLambdaTagRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateQueryLambdaTagRequest] (val x: Self) extends AnyVal {
    
    inline def setTag_name(value: String): Self = StObject.set(x, "tag_name", value.asInstanceOf[js.Any])
    
    inline def setTag_nameUndefined: Self = StObject.set(x, "tag_name", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
