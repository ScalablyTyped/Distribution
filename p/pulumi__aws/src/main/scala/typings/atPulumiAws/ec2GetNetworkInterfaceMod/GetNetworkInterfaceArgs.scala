package typings.atPulumiAws.ec2GetNetworkInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_NameValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNetworkInterfaceArgs extends js.Object {
  /**
    * One or more name/value pairs to filter off of. There are several valid keys, for a full reference, check out [describe-network-interfaces](https://docs.aws.amazon.com/cli/latest/reference/ec2/describe-network-interfaces.html) in the AWS CLI reference.
    */
  val filters: js.UndefOr[js.Array[Anon_NameValues]] = js.undefined
  /**
    * The identifier for the network interface.
    */
  val id: js.UndefOr[String] = js.undefined
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object GetNetworkInterfaceArgs {
  @scala.inline
  def apply(
    filters: js.Array[Anon_NameValues] = null,
    id: String = null,
    tags: StringDictionary[js.Any] = null
  ): GetNetworkInterfaceArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (id != null) __obj.updateDynamic("id")(id)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetNetworkInterfaceArgs]
  }
}

