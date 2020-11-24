package typings.pulumiAws.proxyDefaultTargetGroupMod

import typings.pulumiAws.inputMod.rds.ProxyDefaultTargetGroupConnectionPoolConfig
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProxyDefaultTargetGroupArgs extends js.Object {
  
  /**
    * The settings that determine the size and behavior of the connection pool for the target group.
    */
  val connectionPoolConfig: Input[ProxyDefaultTargetGroupConnectionPoolConfig] = js.native
  
  /**
    * Name of the RDS DB Proxy.
    */
  val dbProxyName: Input[String] = js.native
}
object ProxyDefaultTargetGroupArgs {
  
  @scala.inline
  def apply(
    connectionPoolConfig: Input[ProxyDefaultTargetGroupConnectionPoolConfig],
    dbProxyName: Input[String]
  ): ProxyDefaultTargetGroupArgs = {
    val __obj = js.Dynamic.literal(connectionPoolConfig = connectionPoolConfig.asInstanceOf[js.Any], dbProxyName = dbProxyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyDefaultTargetGroupArgs]
  }
  
  @scala.inline
  implicit class ProxyDefaultTargetGroupArgsOps[Self <: ProxyDefaultTargetGroupArgs] (val x: Self) extends AnyVal {
    
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
    def setConnectionPoolConfig(value: Input[ProxyDefaultTargetGroupConnectionPoolConfig]): Self = this.set("connectionPoolConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbProxyName(value: Input[String]): Self = this.set("dbProxyName", value.asInstanceOf[js.Any])
  }
}
