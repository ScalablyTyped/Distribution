package typings.atPulumiAws.typesOutputMod.s3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketReplicationConfigurationRule extends js.Object {
  /**
    * Specifies the destination for the rule (documented below).
    */
  var destination: BucketReplicationConfigurationRuleDestination
  /**
    * Filter that identifies subset of objects to which the replication rule applies (documented below).
    */
  var filter: js.UndefOr[BucketReplicationConfigurationRuleFilter] = js.undefined
  /**
    * Unique identifier for the rule.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Object keyname prefix that identifies subset of objects to which the rule applies.
    */
  var prefix: js.UndefOr[String] = js.undefined
  /**
    * The priority associated with the rule.
    */
  var priority: js.UndefOr[Double] = js.undefined
  /**
    * Specifies special object selection criteria (documented below).
    */
  var sourceSelectionCriteria: js.UndefOr[BucketReplicationConfigurationRuleSourceSelectionCriteria] = js.undefined
  /**
    * The status of the rule. Either `Enabled` or `Disabled`. The rule is ignored if status is not Enabled.
    */
  var status: String
}

object BucketReplicationConfigurationRule {
  @scala.inline
  def apply(
    destination: BucketReplicationConfigurationRuleDestination,
    status: String,
    filter: BucketReplicationConfigurationRuleFilter = null,
    id: String = null,
    prefix: String = null,
    priority: Int | Double = null,
    sourceSelectionCriteria: BucketReplicationConfigurationRuleSourceSelectionCriteria = null
  ): BucketReplicationConfigurationRule = {
    val __obj = js.Dynamic.literal(destination = destination, status = status)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (id != null) __obj.updateDynamic("id")(id)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (sourceSelectionCriteria != null) __obj.updateDynamic("sourceSelectionCriteria")(sourceSelectionCriteria)
    __obj.asInstanceOf[BucketReplicationConfigurationRule]
  }
}

