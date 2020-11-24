package typings.pulumiAws.proxyTargetMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProxyTargetArgs extends js.Object {
  
  /**
    * DB cluster identifier.
    */
  val dbClusterIdentifier: js.UndefOr[Input[String]] = js.native
  
  /**
    * DB instance identifier.
    */
  val dbInstanceIdentifier: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the DB proxy.
    */
  val dbProxyName: Input[String] = js.native
  
  /**
    * The name of the target group.
    */
  val targetGroupName: Input[String] = js.native
}
object ProxyTargetArgs {
  
  @scala.inline
  def apply(dbProxyName: Input[String], targetGroupName: Input[String]): ProxyTargetArgs = {
    val __obj = js.Dynamic.literal(dbProxyName = dbProxyName.asInstanceOf[js.Any], targetGroupName = targetGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyTargetArgs]
  }
  
  @scala.inline
  implicit class ProxyTargetArgsOps[Self <: ProxyTargetArgs] (val x: Self) extends AnyVal {
    
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
    def setDbProxyName(value: Input[String]): Self = this.set("dbProxyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetGroupName(value: Input[String]): Self = this.set("targetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbClusterIdentifier(value: Input[String]): Self = this.set("dbClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbClusterIdentifier: Self = this.set("dbClusterIdentifier", js.undefined)
    
    @scala.inline
    def setDbInstanceIdentifier(value: Input[String]): Self = this.set("dbInstanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbInstanceIdentifier: Self = this.set("dbInstanceIdentifier", js.undefined)
  }
}
