package typings.pulumiAws.proxyTargetMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProxyTargetState extends js.Object {
  
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
  val dbProxyName: js.UndefOr[Input[String]] = js.native
  
  /**
    * Hostname for the target RDS DB Instance. Only returned for `RDS_INSTANCE` type.
    */
  val endpoint: js.UndefOr[Input[String]] = js.native
  
  /**
    * Port for the target RDS DB Instance or Aurora DB Cluster.
    */
  val port: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Identifier representing the DB Instance or DB Cluster target.
    */
  val rdsResourceId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Amazon Resource Name (ARN) for the DB instance or DB cluster. Currently not returned by the RDS API.
    */
  val targetArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the target group.
    */
  val targetGroupName: js.UndefOr[Input[String]] = js.native
  
  /**
    * DB Cluster identifier for the DB Instance target. Not returned unless manually importing an `RDS_INSTANCE` target that is part of a DB Cluster.
    */
  val trackedClusterId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Type of target. e.g. `RDS_INSTANCE` or `TRACKED_CLUSTER`
    */
  val `type`: js.UndefOr[Input[String]] = js.native
}
object ProxyTargetState {
  
  @scala.inline
  def apply(): ProxyTargetState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyTargetState]
  }
  
  @scala.inline
  implicit class ProxyTargetStateOps[Self <: ProxyTargetState] (val x: Self) extends AnyVal {
    
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
    def setDbClusterIdentifier(value: Input[String]): Self = this.set("dbClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbClusterIdentifier: Self = this.set("dbClusterIdentifier", js.undefined)
    
    @scala.inline
    def setDbInstanceIdentifier(value: Input[String]): Self = this.set("dbInstanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbInstanceIdentifier: Self = this.set("dbInstanceIdentifier", js.undefined)
    
    @scala.inline
    def setDbProxyName(value: Input[String]): Self = this.set("dbProxyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbProxyName: Self = this.set("dbProxyName", js.undefined)
    
    @scala.inline
    def setEndpoint(value: Input[String]): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    
    @scala.inline
    def setPort(value: Input[Double]): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setRdsResourceId(value: Input[String]): Self = this.set("rdsResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRdsResourceId: Self = this.set("rdsResourceId", js.undefined)
    
    @scala.inline
    def setTargetArn(value: Input[String]): Self = this.set("targetArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetArn: Self = this.set("targetArn", js.undefined)
    
    @scala.inline
    def setTargetGroupName(value: Input[String]): Self = this.set("targetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetGroupName: Self = this.set("targetGroupName", js.undefined)
    
    @scala.inline
    def setTrackedClusterId(value: Input[String]): Self = this.set("trackedClusterId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackedClusterId: Self = this.set("trackedClusterId", js.undefined)
    
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
