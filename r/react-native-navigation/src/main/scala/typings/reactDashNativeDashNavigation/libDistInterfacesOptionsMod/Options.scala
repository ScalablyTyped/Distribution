package typings.reactDashNativeDashNavigation.libDistInterfacesOptionsMod

import typings.reactDashNative.reactDashNativeMod.ImageRequireSource
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
  var animations: js.UndefOr[AnimationOptions] = js.undefined
  /**
    * Background image for the screen
    * #### (iOS specific)
    */
  var backgroundImage: js.UndefOr[ImageRequireSource] = js.undefined
  /**
    * Enable or disable automatically blurring focused input, dismissing keyboard on unmount
    * #### (Android specific)
    * @default false
    */
  var blurOnUnmount: js.UndefOr[Boolean] = js.undefined
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
  var overlay: js.UndefOr[OverlayOptions] = js.undefined
  /**
    * Enable or disable swipe back to pop gesture
    * #### (iOS specific)
    * @default true
    */
  var popGesture: js.UndefOr[Boolean] = js.undefined
  /**
    * Preview configuration for Peek and Pop
    * #### (iOS specific)
    */
  var preview: js.UndefOr[OptionsPreview] = js.undefined
  /**
    * Background image for the Navigation View
    * #### (iOS specific)
    */
  var rootBackgroundImage: js.UndefOr[ImageRequireSource] = js.undefined
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

object Options {
  @scala.inline
  def apply(
    animations: AnimationOptions = null,
    backgroundImage: Int | Double = null,
    blurOnUnmount: js.UndefOr[Boolean] = js.undefined,
    bottomTab: OptionsBottomTab = null,
    bottomTabs: OptionsBottomTabs = null,
    customTransition: OptionsCustomTransition = null,
    fab: OptionsFab = null,
    layout: OptionsLayout = null,
    modalPresentationStyle: OptionsModalPresentationStyle = null,
    modalTransitionStyle: OptionsModalTransitionStyle = null,
    overlay: OverlayOptions = null,
    popGesture: js.UndefOr[Boolean] = js.undefined,
    preview: OptionsPreview = null,
    rootBackgroundImage: Int | Double = null,
    sideMenu: OptionsSideMenu = null,
    splitView: OptionsSplitView = null,
    statusBar: OptionsStatusBar = null,
    topBar: OptionsTopBar = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (animations != null) __obj.updateDynamic("animations")(animations)
    if (backgroundImage != null) __obj.updateDynamic("backgroundImage")(backgroundImage.asInstanceOf[js.Any])
    if (!js.isUndefined(blurOnUnmount)) __obj.updateDynamic("blurOnUnmount")(blurOnUnmount)
    if (bottomTab != null) __obj.updateDynamic("bottomTab")(bottomTab)
    if (bottomTabs != null) __obj.updateDynamic("bottomTabs")(bottomTabs)
    if (customTransition != null) __obj.updateDynamic("customTransition")(customTransition)
    if (fab != null) __obj.updateDynamic("fab")(fab)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (modalPresentationStyle != null) __obj.updateDynamic("modalPresentationStyle")(modalPresentationStyle)
    if (modalTransitionStyle != null) __obj.updateDynamic("modalTransitionStyle")(modalTransitionStyle)
    if (overlay != null) __obj.updateDynamic("overlay")(overlay)
    if (!js.isUndefined(popGesture)) __obj.updateDynamic("popGesture")(popGesture)
    if (preview != null) __obj.updateDynamic("preview")(preview)
    if (rootBackgroundImage != null) __obj.updateDynamic("rootBackgroundImage")(rootBackgroundImage.asInstanceOf[js.Any])
    if (sideMenu != null) __obj.updateDynamic("sideMenu")(sideMenu)
    if (splitView != null) __obj.updateDynamic("splitView")(splitView)
    if (statusBar != null) __obj.updateDynamic("statusBar")(statusBar)
    if (topBar != null) __obj.updateDynamic("topBar")(topBar)
    __obj.asInstanceOf[Options]
  }
}

