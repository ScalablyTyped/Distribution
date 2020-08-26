package typings.reactCopyWrite.mod

import typings.react.mod.global.JSX.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProviderProps[T] extends js.Object {
  var children: Element | js.Array[Element] = js.native
  var initialState: js.UndefOr[Partial[T]] = js.native
}

object ProviderProps {
  @scala.inline
  def apply[T](children: Element | js.Array[Element]): ProviderProps[T] = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderProps[T]]
  }
  @scala.inline
  implicit class ProviderPropsOps[Self <: ProviderProps[_], T] (val x: Self with ProviderProps[T]) extends AnyVal {
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
    def setChildrenVarargs(value: Element*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: Element | js.Array[Element]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialState(value: Partial[T]): Self = this.set("initialState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
  }
  
}

