package typings.rnSwipeablePanel.mod

import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.Props
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeablePanelProps extends Props[SwipeablePanel] {
  /**
    * Set true if you want to make toucable outside of panel
    */
  var allowTouchOutside: js.UndefOr[Boolean] = js.undefined
  /**
    * Use this prop to override bar style
    */
  var barStyle: js.UndefOr[js.Object] = js.undefined
  /**
    * Use this prop to override close button icon style
    */
  var closeIconStyle: js.UndefOr[js.Object] = js.undefined
  /**
    * Set true if you want to close panel by touching outside
    */
  var closeOnTouchOutside: js.UndefOr[Boolean] = js.undefined
  /**
    * Use this prop to override close button background style
    */
  var closeRootStyle: js.UndefOr[js.Object] = js.undefined
  /**
    * Set true if you want to make full with panel
    */
  var fullWidth: js.UndefOr[Boolean] = js.undefined
  /**
    * Required prop for panels actual state. Set true if you want to open panel
    */
  var isActive: Boolean
  /**
    * Set true if you want to disable black background opacity
    */
  var noBackgroundOpacity: js.UndefOr[Boolean] = js.undefined
  /**
    * Set true if you want to remove gray bar
    */
  var noBar: js.UndefOr[Boolean] = js.undefined
  /**
    * Set true if you want to let panel open just large mode
    */
  var onlyLarge: js.UndefOr[Boolean] = js.undefined
  /**
    * Set true if you want to let panel open just small mode
    */
  var onlySmall: js.UndefOr[Boolean] = js.undefined
  /**
    * Set true if you want to open panel large by default
    */
  var openLarge: js.UndefOr[Boolean] = js.undefined
  /**
    * Set true if you want to show close button
    */
  var showCloseButton: js.UndefOr[Boolean] = js.undefined
  /**
    * Use this prop to override panel style
    */
  var style: js.UndefOr[js.Object] = js.undefined
  // Event Handlers
  /**
    * Required prop to keep panel's state sync with your parent components'state. Will be fired when panel is closed. See the example project.
    */
  def onClose(): Unit
}

object SwipeablePanelProps {
  @scala.inline
  def apply(
    isActive: Boolean,
    onClose: () => Unit,
    allowTouchOutside: js.UndefOr[Boolean] = js.undefined,
    barStyle: js.Object = null,
    children: ReactNode = null,
    closeIconStyle: js.Object = null,
    closeOnTouchOutside: js.UndefOr[Boolean] = js.undefined,
    closeRootStyle: js.Object = null,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    noBackgroundOpacity: js.UndefOr[Boolean] = js.undefined,
    noBar: js.UndefOr[Boolean] = js.undefined,
    onlyLarge: js.UndefOr[Boolean] = js.undefined,
    onlySmall: js.UndefOr[Boolean] = js.undefined,
    openLarge: js.UndefOr[Boolean] = js.undefined,
    ref: js.UndefOr[Null | LegacyRef[SwipeablePanel]] = js.undefined,
    showCloseButton: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null
  ): SwipeablePanelProps = {
    val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose))
    if (!js.isUndefined(allowTouchOutside)) __obj.updateDynamic("allowTouchOutside")(allowTouchOutside.get.asInstanceOf[js.Any])
    if (barStyle != null) __obj.updateDynamic("barStyle")(barStyle.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (closeIconStyle != null) __obj.updateDynamic("closeIconStyle")(closeIconStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnTouchOutside)) __obj.updateDynamic("closeOnTouchOutside")(closeOnTouchOutside.get.asInstanceOf[js.Any])
    if (closeRootStyle != null) __obj.updateDynamic("closeRootStyle")(closeRootStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(noBackgroundOpacity)) __obj.updateDynamic("noBackgroundOpacity")(noBackgroundOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noBar)) __obj.updateDynamic("noBar")(noBar.get.asInstanceOf[js.Any])
    if (!js.isUndefined(onlyLarge)) __obj.updateDynamic("onlyLarge")(onlyLarge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(onlySmall)) __obj.updateDynamic("onlySmall")(onlySmall.get.asInstanceOf[js.Any])
    if (!js.isUndefined(openLarge)) __obj.updateDynamic("openLarge")(openLarge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwipeablePanelProps]
  }
}

