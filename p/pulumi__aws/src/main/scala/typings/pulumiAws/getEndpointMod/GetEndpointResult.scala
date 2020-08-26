package typings.pulumiAws.getEndpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEndpointResult extends js.Object {
  /**
    * The endpoint based on `endpointType`:
    * * No `endpointType`: Either `iot:Data` or `iot:Data-ATS` [depending on region](https://aws.amazon.com/blogs/iot/aws-iot-core-ats-endpoints/)
    * * `iot:CredentialsProvider`: `IDENTIFIER.credentials.iot.REGION.amazonaws.com`
    * * `iot:Data`: `IDENTIFIER.iot.REGION.amazonaws.com`
    * * `iot:Data-ATS`: `IDENTIFIER-ats.iot.REGION.amazonaws.com`
    * * `iot:Job`: `IDENTIFIER.jobs.iot.REGION.amazonaws.com`
    */
  val endpointAddress: String = js.native
  val endpointType: js.UndefOr[String] = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
}

object GetEndpointResult {
  @scala.inline
  def apply(endpointAddress: String, id: String): GetEndpointResult = {
    val __obj = js.Dynamic.literal(endpointAddress = endpointAddress.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEndpointResult]
  }
  @scala.inline
  implicit class GetEndpointResultOps[Self <: GetEndpointResult] (val x: Self) extends AnyVal {
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
    def setEndpointAddress(value: String): Self = this.set("endpointAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndpointType(value: String): Self = this.set("endpointType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointType: Self = this.set("endpointType", js.undefined)
  }
  
}

