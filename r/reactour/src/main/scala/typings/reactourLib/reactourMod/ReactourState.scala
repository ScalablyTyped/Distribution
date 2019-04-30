package typings
package reactourLib.reactourMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactourState extends js.Object {
  var bottom: scala.Double
  var current: scala.Double
  var focusUnlocked: scala.Boolean
  var h: scala.Double
  var height: scala.Double
  var helperHeight: js.UndefOr[scala.Double] = js.undefined
  var helperPosition: js.UndefOr[ReactourStepPosition] = js.undefined
  var helperWidth: js.UndefOr[scala.Double] = js.undefined
  var inDOM: scala.Boolean
  var isOpen: scala.Boolean
  var left: scala.Double
  var observer: stdLib.MutationObserver | scala.Null
  var right: scala.Double
  var top: scala.Double
  var w: scala.Double
  var width: scala.Double
}

object ReactourState {
  @scala.inline
  def apply(
    bottom: scala.Double,
    current: scala.Double,
    focusUnlocked: scala.Boolean,
    h: scala.Double,
    height: scala.Double,
    inDOM: scala.Boolean,
    isOpen: scala.Boolean,
    left: scala.Double,
    right: scala.Double,
    top: scala.Double,
    w: scala.Double,
    width: scala.Double,
    helperHeight: scala.Int | scala.Double = null,
    helperPosition: ReactourStepPosition = null,
    helperWidth: scala.Int | scala.Double = null,
    observer: stdLib.MutationObserver = null
  ): ReactourState = {
    val __obj = js.Dynamic.literal(bottom = bottom, current = current, focusUnlocked = focusUnlocked, h = h, height = height, inDOM = inDOM, isOpen = isOpen, left = left, right = right, top = top, w = w, width = width)
    if (helperHeight != null) __obj.updateDynamic("helperHeight")(helperHeight.asInstanceOf[js.Any])
    if (helperPosition != null) __obj.updateDynamic("helperPosition")(helperPosition)
    if (helperWidth != null) __obj.updateDynamic("helperWidth")(helperWidth.asInstanceOf[js.Any])
    if (observer != null) __obj.updateDynamic("observer")(observer)
    __obj.asInstanceOf[ReactourState]
  }
}

