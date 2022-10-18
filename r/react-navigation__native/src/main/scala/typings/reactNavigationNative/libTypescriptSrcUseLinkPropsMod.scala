package typings.reactNavigationNative

import typings.reactNavigationCore.libTypescriptSrcTypesMod.global.ReactNavigation.RootParamList
import typings.reactNavigationNative.anon.AccessibilityRole
import typings.reactNavigationNative.libTypescriptSrcUseLinkToMod.To
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcUseLinkPropsMod {
  
  @JSImport("@react-navigation/native/lib/typescript/src/useLinkProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ParamList /* <: RootParamList */](hasToAction: Props[ParamList]): AccessibilityRole = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasToAction.asInstanceOf[js.Any]).asInstanceOf[AccessibilityRole]
  
  trait Props[ParamList /* <: RootParamList */] extends StObject {
    
    var action: js.UndefOr[NavigationAction] = js.undefined
    
    var to: To[ParamList, /* keyof ParamList */ String]
  }
  object Props {
    
    inline def apply[ParamList /* <: RootParamList */](to: To[ParamList, /* keyof ParamList */ String]): Props[ParamList] = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props[ParamList]]
    }
    
    extension [Self <: Props[?], ParamList /* <: RootParamList */](x: Self & Props[ParamList]) {
      
      inline def setAction(value: NavigationAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setTo(value: To[ParamList, /* keyof ParamList */ String]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
}
