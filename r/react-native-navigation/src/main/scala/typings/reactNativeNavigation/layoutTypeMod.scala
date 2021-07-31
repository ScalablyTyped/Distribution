package typings.reactNativeNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutTypeMod {
  
  @js.native
  sealed trait LayoutType extends StObject
  @JSImport("react-native-navigation/lib/dist/commands/LayoutType", "LayoutType")
  @js.native
  object LayoutType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LayoutType & String] = js.native
    
    @js.native
    sealed trait BottomTabs
      extends StObject
         with LayoutType
    /* "BottomTabs" */ val BottomTabs: typings.reactNativeNavigation.layoutTypeMod.LayoutType.BottomTabs & String = js.native
    
    @js.native
    sealed trait Component
      extends StObject
         with LayoutType
    /* "Component" */ val Component: typings.reactNativeNavigation.layoutTypeMod.LayoutType.Component & String = js.native
    
    @js.native
    sealed trait ExternalComponent
      extends StObject
         with LayoutType
    /* "ExternalComponent" */ val ExternalComponent: typings.reactNativeNavigation.layoutTypeMod.LayoutType.ExternalComponent & String = js.native
    
    @js.native
    sealed trait SideMenuCenter
      extends StObject
         with LayoutType
    /* "SideMenuCenter" */ val SideMenuCenter: typings.reactNativeNavigation.layoutTypeMod.LayoutType.SideMenuCenter & String = js.native
    
    @js.native
    sealed trait SideMenuLeft
      extends StObject
         with LayoutType
    /* "SideMenuLeft" */ val SideMenuLeft: typings.reactNativeNavigation.layoutTypeMod.LayoutType.SideMenuLeft & String = js.native
    
    @js.native
    sealed trait SideMenuRight
      extends StObject
         with LayoutType
    /* "SideMenuRight" */ val SideMenuRight: typings.reactNativeNavigation.layoutTypeMod.LayoutType.SideMenuRight & String = js.native
    
    @js.native
    sealed trait SideMenuRoot
      extends StObject
         with LayoutType
    /* "SideMenuRoot" */ val SideMenuRoot: typings.reactNativeNavigation.layoutTypeMod.LayoutType.SideMenuRoot & String = js.native
    
    @js.native
    sealed trait SplitView
      extends StObject
         with LayoutType
    /* "SplitView" */ val SplitView: typings.reactNativeNavigation.layoutTypeMod.LayoutType.SplitView & String = js.native
    
    @js.native
    sealed trait Stack
      extends StObject
         with LayoutType
    /* "Stack" */ val Stack: typings.reactNativeNavigation.layoutTypeMod.LayoutType.Stack & String = js.native
    
    @js.native
    sealed trait TopTabs
      extends StObject
         with LayoutType
    /* "TopTabs" */ val TopTabs: typings.reactNativeNavigation.layoutTypeMod.LayoutType.TopTabs & String = js.native
  }
}
