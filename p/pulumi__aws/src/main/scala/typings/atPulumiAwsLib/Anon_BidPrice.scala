package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BidPrice extends js.Object {
  var bidPrice: js.UndefOr[java.lang.String] = js.undefined
  var ebsConfigs: js.Array[Anon_Iops]
  var id: java.lang.String
  var instanceCount: js.UndefOr[scala.Double] = js.undefined
  var instanceType: java.lang.String
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_BidPrice {
  @scala.inline
  def apply(
    ebsConfigs: js.Array[Anon_Iops],
    id: java.lang.String,
    instanceType: java.lang.String,
    bidPrice: java.lang.String = null,
    instanceCount: scala.Int | scala.Double = null,
    name: java.lang.String = null
  ): Anon_BidPrice = {
    val __obj = js.Dynamic.literal(ebsConfigs = ebsConfigs, id = id, instanceType = instanceType)
    if (bidPrice != null) __obj.updateDynamic("bidPrice")(bidPrice)
    if (instanceCount != null) __obj.updateDynamic("instanceCount")(instanceCount.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_BidPrice]
  }
}

