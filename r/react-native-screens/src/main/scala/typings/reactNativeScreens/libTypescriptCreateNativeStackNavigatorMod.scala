package typings.reactNativeScreens

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.reactNative.mod.Animated.WithAnimatedValue
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeScreens.anon.TintColor
import typings.reactNativeScreens.reactNativeScreensStrings.containedModal
import typings.reactNativeScreens.reactNativeScreensStrings.modal
import typings.reactNativeScreens.reactNativeScreensStrings.none
import typings.reactNavigation.mod.CreateNavigatorConfig
import typings.reactNavigation.mod.NavigationNavigator
import typings.reactNavigation.mod.NavigationProp
import typings.reactNavigation.mod.NavigationRouteConfigMap
import typings.reactNavigation.mod.NavigationStackRouterConfig
import typings.reactNavigation.mod.NavigationState
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptCreateNativeStackNavigatorMod {
  
  @JSImport("react-native-screens/lib/typescript/createNativeStackNavigator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    routeConfigMap: NavigationRouteConfigMap[
      NativeStackNavigationOptions, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StackNavigationProp */ Any, 
      Any
    ]
  ): NavigationNavigator[Record[String, Any], NavigationProp[NavigationState]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(routeConfigMap.asInstanceOf[js.Any]).asInstanceOf[NavigationNavigator[Record[String, Any], NavigationProp[NavigationState]]]
  inline def default(
    routeConfigMap: NavigationRouteConfigMap[
      NativeStackNavigationOptions, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StackNavigationProp */ Any, 
      Any
    ],
    stackConfig: CreateNavigatorConfig[
      NativeStackNavigationConfig, 
      NavigationStackRouterConfig, 
      NativeStackNavigationOptions, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StackNavigationProp */ Any
    ]
  ): NavigationNavigator[Record[String, Any], NavigationProp[NavigationState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routeConfigMap.asInstanceOf[js.Any], stackConfig.asInstanceOf[js.Any])).asInstanceOf[NavigationNavigator[Record[String, Any], NavigationProp[NavigationState]]]
  
  trait BackButtonProps extends StObject {
    
    var backButtonTitle: js.UndefOr[String] = js.undefined
    
    var backTitleVisible: js.UndefOr[Boolean] = js.undefined
    
    var headerBackImage: js.UndefOr[js.Function1[/* props */ TintColor, ReactNode]] = js.undefined
    
    var headerBackTitleStyle: js.UndefOr[WithAnimatedValue[StyleProp[TextStyle]]] = js.undefined
    
    var headerPressColorAndroid: js.UndefOr[String] = js.undefined
    
    var headerTintColor: js.UndefOr[String] = js.undefined
    
    var layoutPreset: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Layout */ Any
      ] = js.undefined
    
    var truncatedBackButtonTitle: js.UndefOr[String] = js.undefined
  }
  object BackButtonProps {
    
    inline def apply(): BackButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackButtonProps]
    }
    
    extension [Self <: BackButtonProps](x: Self) {
      
      inline def setBackButtonTitle(value: String): Self = StObject.set(x, "backButtonTitle", value.asInstanceOf[js.Any])
      
      inline def setBackButtonTitleUndefined: Self = StObject.set(x, "backButtonTitle", js.undefined)
      
      inline def setBackTitleVisible(value: Boolean): Self = StObject.set(x, "backTitleVisible", value.asInstanceOf[js.Any])
      
      inline def setBackTitleVisibleUndefined: Self = StObject.set(x, "backTitleVisible", js.undefined)
      
      inline def setHeaderBackImage(value: /* props */ TintColor => ReactNode): Self = StObject.set(x, "headerBackImage", js.Any.fromFunction1(value))
      
      inline def setHeaderBackImageUndefined: Self = StObject.set(x, "headerBackImage", js.undefined)
      
      inline def setHeaderBackTitleStyle(value: WithAnimatedValue[StyleProp[TextStyle]]): Self = StObject.set(x, "headerBackTitleStyle", value.asInstanceOf[js.Any])
      
      inline def setHeaderBackTitleStyleUndefined: Self = StObject.set(x, "headerBackTitleStyle", js.undefined)
      
      inline def setHeaderPressColorAndroid(value: String): Self = StObject.set(x, "headerPressColorAndroid", value.asInstanceOf[js.Any])
      
      inline def setHeaderPressColorAndroidUndefined: Self = StObject.set(x, "headerPressColorAndroid", js.undefined)
      
      inline def setHeaderTintColor(value: String): Self = StObject.set(x, "headerTintColor", value.asInstanceOf[js.Any])
      
      inline def setHeaderTintColorUndefined: Self = StObject.set(x, "headerTintColor", js.undefined)
      
      inline def setLayoutPreset(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Layout */ Any
      ): Self = StObject.set(x, "layoutPreset", value.asInstanceOf[js.Any])
      
      inline def setLayoutPresetUndefined: Self = StObject.set(x, "layoutPreset", js.undefined)
      
      inline def setTruncatedBackButtonTitle(value: String): Self = StObject.set(x, "truncatedBackButtonTitle", value.asInstanceOf[js.Any])
      
      inline def setTruncatedBackButtonTitleUndefined: Self = StObject.set(x, "truncatedBackButtonTitle", js.undefined)
    }
  }
  
  trait NativeStackNavigationConfig extends StObject {
    
    /** This is an option from `stackNavigator` and makes the header hide when set to `none`. Use `headerShown` instead to be consistent with v5 `native-stack` */
    var headerMode: js.UndefOr[none] = js.undefined
    
    /** This is an option from `stackNavigator` and controls the stack presentation along with `cardTransparent` prop. Use `stackPresentation` instead to be consistent with v5 `native-stack` */
    var mode: js.UndefOr[modal | containedModal] = js.undefined
    
    /** This is an option from `stackNavigator` and controls the stack presentation along with `mode` prop. Use `stackPresentation` instead to be consistent with v5 `native-stack` */
    var transparentCard: js.UndefOr[Boolean] = js.undefined
  }
  object NativeStackNavigationConfig {
    
    inline def apply(): NativeStackNavigationConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NativeStackNavigationConfig]
    }
    
    extension [Self <: NativeStackNavigationConfig](x: Self) {
      
      inline def setHeaderMode(value: none): Self = StObject.set(x, "headerMode", value.asInstanceOf[js.Any])
      
      inline def setHeaderModeUndefined: Self = StObject.set(x, "headerMode", js.undefined)
      
      inline def setMode(value: modal | containedModal): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setTransparentCard(value: Boolean): Self = StObject.set(x, "transparentCard", value.asInstanceOf[js.Any])
      
      inline def setTransparentCardUndefined: Self = StObject.set(x, "transparentCard", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.reactNativeScreens.libTypescriptCreateNativeStackNavigatorMod.BackButtonProps because var conflicts: headerBackTitleStyle, headerTintColor. Inlined headerBackImage, headerPressColorAndroid, backButtonTitle, truncatedBackButtonTitle, backTitleVisible, layoutPreset */ trait NativeStackNavigationOptions
    extends StObject
       with StackNavigatorOptions
       with typings.reactNativeScreens.libTypescriptNativeStackTypesMod.NativeStackNavigationOptions {
    
    var backButtonTitle: js.UndefOr[String] = js.undefined
    
    var backTitleVisible: js.UndefOr[Boolean] = js.undefined
    
    var headerBackImage: js.UndefOr[js.Function1[/* props */ TintColor, ReactNode]] = js.undefined
    
    var headerPressColorAndroid: js.UndefOr[String] = js.undefined
    
    /** Use `headerHideShadow` to be consistent with v5 `native-stack` */
    var hideShadow: js.UndefOr[Boolean] = js.undefined
    
    /** Use `headerLargeTitle` to be consistent with v5 `native-stack` */
    var largeTitle: js.UndefOr[Boolean] = js.undefined
    
    /** Use `headerLargeTitleHideShadow` to be consistent with v5 `native-stack` */
    var largeTitleHideShadow: js.UndefOr[Boolean] = js.undefined
    
    var layoutPreset: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Layout */ Any
      ] = js.undefined
    
    var onAppear: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onDisappear: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onWillAppear: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onWillDisappear: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Use `headerTranslucent` to be consistent with v5 `native-stack` */
    var translucent: js.UndefOr[Boolean] = js.undefined
    
    var truncatedBackButtonTitle: js.UndefOr[String] = js.undefined
  }
  object NativeStackNavigationOptions {
    
    inline def apply(): NativeStackNavigationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NativeStackNavigationOptions]
    }
    
    extension [Self <: NativeStackNavigationOptions](x: Self) {
      
      inline def setBackButtonTitle(value: String): Self = StObject.set(x, "backButtonTitle", value.asInstanceOf[js.Any])
      
      inline def setBackButtonTitleUndefined: Self = StObject.set(x, "backButtonTitle", js.undefined)
      
      inline def setBackTitleVisible(value: Boolean): Self = StObject.set(x, "backTitleVisible", value.asInstanceOf[js.Any])
      
      inline def setBackTitleVisibleUndefined: Self = StObject.set(x, "backTitleVisible", js.undefined)
      
      inline def setHeaderBackImage(value: /* props */ TintColor => ReactNode): Self = StObject.set(x, "headerBackImage", js.Any.fromFunction1(value))
      
      inline def setHeaderBackImageUndefined: Self = StObject.set(x, "headerBackImage", js.undefined)
      
      inline def setHeaderPressColorAndroid(value: String): Self = StObject.set(x, "headerPressColorAndroid", value.asInstanceOf[js.Any])
      
      inline def setHeaderPressColorAndroidUndefined: Self = StObject.set(x, "headerPressColorAndroid", js.undefined)
      
      inline def setHideShadow(value: Boolean): Self = StObject.set(x, "hideShadow", value.asInstanceOf[js.Any])
      
      inline def setHideShadowUndefined: Self = StObject.set(x, "hideShadow", js.undefined)
      
      inline def setLargeTitle(value: Boolean): Self = StObject.set(x, "largeTitle", value.asInstanceOf[js.Any])
      
      inline def setLargeTitleHideShadow(value: Boolean): Self = StObject.set(x, "largeTitleHideShadow", value.asInstanceOf[js.Any])
      
      inline def setLargeTitleHideShadowUndefined: Self = StObject.set(x, "largeTitleHideShadow", js.undefined)
      
      inline def setLargeTitleUndefined: Self = StObject.set(x, "largeTitle", js.undefined)
      
      inline def setLayoutPreset(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Layout */ Any
      ): Self = StObject.set(x, "layoutPreset", value.asInstanceOf[js.Any])
      
      inline def setLayoutPresetUndefined: Self = StObject.set(x, "layoutPreset", js.undefined)
      
      inline def setOnAppear(value: () => Unit): Self = StObject.set(x, "onAppear", js.Any.fromFunction0(value))
      
      inline def setOnAppearUndefined: Self = StObject.set(x, "onAppear", js.undefined)
      
      inline def setOnDisappear(value: () => Unit): Self = StObject.set(x, "onDisappear", js.Any.fromFunction0(value))
      
      inline def setOnDisappearUndefined: Self = StObject.set(x, "onDisappear", js.undefined)
      
      inline def setOnWillAppear(value: () => Unit): Self = StObject.set(x, "onWillAppear", js.Any.fromFunction0(value))
      
      inline def setOnWillAppearUndefined: Self = StObject.set(x, "onWillAppear", js.undefined)
      
      inline def setOnWillDisappear(value: () => Unit): Self = StObject.set(x, "onWillDisappear", js.Any.fromFunction0(value))
      
      inline def setOnWillDisappearUndefined: Self = StObject.set(x, "onWillDisappear", js.undefined)
      
      inline def setTranslucent(value: Boolean): Self = StObject.set(x, "translucent", value.asInstanceOf[js.Any])
      
      inline def setTranslucentUndefined: Self = StObject.set(x, "translucent", js.undefined)
      
      inline def setTruncatedBackButtonTitle(value: String): Self = StObject.set(x, "truncatedBackButtonTitle", value.asInstanceOf[js.Any])
      
      inline def setTruncatedBackButtonTitleUndefined: Self = StObject.set(x, "truncatedBackButtonTitle", js.undefined)
    }
  }
  
  type NativeStackNavigationProp = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StackNavigationProp */ Any
  
  trait StackNavigatorOptions extends StObject {
    
    /** This is an option from `stackNavigator` and it sets stack animation to none when `false` passed. Use `stackAnimation: 'none'` instead to be consistent with v5 `native-stack` */
    var animationEnabled: js.UndefOr[Boolean] = js.undefined
    
    var cardStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /** This is an option from `stackNavigator` and it controls the stack presentation along with `mode` prop. Use `stackPresentation` instead to be consistent with v5 `native-stack` */
    var cardTransparent: js.UndefOr[Boolean] = js.undefined
    
    /** This is an option from `stackNavigator` and it hides the header when set to `null`. Use `headerShown` instead to be consistent with v5 `native-stack`. */
    var header: js.UndefOr[(ComponentType[Record[String, Any]]) | Null] = js.undefined
  }
  object StackNavigatorOptions {
    
    inline def apply(): StackNavigatorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StackNavigatorOptions]
    }
    
    extension [Self <: StackNavigatorOptions](x: Self) {
      
      inline def setAnimationEnabled(value: Boolean): Self = StObject.set(x, "animationEnabled", value.asInstanceOf[js.Any])
      
      inline def setAnimationEnabledUndefined: Self = StObject.set(x, "animationEnabled", js.undefined)
      
      inline def setCardStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "cardStyle", value.asInstanceOf[js.Any])
      
      inline def setCardStyleNull: Self = StObject.set(x, "cardStyle", null)
      
      inline def setCardStyleUndefined: Self = StObject.set(x, "cardStyle", js.undefined)
      
      inline def setCardTransparent(value: Boolean): Self = StObject.set(x, "cardTransparent", value.asInstanceOf[js.Any])
      
      inline def setCardTransparentUndefined: Self = StObject.set(x, "cardTransparent", js.undefined)
      
      inline def setHeader(value: ComponentType[Record[String, Any]]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderNull: Self = StObject.set(x, "header", null)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    }
  }
}
