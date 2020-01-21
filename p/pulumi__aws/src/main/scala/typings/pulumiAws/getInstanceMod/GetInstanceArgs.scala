package typings.pulumiAws.getInstanceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetInstanceFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceArgs extends js.Object {
  /**
    * One or more name/value pairs to use as filters. There are
    * several valid keys, for a full reference, check out
    * [describe-instances in the AWS CLI reference][1].
    */
  val filters: js.UndefOr[js.Array[GetInstanceFilter]] = js.native
  /**
    * If true, wait for password data to become available and retrieve it. Useful for getting the administrator password for instances running Microsoft Windows. The password data is exported to the `passwordData` attribute. See [GetPasswordData](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_GetPasswordData.html) for more information.
    */
  val getPasswordData: js.UndefOr[Boolean] = js.native
  /**
    * Retrieve Base64 encoded User Data contents into the `userDataBase64` attribute. A SHA-1 hash of the User Data contents will always be present in the `userData` attribute. Defaults to `false`.
    */
  val getUserData: js.UndefOr[Boolean] = js.native
  /**
    * Specify the exact Instance ID with which to populate the data source.
    */
  val instanceId: js.UndefOr[String] = js.native
  /**
    * A mapping of tags, each pair of which must
    * exactly match a pair on the desired Instance.
    */
  val instanceTags: js.UndefOr[StringDictionary[js.Any]] = js.native
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetInstanceArgs {
  @scala.inline
  def apply(
    filters: js.Array[GetInstanceFilter] = null,
    getPasswordData: js.UndefOr[Boolean] = js.undefined,
    getUserData: js.UndefOr[Boolean] = js.undefined,
    instanceId: String = null,
    instanceTags: StringDictionary[js.Any] = null,
    tags: StringDictionary[js.Any] = null
  ): GetInstanceArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(getPasswordData)) __obj.updateDynamic("getPasswordData")(getPasswordData.asInstanceOf[js.Any])
    if (!js.isUndefined(getUserData)) __obj.updateDynamic("getUserData")(getUserData.asInstanceOf[js.Any])
    if (instanceId != null) __obj.updateDynamic("instanceId")(instanceId.asInstanceOf[js.Any])
    if (instanceTags != null) __obj.updateDynamic("instanceTags")(instanceTags.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceArgs]
  }
}

