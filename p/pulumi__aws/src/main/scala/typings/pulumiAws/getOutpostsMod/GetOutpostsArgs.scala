package typings.pulumiAws.getOutpostsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOutpostsArgs extends js.Object {
  /**
    * Availability Zone name.
    */
  val availabilityZone: js.UndefOr[String] = js.native
  /**
    * Availability Zone identifier.
    */
  val availabilityZoneId: js.UndefOr[String] = js.native
  /**
    * Site identifier.
    */
  val siteId: js.UndefOr[String] = js.native
}

object GetOutpostsArgs {
  @scala.inline
  def apply(): GetOutpostsArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOutpostsArgs]
  }
  @scala.inline
  implicit class GetOutpostsArgsOps[Self <: GetOutpostsArgs] (val x: Self) extends AnyVal {
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
    def setAvailabilityZone(value: String): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("availabilityZone", js.undefined)
    @scala.inline
    def setAvailabilityZoneId(value: String): Self = this.set("availabilityZoneId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZoneId: Self = this.set("availabilityZoneId", js.undefined)
    @scala.inline
    def setSiteId(value: String): Self = this.set("siteId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiteId: Self = this.set("siteId", js.undefined)
  }
  
}

