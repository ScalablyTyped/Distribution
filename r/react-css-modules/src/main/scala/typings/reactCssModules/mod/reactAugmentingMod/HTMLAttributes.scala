package typings.reactCssModules.mod.reactAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLAttributes[T] extends js.Object {
  var styleName: js.UndefOr[String] = js.native
}

object HTMLAttributes {
  @scala.inline
  def apply[T](): HTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTMLAttributes[T]]
  }
  @scala.inline
  implicit class HTMLAttributesOps[Self <: HTMLAttributes[_], T] (val x: Self with HTMLAttributes[T]) extends AnyVal {
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
    def setStyleName(value: String): Self = this.set("styleName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyleName: Self = this.set("styleName", js.undefined)
  }
  
}

