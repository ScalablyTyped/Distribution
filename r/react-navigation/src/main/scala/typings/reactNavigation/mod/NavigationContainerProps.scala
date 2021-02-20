package typings.reactNavigation.mod

import typings.react.mod.ComponentType
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationContainerProps[State, Options, ScreenProps] extends StObject {
  
  /**
    * Controls whether the navigation container handles URLs opened via 'Linking'
    * @see https://facebook.github.io/react-native/docs/linking
    * @see https://reactnavigation.org/docs/en/deep-linking.html
    */
  var enableURLHandling: js.UndefOr[Boolean] = js.native
  
  var loadNavigationState: js.UndefOr[js.Function0[js.Promise[_]]] = js.native
  
  var navigation: js.UndefOr[NavigationScreenProp[State, NavigationParams]] = js.native
  
  var navigationOptions: js.UndefOr[Options] = js.native
  
  // defaults to true
  var onNavigationStateChange: js.UndefOr[
    js.Function3[
      /* prevNavigationState */ NavigationState, 
      /* nextNavigationState */ NavigationState, 
      /* action */ NavigationAction, 
      js.UndefOr[Unit | Null]
    ]
  ] = js.native
  
  var persistNavigationState: js.UndefOr[js.Function1[/* state */ NavigationState, js.Promise[_]]] = js.native
  
  /*
    * This prop is no longer supported. Use `loadNavigationState` and
    * `persistNavigationState` instead.
    */
  var persistenceKey: js.UndefOr[String | Null] = js.native
  
  var renderLoadingExperimental: js.UndefOr[ComponentType[js.Object]] = js.native
  
  var screenProps: js.UndefOr[ScreenProps] = js.native
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var uriPrefix: js.UndefOr[String | RegExp] = js.native
}
object NavigationContainerProps {
  
  @scala.inline
  def apply[State, Options, ScreenProps](): NavigationContainerProps[State, Options, ScreenProps] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationContainerProps[State, Options, ScreenProps]]
  }
  
  @scala.inline
  implicit class NavigationContainerPropsMutableBuilder[Self <: NavigationContainerProps[_, _, _], State, Options, ScreenProps] (val x: Self with (NavigationContainerProps[State, Options, ScreenProps])) extends AnyVal {
    
    @scala.inline
    def setEnableURLHandling(value: Boolean): Self = StObject.set(x, "enableURLHandling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableURLHandlingUndefined: Self = StObject.set(x, "enableURLHandling", js.undefined)
    
    @scala.inline
    def setLoadNavigationState(value: () => js.Promise[_]): Self = StObject.set(x, "loadNavigationState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoadNavigationStateUndefined: Self = StObject.set(x, "loadNavigationState", js.undefined)
    
    @scala.inline
    def setNavigation(value: NavigationScreenProp[State, NavigationParams]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationOptions(value: Options): Self = StObject.set(x, "navigationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationOptionsUndefined: Self = StObject.set(x, "navigationOptions", js.undefined)
    
    @scala.inline
    def setNavigationUndefined: Self = StObject.set(x, "navigation", js.undefined)
    
    @scala.inline
    def setOnNavigationStateChange(
      value: (/* prevNavigationState */ NavigationState, /* nextNavigationState */ NavigationState, /* action */ NavigationAction) => js.UndefOr[Unit | Null]
    ): Self = StObject.set(x, "onNavigationStateChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnNavigationStateChangeUndefined: Self = StObject.set(x, "onNavigationStateChange", js.undefined)
    
    @scala.inline
    def setPersistNavigationState(value: /* state */ NavigationState => js.Promise[_]): Self = StObject.set(x, "persistNavigationState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPersistNavigationStateUndefined: Self = StObject.set(x, "persistNavigationState", js.undefined)
    
    @scala.inline
    def setPersistenceKey(value: String): Self = StObject.set(x, "persistenceKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersistenceKeyNull: Self = StObject.set(x, "persistenceKey", null)
    
    @scala.inline
    def setPersistenceKeyUndefined: Self = StObject.set(x, "persistenceKey", js.undefined)
    
    @scala.inline
    def setRenderLoadingExperimental(value: ComponentType[js.Object]): Self = StObject.set(x, "renderLoadingExperimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderLoadingExperimentalUndefined: Self = StObject.set(x, "renderLoadingExperimental", js.undefined)
    
    @scala.inline
    def setScreenProps(value: ScreenProps): Self = StObject.set(x, "screenProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenPropsUndefined: Self = StObject.set(x, "screenProps", js.undefined)
    
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleNull: Self = StObject.set(x, "style", null)
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setUriPrefix(value: String | RegExp): Self = StObject.set(x, "uriPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriPrefixUndefined: Self = StObject.set(x, "uriPrefix", js.undefined)
  }
}
