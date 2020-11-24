package typings.pulumiAws.logDestinationPolicyMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogDestinationPolicyState extends js.Object {
  
  /**
    * The policy document. This is a JSON formatted string.
    */
  val accessPolicy: js.UndefOr[Input[String]] = js.native
  
  /**
    * A name for the subscription filter
    */
  val destinationName: js.UndefOr[Input[String]] = js.native
}
object LogDestinationPolicyState {
  
  @scala.inline
  def apply(): LogDestinationPolicyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogDestinationPolicyState]
  }
  
  @scala.inline
  implicit class LogDestinationPolicyStateOps[Self <: LogDestinationPolicyState] (val x: Self) extends AnyVal {
    
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
    def setAccessPolicy(value: Input[String]): Self = this.set("accessPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessPolicy: Self = this.set("accessPolicy", js.undefined)
    
    @scala.inline
    def setDestinationName(value: Input[String]): Self = this.set("destinationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationName: Self = this.set("destinationName", js.undefined)
  }
}
