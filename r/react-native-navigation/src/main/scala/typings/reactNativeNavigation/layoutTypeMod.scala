package typings.reactNativeNavigation

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation/lib/dist/commands/LayoutType", JSImport.Namespace)
@js.native
object layoutTypeMod extends js.Object {
  @js.native
  sealed trait LayoutType extends js.Object
  
  @js.native
  object LayoutType extends js.Object {
    @js.native
    sealed trait BottomTabs extends LayoutType
    
    @js.native
    sealed trait Component extends LayoutType
    
    @js.native
    sealed trait ExternalComponent extends LayoutType
    
    @js.native
    sealed trait SideMenuCenter extends LayoutType
    
    @js.native
    sealed trait SideMenuLeft extends LayoutType
    
    @js.native
    sealed trait SideMenuRight extends LayoutType
    
    @js.native
    sealed trait SideMenuRoot extends LayoutType
    
    @js.native
    sealed trait SplitView extends LayoutType
    
    @js.native
    sealed trait Stack extends LayoutType
    
    @js.native
    sealed trait TopTabs extends LayoutType
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LayoutType with String] = js.native
    /* "BottomTabs" */ @js.native
    object BottomTabs extends TopLevel[BottomTabs with String]
    
    /* "Component" */ @js.native
    object Component extends TopLevel[Component with String]
    
    /* "ExternalComponent" */ @js.native
    object ExternalComponent extends TopLevel[ExternalComponent with String]
    
    /* "SideMenuCenter" */ @js.native
    object SideMenuCenter extends TopLevel[SideMenuCenter with String]
    
    /* "SideMenuLeft" */ @js.native
    object SideMenuLeft extends TopLevel[SideMenuLeft with String]
    
    /* "SideMenuRight" */ @js.native
    object SideMenuRight extends TopLevel[SideMenuRight with String]
    
    /* "SideMenuRoot" */ @js.native
    object SideMenuRoot extends TopLevel[SideMenuRoot with String]
    
    /* "SplitView" */ @js.native
    object SplitView extends TopLevel[SplitView with String]
    
    /* "Stack" */ @js.native
    object Stack extends TopLevel[Stack with String]
    
    /* "TopTabs" */ @js.native
    object TopTabs extends TopLevel[TopTabs with String]
    
  }
  
}

