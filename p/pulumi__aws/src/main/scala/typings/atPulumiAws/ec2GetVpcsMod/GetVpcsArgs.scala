package typings.atPulumiAws.ec2GetVpcsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.ec2Ns.GetVpcsFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVpcsArgs extends js.Object {
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[GetVpcsFilter]] = js.undefined
  /**
    * A mapping of tags, each pair of which must exactly match
    * a pair on the desired vpcs.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object GetVpcsArgs {
  @scala.inline
  def apply(filters: js.Array[GetVpcsFilter] = null, tags: StringDictionary[js.Any] = null): GetVpcsArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetVpcsArgs]
  }
}

