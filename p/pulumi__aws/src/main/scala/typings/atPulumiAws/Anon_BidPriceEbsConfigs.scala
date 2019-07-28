package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BidPriceEbsConfigs extends js.Object {
  var bidPrice: js.UndefOr[Input[String]] = js.undefined
  var ebsConfigs: js.UndefOr[Input[js.Array[Input[Anon_IopsSize]]]] = js.undefined
  var id: js.UndefOr[Input[String]] = js.undefined
  var instanceCount: js.UndefOr[Input[Double]] = js.undefined
  var instanceType: Input[String]
  var name: js.UndefOr[Input[String]] = js.undefined
}

object Anon_BidPriceEbsConfigs {
  @scala.inline
  def apply(
    instanceType: Input[String],
    bidPrice: Input[String] = null,
    ebsConfigs: Input[js.Array[Input[Anon_IopsSize]]] = null,
    id: Input[String] = null,
    instanceCount: Input[Double] = null,
    name: Input[String] = null
  ): Anon_BidPriceEbsConfigs = {
    val __obj = js.Dynamic.literal(instanceType = instanceType.asInstanceOf[js.Any])
    if (bidPrice != null) __obj.updateDynamic("bidPrice")(bidPrice.asInstanceOf[js.Any])
    if (ebsConfigs != null) __obj.updateDynamic("ebsConfigs")(ebsConfigs.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (instanceCount != null) __obj.updateDynamic("instanceCount")(instanceCount.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BidPriceEbsConfigs]
  }
}

