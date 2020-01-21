package typings.pulumiAws.inputMod.cfg

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecorderRecordingGroup extends js.Object {
  /**
    * Specifies whether AWS Config records configuration changes
    * for every supported type of regional resource (which includes any new type that will become supported in the future).
    * Conflicts with `resourceTypes`. Defaults to `true`.
    */
  var allSupported: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Specifies whether AWS Config includes all supported types of *global resources*
    * with the resources that it records. Requires `allSupported = true`. Conflicts with `resourceTypes`.
    */
  var includeGlobalResourceTypes: js.UndefOr[Input[Boolean]] = js.native
  /**
    * A list that specifies the types of AWS resources for which
    * AWS Config records configuration changes (for example, `AWS::EC2::Instance` or `AWS::CloudTrail::Trail`).
    * See [relevant part of AWS Docs](http://docs.aws.amazon.com/config/latest/APIReference/API_ResourceIdentifier.html#config-Type-ResourceIdentifier-resourceType) for available types.
    */
  var resourceTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object RecorderRecordingGroup {
  @scala.inline
  def apply(
    allSupported: Input[Boolean] = null,
    includeGlobalResourceTypes: Input[Boolean] = null,
    resourceTypes: Input[js.Array[Input[String]]] = null
  ): RecorderRecordingGroup = {
    val __obj = js.Dynamic.literal()
    if (allSupported != null) __obj.updateDynamic("allSupported")(allSupported.asInstanceOf[js.Any])
    if (includeGlobalResourceTypes != null) __obj.updateDynamic("includeGlobalResourceTypes")(includeGlobalResourceTypes.asInstanceOf[js.Any])
    if (resourceTypes != null) __obj.updateDynamic("resourceTypes")(resourceTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecorderRecordingGroup]
  }
}

