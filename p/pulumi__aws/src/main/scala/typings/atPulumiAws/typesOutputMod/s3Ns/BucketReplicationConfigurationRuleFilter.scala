package typings.atPulumiAws.typesOutputMod.s3Ns

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketReplicationConfigurationRuleFilter extends js.Object {
  /**
    * Object keyname prefix that identifies subset of objects to which the rule applies.
    */
  var prefix: js.UndefOr[String] = js.undefined
  /**
    * A mapping of tags that identifies subset of objects to which the rule applies.
    * The rule applies only to objects having all the tags in its tagset.
    */
  var tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object BucketReplicationConfigurationRuleFilter {
  @scala.inline
  def apply(prefix: String = null, tags: StringDictionary[js.Any] = null): BucketReplicationConfigurationRuleFilter = {
    val __obj = js.Dynamic.literal()
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[BucketReplicationConfigurationRuleFilter]
  }
}

