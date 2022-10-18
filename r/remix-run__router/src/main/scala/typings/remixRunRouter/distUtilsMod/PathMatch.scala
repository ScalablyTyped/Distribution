package typings.remixRunRouter.distUtilsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathMatch[ParamKey /* <: String */] extends StObject {
  
  /**
    * The names and values of dynamic parameters in the URL.
    */
  var params: Params[ParamKey]
  
  /**
    * The portion of the URL pathname that was matched.
    */
  var pathname: String
  
  /**
    * The portion of the URL pathname that was matched before child routes.
    */
  var pathnameBase: String
  
  /**
    * The pattern that was used to match.
    */
  var pattern: PathPattern[String]
}
object PathMatch {
  
  inline def apply[ParamKey /* <: String */](params: Params[ParamKey], pathname: String, pathnameBase: String, pattern: PathPattern[String]): PathMatch[ParamKey] = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], pathnameBase = pathnameBase.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathMatch[ParamKey]]
  }
  
  extension [Self <: PathMatch[?], ParamKey /* <: String */](x: Self & PathMatch[ParamKey]) {
    
    inline def setParams(value: Params[ParamKey]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    
    inline def setPathnameBase(value: String): Self = StObject.set(x, "pathnameBase", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: PathPattern[String]): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
  }
}
