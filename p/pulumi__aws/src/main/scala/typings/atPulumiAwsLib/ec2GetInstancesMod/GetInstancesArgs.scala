package typings
package atPulumiAwsLib.ec2GetInstancesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstancesArgs extends js.Object {
  /**
    * One or more name/value pairs to use as filters. There are
    * several valid keys, for a full reference, check out
    * [describe-instances in the AWS CLI reference][1].
    */
  val filters: js.UndefOr[js.Array[atPulumiAwsLib.Anon_NameValues]] = js.undefined
  /**
    * A list of instance states that should be applicable to the desired instances. The permitted values are: `pending, running, shutting-down, stopped, stopping, terminated`. The default value is `running`.
    */
  val instanceStateNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * A mapping of tags, each pair of which must
    * exactly match a pair on desired instances.
    */
  val instanceTags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object GetInstancesArgs {
  @scala.inline
  def apply(
    filters: js.Array[atPulumiAwsLib.Anon_NameValues] = null,
    instanceStateNames: js.Array[java.lang.String] = null,
    instanceTags: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): GetInstancesArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (instanceStateNames != null) __obj.updateDynamic("instanceStateNames")(instanceStateNames)
    if (instanceTags != null) __obj.updateDynamic("instanceTags")(instanceTags)
    __obj.asInstanceOf[GetInstancesArgs]
  }
}

