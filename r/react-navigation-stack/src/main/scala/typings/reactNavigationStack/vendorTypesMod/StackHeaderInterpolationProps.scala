package typings.reactNavigationStack.vendorTypesMod

import typings.reactNavigationStack.AnonHeader
import typings.reactNavigationStack.AnonProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackHeaderInterpolationProps extends js.Object {
  /**
    * Values for the current screen (the screen which owns this header).
    */
  var current: AnonProgress
  /**
    * Layout measurements for various items we use for animation.
    */
  var layouts: AnonHeader
  /**
    * Values for the current screen the screen after this one in the stack.
    * This can be `undefined` in case the screen animating is the last one.
    */
  var next: js.UndefOr[AnonProgress] = js.undefined
}

object StackHeaderInterpolationProps {
  @scala.inline
  def apply(current: AnonProgress, layouts: AnonHeader, next: AnonProgress = null): StackHeaderInterpolationProps = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], layouts = layouts.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackHeaderInterpolationProps]
  }
}

