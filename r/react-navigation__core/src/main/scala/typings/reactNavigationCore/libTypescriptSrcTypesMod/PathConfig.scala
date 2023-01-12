package typings.reactNavigationCore.libTypescriptSrcTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathConfig[ParamList /* <: js.Object */] extends StObject {
  
  var exact: js.UndefOr[Boolean] = js.undefined
  
  var initialRouteName: js.UndefOr[/* keyof ParamList */ String] = js.undefined
  
  var parse: js.UndefOr[Record[String, js.Function1[/* value */ String, Any]]] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var screens: js.UndefOr[PathConfigMap[ParamList]] = js.undefined
  
  var stringify: js.UndefOr[Record[String, js.Function1[/* value */ Any, String]]] = js.undefined
}
object PathConfig {
  
  inline def apply[ParamList /* <: js.Object */](): PathConfig[ParamList] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathConfig[ParamList]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathConfig[?], ParamList /* <: js.Object */] (val x: Self & PathConfig[ParamList]) extends AnyVal {
    
    inline def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
    
    inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
    
    inline def setInitialRouteName(value: /* keyof ParamList */ String): Self = StObject.set(x, "initialRouteName", value.asInstanceOf[js.Any])
    
    inline def setInitialRouteNameUndefined: Self = StObject.set(x, "initialRouteName", js.undefined)
    
    inline def setParse(value: Record[String, js.Function1[/* value */ String, Any]]): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setScreens(value: PathConfigMap[ParamList]): Self = StObject.set(x, "screens", value.asInstanceOf[js.Any])
    
    inline def setScreensUndefined: Self = StObject.set(x, "screens", js.undefined)
    
    inline def setStringify(value: Record[String, js.Function1[/* value */ Any, String]]): Self = StObject.set(x, "stringify", value.asInstanceOf[js.Any])
    
    inline def setStringifyUndefined: Self = StObject.set(x, "stringify", js.undefined)
  }
}
