package typings
package reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Animation used for navigation commands that modify the layout
    * hierarchy can be controlled in options.
    *
    * Animations can be modified per command and it's also possible
    * to change the default animation for each command.
    *
    * Example:
    ```js
    setRoot: {
    y: {
    from: 1000,
    to: 0,
    duration: 500,
    interpolation: 'accelerate',
    },
    alpha: {
    from: 0,
    to: 1,
    duration: 400,
    startDelay: 100,
    interpolation: 'accelerate'
    }
    }
    ```
    */
  var animations: js.UndefOr[OptionsAnimations] = js.undefined
  /**
    * Background image for the screen
    * #### (iOS specific)
    */
  var backgroundImage: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ImageRequireSource] = js.undefined
  /**
    * Enable or disable automatically blurring focused input, dismissing keyboard on unmount
    * #### (Android specific)
    * @default false
    */
  var blurOnUnmount: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Configure the bottom tab associated to the screen
    */
  var bottomTab: js.UndefOr[OptionsBottomTab] = js.undefined
  /**
    * Configure the bottom tabs
    */
  var bottomTabs: js.UndefOr[OptionsBottomTabs] = js.undefined
  /**
    * Custom Transition used for animate shared element between two screens
    * Example:
    ```js
    Navigation.push(this.props.componentId, {
    component: {
    name: 'second.screen',
    options: {
    customTransition: {
    animations: [
    { type: 'sharedElement', fromId: 'image1', toId: 'image2', startDelay: 0, springVelocity: 0.2, duration: 0.5 }
    ],
    duration: 0.8
    }
    }
    }
    });
    ```
    */
  var customTransition: js.UndefOr[OptionsCustomTransition] = js.undefined
  var fab: js.UndefOr[OptionsFab] = js.undefined
  /**
    * Configure the layout
    */
  var layout: js.UndefOr[OptionsLayout] = js.undefined
  /**
    * Configure the presentation style of the modal
    */
  var modalPresentationStyle: js.UndefOr[OptionsModalPresentationStyle] = js.undefined
  /**
    * Configure the transition style of the modal
    *
    * #### (Android specific)
    */
  var modalTransitionStyle: js.UndefOr[OptionsModalTransitionStyle] = js.undefined
  /**
    * Configure the overlay
    */
  var overlay: js.UndefOr[OptionsOverlay] = js.undefined
  /**
    * Enable or disable swipe back to pop gesture
    * #### (iOS specific)
    * @default true
    */
  var popGesture: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Preview configuration for Peek and Pop
    * #### (iOS specific)
    */
  var preview: js.UndefOr[OptionsPreview] = js.undefined
  /**
    * Background image for the Navigation View
    * #### (iOS specific)
    */
  var rootBackgroundImage: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ImageRequireSource] = js.undefined
  /**
    * Configure the side menu
    */
  var sideMenu: js.UndefOr[OptionsSideMenu] = js.undefined
  /**
    * Configure the splitView controller
    */
  var splitView: js.UndefOr[OptionsSplitView] = js.undefined
  /**
    * Configure the status bar
    */
  var statusBar: js.UndefOr[OptionsStatusBar] = js.undefined
  /**
    * Configure the top bar
    */
  var topBar: js.UndefOr[OptionsTopBar] = js.undefined
}

