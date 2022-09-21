package typings.reactNavigationNative.anon

import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.reactNavigationCore.typesMod.NavigationContainerRef
import typings.reactNavigationNative.typesMod.DocumentTitleOptions
import typings.reactNavigationNative.typesMod.LinkingOptions
import typings.reactNavigationNative.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentTitle[RootParamList /* <: js.Object */] extends StObject {
  
  var documentTitle: js.UndefOr[DocumentTitleOptions] = js.undefined
  
  var fallback: js.UndefOr[ReactNode] = js.undefined
  
  var linking: js.UndefOr[LinkingOptions[RootParamList]] = js.undefined
  
  var onReady: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var ref: js.UndefOr[Ref[NavigationContainerRef[RootParamList]]] = js.undefined
  
  var theme: js.UndefOr[Theme] = js.undefined
}
object DocumentTitle {
  
  inline def apply[RootParamList /* <: js.Object */](): DocumentTitle[RootParamList] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentTitle[RootParamList]]
  }
  
  extension [Self <: DocumentTitle[?], RootParamList /* <: js.Object */](x: Self & DocumentTitle[RootParamList]) {
    
    inline def setDocumentTitle(value: DocumentTitleOptions): Self = StObject.set(x, "documentTitle", value.asInstanceOf[js.Any])
    
    inline def setDocumentTitleUndefined: Self = StObject.set(x, "documentTitle", js.undefined)
    
    inline def setFallback(value: ReactNode): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
    
    inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    
    inline def setLinking(value: LinkingOptions[RootParamList]): Self = StObject.set(x, "linking", value.asInstanceOf[js.Any])
    
    inline def setLinkingUndefined: Self = StObject.set(x, "linking", js.undefined)
    
    inline def setOnReady(value: () => Unit): Self = StObject.set(x, "onReady", js.Any.fromFunction0(value))
    
    inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
    
    inline def setRef(value: Ref[NavigationContainerRef[RootParamList]]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefFunction1(value: /* instance */ NavigationContainerRef[RootParamList] | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefNull: Self = StObject.set(x, "ref", null)
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
