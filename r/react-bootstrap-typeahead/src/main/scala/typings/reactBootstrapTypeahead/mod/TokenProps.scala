package typings.reactBootstrapTypeahead.mod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.div
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenProps
  extends AllHTMLAttributes[div]
     with ClassAttributes[div] {
  var active: js.UndefOr[Boolean] = js.native
  var onRemove: js.UndefOr[js.Function0[Unit]] = js.native
}

object TokenProps {
  @scala.inline
  def apply(): TokenProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenProps]
  }
  @scala.inline
  implicit class TokenPropsOps[Self <: TokenProps] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setOnRemove(value: () => Unit): Self = this.set("onRemove", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnRemove: Self = this.set("onRemove", js.undefined)
  }
  
}

