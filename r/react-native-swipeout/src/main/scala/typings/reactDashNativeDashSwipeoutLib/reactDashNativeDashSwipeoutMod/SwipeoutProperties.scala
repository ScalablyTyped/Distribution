package typings
package reactDashNativeDashSwipeoutLib.reactDashNativeDashSwipeoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeoutProperties extends js.Object {
  var autoClose: js.UndefOr[scala.Boolean] = js.undefined
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var buttonWidth: js.UndefOr[scala.Double] = js.undefined
  var close: js.UndefOr[scala.Boolean] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var left: js.UndefOr[js.Array[SwipeoutButtonProperties]] = js.undefined
  var onClose: js.UndefOr[
    js.Function3[
      /* sectionId */ scala.Double, 
      /* rowId */ scala.Double, 
      /* direction */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var onOpen: js.UndefOr[
    js.Function3[
      /* sectionId */ scala.Double, 
      /* rowId */ scala.Double, 
      /* direction */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var openLeft: js.UndefOr[scala.Boolean] = js.undefined
  var openRight: js.UndefOr[scala.Boolean] = js.undefined
  var right: js.UndefOr[js.Array[SwipeoutButtonProperties]] = js.undefined
  var rowId: js.UndefOr[scala.Double] = js.undefined
  var scroll: js.UndefOr[js.Function1[/* scrollEnabled */ scala.Boolean, scala.Unit]] = js.undefined
  var sectionId: js.UndefOr[scala.Double] = js.undefined
  var sensitivity: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object SwipeoutProperties {
  @scala.inline
  def apply(
    autoClose: js.UndefOr[scala.Boolean] = js.undefined,
    backgroundColor: java.lang.String = null,
    buttonWidth: scala.Int | scala.Double = null,
    close: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    left: js.Array[SwipeoutButtonProperties] = null,
    onClose: js.Function3[
      /* sectionId */ scala.Double, 
      /* rowId */ scala.Double, 
      /* direction */ java.lang.String, 
      scala.Unit
    ] = null,
    onOpen: js.Function3[
      /* sectionId */ scala.Double, 
      /* rowId */ scala.Double, 
      /* direction */ java.lang.String, 
      scala.Unit
    ] = null,
    openLeft: js.UndefOr[scala.Boolean] = js.undefined,
    openRight: js.UndefOr[scala.Boolean] = js.undefined,
    right: js.Array[SwipeoutButtonProperties] = null,
    rowId: scala.Int | scala.Double = null,
    scroll: js.Function1[/* scrollEnabled */ scala.Boolean, scala.Unit] = null,
    sectionId: scala.Int | scala.Double = null,
    sensitivity: scala.Int | scala.Double = null,
    style: js.Object = null
  ): SwipeoutProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (buttonWidth != null) __obj.updateDynamic("buttonWidth")(buttonWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(close)) __obj.updateDynamic("close")(close)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (left != null) __obj.updateDynamic("left")(left)
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (onOpen != null) __obj.updateDynamic("onOpen")(onOpen)
    if (!js.isUndefined(openLeft)) __obj.updateDynamic("openLeft")(openLeft)
    if (!js.isUndefined(openRight)) __obj.updateDynamic("openRight")(openRight)
    if (right != null) __obj.updateDynamic("right")(right)
    if (rowId != null) __obj.updateDynamic("rowId")(rowId.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(scroll)
    if (sectionId != null) __obj.updateDynamic("sectionId")(sectionId.asInstanceOf[js.Any])
    if (sensitivity != null) __obj.updateDynamic("sensitivity")(sensitivity.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[SwipeoutProperties]
  }
}

