package typings.atPulumiAws.ec2GetNetworkInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.ec2.GetNetworkInterfacesFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNetworkInterfacesArgs extends js.Object {
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[GetNetworkInterfacesFilter]] = js.undefined
  /**
    * A mapping of tags, each pair of which must exactly match
    * a pair on the desired network interfaces.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object GetNetworkInterfacesArgs {
  @scala.inline
  def apply(filters: js.Array[GetNetworkInterfacesFilter] = null, tags: StringDictionary[js.Any] = null): GetNetworkInterfacesArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetNetworkInterfacesArgs]
  }
}

