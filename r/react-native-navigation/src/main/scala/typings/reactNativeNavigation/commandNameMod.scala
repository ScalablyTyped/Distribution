package typings.reactNativeNavigation

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-navigation/lib/dist/interfaces/CommandName", JSImport.Namespace)
@js.native
object commandNameMod extends js.Object {
  
  @js.native
  sealed trait CommandName extends js.Object
  @js.native
  object CommandName extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CommandName with String] = js.native
    
    @js.native
    sealed trait DismissAllModals extends CommandName
    /* "dismissAllModals" */ @js.native
    object DismissAllModals extends TopLevel[DismissAllModals with String]
    
    @js.native
    sealed trait DismissModal extends CommandName
    /* "dismissModal" */ @js.native
    object DismissModal extends TopLevel[DismissModal with String]
    
    @js.native
    sealed trait DismissOverlay extends CommandName
    /* "dismissOverlay" */ @js.native
    object DismissOverlay extends TopLevel[DismissOverlay with String]
    
    @js.native
    sealed trait GetLaunchArgs extends CommandName
    /* "getLaunchArgs" */ @js.native
    object GetLaunchArgs extends TopLevel[GetLaunchArgs with String]
    
    @js.native
    sealed trait MergeOptions extends CommandName
    /* "mergeOptions" */ @js.native
    object MergeOptions extends TopLevel[MergeOptions with String]
    
    @js.native
    sealed trait Pop extends CommandName
    /* "pop" */ @js.native
    object Pop extends TopLevel[Pop with String]
    
    @js.native
    sealed trait PopTo extends CommandName
    /* "popTo" */ @js.native
    object PopTo extends TopLevel[PopTo with String]
    
    @js.native
    sealed trait PopToRoot extends CommandName
    /* "popToRoot" */ @js.native
    object PopToRoot extends TopLevel[PopToRoot with String]
    
    @js.native
    sealed trait Push extends CommandName
    /* "push" */ @js.native
    object Push extends TopLevel[Push with String]
    
    @js.native
    sealed trait SetDefaultOptions extends CommandName
    /* "setDefaultOptions" */ @js.native
    object SetDefaultOptions extends TopLevel[SetDefaultOptions with String]
    
    @js.native
    sealed trait SetRoot extends CommandName
    /* "setRoot" */ @js.native
    object SetRoot extends TopLevel[SetRoot with String]
    
    @js.native
    sealed trait SetStackRoot extends CommandName
    /* "setStackRoot" */ @js.native
    object SetStackRoot extends TopLevel[SetStackRoot with String]
    
    @js.native
    sealed trait ShowModal extends CommandName
    /* "showModal" */ @js.native
    object ShowModal extends TopLevel[ShowModal with String]
    
    @js.native
    sealed trait ShowOverlay extends CommandName
    /* "showOverlay" */ @js.native
    object ShowOverlay extends TopLevel[ShowOverlay with String]
    
    @js.native
    sealed trait UpdateProps extends CommandName
    /* "updateProps" */ @js.native
    object UpdateProps extends TopLevel[UpdateProps with String]
  }
}
