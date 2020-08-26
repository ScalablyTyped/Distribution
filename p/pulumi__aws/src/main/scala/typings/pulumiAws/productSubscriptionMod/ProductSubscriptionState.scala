package typings.pulumiAws.productSubscriptionMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductSubscriptionState extends js.Object {
  /**
    * The ARN of a resource that represents your subscription to the product that generates the findings that you want to import into Security Hub.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the product that generates findings that you want to import into Security Hub - see below.
    */
  val productArn: js.UndefOr[Input[String]] = js.native
}

object ProductSubscriptionState {
  @scala.inline
  def apply(): ProductSubscriptionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductSubscriptionState]
  }
  @scala.inline
  implicit class ProductSubscriptionStateOps[Self <: ProductSubscriptionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setProductArn(value: Input[String]): Self = this.set("productArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductArn: Self = this.set("productArn", js.undefined)
  }
  
}

