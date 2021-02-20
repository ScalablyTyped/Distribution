package typings.reactNativeNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandNameMod {
  
  @js.native
  sealed trait CommandName extends StObject
  @JSImport("react-native-navigation/lib/dist/interfaces/CommandName", "CommandName")
  @js.native
  object CommandName extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CommandName with String] = js.native
    
    @js.native
    sealed trait DismissAllModals extends CommandName
    /* "dismissAllModals" */ val DismissAllModals: typings.reactNativeNavigation.commandNameMod.CommandName.DismissAllModals with String = js.native
    
    @js.native
    sealed trait DismissModal extends CommandName
    /* "dismissModal" */ val DismissModal: typings.reactNativeNavigation.commandNameMod.CommandName.DismissModal with String = js.native
    
    @js.native
    sealed trait DismissOverlay extends CommandName
    /* "dismissOverlay" */ val DismissOverlay: typings.reactNativeNavigation.commandNameMod.CommandName.DismissOverlay with String = js.native
    
    @js.native
    sealed trait GetLaunchArgs extends CommandName
    /* "getLaunchArgs" */ val GetLaunchArgs: typings.reactNativeNavigation.commandNameMod.CommandName.GetLaunchArgs with String = js.native
    
    @js.native
    sealed trait MergeOptions extends CommandName
    /* "mergeOptions" */ val MergeOptions: typings.reactNativeNavigation.commandNameMod.CommandName.MergeOptions with String = js.native
    
    @js.native
    sealed trait Pop extends CommandName
    /* "pop" */ val Pop: typings.reactNativeNavigation.commandNameMod.CommandName.Pop with String = js.native
    
    @js.native
    sealed trait PopTo extends CommandName
    /* "popTo" */ val PopTo: typings.reactNativeNavigation.commandNameMod.CommandName.PopTo with String = js.native
    
    @js.native
    sealed trait PopToRoot extends CommandName
    /* "popToRoot" */ val PopToRoot: typings.reactNativeNavigation.commandNameMod.CommandName.PopToRoot with String = js.native
    
    @js.native
    sealed trait Push extends CommandName
    /* "push" */ val Push: typings.reactNativeNavigation.commandNameMod.CommandName.Push with String = js.native
    
    @js.native
    sealed trait SetDefaultOptions extends CommandName
    /* "setDefaultOptions" */ val SetDefaultOptions: typings.reactNativeNavigation.commandNameMod.CommandName.SetDefaultOptions with String = js.native
    
    @js.native
    sealed trait SetRoot extends CommandName
    /* "setRoot" */ val SetRoot: typings.reactNativeNavigation.commandNameMod.CommandName.SetRoot with String = js.native
    
    @js.native
    sealed trait SetStackRoot extends CommandName
    /* "setStackRoot" */ val SetStackRoot: typings.reactNativeNavigation.commandNameMod.CommandName.SetStackRoot with String = js.native
    
    @js.native
    sealed trait ShowModal extends CommandName
    /* "showModal" */ val ShowModal: typings.reactNativeNavigation.commandNameMod.CommandName.ShowModal with String = js.native
    
    @js.native
    sealed trait ShowOverlay extends CommandName
    /* "showOverlay" */ val ShowOverlay: typings.reactNativeNavigation.commandNameMod.CommandName.ShowOverlay with String = js.native
    
    @js.native
    sealed trait UpdateProps extends CommandName
    /* "updateProps" */ val UpdateProps: typings.reactNativeNavigation.commandNameMod.CommandName.UpdateProps with String = js.native
  }
}
