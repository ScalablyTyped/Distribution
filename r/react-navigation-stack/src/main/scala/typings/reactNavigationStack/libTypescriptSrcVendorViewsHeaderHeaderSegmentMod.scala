package typings.reactNavigationStack

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNativeSafeAreaContext.libTypescriptSafeAreaDottypesMod.EdgeInsets
import typings.reactNavigation.mod.NavigationParams
import typings.reactNavigation.mod.NavigationRoute
import typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.Layout
import typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.Scene
import typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackHeaderInterpolatedStyle
import typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackHeaderInterpolationProps
import typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackHeaderOptions
import typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackHeaderStyleInterpolator
import typings.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackHeaderTitleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcVendorViewsHeaderHeaderSegmentMod {
  
  @JSImport("react-navigation-stack/lib/typescript/src/vendor/views/Header/HeaderSegment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def getDefaultHeaderHeight(layout: Layout, statusBarHeight: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultHeaderHeight")(layout.asInstanceOf[js.Any], statusBarHeight.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait Props
    extends StObject
       with StackHeaderOptions {
    
    @JSName("headerTitle")
    def headerTitle_MProps(props: StackHeaderTitleProps): ReactNode
    
    var insets: EdgeInsets
    
    var layout: Layout
    
    var leftLabel: js.UndefOr[String] = js.undefined
    
    var onGoBack: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var scene: Scene[NavigationRoute[NavigationParams]]
    
    var styleInterpolator: StackHeaderStyleInterpolator
    
    var title: js.UndefOr[String] = js.undefined
  }
  object Props {
    
    inline def apply(
      headerTitle: StackHeaderTitleProps => ReactNode,
      insets: EdgeInsets,
      layout: Layout,
      scene: Scene[NavigationRoute[NavigationParams]],
      styleInterpolator: /* props */ StackHeaderInterpolationProps => StackHeaderInterpolatedStyle
    ): Props = {
      val __obj = js.Dynamic.literal(headerTitle = js.Any.fromFunction1(headerTitle), insets = insets.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], styleInterpolator = js.Any.fromFunction1(styleInterpolator))
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setHeaderTitle(value: StackHeaderTitleProps => ReactNode): Self = StObject.set(x, "headerTitle", js.Any.fromFunction1(value))
      
      inline def setInsets(value: EdgeInsets): Self = StObject.set(x, "insets", value.asInstanceOf[js.Any])
      
      inline def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLeftLabel(value: String): Self = StObject.set(x, "leftLabel", value.asInstanceOf[js.Any])
      
      inline def setLeftLabelUndefined: Self = StObject.set(x, "leftLabel", js.undefined)
      
      inline def setOnGoBack(value: () => Unit): Self = StObject.set(x, "onGoBack", js.Any.fromFunction0(value))
      
      inline def setOnGoBackUndefined: Self = StObject.set(x, "onGoBack", js.undefined)
      
      inline def setScene(value: Scene[NavigationRoute[NavigationParams]]): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
      
      inline def setStyleInterpolator(value: /* props */ StackHeaderInterpolationProps => StackHeaderInterpolatedStyle): Self = StObject.set(x, "styleInterpolator", js.Any.fromFunction1(value))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
