package typings.reactSpring.webMod

import typings.reactSpring.renderpropsUniversalMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseTransitionResult[TItem, DS /* <: js.Object */] extends js.Object {
  var item: TItem = js.native
  var key: String = js.native
  var props: AnimatedValue[ForwardedProps[DS]] = js.native
  var state: State = js.native
}

object UseTransitionResult {
  @scala.inline
  def apply[TItem, /* <: js.Object */ DS](item: TItem, key: String, props: AnimatedValue[ForwardedProps[DS]], state: State): UseTransitionResult[TItem, DS] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseTransitionResult[TItem, DS]]
  }
  @scala.inline
  implicit class UseTransitionResultOps[Self <: UseTransitionResult[_, _], TItem, /* <: js.Object */ DS] (val x: Self with (UseTransitionResult[TItem, DS])) extends AnyVal {
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
    def setItem(value: TItem): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setProps(value: AnimatedValue[ForwardedProps[DS]]): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: State): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

