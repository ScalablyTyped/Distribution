package typings.reactNativeSwipeout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeoutProperties extends js.Object {
  var autoClose: js.UndefOr[Boolean] = js.undefined
  var backgroundColor: js.UndefOr[String] = js.undefined
  var buttonWidth: js.UndefOr[Double] = js.undefined
  var close: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var left: js.UndefOr[js.Array[SwipeoutButtonProperties]] = js.undefined
  var onClose: js.UndefOr[
    js.Function3[/* sectionId */ Double, /* rowId */ Double, /* direction */ String, Unit]
  ] = js.undefined
  var onOpen: js.UndefOr[
    js.Function3[/* sectionId */ Double, /* rowId */ Double, /* direction */ String, Unit]
  ] = js.undefined
  var openLeft: js.UndefOr[Boolean] = js.undefined
  var openRight: js.UndefOr[Boolean] = js.undefined
  var right: js.UndefOr[js.Array[SwipeoutButtonProperties]] = js.undefined
  var rowId: js.UndefOr[Double] = js.undefined
  var scroll: js.UndefOr[js.Function1[/* scrollEnabled */ Boolean, Unit]] = js.undefined
  var sectionId: js.UndefOr[Double] = js.undefined
  var sensitivity: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object SwipeoutProperties {
  @scala.inline
  def apply(
    autoClose: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: String = null,
    buttonWidth: js.UndefOr[Double] = js.undefined,
    close: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    left: js.Array[SwipeoutButtonProperties] = null,
    onClose: (/* sectionId */ Double, /* rowId */ Double, /* direction */ String) => Unit = null,
    onOpen: (/* sectionId */ Double, /* rowId */ Double, /* direction */ String) => Unit = null,
    openLeft: js.UndefOr[Boolean] = js.undefined,
    openRight: js.UndefOr[Boolean] = js.undefined,
    right: js.Array[SwipeoutButtonProperties] = null,
    rowId: js.UndefOr[Double] = js.undefined,
    scroll: /* scrollEnabled */ Boolean => Unit = null,
    sectionId: js.UndefOr[Double] = js.undefined,
    sensitivity: js.UndefOr[Double] = js.undefined,
    style: js.Object = null
  ): SwipeoutProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClose)) __obj.updateDynamic("autoClose")(autoClose.get.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (!js.isUndefined(buttonWidth)) __obj.updateDynamic("buttonWidth")(buttonWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(close)) __obj.updateDynamic("close")(close.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction3(onClose))
    if (onOpen != null) __obj.updateDynamic("onOpen")(js.Any.fromFunction3(onOpen))
    if (!js.isUndefined(openLeft)) __obj.updateDynamic("openLeft")(openLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(openRight)) __obj.updateDynamic("openRight")(openRight.get.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (!js.isUndefined(rowId)) __obj.updateDynamic("rowId")(rowId.get.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(js.Any.fromFunction1(scroll))
    if (!js.isUndefined(sectionId)) __obj.updateDynamic("sectionId")(sectionId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitivity)) __obj.updateDynamic("sensitivity")(sensitivity.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwipeoutProperties]
  }
}

