package typings.atPulumiAws.getElasticIpMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.GetElasticIpFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetElasticIpArgs extends js.Object {
  /**
    * One or more name/value pairs to use as filters. There are several valid keys, for a full reference, check out the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAddresses.html).
    */
  val filters: js.UndefOr[js.Array[GetElasticIpFilter]] = js.native
  /**
    * The allocation id of the specific VPC EIP to retrieve. If a classic EIP is required, do NOT set `id`, only set `publicIp`
    */
  val id: js.UndefOr[String] = js.native
  /**
    * The public IP of the specific EIP to retrieve.
    */
  val publicIp: js.UndefOr[String] = js.native
  /**
    * A mapping of tags, each pair of which must exactly match a pair on the desired Elastic IP
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GetElasticIpArgs {
  @scala.inline
  def apply(
    filters: js.Array[GetElasticIpFilter] = null,
    id: String = null,
    publicIp: String = null,
    tags: StringDictionary[js.Any] = null
  ): GetElasticIpArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (publicIp != null) __obj.updateDynamic("publicIp")(publicIp.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetElasticIpArgs]
  }
}

