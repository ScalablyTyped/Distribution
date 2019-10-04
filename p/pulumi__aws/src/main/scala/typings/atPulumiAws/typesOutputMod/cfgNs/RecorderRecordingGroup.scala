package typings.atPulumiAws.typesOutputMod.cfgNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecorderRecordingGroup extends js.Object {
  /**
    * Specifies whether AWS Config records configuration changes
    * for every supported type of regional resource (which includes any new type that will become supported in the future).
    * Conflicts with `resourceTypes`. Defaults to `true`.
    */
  var allSupported: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies whether AWS Config includes all supported types of *global resources*
    * with the resources that it records. Requires `allSupported = true`. Conflicts with `resourceTypes`.
    */
  var includeGlobalResourceTypes: js.UndefOr[Boolean] = js.undefined
  /**
    * A list that specifies the types of AWS resources for which
    * AWS Config records configuration changes (for example, `AWS::EC2::Instance` or `AWS::CloudTrail::Trail`).
    * See [relevant part of AWS Docs](http://docs.aws.amazon.com/config/latest/APIReference/API_ResourceIdentifier.html#config-Type-ResourceIdentifier-resourceType) for available types.
    */
  var resourceTypes: js.UndefOr[js.Array[String]] = js.undefined
}

object RecorderRecordingGroup {
  @scala.inline
  def apply(
    allSupported: js.UndefOr[Boolean] = js.undefined,
    includeGlobalResourceTypes: js.UndefOr[Boolean] = js.undefined,
    resourceTypes: js.Array[String] = null
  ): RecorderRecordingGroup = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allSupported)) __obj.updateDynamic("allSupported")(allSupported)
    if (!js.isUndefined(includeGlobalResourceTypes)) __obj.updateDynamic("includeGlobalResourceTypes")(includeGlobalResourceTypes)
    if (resourceTypes != null) __obj.updateDynamic("resourceTypes")(resourceTypes)
    __obj.asInstanceOf[RecorderRecordingGroup]
  }
}

