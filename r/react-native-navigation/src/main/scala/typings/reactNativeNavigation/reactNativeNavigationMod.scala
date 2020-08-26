package typings.reactNativeNavigation

import typings.reactNativeNavigation.commandsObserverMod.CommandsObserver
import typings.reactNativeNavigation.componentEventsObserverMod.ComponentEventsObserver
import typings.reactNativeNavigation.constantsMod.NavigationConstants
import typings.reactNativeNavigation.nativeEventsReceiverMod.NativeEventsReceiver
import typings.reactNativeNavigation.navigationMod.NavigationRoot
import typings.reactNativeNavigation.optionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation", JSImport.Namespace)
@js.native
object reactNativeNavigationMod extends js.Object {
  @js.native
  class Constants protected ()
    extends typings.reactNativeNavigation.constantsMod.Constants
  
  @js.native
  class EventsRegistry protected ()
    extends typings.reactNativeNavigation.eventsRegistryMod.EventsRegistry {
    def this(
      nativeEventsReceiver: NativeEventsReceiver,
      commandsObserver: CommandsObserver,
      componentEventsObserver: ComponentEventsObserver
    ) = this()
  }
  
  @js.native
  class NavigationComponent[Props, State, Snapshot] ()
    extends typings.reactNativeNavigation.navigationComponentMod.NavigationComponent[Props, State, Snapshot]
  
  val Navigation: NavigationRoot = js.native
  @js.native
  object CommandName extends js.Object {
    /* "dismissAllModals" */ val DismissAllModals: typings.reactNativeNavigation.commandNameMod.CommandName.DismissAllModals with String = js.native
    /* "dismissModal" */ val DismissModal: typings.reactNativeNavigation.commandNameMod.CommandName.DismissModal with String = js.native
    /* "dismissOverlay" */ val DismissOverlay: typings.reactNativeNavigation.commandNameMod.CommandName.DismissOverlay with String = js.native
    /* "getLaunchArgs" */ val GetLaunchArgs: typings.reactNativeNavigation.commandNameMod.CommandName.GetLaunchArgs with String = js.native
    /* "mergeOptions" */ val MergeOptions: typings.reactNativeNavigation.commandNameMod.CommandName.MergeOptions with String = js.native
    /* "pop" */ val Pop: typings.reactNativeNavigation.commandNameMod.CommandName.Pop with String = js.native
    /* "popTo" */ val PopTo: typings.reactNativeNavigation.commandNameMod.CommandName.PopTo with String = js.native
    /* "popToRoot" */ val PopToRoot: typings.reactNativeNavigation.commandNameMod.CommandName.PopToRoot with String = js.native
    /* "push" */ val Push: typings.reactNativeNavigation.commandNameMod.CommandName.Push with String = js.native
    /* "setDefaultOptions" */ val SetDefaultOptions: typings.reactNativeNavigation.commandNameMod.CommandName.SetDefaultOptions with String = js.native
    /* "setRoot" */ val SetRoot: typings.reactNativeNavigation.commandNameMod.CommandName.SetRoot with String = js.native
    /* "setStackRoot" */ val SetStackRoot: typings.reactNativeNavigation.commandNameMod.CommandName.SetStackRoot with String = js.native
    /* "showModal" */ val ShowModal: typings.reactNativeNavigation.commandNameMod.CommandName.ShowModal with String = js.native
    /* "showOverlay" */ val ShowOverlay: typings.reactNativeNavigation.commandNameMod.CommandName.ShowOverlay with String = js.native
    /* "updateProps" */ val UpdateProps: typings.reactNativeNavigation.commandNameMod.CommandName.UpdateProps with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.reactNativeNavigation.commandNameMod.CommandName with String] = js.native
  }
  
  /* static members */
  @js.native
  object Constants extends js.Object {
    def get(): js.Promise[NavigationConstants] = js.native
  }
  
  /* static members */
  @js.native
  object NavigationComponent extends js.Object {
    /**
      * Options used to apply a style configuration when the screen appears.
      *
      * This field can either contain the concrete options to be applied, or a generator function
      * which accepts props and returns an Options object.
      */
    var options: (js.Function1[/* props */ js.UndefOr[js.Any], Options]) | Options = js.native
  }
  
  @js.native
  object OptionsModalPresentationStyle extends js.Object {
    /* "currentContext" */ val currentContext: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.currentContext with String = js.native
    /* "formSheet" */ val formSheet: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.formSheet with String = js.native
    /* "fullScreen" */ val fullScreen: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.fullScreen with String = js.native
    /* "none" */ val none: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.none with String = js.native
    /* "overCurrentContext" */ val overCurrentContext: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.overCurrentContext with String = js.native
    /* "overFullScreen" */ val overFullScreen: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.overFullScreen with String = js.native
    /* "pageSheet" */ val pageSheet: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.pageSheet with String = js.native
    /* "popover" */ val popover: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.popover with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle with String
      ] = js.native
  }
  
  @js.native
  object OptionsModalTransitionStyle extends js.Object {
    /* "coverVertical" */ val coverVertical: typings.reactNativeNavigation.optionsMod.OptionsModalTransitionStyle.coverVertical with String = js.native
    /* "crossDissolve" */ val crossDissolve: typings.reactNativeNavigation.optionsMod.OptionsModalTransitionStyle.crossDissolve with String = js.native
    /* "flipHorizontal" */ val flipHorizontal: typings.reactNativeNavigation.optionsMod.OptionsModalTransitionStyle.flipHorizontal with String = js.native
    /* "partialCurl" */ val partialCurl: typings.reactNativeNavigation.optionsMod.OptionsModalTransitionStyle.partialCurl with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.reactNativeNavigation.optionsMod.OptionsModalTransitionStyle with String] = js.native
  }
  
}

