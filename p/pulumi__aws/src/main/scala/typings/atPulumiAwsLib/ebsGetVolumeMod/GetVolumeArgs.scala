package typings
package atPulumiAwsLib.ebsGetVolumeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVolumeArgs extends js.Object {
  /**
    * One or more name/value pairs to filter off of. There are
    * several valid keys, for a full reference, check out
    * [describe-volumes in the AWS CLI reference][1].
    */
  val filters: js.UndefOr[js.Array[atPulumiAwsLib.Anon_NameValues]] = js.undefined
  /**
    * If more than one result is returned, use the most
    * recent Volume.
    */
  val mostRecent: js.UndefOr[scala.Boolean] = js.undefined
  val tags: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object GetVolumeArgs {
  @scala.inline
  def apply(
    filters: js.Array[atPulumiAwsLib.Anon_NameValues] = null,
    mostRecent: js.UndefOr[scala.Boolean] = js.undefined,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): GetVolumeArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (!js.isUndefined(mostRecent)) __obj.updateDynamic("mostRecent")(mostRecent)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetVolumeArgs]
  }
}

