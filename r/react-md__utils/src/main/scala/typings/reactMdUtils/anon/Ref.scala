package typings.reactMdUtils.anon

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ref[E /* <: HTMLElement */] extends js.Object {
  /**
    * An optional ref that can be applied.
    */
  var ref: js.UndefOr[typings.react.mod.Ref[E]] = js.native
}

object Ref {
  @scala.inline
  def apply[/* <: typings.std.HTMLElement */ E](): Ref[E] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ref[E]]
  }
  @scala.inline
  implicit class RefOps[Self <: Ref[_], /* <: typings.std.HTMLElement */ E] (val x: Self with Ref[E]) extends AnyVal {
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
    def setRefFunction1(value: /* instance */ E | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    @scala.inline
    def setRef(value: typings.react.mod.Ref[E]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRef: Self = this.set("ref", js.undefined)
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
  }
  
}

