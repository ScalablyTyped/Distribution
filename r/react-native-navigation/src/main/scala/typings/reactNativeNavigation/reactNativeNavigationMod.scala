package typings.reactNativeNavigation

import org.scalablytyped.runtime.Shortcut
import typings.reactNativeNavigation.commandsObserverMod.CommandsObserver
import typings.reactNativeNavigation.componentEventsObserverMod.ComponentEventsObserver
import typings.reactNativeNavigation.constantsMod.NavigationConstants
import typings.reactNativeNavigation.nativeEventsReceiverMod.NativeEventsReceiver
import typings.reactNativeNavigation.navigationComponentPropsMod.NavigationComponentProps
import typings.reactNativeNavigation.navigationMod.NavigationRoot
import typings.reactNativeNavigation.optionsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativeNavigationMod {
  
  @JSImport("react-native-navigation", "CommandName")
  @js.native
  object CommandName extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.reactNativeNavigation.commandNameMod.CommandName & String] = js.native
    
    /* "dismissAllModals" */ val DismissAllModals: typings.reactNativeNavigation.commandNameMod.CommandName.DismissAllModals & String = js.native
    
    /* "dismissModal" */ val DismissModal: typings.reactNativeNavigation.commandNameMod.CommandName.DismissModal & String = js.native
    
    /* "dismissOverlay" */ val DismissOverlay: typings.reactNativeNavigation.commandNameMod.CommandName.DismissOverlay & String = js.native
    
    /* "getLaunchArgs" */ val GetLaunchArgs: typings.reactNativeNavigation.commandNameMod.CommandName.GetLaunchArgs & String = js.native
    
    /* "mergeOptions" */ val MergeOptions: typings.reactNativeNavigation.commandNameMod.CommandName.MergeOptions & String = js.native
    
    /* "pop" */ val Pop: typings.reactNativeNavigation.commandNameMod.CommandName.Pop & String = js.native
    
    /* "popTo" */ val PopTo: typings.reactNativeNavigation.commandNameMod.CommandName.PopTo & String = js.native
    
    /* "popToRoot" */ val PopToRoot: typings.reactNativeNavigation.commandNameMod.CommandName.PopToRoot & String = js.native
    
    /* "push" */ val Push: typings.reactNativeNavigation.commandNameMod.CommandName.Push & String = js.native
    
    /* "setDefaultOptions" */ val SetDefaultOptions: typings.reactNativeNavigation.commandNameMod.CommandName.SetDefaultOptions & String = js.native
    
    /* "setRoot" */ val SetRoot: typings.reactNativeNavigation.commandNameMod.CommandName.SetRoot & String = js.native
    
    /* "setStackRoot" */ val SetStackRoot: typings.reactNativeNavigation.commandNameMod.CommandName.SetStackRoot & String = js.native
    
    /* "showModal" */ val ShowModal: typings.reactNativeNavigation.commandNameMod.CommandName.ShowModal & String = js.native
    
    /* "showOverlay" */ val ShowOverlay: typings.reactNativeNavigation.commandNameMod.CommandName.ShowOverlay & String = js.native
    
    /* "updateProps" */ val UpdateProps: typings.reactNativeNavigation.commandNameMod.CommandName.UpdateProps & String = js.native
  }
  
  @JSImport("react-native-navigation", "Constants")
  @js.native
  /* private */ class Constants ()
    extends typings.reactNativeNavigation.constantsMod.Constants
  /* static members */
  object Constants {
    
    @JSImport("react-native-navigation", "Constants")
    @js.native
    val ^ : js.Any = js.native
    
    inline def get(): js.Promise[NavigationConstants] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")().asInstanceOf[js.Promise[NavigationConstants]]
  }
  
  @JSImport("react-native-navigation", "EventsRegistry")
  @js.native
  class EventsRegistry protected ()
    extends typings.reactNativeNavigation.eventsRegistryMod.EventsRegistry {
    def this(
      nativeEventsReceiver: NativeEventsReceiver,
      commandsObserver: CommandsObserver,
      componentEventsObserver: ComponentEventsObserver
    ) = this()
  }
  
  object Navigation extends Shortcut {
    
    @JSImport("react-native-navigation", "Navigation")
    @js.native
    val ^ : NavigationRoot = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("react-native-navigation", "Navigation.TouchablePreview")
    @js.native
    class TouchablePreview ()
      extends typings.reactNativeNavigation.touchablePreviewMod.TouchablePreview
    
    type _To = NavigationRoot
    
    /* This means you don't have to write `^`, but can instead just say `Navigation.foo` */
    override def _to: NavigationRoot = ^
  }
  
  @JSImport("react-native-navigation", "NavigationComponent")
  @js.native
  class NavigationComponent[Props, State, Snapshot] protected ()
    extends typings.reactNativeNavigation.navigationComponentMod.NavigationComponent[Props, State, Snapshot] {
    def this(props: Props & NavigationComponentProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props & NavigationComponentProps, context: js.Any) = this()
  }
  /* static members */
  object NavigationComponent {
    
    @JSImport("react-native-navigation", "NavigationComponent")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Options used to apply a style configuration when the screen appears.
      *
      * This field can either contain the concrete options to be applied, or a generator function
      * which accepts props and returns an Options object.
      */
    @JSImport("react-native-navigation", "NavigationComponent.options")
    @js.native
    def options: (js.Function1[/* props */ js.UndefOr[js.Any], Options]) | Options = js.native
    inline def options_=(x: (js.Function1[/* props */ js.UndefOr[js.Any], Options]) | Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-native-navigation", "OptionsModalPresentationStyle")
  @js.native
  object OptionsModalPresentationStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle & String] = js.native
    
    /* "currentContext" */ val currentContext: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.currentContext & String = js.native
    
    /* "formSheet" */ val formSheet: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.formSheet & String = js.native
    
    /* "fullScreen" */ val fullScreen: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.fullScreen & String = js.native
    
    /* "none" */ val none: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.none & String = js.native
    
    /* "overCurrentContext" */ val overCurrentContext: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.overCurrentContext & String = js.native
    
    /* "overFullScreen" */ val overFullScreen: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.overFullScreen & String = js.native
    
    /* "pageSheet" */ val pageSheet: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.pageSheet & String = js.native
    
    /* "popover" */ val popover: typings.reactNativeNavigation.optionsMod.OptionsModalPresentationStyle.popover & String = js.native
  }
  
  @JSImport("react-native-navigation", "OptionsModalTransitionStyle")
  @js.native
  object OptionsModalTransitionStyle extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.reactNativeNavigation.optionsMod.OptionsModalTransitionStyle & String] = js.native
    
    /* "coverVertical" */ val coverVertical: typings.reactNativeNavigation.optionsMod.OptionsModalTransitionStyle.coverVertical & String = js.native
    
    /* "crossDissolve" */ val crossDissolve: typings.reactNativeNavigation.optionsMod.OptionsModalTransitionStyle.crossDissolve & String = js.native
    
    /* "flipHorizontal" */ val flipHorizontal: typings.reactNativeNavigation.optionsMod.OptionsModalTransitionStyle.flipHorizontal & String = js.native
    
    /* "partialCurl" */ val partialCurl: typings.reactNativeNavigation.optionsMod.OptionsModalTransitionStyle.partialCurl & String = js.native
  }
}
