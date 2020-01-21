package typings.pulumiAws.getVpcsMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetVpcsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpcsArgs extends js.Object {
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[GetVpcsFilter]] = js.native
  /**
    * A mapping of tags, each pair of which must exactly match
    * a pair on the desired vpcs.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetVpcsArgs {
  @scala.inline
  def apply(filters: js.Array[GetVpcsFilter] = null, tags: StringDictionary[js.Any] = null): GetVpcsArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcsArgs]
  }
}

