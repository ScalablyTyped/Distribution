package typings.atPulumiAws.getElasticIpMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_NameValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetElasticIpArgs extends js.Object {
  /**
    * One or more name/value pairs to use as filters. There are several valid keys, for a full reference, check out the [EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAddresses.html).
    */
  val filters: js.UndefOr[js.Array[Anon_NameValues]] = js.undefined
  /**
    * The allocation id of the specific VPC EIP to retrieve. If a classic EIP is required, do NOT set `id`, only set `public_ip`
    */
  val id: js.UndefOr[String] = js.undefined
  /**
    * The public IP of the specific EIP to retrieve.
    */
  val publicIp: js.UndefOr[String] = js.undefined
  /**
    * A mapping of tags, each pair of which must exactly match a pair on the desired Elastic IP
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object GetElasticIpArgs {
  @scala.inline
  def apply(
    filters: js.Array[Anon_NameValues] = null,
    id: String = null,
    publicIp: String = null,
    tags: StringDictionary[js.Any] = null
  ): GetElasticIpArgs = {
    val __obj = js.Dynamic.literal()
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (id != null) __obj.updateDynamic("id")(id)
    if (publicIp != null) __obj.updateDynamic("publicIp")(publicIp)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GetElasticIpArgs]
  }
}

