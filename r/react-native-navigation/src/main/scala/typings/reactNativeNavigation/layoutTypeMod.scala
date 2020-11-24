package typings.reactNativeNavigation

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-navigation/lib/dist/commands/LayoutType", JSImport.Namespace)
@js.native
object layoutTypeMod extends js.Object {
  
  @js.native
  sealed trait LayoutType extends js.Object
  @js.native
  object LayoutType extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LayoutType with String] = js.native
    
    @js.native
    sealed trait BottomTabs extends LayoutType
    /* "BottomTabs" */ @js.native
    object BottomTabs extends TopLevel[BottomTabs with String]
    
    @js.native
    sealed trait Component extends LayoutType
    /* "Component" */ @js.native
    object Component extends TopLevel[Component with String]
    
    @js.native
    sealed trait ExternalComponent extends LayoutType
    /* "ExternalComponent" */ @js.native
    object ExternalComponent extends TopLevel[ExternalComponent with String]
    
    @js.native
    sealed trait SideMenuCenter extends LayoutType
    /* "SideMenuCenter" */ @js.native
    object SideMenuCenter extends TopLevel[SideMenuCenter with String]
    
    @js.native
    sealed trait SideMenuLeft extends LayoutType
    /* "SideMenuLeft" */ @js.native
    object SideMenuLeft extends TopLevel[SideMenuLeft with String]
    
    @js.native
    sealed trait SideMenuRight extends LayoutType
    /* "SideMenuRight" */ @js.native
    object SideMenuRight extends TopLevel[SideMenuRight with String]
    
    @js.native
    sealed trait SideMenuRoot extends LayoutType
    /* "SideMenuRoot" */ @js.native
    object SideMenuRoot extends TopLevel[SideMenuRoot with String]
    
    @js.native
    sealed trait SplitView extends LayoutType
    /* "SplitView" */ @js.native
    object SplitView extends TopLevel[SplitView with String]
    
    @js.native
    sealed trait Stack extends LayoutType
    /* "Stack" */ @js.native
    object Stack extends TopLevel[Stack with String]
    
    @js.native
    sealed trait TopTabs extends LayoutType
    /* "TopTabs" */ @js.native
    object TopTabs extends TopLevel[TopTabs with String]
  }
}
