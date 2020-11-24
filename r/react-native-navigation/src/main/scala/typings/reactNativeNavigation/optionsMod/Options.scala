package typings.reactNativeNavigation.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  var animations: js.UndefOr[AnimationOptions] = js.native
  
  /**
    * Background image for the screen
    * #### (iOS specific)
    */
  var backgroundImage: js.UndefOr[ImageResource] = js.native
  
  /**
    * Enable or disable automatically blurring focused input, dismissing keyboard on unmount
    * #### (Android specific)
    * @default false
    */
  var blurOnUnmount: js.UndefOr[Boolean] = js.native
  
  /**
    * Configure the bottom tab associated to the screen
    */
  var bottomTab: js.UndefOr[OptionsBottomTab] = js.native
  
  /**
    * Configure the bottom tabs
    */
  var bottomTabs: js.UndefOr[OptionsBottomTabs] = js.native
  
  var fab: js.UndefOr[OptionsFab] = js.native
  
  /**
    * Configure the layout
    */
  var layout: js.UndefOr[OptionsLayout] = js.native
  
  /**
    * Configure the modal
    */
  var modal: js.UndefOr[ModalOptions] = js.native
  
  /**
    * Configure the presentation style of the modal
    */
  var modalPresentationStyle: js.UndefOr[OptionsModalPresentationStyle] = js.native
  
  /**
    * Configure the transition style of the modal
    *
    * #### (Android specific)
    */
  var modalTransitionStyle: js.UndefOr[OptionsModalTransitionStyle] = js.native
  
  /**
    * Configure Android's NavigationBar
    */
  var navigationBar: js.UndefOr[NavigationBarOptions] = js.native
  
  /**
    * Configure the overlay
    */
  var overlay: js.UndefOr[OverlayOptions] = js.native
  
  /**
    * Enable or disable swipe back to pop gesture
    * #### (iOS specific)
    * @default true
    */
  var popGesture: js.UndefOr[Boolean] = js.native
  
  /**
    * Preview configuration for Peek and Pop
    * #### (iOS specific)
    */
  var preview: js.UndefOr[OptionsPreview] = js.native
  
  /**
    * Background image for the Navigation View
    * #### (iOS specific)
    */
  var rootBackgroundImage: js.UndefOr[ImageResource] = js.native
  
  /**
    * Configure the side menu
    */
  var sideMenu: js.UndefOr[OptionsSideMenu] = js.native
  
  /**
    * Configure the splitView controller
    */
  var splitView: js.UndefOr[OptionsSplitView] = js.native
  
  /**
    * Configure the status bar
    */
  var statusBar: js.UndefOr[OptionsStatusBar] = js.native
  
  /**
    * Configure the top bar
    */
  var topBar: js.UndefOr[OptionsTopBar] = js.native
  
  /**
    * Provides a way to configure the overall presentation of your application's main user interface
    * #### (iOS specific)
    */
  var window: js.UndefOr[WindowOptions] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnimations(value: AnimationOptions): Self = this.set("animations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimations: Self = this.set("animations", js.undefined)
    
    @scala.inline
    def setBackgroundImage(value: ImageResource): Self = this.set("backgroundImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundImage: Self = this.set("backgroundImage", js.undefined)
    
    @scala.inline
    def setBlurOnUnmount(value: Boolean): Self = this.set("blurOnUnmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlurOnUnmount: Self = this.set("blurOnUnmount", js.undefined)
    
    @scala.inline
    def setBottomTab(value: OptionsBottomTab): Self = this.set("bottomTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomTab: Self = this.set("bottomTab", js.undefined)
    
    @scala.inline
    def setBottomTabs(value: OptionsBottomTabs): Self = this.set("bottomTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomTabs: Self = this.set("bottomTabs", js.undefined)
    
    @scala.inline
    def setFab(value: OptionsFab): Self = this.set("fab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFab: Self = this.set("fab", js.undefined)
    
    @scala.inline
    def setLayout(value: OptionsLayout): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setModal(value: ModalOptions): Self = this.set("modal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModal: Self = this.set("modal", js.undefined)
    
    @scala.inline
    def setModalPresentationStyle(value: OptionsModalPresentationStyle): Self = this.set("modalPresentationStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModalPresentationStyle: Self = this.set("modalPresentationStyle", js.undefined)
    
    @scala.inline
    def setModalTransitionStyle(value: OptionsModalTransitionStyle): Self = this.set("modalTransitionStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModalTransitionStyle: Self = this.set("modalTransitionStyle", js.undefined)
    
    @scala.inline
    def setNavigationBar(value: NavigationBarOptions): Self = this.set("navigationBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigationBar: Self = this.set("navigationBar", js.undefined)
    
    @scala.inline
    def setOverlay(value: OverlayOptions): Self = this.set("overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    
    @scala.inline
    def setPopGesture(value: Boolean): Self = this.set("popGesture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopGesture: Self = this.set("popGesture", js.undefined)
    
    @scala.inline
    def setPreview(value: OptionsPreview): Self = this.set("preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreview: Self = this.set("preview", js.undefined)
    
    @scala.inline
    def setRootBackgroundImage(value: ImageResource): Self = this.set("rootBackgroundImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootBackgroundImage: Self = this.set("rootBackgroundImage", js.undefined)
    
    @scala.inline
    def setSideMenu(value: OptionsSideMenu): Self = this.set("sideMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSideMenu: Self = this.set("sideMenu", js.undefined)
    
    @scala.inline
    def setSplitView(value: OptionsSplitView): Self = this.set("splitView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplitView: Self = this.set("splitView", js.undefined)
    
    @scala.inline
    def setStatusBar(value: OptionsStatusBar): Self = this.set("statusBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusBar: Self = this.set("statusBar", js.undefined)
    
    @scala.inline
    def setTopBar(value: OptionsTopBar): Self = this.set("topBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopBar: Self = this.set("topBar", js.undefined)
    
    @scala.inline
    def setWindow(value: WindowOptions): Self = this.set("window", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindow: Self = this.set("window", js.undefined)
  }
}
