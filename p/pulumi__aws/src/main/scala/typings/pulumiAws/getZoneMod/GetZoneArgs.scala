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
    * Used with `name` field. A mapping of tags, each pair of which must exactly match a pair on the desired Hosted Zone.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
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
  def apply(
    name: String = null,
    privateZone: js.UndefOr[Boolean] = js.undefined,
    resourceRecordSetCount: js.UndefOr[Double] = js.undefined,
    tags: StringDictionary[js.Any] = null,
    vpcId: String = null,
    zoneId: String = null
  ): GetZoneArgs = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(privateZone)) __obj.updateDynamic("privateZone")(privateZone.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resourceRecordSetCount)) __obj.updateDynamic("resourceRecordSetCount")(resourceRecordSetCount.get.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    if (zoneId != null) __obj.updateDynamic("zoneId")(zoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetZoneArgs]
  }
}

