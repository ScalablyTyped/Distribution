package typings.pulumiAws.elasticloadbalancingGetServiceAccountMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServiceAccountArgs extends js.Object {
  /**
    * Name of the region whose AWS ELB account ID is desired.
    * Defaults to the region from the AWS provider configuration.
    */
  val region: js.UndefOr[String] = js.native
}

object GetServiceAccountArgs {
  @scala.inline
  def apply(): GetServiceAccountArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServiceAccountArgs]
  }
  @scala.inline
  implicit class GetServiceAccountArgsOps[Self <: GetServiceAccountArgs] (val x: Self) extends AnyVal {
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
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
  }
  
}

