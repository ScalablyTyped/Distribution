package typings.reactNavigation.mod

import typings.react.mod.ComponentType
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationContainerProps[State, Options, ScreenProps] extends StObject {
  
  /**
    * Controls whether the navigation container handles URLs opened via 'Linking'
    * @see https://facebook.github.io/react-native/docs/linking
    * @see https://reactnavigation.org/docs/en/deep-linking.html
    */
  var enableURLHandling: js.UndefOr[Boolean] = js.undefined
  
  var loadNavigationState: js.UndefOr[js.Function0[js.Promise[Any]]] = js.undefined
  
  var navigation: js.UndefOr[NavigationScreenProp[State, NavigationParams]] = js.undefined
  
  var navigationOptions: js.UndefOr[Options] = js.undefined
  
  // defaults to true
  var onNavigationStateChange: js.UndefOr[
    js.Function3[
      /* prevNavigationState */ NavigationState, 
      /* nextNavigationState */ NavigationState, 
      /* action */ NavigationAction, 
      js.UndefOr[Unit | Null]
    ]
  ] = js.undefined
  
  var persistNavigationState: js.UndefOr[js.Function1[/* state */ NavigationState, js.Promise[Any]]] = js.undefined
  
  /*
    * This prop is no longer supported. Use `loadNavigationState` and
    * `persistNavigationState` instead.
    */
  var persistenceKey: js.UndefOr[String | Null] = js.undefined
  
  var renderLoadingExperimental: js.UndefOr[ComponentType[js.Object]] = js.undefined
  
  var screenProps: js.UndefOr[ScreenProps] = js.undefined
  
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var uriPrefix: js.UndefOr[String | js.RegExp] = js.undefined
}
object NavigationContainerProps {
  
  inline def apply[State, Options, ScreenProps](): NavigationContainerProps[State, Options, ScreenProps] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationContainerProps[State, Options, ScreenProps]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationContainerProps[?, ?, ?], State, Options, ScreenProps] (val x: Self & (NavigationContainerProps[State, Options, ScreenProps])) extends AnyVal {
    
    inline def setEnableURLHandling(value: Boolean): Self = StObject.set(x, "enableURLHandling", value.asInstanceOf[js.Any])
    
    inline def setEnableURLHandlingUndefined: Self = StObject.set(x, "enableURLHandling", js.undefined)
    
    inline def setLoadNavigationState(value: () => js.Promise[Any]): Self = StObject.set(x, "loadNavigationState", js.Any.fromFunction0(value))
    
    inline def setLoadNavigationStateUndefined: Self = StObject.set(x, "loadNavigationState", js.undefined)
    
    inline def setNavigation(value: NavigationScreenProp[State, NavigationParams]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setNavigationOptions(value: Options): Self = StObject.set(x, "navigationOptions", value.asInstanceOf[js.Any])
    
    inline def setNavigationOptionsUndefined: Self = StObject.set(x, "navigationOptions", js.undefined)
    
    inline def setNavigationUndefined: Self = StObject.set(x, "navigation", js.undefined)
    
    inline def setOnNavigationStateChange(
      value: (/* prevNavigationState */ NavigationState, /* nextNavigationState */ NavigationState, /* action */ NavigationAction) => js.UndefOr[Unit | Null]
    ): Self = StObject.set(x, "onNavigationStateChange", js.Any.fromFunction3(value))
    
    inline def setOnNavigationStateChangeUndefined: Self = StObject.set(x, "onNavigationStateChange", js.undefined)
    
    inline def setPersistNavigationState(value: /* state */ NavigationState => js.Promise[Any]): Self = StObject.set(x, "persistNavigationState", js.Any.fromFunction1(value))
    
    inline def setPersistNavigationStateUndefined: Self = StObject.set(x, "persistNavigationState", js.undefined)
    
    inline def setPersistenceKey(value: String): Self = StObject.set(x, "persistenceKey", value.asInstanceOf[js.Any])
    
    inline def setPersistenceKeyNull: Self = StObject.set(x, "persistenceKey", null)
    
    inline def setPersistenceKeyUndefined: Self = StObject.set(x, "persistenceKey", js.undefined)
    
    inline def setRenderLoadingExperimental(value: ComponentType[js.Object]): Self = StObject.set(x, "renderLoadingExperimental", value.asInstanceOf[js.Any])
    
    inline def setRenderLoadingExperimentalUndefined: Self = StObject.set(x, "renderLoadingExperimental", js.undefined)
    
    inline def setScreenProps(value: ScreenProps): Self = StObject.set(x, "screenProps", value.asInstanceOf[js.Any])
    
    inline def setScreenPropsUndefined: Self = StObject.set(x, "screenProps", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setUriPrefix(value: String | js.RegExp): Self = StObject.set(x, "uriPrefix", value.asInstanceOf[js.Any])
    
    inline def setUriPrefixUndefined: Self = StObject.set(x, "uriPrefix", js.undefined)
  }
}
