package typings.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// type SD<K extends ResourceConstant> = {
//   [P in K]: number;
//   energy: number;
// }
/* Inlined std.Partial<std.Record<screeps.ExitKey, string>> */
@js.native
trait ExitsInformation extends js.Object {
  var `1`: js.UndefOr[String] = js.native
  var `3`: js.UndefOr[String] = js.native
  var `5`: js.UndefOr[String] = js.native
  var `7`: js.UndefOr[String] = js.native
}

object ExitsInformation {
  @scala.inline
  def apply(): ExitsInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExitsInformation]
  }
  @scala.inline
  implicit class ExitsInformationOps[Self <: ExitsInformation] (val x: Self) extends AnyVal {
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
    def set1(value: String): Self = this.set("1", value.asInstanceOf[js.Any])
    @scala.inline
    def delete1: Self = this.set("1", js.undefined)
    @scala.inline
    def set3(value: String): Self = this.set("3", value.asInstanceOf[js.Any])
    @scala.inline
    def delete3: Self = this.set("3", js.undefined)
    @scala.inline
    def set5(value: String): Self = this.set("5", value.asInstanceOf[js.Any])
    @scala.inline
    def delete5: Self = this.set("5", js.undefined)
    @scala.inline
    def set7(value: String): Self = this.set("7", value.asInstanceOf[js.Any])
    @scala.inline
    def delete7: Self = this.set("7", js.undefined)
  }
  
}

