package typings.reactNativeElements.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeConsumerProps[T] extends js.Object {
  def children(props: ThemeProps[T]): ReactNode = js.native
}

object ThemeConsumerProps {
  @scala.inline
  def apply[T](children: ThemeProps[T] => ReactNode): ThemeConsumerProps[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[ThemeConsumerProps[T]]
  }
  @scala.inline
  implicit class ThemeConsumerPropsOps[Self <: ThemeConsumerProps[_], T] (val x: Self with ThemeConsumerProps[T]) extends AnyVal {
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
    def setChildren(value: ThemeProps[T] => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
  }
  
}

