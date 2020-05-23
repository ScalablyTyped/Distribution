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
}

