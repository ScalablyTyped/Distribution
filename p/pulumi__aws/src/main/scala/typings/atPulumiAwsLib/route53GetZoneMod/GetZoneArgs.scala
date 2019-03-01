package typings
package atPulumiAwsLib.route53GetZoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetZoneArgs extends js.Object {
  val callerReference: js.UndefOr[java.lang.String] = js.undefined
  val comment: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Hosted Zone name of the desired Hosted Zone.
    */
  val name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Used with `name` field to get a private Hosted Zone.
    */
  val privateZone: js.UndefOr[scala.Boolean] = js.undefined
  val resourceRecordSetCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * Used with `name` field. A mapping of tags, each pair of which must exactly match
    * a pair on the desired Hosted Zone.
    */
  val tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
    * Used with `name` field to get a private Hosted Zone associated with the vpc_id (in this case, private_zone is not mandatory).
    */
  val vpcId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The Hosted Zone id of the desired Hosted Zone.
    */
  val zoneId: js.UndefOr[java.lang.String] = js.undefined
}

object GetZoneArgs {
  @scala.inline
  def apply(
    callerReference: java.lang.String = null,
    comment: java.lang.String = null,
    name: java.lang.String = null,
    privateZone: js.UndefOr[scala.Boolean] = js.undefined,
    resourceRecordSetCount: scala.Int | scala.Double = null,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    vpcId: java.lang.String = null,
    zoneId: java.lang.String = null
  ): GetZoneArgs = {
    val __obj = js.Dynamic.literal()
    if (callerReference != null) __obj.updateDynamic("callerReference")(callerReference)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(privateZone)) __obj.updateDynamic("privateZone")(privateZone)
    if (resourceRecordSetCount != null) __obj.updateDynamic("resourceRecordSetCount")(resourceRecordSetCount.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId)
    if (zoneId != null) __obj.updateDynamic("zoneId")(zoneId)
    __obj.asInstanceOf[GetZoneArgs]
  }
}

