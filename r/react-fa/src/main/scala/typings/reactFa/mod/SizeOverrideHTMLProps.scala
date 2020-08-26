package typings.reactFa.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// fake intermediate interface to remove typing on size, as the typing
// is overrided by react-fa
@js.native
trait SizeOverrideHTMLProps[T]
  extends AllHTMLAttributes[T]
     with ClassAttributes[T] {
  @JSName("size")
  var size_SizeOverrideHTMLProps: js.UndefOr[js.Any] = js.native
}

object SizeOverrideHTMLProps {
  @scala.inline
  def apply[T](): SizeOverrideHTMLProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeOverrideHTMLProps[T]]
  }
  @scala.inline
  implicit class SizeOverrideHTMLPropsOps[Self <: SizeOverrideHTMLProps[_], T] (val x: Self with SizeOverrideHTMLProps[T]) extends AnyVal {
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
    def setSize(value: js.Any): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

