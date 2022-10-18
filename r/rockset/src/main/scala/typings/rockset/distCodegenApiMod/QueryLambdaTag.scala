package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryLambdaTag extends StObject {
  
  /**
    * name of Query Lambda tag
    * @type {string}
    * @memberof QueryLambdaTag
    */
  var tag_name: js.UndefOr[String] = js.undefined
  
  /**
    * query lambda version
    * @type {QueryLambdaVersion}
    * @memberof QueryLambdaTag
    */
  var version: js.UndefOr[QueryLambdaVersion] = js.undefined
}
object QueryLambdaTag {
  
  inline def apply(): QueryLambdaTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryLambdaTag]
  }
  
  extension [Self <: QueryLambdaTag](x: Self) {
    
    inline def setTag_name(value: String): Self = StObject.set(x, "tag_name", value.asInstanceOf[js.Any])
    
    inline def setTag_nameUndefined: Self = StObject.set(x, "tag_name", js.undefined)
    
    inline def setVersion(value: QueryLambdaVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
