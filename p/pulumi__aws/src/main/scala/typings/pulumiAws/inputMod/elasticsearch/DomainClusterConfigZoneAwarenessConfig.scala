package typings.pulumiAws.inputMod.elasticsearch

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainClusterConfigZoneAwarenessConfig extends js.Object {
  /**
    * Number of Availability Zones for the domain to use with `zoneAwarenessEnabled`. Defaults to `2`. Valid values: `2` or `3`.
    */
  var availabilityZoneCount: js.UndefOr[Input[Double]] = js.native
}

object DomainClusterConfigZoneAwarenessConfig {
  @scala.inline
  def apply(): DomainClusterConfigZoneAwarenessConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainClusterConfigZoneAwarenessConfig]
  }
  @scala.inline
  implicit class DomainClusterConfigZoneAwarenessConfigOps[Self <: DomainClusterConfigZoneAwarenessConfig] (val x: Self) extends AnyVal {
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
    def setAvailabilityZoneCount(value: Input[Double]): Self = this.set("availabilityZoneCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZoneCount: Self = this.set("availabilityZoneCount", js.undefined)
  }
  
}

