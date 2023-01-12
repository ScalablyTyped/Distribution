package typings.storybookRouter.distTs3Dot9ModulesReactRouterIndexMod

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
  var pattern: PathPattern
}
object PathMatch {
  
  inline def apply[ParamKey /* <: String */](params: Params[ParamKey], pathname: String, pathnameBase: String, pattern: PathPattern): PathMatch[ParamKey] = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], pathnameBase = pathnameBase.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathMatch[ParamKey]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathMatch[?], ParamKey /* <: String */] (val x: Self & PathMatch[ParamKey]) extends AnyVal {
    
    inline def setParams(value: Params[ParamKey]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
    
    inline def setPathnameBase(value: String): Self = StObject.set(x, "pathnameBase", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: PathPattern): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
  }
}
