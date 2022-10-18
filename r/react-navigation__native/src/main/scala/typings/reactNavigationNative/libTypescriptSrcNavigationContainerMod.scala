package typings.reactNavigationNative

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactNavigationCore.libTypescriptSrcTypesMod.NavigationContainerProps
import typings.reactNavigationCore.libTypescriptSrcTypesMod.NavigationContainerRef
import typings.reactNavigationNative.anon.DocumentTitle
import typings.reactNavigationNative.anon.Linking
import typings.reactNavigationNative.libTypescriptSrcTypesMod.DocumentTitleOptions
import typings.reactNavigationNative.libTypescriptSrcTypesMod.LinkingOptions
import typings.reactNavigationNative.libTypescriptSrcTypesMod.Theme
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcNavigationContainerMod {
  
  @JSImport("@react-navigation/native/lib/typescript/src/NavigationContainer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[RootParamList /* <: js.Object */](props: DocumentTitle[RootParamList] & NavigationContainerProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  object global {
    
    @JSGlobal("REACT_NAVIGATION_DEVTOOLS")
    @js.native
    def REACT_NAVIGATION_DEVTOOLS: WeakMap[NavigationContainerRef[Any], Linking] = js.native
    inline def REACT_NAVIGATION_DEVTOOLS_=(x: WeakMap[NavigationContainerRef[Any], Linking]): Unit = js.Dynamic.global.updateDynamic("REACT_NAVIGATION_DEVTOOLS")(x.asInstanceOf[js.Any])
  }
  
  trait Props[ParamList /* <: js.Object */]
    extends StObject
       with NavigationContainerProps {
    
    var documentTitle: js.UndefOr[DocumentTitleOptions] = js.undefined
    
    var fallback: js.UndefOr[ReactNode] = js.undefined
    
    var linking: js.UndefOr[LinkingOptions[ParamList]] = js.undefined
    
    var onReady: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var theme: js.UndefOr[Theme] = js.undefined
  }
  object Props {
    
    inline def apply[ParamList /* <: js.Object */](): Props[ParamList] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Props[ParamList]]
    }
    
    extension [Self <: Props[?], ParamList /* <: js.Object */](x: Self & Props[ParamList]) {
      
      inline def setDocumentTitle(value: DocumentTitleOptions): Self = StObject.set(x, "documentTitle", value.asInstanceOf[js.Any])
      
      inline def setDocumentTitleUndefined: Self = StObject.set(x, "documentTitle", js.undefined)
      
      inline def setFallback(value: ReactNode): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      inline def setLinking(value: LinkingOptions[ParamList]): Self = StObject.set(x, "linking", value.asInstanceOf[js.Any])
      
      inline def setLinkingUndefined: Self = StObject.set(x, "linking", js.undefined)
      
      inline def setOnReady(value: () => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction0(value))
      
      inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
