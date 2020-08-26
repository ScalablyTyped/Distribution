package typings.reactSpring.anon

import typings.reactSpring.webMod.InferFrom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait From[DS /* <: js.Object */] extends js.Object {
  var from: js.UndefOr[InferFrom[DS]] = js.native
  /**
    * Callback when the animation comes to a still-stand
    */
  var onRest: js.UndefOr[js.Function1[/* ds */ InferFrom[DS], Unit]] = js.native
}

object From {
  @scala.inline
  def apply[/* <: js.Object */ DS](): From[DS] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[From[DS]]
  }
  @scala.inline
  implicit class FromOps[Self <: From[_], /* <: js.Object */ DS] (val x: Self with From[DS]) extends AnyVal {
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
    def setFrom(value: InferFrom[DS]): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setOnRest(value: /* ds */ InferFrom[DS] => Unit): Self = this.set("onRest", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRest: Self = this.set("onRest", js.undefined)
  }
  
}

