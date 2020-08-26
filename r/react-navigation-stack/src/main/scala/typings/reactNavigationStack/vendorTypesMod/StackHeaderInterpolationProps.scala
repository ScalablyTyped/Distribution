package typings.reactNavigationStack.vendorTypesMod

import typings.reactNavigationStack.anon.Header
import typings.reactNavigationStack.anon.Progress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackHeaderInterpolationProps extends js.Object {
  /**
    * Values for the current screen (the screen which owns this header).
    */
  var current: Progress = js.native
  /**
    * Layout measurements for various items we use for animation.
    */
  var layouts: Header = js.native
  /**
    * Values for the current screen the screen after this one in the stack.
    * This can be `undefined` in case the screen animating is the last one.
    */
  var next: js.UndefOr[Progress] = js.native
}

object StackHeaderInterpolationProps {
  @scala.inline
  def apply(current: Progress, layouts: Header): StackHeaderInterpolationProps = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], layouts = layouts.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackHeaderInterpolationProps]
  }
  @scala.inline
  implicit class StackHeaderInterpolationPropsOps[Self <: StackHeaderInterpolationProps] (val x: Self) extends AnyVal {
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
    def setCurrent(value: Progress): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayouts(value: Header): Self = this.set("layouts", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext(value: Progress): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
  }
  
}

