package typings.pulumiAws.getZoneMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetZoneResult extends js.Object {
  /**
    * Caller Reference of the Hosted Zone.
    */
  val callerReference: String = js.native
  /**
    * The comment field of the Hosted Zone.
    */
  val comment: String = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The description provided by the service that created the Hosted Zone (e.g. `arn:aws:servicediscovery:us-east-1:1234567890:namespace/ns-xxxxxxxxxxxxxxxx`).
    */
  val linkedServiceDescription: String = js.native
  /**
    * The service that created the Hosted Zone (e.g. `servicediscovery.amazonaws.com`).
    */
  val linkedServicePrincipal: String = js.native
  val name: String = js.native
  /**
    * The list of DNS name servers for the Hosted Zone.
    */
  val nameServers: js.Array[String] = js.native
  val privateZone: js.UndefOr[Boolean] = js.native
  /**
    * The number of Record Set in the Hosted Zone.
    */
  val resourceRecordSetCount: Double = js.native
  val tags: StringDictionary[String] = js.native
  val vpcId: String = js.native
  val zoneId: String = js.native
}

object GetZoneResult {
  @scala.inline
  def apply(
    callerReference: String,
    comment: String,
    id: String,
    linkedServiceDescription: String,
    linkedServicePrincipal: String,
    name: String,
    nameServers: js.Array[String],
    resourceRecordSetCount: Double,
    tags: StringDictionary[String],
    vpcId: String,
    zoneId: String
  ): GetZoneResult = {
    val __obj = js.Dynamic.literal(callerReference = callerReference.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], linkedServiceDescription = linkedServiceDescription.asInstanceOf[js.Any], linkedServicePrincipal = linkedServicePrincipal.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameServers = nameServers.asInstanceOf[js.Any], resourceRecordSetCount = resourceRecordSetCount.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any], zoneId = zoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetZoneResult]
  }
  @scala.inline
  implicit class GetZoneResultOps[Self <: GetZoneResult] (val x: Self) extends AnyVal {
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
    def setCallerReference(value: String): Self = this.set("callerReference", value.asInstanceOf[js.Any])
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinkedServiceDescription(value: String): Self = this.set("linkedServiceDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinkedServicePrincipal(value: String): Self = this.set("linkedServicePrincipal", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNameServersVarargs(value: String*): Self = this.set("nameServers", js.Array(value :_*))
    @scala.inline
    def setNameServers(value: js.Array[String]): Self = this.set("nameServers", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceRecordSetCount(value: Double): Self = this.set("resourceRecordSetCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setVpcId(value: String): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoneId(value: String): Self = this.set("zoneId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrivateZone(value: Boolean): Self = this.set("privateZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateZone: Self = this.set("privateZone", js.undefined)
  }
  
}

