package typings.pulumiCloud.bucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketFilter extends js.Object {
  var keyPrefix: js.UndefOr[String] = js.native
  var keySuffix: js.UndefOr[String] = js.native
}

object BucketFilter {
  @scala.inline
  def apply(): BucketFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketFilter]
  }
  @scala.inline
  implicit class BucketFilterOps[Self <: BucketFilter] (val x: Self) extends AnyVal {
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
    def setKeyPrefix(value: String): Self = this.set("keyPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyPrefix: Self = this.set("keyPrefix", js.undefined)
    @scala.inline
    def setKeySuffix(value: String): Self = this.set("keySuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeySuffix: Self = this.set("keySuffix", js.undefined)
  }
  
}

