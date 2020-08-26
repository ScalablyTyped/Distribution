package typings.pulumiAws.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Xamzid2 extends js.Object {
  var `x-amz-id-2`: String = js.native
  var `x-amz-request-id`: String = js.native
}

object Xamzid2 {
  @scala.inline
  def apply(`x-amz-id-2`: String, `x-amz-request-id`: String): Xamzid2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x-amz-id-2")(`x-amz-id-2`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-amz-request-id")(`x-amz-request-id`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xamzid2]
  }
  @scala.inline
  implicit class Xamzid2Ops[Self <: Xamzid2] (val x: Self) extends AnyVal {
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
    def `setX-amz-id-2`(value: String): Self = this.set("x-amz-id-2", value.asInstanceOf[js.Any])
    @scala.inline
    def `setX-amz-request-id`(value: String): Self = this.set("x-amz-request-id", value.asInstanceOf[js.Any])
  }
  
}

