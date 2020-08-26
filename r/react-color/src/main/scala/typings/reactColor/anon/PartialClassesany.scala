package typings.reactColor.anon

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<reactcss.reactcss.Classes<any>> */
@js.native
trait PartialClassesany extends js.Object {
  var default: js.UndefOr[Partial[_]] = js.native
}

object PartialClassesany {
  @scala.inline
  def apply(): PartialClassesany = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialClassesany]
  }
  @scala.inline
  implicit class PartialClassesanyOps[Self <: PartialClassesany] (val x: Self) extends AnyVal {
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
    def setDefault(value: Partial[_]): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
  }
  
}

