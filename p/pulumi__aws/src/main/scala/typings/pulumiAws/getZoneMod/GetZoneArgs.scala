package typings.pulumiAws.getZoneMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetZoneArgs extends js.Object {
  /**
    * The Hosted Zone name of the desired Hosted Zone.
    */
  val name: js.UndefOr[String] = js.native
  /**
    * Used with `name` field to get a private Hosted Zone.
    */
  val privateZone: js.UndefOr[Boolean] = js.native
  /**
    * The number of Record Set in the Hosted Zone.
    */
  val resourceRecordSetCount: js.UndefOr[Double] = js.native
  /**
    * Used with `name` field. A map of tags, each pair of which must exactly match a pair on the desired Hosted Zone.
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Used with `name` field to get a private Hosted Zone associated with the vpcId (in this case, privateZone is not mandatory).
    */
  val vpcId: js.UndefOr[String] = js.native
  /**
    * The Hosted Zone id of the desired Hosted Zone.
    */
  val zoneId: js.UndefOr[String] = js.native
}

object GetZoneArgs {
  @scala.inline
  def apply(): GetZoneArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetZoneArgs]
  }
  @scala.inline
  implicit class GetZoneArgsOps[Self <: GetZoneArgs] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPrivateZone(value: Boolean): Self = this.set("privateZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateZone: Self = this.set("privateZone", js.undefined)
    @scala.inline
    def setResourceRecordSetCount(value: Double): Self = this.set("resourceRecordSetCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceRecordSetCount: Self = this.set("resourceRecordSetCount", js.undefined)
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setVpcId(value: String): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("vpcId", js.undefined)
    @scala.inline
    def setZoneId(value: String): Self = this.set("zoneId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoneId: Self = this.set("zoneId", js.undefined)
  }
  
}

