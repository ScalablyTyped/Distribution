package typings.reactNavigationStack

import typings.react.mod.Context
import typings.react.mod.NamedExoticComponent
import typings.react.mod.Ref
import typings.react.mod.global.JSX.Element
import typings.reactNativeGestureHandler.libTypescriptHandlersPanGestureHandlerMod.PanGestureHandler
import typings.reactNavigation.mod.CreateNavigatorConfig
import typings.reactNavigation.mod.NavigationNavigator
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationProp
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigation.mod.NavigationRouteConfigMap
import typings.reactNavigation.mod.NavigationStackRouterConfig
import typings.reactNavigation.mod.NavigationState
import typings.reactNavigationStack.anon.ClosingRouteKeys
import typings.reactNavigationStack.anon.Descriptors
import typings.reactNavigationStack.anon.ReadonlyProps
import typings.reactNavigationStack.anon.ReadonlyState
import typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackCardInterpolatedStyle
import typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackCardInterpolationProps
import typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackHeaderInterpolatedStyle
import typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackHeaderInterpolationProps
import typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackHeaderProps
import typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackNavigationConfig
import typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackNavigationOptions
import typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackNavigationProp
import typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.TransitionPreset
import typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.TransitionSpec
import typings.reactNavigationStack.libTypescriptSrcVendorViewsHeaderHeaderBackButtonMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-navigation-stack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-navigation-stack", "Assets")
  @js.native
  val Assets: js.Array[Any] = js.native
  
  @JSImport("react-navigation-stack", "CardAnimationContext")
  @js.native
  val CardAnimationContext: Context[js.UndefOr[StackCardInterpolationProps]] = js.native
  
  object CardStyleInterpolators {
    
    @JSImport("react-navigation-stack", "CardStyleInterpolators")
    @js.native
    val ^ : js.Any = js.native
    
    inline def forFadeFromBottomAndroid(param0: StackCardInterpolationProps): StackCardInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forFadeFromBottomAndroid")(param0.asInstanceOf[js.Any]).asInstanceOf[StackCardInterpolatedStyle]
    
    inline def forHorizontalIOS(param0: StackCardInterpolationProps): StackCardInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forHorizontalIOS")(param0.asInstanceOf[js.Any]).asInstanceOf[StackCardInterpolatedStyle]
    
    inline def forModalPresentationIOS(param0: StackCardInterpolationProps): StackCardInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forModalPresentationIOS")(param0.asInstanceOf[js.Any]).asInstanceOf[StackCardInterpolatedStyle]
    
    inline def forNoAnimation(): StackCardInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forNoAnimation")().asInstanceOf[StackCardInterpolatedStyle]
    
    inline def forRevealFromBottomAndroid(param0: StackCardInterpolationProps): StackCardInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forRevealFromBottomAndroid")(param0.asInstanceOf[js.Any]).asInstanceOf[StackCardInterpolatedStyle]
    
    inline def forScaleFromCenterAndroid(param0: StackCardInterpolationProps): StackCardInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forScaleFromCenterAndroid")(param0.asInstanceOf[js.Any]).asInstanceOf[StackCardInterpolatedStyle]
    
    inline def forVerticalIOS(param0: StackCardInterpolationProps): StackCardInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forVerticalIOS")(param0.asInstanceOf[js.Any]).asInstanceOf[StackCardInterpolatedStyle]
  }
  
  @JSImport("react-navigation-stack", "GestureHandlerRefContext")
  @js.native
  val GestureHandlerRefContext: Context[Ref[PanGestureHandler]] = js.native
  
  @JSImport("react-navigation-stack", "Header")
  @js.native
  val Header: NamedExoticComponent[StackHeaderProps] = js.native
  
  inline def HeaderBackButton(param0: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("HeaderBackButton")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def HeaderBackground(param0: typings.reactNavigationStack.libTypescriptSrcVendorViewsHeaderHeaderBackgroundMod.Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("HeaderBackground")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-navigation-stack", "HeaderHeightContext")
  @js.native
  val HeaderHeightContext: Context[js.UndefOr[Double]] = js.native
  
  object HeaderStyleInterpolators {
    
    @JSImport("react-navigation-stack", "HeaderStyleInterpolators")
    @js.native
    val ^ : js.Any = js.native
    
    inline def forFade(param0: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forFade")(param0.asInstanceOf[js.Any]).asInstanceOf[StackHeaderInterpolatedStyle]
    
    inline def forNoAnimation(): StackHeaderInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forNoAnimation")().asInstanceOf[StackHeaderInterpolatedStyle]
    
    inline def forSlideLeft(param0: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forSlideLeft")(param0.asInstanceOf[js.Any]).asInstanceOf[StackHeaderInterpolatedStyle]
    
    inline def forSlideRight(param0: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forSlideRight")(param0.asInstanceOf[js.Any]).asInstanceOf[StackHeaderInterpolatedStyle]
    
    inline def forSlideUp(param0: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forSlideUp")(param0.asInstanceOf[js.Any]).asInstanceOf[StackHeaderInterpolatedStyle]
    
    inline def forUIKit(param0: StackHeaderInterpolationProps): StackHeaderInterpolatedStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("forUIKit")(param0.asInstanceOf[js.Any]).asInstanceOf[StackHeaderInterpolatedStyle]
  }
  
  inline def HeaderTitle(param0: typings.reactNavigationStack.libTypescriptSrcVendorViewsHeaderHeaderTitleMod.Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("HeaderTitle")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-navigation-stack", "StackView")
  @js.native
  open class StackView ()
    extends typings.reactNavigationStack.libTypescriptSrcVendorMod.StackView
  /* static members */
  object StackView {
    
    @JSImport("react-navigation-stack", "StackView")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getDerivedStateFromProps(props: ReadonlyProps, state: ReadonlyState): ClosingRouteKeys | Descriptors = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ClosingRouteKeys | Descriptors]
  }
  
  object TransitionPresets {
    
    @JSImport("react-navigation-stack", "TransitionPresets.DefaultTransition")
    @js.native
    val DefaultTransition: TransitionPreset = js.native
    
    @JSImport("react-navigation-stack", "TransitionPresets.FadeFromBottomAndroid")
    @js.native
    val FadeFromBottomAndroid: TransitionPreset = js.native
    
    @JSImport("react-navigation-stack", "TransitionPresets.ModalPresentationIOS")
    @js.native
    val ModalPresentationIOS: TransitionPreset = js.native
    
    @JSImport("react-navigation-stack", "TransitionPresets.ModalSlideFromBottomIOS")
    @js.native
    val ModalSlideFromBottomIOS: TransitionPreset = js.native
    
    @JSImport("react-navigation-stack", "TransitionPresets.ModalTransition")
    @js.native
    val ModalTransition: TransitionPreset = js.native
    
    @JSImport("react-navigation-stack", "TransitionPresets.RevealFromBottomAndroid")
    @js.native
    val RevealFromBottomAndroid: TransitionPreset = js.native
    
    @JSImport("react-navigation-stack", "TransitionPresets.ScaleFromCenterAndroid")
    @js.native
    val ScaleFromCenterAndroid: TransitionPreset = js.native
    
    @JSImport("react-navigation-stack", "TransitionPresets.SlideFromRightIOS")
    @js.native
    val SlideFromRightIOS: TransitionPreset = js.native
  }
  
  object TransitionSpecs {
    
    @JSImport("react-navigation-stack", "TransitionSpecs.FadeInFromBottomAndroidSpec")
    @js.native
    val FadeInFromBottomAndroidSpec: TransitionSpec = js.native
    
    @JSImport("react-navigation-stack", "TransitionSpecs.FadeOutToBottomAndroidSpec")
    @js.native
    val FadeOutToBottomAndroidSpec: TransitionSpec = js.native
    
    @JSImport("react-navigation-stack", "TransitionSpecs.RevealFromBottomAndroidSpec")
    @js.native
    val RevealFromBottomAndroidSpec: TransitionSpec = js.native
    
    @JSImport("react-navigation-stack", "TransitionSpecs.ScaleFromCenterAndroidSpec")
    @js.native
    val ScaleFromCenterAndroidSpec: TransitionSpec = js.native
    
    @JSImport("react-navigation-stack", "TransitionSpecs.TransitionIOSSpec")
    @js.native
    val TransitionIOSSpec: TransitionSpec = js.native
  }
  
  inline def createStackNavigator(
    routeConfigMap: NavigationRouteConfigMap[
      StackNavigationOptions, 
      StackNavigationProp[NavigationRoute[NavigationParams], NavigationParams], 
      Any
    ]
  ): NavigationNavigator[Any, NavigationProp[NavigationState]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStackNavigator")(routeConfigMap.asInstanceOf[js.Any]).asInstanceOf[NavigationNavigator[Any, NavigationProp[NavigationState]]]
  inline def createStackNavigator(
    routeConfigMap: NavigationRouteConfigMap[
      StackNavigationOptions, 
      StackNavigationProp[NavigationRoute[NavigationParams], NavigationParams], 
      Any
    ],
    stackConfig: CreateNavigatorConfig[
      StackNavigationConfig, 
      NavigationStackRouterConfig, 
      StackNavigationOptions, 
      StackNavigationProp[NavigationRoute[NavigationParams], NavigationParams]
    ]
  ): NavigationNavigator[Any, NavigationProp[NavigationState]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createStackNavigator")(routeConfigMap.asInstanceOf[js.Any], stackConfig.asInstanceOf[js.Any])).asInstanceOf[NavigationNavigator[Any, NavigationProp[NavigationState]]]
  
  inline def useCardAnimation(): StackCardInterpolationProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useCardAnimation")().asInstanceOf[StackCardInterpolationProps]
  
  inline def useGestureHandlerRef(): Ref[PanGestureHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("useGestureHandlerRef")().asInstanceOf[Ref[PanGestureHandler]]
  
  inline def useHeaderHeight(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("useHeaderHeight")().asInstanceOf[Double]
}
