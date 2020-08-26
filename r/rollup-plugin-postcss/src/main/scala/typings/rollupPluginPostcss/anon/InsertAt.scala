package typings.rollupPluginPostcss.anon

import typings.rollupPluginPostcss.rollupPluginPostcssStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertAt extends js.Object {
  var insertAt: js.UndefOr[top | String] = js.native
}

object InsertAt {
  @scala.inline
  def apply(): InsertAt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertAt]
  }
  @scala.inline
  implicit class InsertAtOps[Self <: InsertAt] (val x: Self) extends AnyVal {
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
    def setInsertAt(value: top | String): Self = this.set("insertAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertAt: Self = this.set("insertAt", js.undefined)
  }
  
}

