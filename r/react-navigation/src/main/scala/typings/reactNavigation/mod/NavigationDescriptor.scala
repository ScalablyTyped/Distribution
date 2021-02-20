package typings.reactNavigation.mod

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationDescriptor[Params, Options, NavigationScreenPropType] extends StObject {
  
  def getComponent(): ComponentType[js.Object] = js.native
  
  var key: String = js.native
  
  var navigation: NavigationScreenPropType = js.native
  
  var options: Options = js.native
  
  var state: NavigationLeafRoute[Params] | NavigationStateRoute[Params] = js.native
}
object NavigationDescriptor {
  
  @scala.inline
  def apply[Params, Options, NavigationScreenPropType](
    getComponent: () => ComponentType[js.Object],
    key: String,
    navigation: NavigationScreenPropType,
    options: Options,
    state: NavigationLeafRoute[Params] | NavigationStateRoute[Params]
  ): NavigationDescriptor[Params, Options, NavigationScreenPropType] = {
    val __obj = js.Dynamic.literal(getComponent = js.Any.fromFunction0(getComponent), key = key.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationDescriptor[Params, Options, NavigationScreenPropType]]
  }
  
  @scala.inline
  implicit class NavigationDescriptorMutableBuilder[Self <: NavigationDescriptor[_, _, _], Params, Options, NavigationScreenPropType] (val x: Self with (NavigationDescriptor[Params, Options, NavigationScreenPropType])) extends AnyVal {
    
    @scala.inline
    def setGetComponent(value: () => ComponentType[js.Object]): Self = StObject.set(x, "getComponent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigation(value: NavigationScreenPropType): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: NavigationLeafRoute[Params] | NavigationStateRoute[Params]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
