package typings.reactour.reactourMod

import typings.std.MutationObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactourState extends js.Object {
  var bottom: Double
  var current: Double
  var focusUnlocked: Boolean
  var h: Double
  var height: Double
  var helperHeight: js.UndefOr[Double] = js.undefined
  var helperPosition: js.UndefOr[ReactourStepPosition] = js.undefined
  var helperWidth: js.UndefOr[Double] = js.undefined
  var inDOM: Boolean
  var isOpen: Boolean
  var left: Double
  var observer: MutationObserver | Null
  var right: Double
  var top: Double
  var w: Double
  var width: Double
}

object ReactourState {
  @scala.inline
  def apply(
    bottom: Double,
    current: Double,
    focusUnlocked: Boolean,
    h: Double,
    height: Double,
    inDOM: Boolean,
    isOpen: Boolean,
    left: Double,
    right: Double,
    top: Double,
    w: Double,
    width: Double,
    helperHeight: Int | Double = null,
    helperPosition: ReactourStepPosition = null,
    helperWidth: Int | Double = null,
    observer: MutationObserver = null
  ): ReactourState = {
    val __obj = js.Dynamic.literal(bottom = bottom, current = current, focusUnlocked = focusUnlocked, h = h, height = height, inDOM = inDOM, isOpen = isOpen, left = left, right = right, top = top, w = w, width = width)
    if (helperHeight != null) __obj.updateDynamic("helperHeight")(helperHeight.asInstanceOf[js.Any])
    if (helperPosition != null) __obj.updateDynamic("helperPosition")(helperPosition)
    if (helperWidth != null) __obj.updateDynamic("helperWidth")(helperWidth.asInstanceOf[js.Any])
    if (observer != null) __obj.updateDynamic("observer")(observer)
    __obj.asInstanceOf[ReactourState]
  }
}

