package typings.pulumiAws.receiptFilterMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReceiptFilterState extends js.Object {
  
  /**
    * The SES receipt filter ARN.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The IP address or address range to filter, in CIDR notation
    */
  val cidr: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the filter
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Block or Allow
    */
  val policy: js.UndefOr[Input[String]] = js.native
}
object ReceiptFilterState {
  
  @scala.inline
  def apply(): ReceiptFilterState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReceiptFilterState]
  }
  
  @scala.inline
  implicit class ReceiptFilterStateOps[Self <: ReceiptFilterState] (val x: Self) extends AnyVal {
    
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
    def setCidr(value: Input[String]): Self = this.set("cidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCidr: Self = this.set("cidr", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPolicy(value: Input[String]): Self = this.set("policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
  }
}
