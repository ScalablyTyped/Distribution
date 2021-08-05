package typings.reactNavigation.mod

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationDescriptor[Params, Options, NavigationScreenPropType] extends StObject {
  
  def getComponent(): ComponentType[js.Object]
  
  var key: String
  
  var navigation: NavigationScreenPropType
  
  var options: Options
  
  var state: NavigationLeafRoute[Params] | NavigationStateRoute[Params]
}
object NavigationDescriptor {
  
  inline def apply[Params, Options, NavigationScreenPropType](
    getComponent: () => ComponentType[js.Object],
    key: String,
    navigation: NavigationScreenPropType,
    options: Options,
    state: NavigationLeafRoute[Params] | NavigationStateRoute[Params]
  ): NavigationDescriptor[Params, Options, NavigationScreenPropType] = {
    val __obj = js.Dynamic.literal(getComponent = js.Any.fromFunction0(getComponent), key = key.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationDescriptor[Params, Options, NavigationScreenPropType]]
  }
  
  extension [Self <: NavigationDescriptor[?, ?, ?], Params, Options, NavigationScreenPropType](x: Self & (NavigationDescriptor[Params, Options, NavigationScreenPropType])) {
    
    inline def setGetComponent(value: () => ComponentType[js.Object]): Self = StObject.set(x, "getComponent", js.Any.fromFunction0(value))
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setNavigation(value: NavigationScreenPropType): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setState(value: NavigationLeafRoute[Params] | NavigationStateRoute[Params]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
