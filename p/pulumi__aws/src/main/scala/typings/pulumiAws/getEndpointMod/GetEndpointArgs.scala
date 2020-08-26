package typings.pulumiAws.getEndpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetEndpointArgs extends js.Object {
  /**
    * Endpoint type. Valid values: `iot:CredentialProvider`, `iot:Data`, `iot:Data-ATS`, `iot:Job`.
    */
  val endpointType: js.UndefOr[String] = js.native
}

object GetEndpointArgs {
  @scala.inline
  def apply(): GetEndpointArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEndpointArgs]
  }
  @scala.inline
  implicit class GetEndpointArgsOps[Self <: GetEndpointArgs] (val x: Self) extends AnyVal {
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
    def setEndpointType(value: String): Self = this.set("endpointType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointType: Self = this.set("endpointType", js.undefined)
  }
  
}

