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
  val name: java.lang.String
  /**
    * The list of DNS name servers for the Hosted Zone.
    */
  val nameServers: js.Array[java.lang.String]
  /**
    * the number of Record Set in the Hosted Zone
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
    name: java.lang.String,
    nameServers: js.Array[java.lang.String],
    resourceRecordSetCount: scala.Double,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any],
    vpcId: java.lang.String,
    zoneId: java.lang.String
  ): GetZoneResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callerReference")(callerReference)
    __obj.updateDynamic("comment")(comment)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("nameServers")(nameServers)
    __obj.updateDynamic("resourceRecordSetCount")(resourceRecordSetCount)
    __obj.updateDynamic("tags")(tags)
    __obj.updateDynamic("vpcId")(vpcId)
    __obj.updateDynamic("zoneId")(zoneId)
    __obj.asInstanceOf[GetZoneResult]
  }
}

