package typings.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketReplicationConfigurationRule extends js.Object {
  /**
    * Specifies the destination for the rule (documented below).
    */
  var destination: BucketReplicationConfigurationRuleDestination = js.native
  /**
    * Filter that identifies subset of objects to which the replication rule applies (documented below).
    */
  var filter: js.UndefOr[BucketReplicationConfigurationRuleFilter] = js.native
  /**
    * Unique identifier for the rule.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Object keyname prefix identifying one or more objects to which the rule applies.
    */
  var prefix: js.UndefOr[String] = js.native
  /**
    * The priority associated with the rule.
    */
  var priority: js.UndefOr[Double] = js.native
  /**
    * Specifies special object selection criteria (documented below).
    */
  var sourceSelectionCriteria: js.UndefOr[BucketReplicationConfigurationRuleSourceSelectionCriteria] = js.native
  /**
    * The status of the rule. Either `Enabled` or `Disabled`. The rule is ignored if status is not Enabled.
    */
  var status: String = js.native
}

object BucketReplicationConfigurationRule {
  @scala.inline
  def apply(
    destination: BucketReplicationConfigurationRuleDestination,
    status: String,
    filter: BucketReplicationConfigurationRuleFilter = null,
    id: String = null,
    prefix: String = null,
    priority: js.UndefOr[Double] = js.undefined,
    sourceSelectionCriteria: BucketReplicationConfigurationRuleSourceSelectionCriteria = null
  ): BucketReplicationConfigurationRule = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    if (sourceSelectionCriteria != null) __obj.updateDynamic("sourceSelectionCriteria")(sourceSelectionCriteria.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketReplicationConfigurationRule]
  }
}

