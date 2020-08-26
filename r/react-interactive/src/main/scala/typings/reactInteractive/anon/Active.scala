package typings.reactInteractive.anon

import typings.react.mod.CSSProperties
import typings.reactInteractive.mod.ActiveProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Active extends ActiveProps {
  var active: js.UndefOr[CSSProperties] = js.native
}

object Active {
  @scala.inline
  def apply(): Active = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Active]
  }
  @scala.inline
  implicit class ActiveOps[Self <: Active] (val x: Self) extends AnyVal {
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
    def setActive(value: CSSProperties): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
  }
  
}

