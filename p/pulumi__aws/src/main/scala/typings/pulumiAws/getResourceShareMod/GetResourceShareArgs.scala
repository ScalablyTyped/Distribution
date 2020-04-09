package typings.pulumiAws.getResourceShareMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ram.GetResourceShareFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourceShareArgs extends js.Object {
  /**
    * A filter used to scope the list e.g. by tags. See [related docs] (https://docs.aws.amazon.com/ram/latest/APIReference/API_TagFilter.html).
    */
  val filters: js.UndefOr[js.Array[GetResourceShareFilter]] = js.native
  /**
    * The name of the tag key to filter on.
    */
  val name: String = js.native
  /**
    * The owner of the resource share. Valid values are SELF or OTHER-ACCOUNTS
    */
  val resourceOwner: String = js.native
  /**
    * The Tags attached to the RAM share
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetResourceShareArgs {
  @scala.inline
  def apply(
    name: String,
    resourceOwner: String,
    filters: js.Array[GetResourceShareFilter] = null,
    tags: StringDictionary[js.Any] = null
  ): GetResourceShareArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], resourceOwner = resourceOwner.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceShareArgs]
  }
}

