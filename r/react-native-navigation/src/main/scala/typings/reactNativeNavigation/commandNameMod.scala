package typings.reactNativeNavigation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandNameMod {
  
  @js.native
  sealed trait CommandName extends StObject
  @JSImport("react-native-navigation/lib/dist/interfaces/CommandName", "CommandName")
  @js.native
  object CommandName extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CommandName & String] = js.native
    
    @js.native
    sealed trait DismissAllModals
      extends StObject
         with CommandName
    /* "dismissAllModals" */ val DismissAllModals: typings.reactNativeNavigation.commandNameMod.CommandName.DismissAllModals & String = js.native
    
    @js.native
    sealed trait DismissModal
      extends StObject
         with CommandName
    /* "dismissModal" */ val DismissModal: typings.reactNativeNavigation.commandNameMod.CommandName.DismissModal & String = js.native
    
    @js.native
    sealed trait DismissOverlay
      extends StObject
         with CommandName
    /* "dismissOverlay" */ val DismissOverlay: typings.reactNativeNavigation.commandNameMod.CommandName.DismissOverlay & String = js.native
    
    @js.native
    sealed trait GetLaunchArgs
      extends StObject
         with CommandName
    /* "getLaunchArgs" */ val GetLaunchArgs: typings.reactNativeNavigation.commandNameMod.CommandName.GetLaunchArgs & String = js.native
    
    @js.native
    sealed trait MergeOptions
      extends StObject
         with CommandName
    /* "mergeOptions" */ val MergeOptions: typings.reactNativeNavigation.commandNameMod.CommandName.MergeOptions & String = js.native
    
    @js.native
    sealed trait Pop
      extends StObject
         with CommandName
    /* "pop" */ val Pop: typings.reactNativeNavigation.commandNameMod.CommandName.Pop & String = js.native
    
    @js.native
    sealed trait PopTo
      extends StObject
         with CommandName
    /* "popTo" */ val PopTo: typings.reactNativeNavigation.commandNameMod.CommandName.PopTo & String = js.native
    
    @js.native
    sealed trait PopToRoot
      extends StObject
         with CommandName
    /* "popToRoot" */ val PopToRoot: typings.reactNativeNavigation.commandNameMod.CommandName.PopToRoot & String = js.native
    
    @js.native
    sealed trait Push
      extends StObject
         with CommandName
    /* "push" */ val Push: typings.reactNativeNavigation.commandNameMod.CommandName.Push & String = js.native
    
    @js.native
    sealed trait SetDefaultOptions
      extends StObject
         with CommandName
    /* "setDefaultOptions" */ val SetDefaultOptions: typings.reactNativeNavigation.commandNameMod.CommandName.SetDefaultOptions & String = js.native
    
    @js.native
    sealed trait SetRoot
      extends StObject
         with CommandName
    /* "setRoot" */ val SetRoot: typings.reactNativeNavigation.commandNameMod.CommandName.SetRoot & String = js.native
    
    @js.native
    sealed trait SetStackRoot
      extends StObject
         with CommandName
    /* "setStackRoot" */ val SetStackRoot: typings.reactNativeNavigation.commandNameMod.CommandName.SetStackRoot & String = js.native
    
    @js.native
    sealed trait ShowModal
      extends StObject
         with CommandName
    /* "showModal" */ val ShowModal: typings.reactNativeNavigation.commandNameMod.CommandName.ShowModal & String = js.native
    
    @js.native
    sealed trait ShowOverlay
      extends StObject
         with CommandName
    /* "showOverlay" */ val ShowOverlay: typings.reactNativeNavigation.commandNameMod.CommandName.ShowOverlay & String = js.native
    
    @js.native
    sealed trait UpdateProps
      extends StObject
         with CommandName
    /* "updateProps" */ val UpdateProps: typings.reactNativeNavigation.commandNameMod.CommandName.UpdateProps & String = js.native
  }
}
