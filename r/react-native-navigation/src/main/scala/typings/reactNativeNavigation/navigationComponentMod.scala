package typings.reactNativeNavigation

import typings.react.mod.Component
import typings.reactNativeNavigation.componentEventsMod.ComponentDidAppearEvent
import typings.reactNativeNavigation.componentEventsMod.ComponentDidDisappearEvent
import typings.reactNativeNavigation.componentEventsMod.NavigationButtonPressedEvent
import typings.reactNativeNavigation.componentEventsMod.PreviewCompletedEvent
import typings.reactNativeNavigation.componentEventsMod.ScreenPoppedEvent
import typings.reactNativeNavigation.componentEventsMod.SearchBarCancelPressedEvent
import typings.reactNativeNavigation.componentEventsMod.SearchBarUpdatedEvent
import typings.reactNativeNavigation.navigationComponentPropsMod.NavigationComponentProps
import typings.reactNativeNavigation.optionsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navigationComponentMod {
  
  @JSImport("react-native-navigation/lib/dist/interfaces/NavigationComponent", "NavigationComponent")
  @js.native
  class NavigationComponent[Props, State, Snapshot] protected () extends Component[Props & NavigationComponentProps, State, Snapshot] {
    def this(props: Props & NavigationComponentProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: Props & NavigationComponentProps, context: js.Any) = this()
    
    def componentDidAppear(_event: ComponentDidAppearEvent): Unit = js.native
    
    def componentDidDisappear(_event: ComponentDidDisappearEvent): Unit = js.native
    
    def navigationButtonPressed(_event: NavigationButtonPressedEvent): Unit = js.native
    
    def previewCompleted(_event: PreviewCompletedEvent): Unit = js.native
    
    def screenPopped(_event: ScreenPoppedEvent): Unit = js.native
    
    def searchBarCancelPressed(_event: SearchBarCancelPressedEvent): Unit = js.native
    
    def searchBarUpdated(_event: SearchBarUpdatedEvent): Unit = js.native
  }
  /* static members */
  object NavigationComponent {
    
    @JSImport("react-native-navigation/lib/dist/interfaces/NavigationComponent", "NavigationComponent")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Options used to apply a style configuration when the screen appears.
      *
      * This field can either contain the concrete options to be applied, or a generator function
      * which accepts props and returns an Options object.
      */
    @JSImport("react-native-navigation/lib/dist/interfaces/NavigationComponent", "NavigationComponent.options")
    @js.native
    def options: (js.Function1[/* props */ js.UndefOr[js.Any], Options]) | Options = js.native
    inline def options_=(x: (js.Function1[/* props */ js.UndefOr[js.Any], Options]) | Options): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  }
}
