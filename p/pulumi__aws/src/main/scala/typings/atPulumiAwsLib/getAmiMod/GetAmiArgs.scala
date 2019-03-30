package typings
package atPulumiAwsLib.getAmiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAmiArgs extends js.Object {
  /**
    * Limit search to users with *explicit* launch permission on
    * the image. Valid items are the numeric account ID or `self`.
    */
  val executableUsers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * One or more name/value pairs to filter off of. There are
    * several valid keys, for a full reference, check out
    * [describe-images in the AWS CLI reference][1].
    */
  val filters: js.UndefOr[js.Array[atPulumiAwsLib.Anon_NameValues]] = js.undefined
  /**
    * If more than one result is returned, use the most
    * recent AMI.
    */
  val mostRecent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A regex string to apply to the AMI list returned
    * by AWS. This allows more advanced filtering not supported from the AWS API. This
    * filtering is done locally on what AWS returns, and could have a performance
    * impact if the result is large. It is recommended to combine this with other
    * options to narrow down the list AWS returns.
    */
  val nameRegex: js.UndefOr[java.lang.String] = js.undefined
  /**
    * List of AMI owners to limit search. At least 1 value must be specified. Valid values: an AWS account ID, `self` (the current account), or an AWS owner alias (e.g. `amazon`, `aws-marketplace`, `microsoft`).
    */
  val owners: js.Array[java.lang.String]
  val tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object GetAmiArgs {
  @scala.inline
  def apply(
    owners: js.Array[java.lang.String],
    executableUsers: js.Array[java.lang.String] = null,
    filters: js.Array[atPulumiAwsLib.Anon_NameValues] = null,
    mostRecent: js.UndefOr[scala.Boolean] = js.undefined,
    nameRegex: java.lang.String = null,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): GetAmiArgs = {
    val __obj = js.Dynamic.literal(owners = owners)
    if (executableUsers != null) __obj.updateDynamic("executableUsers")(executableUsers)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (!js.isUndefined(mostRecent)) __obj.updateDynamic("mostRecent")(mostRecent)
    if (nameRegex != null) __obj.updateDynamic("nameRegex")(nameRegex)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetAmiArgs]
  }
}

