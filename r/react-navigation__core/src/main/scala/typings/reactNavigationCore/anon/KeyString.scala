package typings.reactNavigationCore.anon

import typings.reactNavigationRouters.typesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyString[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */] extends StObject {
  
  var key: String
  
  var params: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
  ] = js.undefined
}
object KeyString {
  
  @scala.inline
  def apply[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */](key: String): KeyString[ParamList, RouteName] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyString[ParamList, RouteName]]
  }
  
  @scala.inline
  implicit class KeyStringMutableBuilder[Self <: KeyString[?, ?], ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */] (val x: Self & (KeyString[ParamList, RouteName])) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(
      value: /* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any
    ): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
