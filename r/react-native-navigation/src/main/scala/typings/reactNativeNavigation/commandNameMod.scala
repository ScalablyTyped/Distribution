package typings.reactNativeNavigation

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation/lib/dist/interfaces/CommandName", JSImport.Namespace)
@js.native
object commandNameMod extends js.Object {
  @js.native
  sealed trait CommandName extends js.Object
  
  @js.native
  object CommandName extends js.Object {
    @js.native
    sealed trait DismissAllModals extends CommandName
    
    @js.native
    sealed trait DismissModal extends CommandName
    
    @js.native
    sealed trait DismissOverlay extends CommandName
    
    @js.native
    sealed trait GetLaunchArgs extends CommandName
    
    @js.native
    sealed trait MergeOptions extends CommandName
    
    @js.native
    sealed trait Pop extends CommandName
    
    @js.native
    sealed trait PopTo extends CommandName
    
    @js.native
    sealed trait PopToRoot extends CommandName
    
    @js.native
    sealed trait Push extends CommandName
    
    @js.native
    sealed trait SetDefaultOptions extends CommandName
    
    @js.native
    sealed trait SetRoot extends CommandName
    
    @js.native
    sealed trait SetStackRoot extends CommandName
    
    @js.native
    sealed trait ShowModal extends CommandName
    
    @js.native
    sealed trait ShowOverlay extends CommandName
    
    @js.native
    sealed trait UpdateProps extends CommandName
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CommandName with String] = js.native
    /* "dismissAllModals" */ @js.native
    object DismissAllModals extends TopLevel[DismissAllModals with String]
    
    /* "dismissModal" */ @js.native
    object DismissModal extends TopLevel[DismissModal with String]
    
    /* "dismissOverlay" */ @js.native
    object DismissOverlay extends TopLevel[DismissOverlay with String]
    
    /* "getLaunchArgs" */ @js.native
    object GetLaunchArgs extends TopLevel[GetLaunchArgs with String]
    
    /* "mergeOptions" */ @js.native
    object MergeOptions extends TopLevel[MergeOptions with String]
    
    /* "pop" */ @js.native
    object Pop extends TopLevel[Pop with String]
    
    /* "popTo" */ @js.native
    object PopTo extends TopLevel[PopTo with String]
    
    /* "popToRoot" */ @js.native
    object PopToRoot extends TopLevel[PopToRoot with String]
    
    /* "push" */ @js.native
    object Push extends TopLevel[Push with String]
    
    /* "setDefaultOptions" */ @js.native
    object SetDefaultOptions extends TopLevel[SetDefaultOptions with String]
    
    /* "setRoot" */ @js.native
    object SetRoot extends TopLevel[SetRoot with String]
    
    /* "setStackRoot" */ @js.native
    object SetStackRoot extends TopLevel[SetStackRoot with String]
    
    /* "showModal" */ @js.native
    object ShowModal extends TopLevel[ShowModal with String]
    
    /* "showOverlay" */ @js.native
    object ShowOverlay extends TopLevel[ShowOverlay with String]
    
    /* "updateProps" */ @js.native
    object UpdateProps extends TopLevel[UpdateProps with String]
    
  }
  
}

