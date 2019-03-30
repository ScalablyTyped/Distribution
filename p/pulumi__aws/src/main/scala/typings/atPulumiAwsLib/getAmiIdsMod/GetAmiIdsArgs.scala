package typings
package atPulumiAwsLib.getAmiIdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAmiIdsArgs extends js.Object {
  /**
    * Limit search to users with *explicit* launch
    * permission on  the image. Valid items are the numeric account ID or `self`.
    */
  val executableUsers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * One or more name/value pairs to filter off of. There
    * are several valid keys, for a full reference, check out
    * [describe-images in the AWS CLI reference][1].
    */
  val filters: js.UndefOr[js.Array[atPulumiAwsLib.Anon_NameValues]] = js.undefined
  /**
    * A regex string to apply to the AMI list returned
    * by AWS. This allows more advanced filtering not supported from the AWS API.
    * This filtering is done locally on what AWS returns, and could have a performance
    * impact if the result is large. It is recommended to combine this with other
    * options to narrow down the list AWS returns.
    */
  val nameRegex: js.UndefOr[java.lang.String] = js.undefined
  /**
    * List of AMI owners to limit search. At least 1 value must be specified. Valid values: an AWS account ID, `self` (the current account), or an AWS owner alias (e.g. `amazon`, `aws-marketplace`, `microsoft`).
    */
  val owners: js.Array[java.lang.String]
  /**
    * Used to sort AMIs by creation time.
    */
  val sortAscending: js.UndefOr[scala.Boolean] = js.undefined
}

object GetAmiIdsArgs {
  @scala.inline
  def apply(
    owners: js.Array[java.lang.String],
    executableUsers: js.Array[java.lang.String] = null,
    filters: js.Array[atPulumiAwsLib.Anon_NameValues] = null,
    nameRegex: java.lang.String = null,
    sortAscending: js.UndefOr[scala.Boolean] = js.undefined
  ): GetAmiIdsArgs = {
    val __obj = js.Dynamic.literal(owners = owners)
    if (executableUsers != null) __obj.updateDynamic("executableUsers")(executableUsers)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (nameRegex != null) __obj.updateDynamic("nameRegex")(nameRegex)
    if (!js.isUndefined(sortAscending)) __obj.updateDynamic("sortAscending")(sortAscending)
    __obj.asInstanceOf[GetAmiIdsArgs]
  }
}

