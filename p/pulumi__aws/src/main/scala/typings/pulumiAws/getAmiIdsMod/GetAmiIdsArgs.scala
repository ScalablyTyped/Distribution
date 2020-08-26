package typings.pulumiAws.getAmiIdsMod

import typings.pulumiAws.inputMod.GetAmiIdsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAmiIdsArgs extends js.Object {
  /**
    * Limit search to users with *explicit* launch
    * permission on  the image. Valid items are the numeric account ID or `self`.
    */
  val executableUsers: js.UndefOr[js.Array[String]] = js.native
  /**
    * One or more name/value pairs to filter off of. There
    * are several valid keys, for a full reference, check out
    * [describe-images in the AWS CLI reference][1].
    */
  val filters: js.UndefOr[js.Array[GetAmiIdsFilter]] = js.native
  /**
    * A regex string to apply to the AMI list returned
    * by AWS. This allows more advanced filtering not supported from the AWS API.
    * This filtering is done locally on what AWS returns, and could have a performance
    * impact if the result is large. It is recommended to combine this with other
    * options to narrow down the list AWS returns.
    */
  val nameRegex: js.UndefOr[String] = js.native
  /**
    * List of AMI owners to limit search. At least 1 value must be specified. Valid values: an AWS account ID, `self` (the current account), or an AWS owner alias (e.g. `amazon`, `aws-marketplace`, `microsoft`).
    */
  val owners: js.Array[String] = js.native
  /**
    * Used to sort AMIs by creation time.
    */
  val sortAscending: js.UndefOr[Boolean] = js.native
}

object GetAmiIdsArgs {
  @scala.inline
  def apply(owners: js.Array[String]): GetAmiIdsArgs = {
    val __obj = js.Dynamic.literal(owners = owners.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAmiIdsArgs]
  }
  @scala.inline
  implicit class GetAmiIdsArgsOps[Self <: GetAmiIdsArgs] (val x: Self) extends AnyVal {
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
    def setOwnersVarargs(value: String*): Self = this.set("owners", js.Array(value :_*))
    @scala.inline
    def setOwners(value: js.Array[String]): Self = this.set("owners", value.asInstanceOf[js.Any])
    @scala.inline
    def setExecutableUsersVarargs(value: String*): Self = this.set("executableUsers", js.Array(value :_*))
    @scala.inline
    def setExecutableUsers(value: js.Array[String]): Self = this.set("executableUsers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutableUsers: Self = this.set("executableUsers", js.undefined)
    @scala.inline
    def setFiltersVarargs(value: GetAmiIdsFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetAmiIdsFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setNameRegex(value: String): Self = this.set("nameRegex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameRegex: Self = this.set("nameRegex", js.undefined)
    @scala.inline
    def setSortAscending(value: Boolean): Self = this.set("sortAscending", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortAscending: Self = this.set("sortAscending", js.undefined)
  }
  
}

