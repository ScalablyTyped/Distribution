package typings.pulumiAws.proxyDefaultTargetGroupMod

import typings.pulumiAws.inputMod.rds.ProxyDefaultTargetGroupConnectionPoolConfig
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProxyDefaultTargetGroupState extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) representing the target group.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The settings that determine the size and behavior of the connection pool for the target group.
    */
  val connectionPoolConfig: js.UndefOr[Input[ProxyDefaultTargetGroupConnectionPoolConfig]] = js.native
  
  /**
    * Name of the RDS DB Proxy.
    */
  val dbProxyName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the default target group.
    */
  val name: js.UndefOr[Input[String]] = js.native
}
object ProxyDefaultTargetGroupState {
  
  @scala.inline
  def apply(): ProxyDefaultTargetGroupState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyDefaultTargetGroupState]
  }
  
  @scala.inline
  implicit class ProxyDefaultTargetGroupStateOps[Self <: ProxyDefaultTargetGroupState] (val x: Self) extends AnyVal {
    
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
    def setConnectionPoolConfig(value: Input[ProxyDefaultTargetGroupConnectionPoolConfig]): Self = this.set("connectionPoolConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionPoolConfig: Self = this.set("connectionPoolConfig", js.undefined)
    
    @scala.inline
    def setDbProxyName(value: Input[String]): Self = this.set("dbProxyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbProxyName: Self = this.set("dbProxyName", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
