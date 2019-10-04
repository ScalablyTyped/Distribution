package typings.atPulumiAws.typesInputMod.s3Ns

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketReplicationConfigurationRuleFilter extends js.Object {
  /**
    * Object keyname prefix that identifies subset of objects to which the rule applies.
    */
  var prefix: js.UndefOr[Input[String]] = js.undefined
  /**
    * A mapping of tags that identifies subset of objects to which the rule applies.
    * The rule applies only to objects having all the tags in its tagset.
    */
  var tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
}

object BucketReplicationConfigurationRuleFilter {
  @scala.inline
  def apply(prefix: Input[String] = null, tags: Input[StringDictionary[_]] = null): BucketReplicationConfigurationRuleFilter = {
    val __obj = js.Dynamic.literal()
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketReplicationConfigurationRuleFilter]
  }
}

