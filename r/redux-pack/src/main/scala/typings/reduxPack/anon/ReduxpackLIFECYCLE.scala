package typings.reduxPack.anon

import typings.reduxPack.mod.LIFECYCLEValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReduxpackLIFECYCLE extends js.Object {
  @JSName("redux-pack/LIFECYCLE")
  var `redux-packSlashLIFECYCLE`: js.UndefOr[LIFECYCLEValues] = js.native
  @JSName("redux-pack/TRANSACTION")
  var `redux-packSlashTRANSACTION`: js.UndefOr[String] = js.native
}

object ReduxpackLIFECYCLE {
  @scala.inline
  def apply(): ReduxpackLIFECYCLE = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReduxpackLIFECYCLE]
  }
  @scala.inline
  implicit class ReduxpackLIFECYCLEOps[Self <: ReduxpackLIFECYCLE] (val x: Self) extends AnyVal {
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
    def `setRedux-packSlashLIFECYCLE`(value: LIFECYCLEValues): Self = this.set("redux-pack/LIFECYCLE", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRedux-packSlashLIFECYCLE`: Self = this.set("redux-pack/LIFECYCLE", js.undefined)
    @scala.inline
    def `setRedux-packSlashTRANSACTION`(value: String): Self = this.set("redux-pack/TRANSACTION", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteRedux-packSlashTRANSACTION`: Self = this.set("redux-pack/TRANSACTION", js.undefined)
  }
  
}

