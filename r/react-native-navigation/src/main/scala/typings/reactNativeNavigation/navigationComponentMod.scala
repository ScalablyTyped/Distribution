package typings.reactNativeNavigation

import typings.react.mod.Component
import typings.reactNativeNavigation.componentEventsMod.ComponentDidAppearEvent
import typings.reactNativeNavigation.componentEventsMod.ComponentDidDisappearEvent
import typings.reactNativeNavigation.componentEventsMod.ModalAttemptedToDismissEvent
import typings.reactNativeNavigation.componentEventsMod.ModalDismissedEvent
import typings.reactNativeNavigation.componentEventsMod.NavigationButtonPressedEvent
import typings.reactNativeNavigation.componentEventsMod.PreviewCompletedEvent
import typings.reactNativeNavigation.componentEventsMod.ScreenPoppedEvent
import typings.reactNativeNavigation.componentEventsMod.SearchBarCancelPressedEvent
import typings.reactNativeNavigation.componentEventsMod.SearchBarUpdatedEvent
import typings.reactNativeNavigation.navigationComponentPropsMod.NavigationComponentProps
import typings.reactNativeNavigation.optionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-navigation/lib/dist/interfaces/NavigationComponent", JSImport.Namespace)
@js.native
object navigationComponentMod extends js.Object {
  @js.native
  class NavigationComponent[Props, State, Snapshot] () extends Component[Props with NavigationComponentProps, State, Snapshot] {
    def componentDidAppear(_event: ComponentDidAppearEvent): Unit = js.native
    def componentDidDisappear(_event: ComponentDidDisappearEvent): Unit = js.native
    def modalAttemptedToDismiss(_event: ModalAttemptedToDismissEvent): Unit = js.native
    def modalDismissed(_event: ModalDismissedEvent): Unit = js.native
    def navigationButtonPressed(_event: NavigationButtonPressedEvent): Unit = js.native
    def previewCompleted(_event: PreviewCompletedEvent): Unit = js.native
    def screenPopped(_event: ScreenPoppedEvent): Unit = js.native
    def searchBarCancelPressed(_event: SearchBarCancelPressedEvent): Unit = js.native
    def searchBarUpdated(_event: SearchBarUpdatedEvent): Unit = js.native
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
  
}

