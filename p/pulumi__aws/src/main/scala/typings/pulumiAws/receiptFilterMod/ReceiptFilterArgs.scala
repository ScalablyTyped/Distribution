package typings.pulumiAws.receiptFilterMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReceiptFilterArgs extends js.Object {
  
  /**
    * The IP address or address range to filter, in CIDR notation
    */
  val cidr: Input[String] = js.native
  
  /**
    * The name of the filter
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Block or Allow
    */
  val policy: Input[String] = js.native
}
object ReceiptFilterArgs {
  
  @scala.inline
  def apply(cidr: Input[String], policy: Input[String]): ReceiptFilterArgs = {
    val __obj = js.Dynamic.literal(cidr = cidr.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptFilterArgs]
  }
  
  @scala.inline
  implicit class ReceiptFilterArgsOps[Self <: ReceiptFilterArgs] (val x: Self) extends AnyVal {
    
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
    def setCidr(value: Input[String]): Self = this.set("cidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicy(value: Input[String]): Self = this.set("policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
