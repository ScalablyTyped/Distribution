package typings.atPulumiAws.ec2GetNetworkInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.ec2.GetNetworkInterfaceFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNetworkInterfaceArgs extends js.Object {
  /**
    * One or more name/value pairs to filter off of. There are several valid keys, for a full reference, check out [describe-network-interfaces](https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-network-interfaces.html) in the AWS CLI reference.
    */
  val filters: js.UndefOr[js.Array[GetNetworkInterfaceFilter]] = js.native
  /**
    * The identifier for the network interface.
    */
  val id: js.UndefOr[String] = js.native
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetNetworkInterfaceArgs {
  @scala.inline
  def apply(
    filters: js.Array[GetNetworkInterfaceFilter] = null,
    id: String = null,
    tags: StringDictionary[js.Any] = null
  ): GetNetworkInterfaceArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNetworkInterfaceArgs]
  }
}

