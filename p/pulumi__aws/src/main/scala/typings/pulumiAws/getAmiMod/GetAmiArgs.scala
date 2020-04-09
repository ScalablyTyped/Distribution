package typings.pulumiAws.getAmiMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.GetAmiFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAmiArgs extends js.Object {
  /**
    * Limit search to users with *explicit* launch permission on
    * the image. Valid items are the numeric account ID or `self`.
    */
  val executableUsers: js.UndefOr[js.Array[String]] = js.native
  /**
    * One or more name/value pairs to filter off of. There are
    * several valid keys, for a full reference, check out
    * [describe-images in the AWS CLI reference][1].
    */
  val filters: js.UndefOr[js.Array[GetAmiFilter]] = js.native
  /**
    * If more than one result is returned, use the most
    * recent AMI.
    */
  val mostRecent: js.UndefOr[Boolean] = js.native
  /**
    * A regex string to apply to the AMI list returned
    * by AWS. This allows more advanced filtering not supported from the AWS API. This
    * filtering is done locally on what AWS returns, and could have a performance
    * impact if the result is large. It is recommended to combine this with other
    * options to narrow down the list AWS returns.
    */
  val nameRegex: js.UndefOr[String] = js.native
  /**
    * List of AMI owners to limit search. At least 1 value must be specified. Valid values: an AWS account ID, `self` (the current account), or an AWS owner alias (e.g. `amazon`, `aws-marketplace`, `microsoft`).
    */
  val owners: js.Array[String] = js.native
  /**
    * Any tags assigned to the image.
    * * `tags.#.key` - The key name of the tag.
    * * `tags.#.value` - The value of the tag.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetAmiArgs {
  @scala.inline
  def apply(
    owners: js.Array[String],
    executableUsers: js.Array[String] = null,
    filters: js.Array[GetAmiFilter] = null,
    mostRecent: js.UndefOr[Boolean] = js.undefined,
    nameRegex: String = null,
    tags: StringDictionary[js.Any] = null
  ): GetAmiArgs = {
    val __obj = js.Dynamic.literal(owners = owners.asInstanceOf[js.Any])
    if (executableUsers != null) __obj.updateDynamic("executableUsers")(executableUsers.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(mostRecent)) __obj.updateDynamic("mostRecent")(mostRecent.asInstanceOf[js.Any])
    if (nameRegex != null) __obj.updateDynamic("nameRegex")(nameRegex.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAmiArgs]
  }
}

