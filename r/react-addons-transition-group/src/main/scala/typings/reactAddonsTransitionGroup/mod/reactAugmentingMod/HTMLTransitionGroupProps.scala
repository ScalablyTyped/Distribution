package typings.reactAddonsTransitionGroup.mod.reactAugmentingMod

import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactElement
import typings.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLTransitionGroupProps[T] extends HTMLAttributes[T] {
  var childFactory: js.UndefOr[js.Function1[/* child */ ReactElement, ReactElement]] = js.native
  var component: js.UndefOr[ReactType[_]] = js.native
}

object HTMLTransitionGroupProps {
  @scala.inline
  def apply[T](): HTMLTransitionGroupProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLTransitionGroupProps[T]]
  }
  @scala.inline
  implicit class HTMLTransitionGroupPropsOps[Self <: HTMLTransitionGroupProps[_], T] (val x: Self with HTMLTransitionGroupProps[T]) extends AnyVal {
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
    def setChildFactory(value: /* child */ ReactElement => ReactElement): Self = this.set("childFactory", js.Any.fromFunction1(value))
    @scala.inline
    def deleteChildFactory: Self = this.set("childFactory", js.undefined)
    @scala.inline
    def setComponent(value: ReactType[_]): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
  }
  
}

