package typings.pulumiAws.inputMod.mq

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrokerInstance extends js.Object {
  
  var consoleUrl: js.UndefOr[Input[String]] = js.native
  
  var endpoints: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  var ipAddress: js.UndefOr[Input[String]] = js.native
}
object BrokerInstance {
  
  @scala.inline
  def apply(): BrokerInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokerInstance]
  }
  
  @scala.inline
  implicit class BrokerInstanceOps[Self <: BrokerInstance] (val x: Self) extends AnyVal {
    
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
    def setConsoleUrl(value: Input[String]): Self = this.set("consoleUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsoleUrl: Self = this.set("consoleUrl", js.undefined)
    
    @scala.inline
    def setEndpointsVarargs(value: Input[String]*): Self = this.set("endpoints", js.Array(value :_*))
    
    @scala.inline
    def setEndpoints(value: Input[js.Array[Input[String]]]): Self = this.set("endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoints: Self = this.set("endpoints", js.undefined)
    
    @scala.inline
    def setIpAddress(value: Input[String]): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpAddress: Self = this.set("ipAddress", js.undefined)
  }
}
