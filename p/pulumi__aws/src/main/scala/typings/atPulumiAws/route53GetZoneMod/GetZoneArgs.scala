package typings.atPulumiAws.route53GetZoneMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetZoneArgs extends js.Object {
  /**
    * The Hosted Zone name of the desired Hosted Zone.
    */
  val name: js.UndefOr[String] = js.undefined
  /**
    * Used with `name` field to get a private Hosted Zone.
    */
  val privateZone: js.UndefOr[Boolean] = js.undefined
  val resourceRecordSetCount: js.UndefOr[Double] = js.undefined
  /**
    * Used with `name` field. A mapping of tags, each pair of which must exactly match
    * a pair on the desired Hosted Zone.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * Used with `name` field to get a private Hosted Zone associated with the vpc_id (in this case, private_zone is not mandatory).
    */
  val vpcId: js.UndefOr[String] = js.undefined
  /**
    * The Hosted Zone id of the desired Hosted Zone.
    */
  val zoneId: js.UndefOr[String] = js.undefined
}

object GetZoneArgs {
  @scala.inline
  def apply(
    name: String = null,
    privateZone: js.UndefOr[Boolean] = js.undefined,
    resourceRecordSetCount: Int | Double = null,
    tags: StringDictionary[js.Any] = null,
    vpcId: String = null,
    zoneId: String = null
  ): GetZoneArgs = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(privateZone)) __obj.updateDynamic("privateZone")(privateZone)
    if (resourceRecordSetCount != null) __obj.updateDynamic("resourceRecordSetCount")(resourceRecordSetCount.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId)
    if (zoneId != null) __obj.updateDynamic("zoneId")(zoneId)
    __obj.asInstanceOf[GetZoneArgs]
  }
}

