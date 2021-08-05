package typings.reactRouter.mod

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `match`[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof Params ]:? string}
  */ typings.reactRouter.reactRouterStrings.`match` & TopLevel[js.Any] */] extends StObject {
  
  var isExact: Boolean
  
  var params: Params
  
  var path: String
  
  var url: String
}
object `match` {
  
  inline def apply[Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouter.reactRouterStrings.`match` & TopLevel[js.Any] */](isExact: Boolean, params: Params, path: String, url: String): `match`[Params] = {
    val __obj = js.Dynamic.literal(isExact = isExact.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[`match`[Params]]
  }
  
  extension [Self <: `match`[?], Params /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Params ]:? string}
    */ typings.reactRouter.reactRouterStrings.`match` & TopLevel[js.Any] */](x: Self & `match`[Params]) {
    
    inline def setIsExact(value: Boolean): Self = StObject.set(x, "isExact", value.asInstanceOf[js.Any])
    
    inline def setParams(value: Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
