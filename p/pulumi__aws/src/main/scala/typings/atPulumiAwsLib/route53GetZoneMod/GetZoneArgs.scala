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

