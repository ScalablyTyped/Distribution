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
    * A map of tags, each pair of which must
    * exactly match a pair on the desired Instance.
    */
  val instanceTags: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * A mapping of tags assigned to the Instance.
    */
  val tags: js.UndefOr[StringDictionary[String]] = js.native
}

object GetInstanceArgs {
  @scala.inline
  def apply(): GetInstanceArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstanceArgs]
  }
  @scala.inline
  implicit class GetInstanceArgsOps[Self <: GetInstanceArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFiltersVarargs(value: GetInstanceFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetInstanceFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setGetPasswordData(value: Boolean): Self = this.set("getPasswordData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetPasswordData: Self = this.set("getPasswordData", js.undefined)
    @scala.inline
    def setGetUserData(value: Boolean): Self = this.set("getUserData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGetUserData: Self = this.set("getUserData", js.undefined)
    @scala.inline
    def setInstanceId(value: String): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("instanceId", js.undefined)
    @scala.inline
    def setInstanceTags(value: StringDictionary[String]): Self = this.set("instanceTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceTags: Self = this.set("instanceTags", js.undefined)
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

