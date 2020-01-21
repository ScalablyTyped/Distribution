package typings.pulumiAws.inputMod.cfg

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleScope extends js.Object {
  /**
    * The IDs of the only AWS resource that you want to trigger an evaluation for the rule.
    * If you specify a resource ID, you must specify one resource type for `complianceResourceTypes`.
    */
  var complianceResourceId: js.UndefOr[Input[String]] = js.native
  /**
    * A list of resource types of only those AWS resources that you want to trigger an
    * evaluation for the rule. e.g. `AWS::EC2::Instance`. You can only specify one type if you also specify
    * a resource ID for `complianceResourceId`. See [relevant part of AWS Docs](http://docs.aws.amazon.com/config/latest/APIReference/API_ResourceIdentifier.html#config-Type-ResourceIdentifier-resourceType) for available types.
    */
  var complianceResourceTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The tag key that is applied to only those AWS resources that you want you
    * want to trigger an evaluation for the rule.
    */
  var tagKey: js.UndefOr[Input[String]] = js.native
  /**
    * The tag value applied to only those AWS resources that you want to trigger an evaluation for the rule.
    */
  var tagValue: js.UndefOr[Input[String]] = js.native
}

object RuleScope {
  @scala.inline
  def apply(
    complianceResourceId: Input[String] = null,
    complianceResourceTypes: Input[js.Array[Input[String]]] = null,
    tagKey: Input[String] = null,
    tagValue: Input[String] = null
  ): RuleScope = {
    val __obj = js.Dynamic.literal()
    if (complianceResourceId != null) __obj.updateDynamic("complianceResourceId")(complianceResourceId.asInstanceOf[js.Any])
    if (complianceResourceTypes != null) __obj.updateDynamic("complianceResourceTypes")(complianceResourceTypes.asInstanceOf[js.Any])
    if (tagKey != null) __obj.updateDynamic("tagKey")(tagKey.asInstanceOf[js.Any])
    if (tagValue != null) __obj.updateDynamic("tagValue")(tagValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleScope]
  }
}

