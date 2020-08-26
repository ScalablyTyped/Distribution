package typings.pulumiAws.getOutpostsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOutpostsResult extends js.Object {
  /**
    * Set of Amazon Resource Names (ARNs).
    */
  val arns: js.Array[String] = js.native
  val availabilityZone: String = js.native
  val availabilityZoneId: String = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * Set of identifiers.
    */
  val ids: js.Array[String] = js.native
  val siteId: String = js.native
}

object GetOutpostsResult {
  @scala.inline
  def apply(
    arns: js.Array[String],
    availabilityZone: String,
    availabilityZoneId: String,
    id: String,
    ids: js.Array[String],
    siteId: String
  ): GetOutpostsResult = {
    val __obj = js.Dynamic.literal(arns = arns.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], availabilityZoneId = availabilityZoneId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], siteId = siteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOutpostsResult]
  }
  @scala.inline
  implicit class GetOutpostsResultOps[Self <: GetOutpostsResult] (val x: Self) extends AnyVal {
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
    def setArnsVarargs(value: String*): Self = this.set("arns", js.Array(value :_*))
    @scala.inline
    def setArns(value: js.Array[String]): Self = this.set("arns", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvailabilityZoneId(value: String): Self = this.set("availabilityZoneId", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdsVarargs(value: String*): Self = this.set("ids", js.Array(value :_*))
    @scala.inline
    def setIds(value: js.Array[String]): Self = this.set("ids", value.asInstanceOf[js.Any])
    @scala.inline
    def setSiteId(value: String): Self = this.set("siteId", value.asInstanceOf[js.Any])
  }
  
}

