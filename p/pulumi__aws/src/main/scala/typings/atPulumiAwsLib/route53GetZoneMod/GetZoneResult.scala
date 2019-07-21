package typings
package atPulumiAwsLib.route53GetZoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetZoneResult extends js.Object {
  /**
    * Caller Reference of the Hosted Zone.
    */
  val callerReference: java.lang.String
  /**
    * The comment field of the Hosted Zone.
    */
  val comment: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The description provided by the service that created the Hosted Zone (e.g. `arn:aws:servicediscovery:us-east-1:1234567890:namespace/ns-xxxxxxxxxxxxxxxx`).
    */
  val linkedServiceDescription: java.lang.String
  /**
    * The service that created the Hosted Zone (e.g. `servicediscovery.amazonaws.com`).
    */
  val linkedServicePrincipal: java.lang.String
  val name: java.lang.String
  /**
    * The list of DNS name servers for the Hosted Zone.
    */
  val nameServers: js.Array[java.lang.String]
  val privateZone: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The number of Record Set in the Hosted Zone.
    */
  val resourceRecordSetCount: scala.Double
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  val vpcId: java.lang.String
  val zoneId: java.lang.String
}

object GetZoneResult {
  @scala.inline
  def apply(
    callerReference: java.lang.String,
    comment: java.lang.String,
    id: java.lang.String,
    linkedServiceDescription: java.lang.String,
    linkedServicePrincipal: java.lang.String,
    name: java.lang.String,
    nameServers: js.Array[java.lang.String],
    resourceRecordSetCount: scala.Double,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any],
    vpcId: java.lang.String,
    zoneId: java.lang.String,
    privateZone: js.UndefOr[scala.Boolean] = js.undefined
  ): GetZoneResult = {
    val __obj = js.Dynamic.literal(callerReference = callerReference, comment = comment, id = id, linkedServiceDescription = linkedServiceDescription, linkedServicePrincipal = linkedServicePrincipal, name = name, nameServers = nameServers, resourceRecordSetCount = resourceRecordSetCount, tags = tags, vpcId = vpcId, zoneId = zoneId)
    if (!js.isUndefined(privateZone)) __obj.updateDynamic("privateZone")(privateZone)
    __obj.asInstanceOf[GetZoneResult]
  }
}

