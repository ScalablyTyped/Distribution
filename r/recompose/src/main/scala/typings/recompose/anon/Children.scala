package typings.recompose.anon

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Children[TInner] extends js.Object {
  def children(props: TInner): ReactElement = js.native
}

object Children {
  @scala.inline
  def apply[TInner](children: TInner => ReactElement): Children[TInner] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[Children[TInner]]
  }
  @scala.inline
  implicit class ChildrenOps[Self <: Children[_], TInner] (val x: Self with Children[TInner]) extends AnyVal {
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
    def setChildren(value: TInner => ReactElement): Self = this.set("children", js.Any.fromFunction1(value))
  }
  
}

