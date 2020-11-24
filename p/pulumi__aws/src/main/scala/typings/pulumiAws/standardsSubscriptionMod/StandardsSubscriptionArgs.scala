package typings.pulumiAws.standardsSubscriptionMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StandardsSubscriptionArgs extends js.Object {
  
  /**
    * The ARN of a standard - see below.
    */
  val standardsArn: Input[String] = js.native
}
object StandardsSubscriptionArgs {
  
  @scala.inline
  def apply(standardsArn: Input[String]): StandardsSubscriptionArgs = {
    val __obj = js.Dynamic.literal(standardsArn = standardsArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardsSubscriptionArgs]
  }
  
  @scala.inline
  implicit class StandardsSubscriptionArgsOps[Self <: StandardsSubscriptionArgs] (val x: Self) extends AnyVal {
    
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
    def setStandardsArn(value: Input[String]): Self = this.set("standardsArn", value.asInstanceOf[js.Any])
  }
}
