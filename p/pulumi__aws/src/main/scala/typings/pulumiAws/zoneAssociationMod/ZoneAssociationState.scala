package typings.pulumiAws.zoneAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoneAssociationState extends js.Object {
  /**
    * The VPC to associate with the private hosted zone.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
  /**
    * The VPC's region. Defaults to the region of the AWS provider.
    */
  val vpcRegion: js.UndefOr[Input[String]] = js.native
  /**
    * The private hosted zone to associate.
    */
  val zoneId: js.UndefOr[Input[String]] = js.native
}

object ZoneAssociationState {
  @scala.inline
  def apply(): ZoneAssociationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoneAssociationState]
  }
  @scala.inline
  implicit class ZoneAssociationStateOps[Self <: ZoneAssociationState] (val x: Self) extends AnyVal {
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
    def setVpcId(value: Input[String]): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("vpcId", js.undefined)
    @scala.inline
    def setVpcRegion(value: Input[String]): Self = this.set("vpcRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcRegion: Self = this.set("vpcRegion", js.undefined)
    @scala.inline
    def setZoneId(value: Input[String]): Self = this.set("zoneId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoneId: Self = this.set("zoneId", js.undefined)
  }
  
}

