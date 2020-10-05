package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StorageEstimate extends js.Object {
  var quota: js.UndefOr[Double] = js.native
  var usage: js.UndefOr[Double] = js.native
}

object StorageEstimate {
  @scala.inline
  def apply(): StorageEstimate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageEstimate]
  }
  @scala.inline
  implicit class StorageEstimateOps[Self <: StorageEstimate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQuota(value: Double): Self = this.set("quota", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuota: Self = this.set("quota", js.undefined)
    @scala.inline
    def setUsage(value: Double): Self = this.set("usage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsage: Self = this.set("usage", js.undefined)
  }
  
}

