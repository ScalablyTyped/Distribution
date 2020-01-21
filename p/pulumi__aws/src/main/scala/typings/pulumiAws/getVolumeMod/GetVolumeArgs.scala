package typings.pulumiAws.getVolumeMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ebs.GetVolumeFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVolumeArgs extends js.Object {
  /**
    * One or more name/value pairs to filter off of. There are
    * several valid keys, for a full reference, check out
    * [describe-volumes in the AWS CLI reference][1].
    */
  val filters: js.UndefOr[js.Array[GetVolumeFilter]] = js.native
  /**
    * If more than one result is returned, use the most
    * recent Volume.
    */
  val mostRecent: js.UndefOr[Boolean] = js.native
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetVolumeArgs {
  @scala.inline
  def apply(
    filters: js.Array[GetVolumeFilter] = null,
    mostRecent: js.UndefOr[Boolean] = js.undefined,
    tags: StringDictionary[js.Any] = null
  ): GetVolumeArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(mostRecent)) __obj.updateDynamic("mostRecent")(mostRecent.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVolumeArgs]
  }
}

