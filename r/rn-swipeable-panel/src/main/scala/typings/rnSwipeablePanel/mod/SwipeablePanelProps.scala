package typings.rnSwipeablePanel.mod

import typings.react.mod.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SwipeablePanelProps extends Props[SwipeablePanel] {
  
  /**
    * Set true if you want to make toucable outside of panel
    */
  var allowTouchOutside: js.UndefOr[Boolean] = js.native
  
  /**
    * Use this prop to override bar style
    */
  var barStyle: js.UndefOr[js.Object] = js.native
  
  /**
    * Use this prop to override close button icon style
    */
  var closeIconStyle: js.UndefOr[js.Object] = js.native
  
  /**
    * Set true if you want to close panel by touching outside
    */
  var closeOnTouchOutside: js.UndefOr[Boolean] = js.native
  
  /**
    * Use this prop to override close button background style
    */
  var closeRootStyle: js.UndefOr[js.Object] = js.native
  
  /**
    * Set true if you want to make full with panel
    */
  var fullWidth: js.UndefOr[Boolean] = js.native
  
  /**
    * Required prop for panels actual state. Set true if you want to open panel
    */
  var isActive: Boolean = js.native
  
  /**
    * Set true if you want to disable black background opacity
    */
  var noBackgroundOpacity: js.UndefOr[Boolean] = js.native
  
  /**
    * Set true if you want to remove gray bar
    */
  var noBar: js.UndefOr[Boolean] = js.native
  
  // Event Handlers
  /**
    * Required prop to keep panel's state sync with your parent components'state. Will be fired when panel is closed. See the example project.
    */
  def onClose(): Unit = js.native
  
  /**
    * Set true if you want to let panel open just large mode
    */
  var onlyLarge: js.UndefOr[Boolean] = js.native
  
  /**
    * Set true if you want to let panel open just small mode
    */
  var onlySmall: js.UndefOr[Boolean] = js.native
  
  /**
    * Set true if you want to open panel large by default
    */
  var openLarge: js.UndefOr[Boolean] = js.native
  
  /**
    * Set true if you want to show close button
    */
  var showCloseButton: js.UndefOr[Boolean] = js.native
  
  /**
    * Use this prop to override panel style
    */
  var style: js.UndefOr[js.Object] = js.native
}
object SwipeablePanelProps {
  
  @scala.inline
  def apply(isActive: Boolean, onClose: () => Unit): SwipeablePanelProps = {
    val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose))
    __obj.asInstanceOf[SwipeablePanelProps]
  }
  
  @scala.inline
  implicit class SwipeablePanelPropsOps[Self <: SwipeablePanelProps] (val x: Self) extends AnyVal {
    
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
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAllowTouchOutside(value: Boolean): Self = this.set("allowTouchOutside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowTouchOutside: Self = this.set("allowTouchOutside", js.undefined)
    
    @scala.inline
    def setBarStyle(value: js.Object): Self = this.set("barStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarStyle: Self = this.set("barStyle", js.undefined)
    
    @scala.inline
    def setCloseIconStyle(value: js.Object): Self = this.set("closeIconStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseIconStyle: Self = this.set("closeIconStyle", js.undefined)
    
    @scala.inline
    def setCloseOnTouchOutside(value: Boolean): Self = this.set("closeOnTouchOutside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseOnTouchOutside: Self = this.set("closeOnTouchOutside", js.undefined)
    
    @scala.inline
    def setCloseRootStyle(value: js.Object): Self = this.set("closeRootStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseRootStyle: Self = this.set("closeRootStyle", js.undefined)
    
    @scala.inline
    def setFullWidth(value: Boolean): Self = this.set("fullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullWidth: Self = this.set("fullWidth", js.undefined)
    
    @scala.inline
    def setNoBackgroundOpacity(value: Boolean): Self = this.set("noBackgroundOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoBackgroundOpacity: Self = this.set("noBackgroundOpacity", js.undefined)
    
    @scala.inline
    def setNoBar(value: Boolean): Self = this.set("noBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoBar: Self = this.set("noBar", js.undefined)
    
    @scala.inline
    def setOnlyLarge(value: Boolean): Self = this.set("onlyLarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyLarge: Self = this.set("onlyLarge", js.undefined)
    
    @scala.inline
    def setOnlySmall(value: Boolean): Self = this.set("onlySmall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlySmall: Self = this.set("onlySmall", js.undefined)
    
    @scala.inline
    def setOpenLarge(value: Boolean): Self = this.set("openLarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpenLarge: Self = this.set("openLarge", js.undefined)
    
    @scala.inline
    def setShowCloseButton(value: Boolean): Self = this.set("showCloseButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCloseButton: Self = this.set("showCloseButton", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
