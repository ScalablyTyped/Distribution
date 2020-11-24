package typings.pulumiAws.inputMod.rds

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProxyDefaultTargetGroupConnectionPoolConfig extends js.Object {
  
  /**
    * The number of seconds for a proxy to wait for a connection to become available in the connection pool. Only applies when the proxy has opened its maximum number of connections and all connections are busy with client sessions.
    */
  var connectionBorrowTimeout: js.UndefOr[Input[Double]] = js.native
  
  /**
    * One or more SQL statements for the proxy to run when opening each new database connection. Typically used with `SET` statements to make sure that each connection has identical settings such as time zone and character set. This setting is empty by default. For multiple statements, use semicolons as the separator. You can also include multiple variables in a single `SET` statement, such as `SET x=1, y=2`.
    */
  var initQuery: js.UndefOr[Input[String]] = js.native
  
  /**
    * The maximum size of the connection pool for each target in a target group. For Aurora MySQL, it is expressed as a percentage of the maxConnections setting for the RDS DB instance or Aurora DB cluster used by the target group.
    */
  var maxConnectionsPercent: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Controls how actively the proxy closes idle database connections in the connection pool. A high value enables the proxy to leave a high percentage of idle connections open. A low value causes the proxy to close idle client connections and return the underlying database connections to the connection pool. For Aurora MySQL, it is expressed as a percentage of the maxConnections setting for the RDS DB instance or Aurora DB cluster used by the target group.
    */
  var maxIdleConnectionsPercent: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Each item in the list represents a class of SQL operations that normally cause all later statements in a session using a proxy to be pinned to the same underlying database connection. Including an item in the list exempts that class of SQL operations from the pinning behavior. Currently, the only allowed value is `EXCLUDE_VARIABLE_SETS`.
    */
  var sessionPinningFilters: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}
object ProxyDefaultTargetGroupConnectionPoolConfig {
  
  @scala.inline
  def apply(): ProxyDefaultTargetGroupConnectionPoolConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyDefaultTargetGroupConnectionPoolConfig]
  }
  
  @scala.inline
  implicit class ProxyDefaultTargetGroupConnectionPoolConfigOps[Self <: ProxyDefaultTargetGroupConnectionPoolConfig] (val x: Self) extends AnyVal {
    
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
    def setConnectionBorrowTimeout(value: Input[Double]): Self = this.set("connectionBorrowTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionBorrowTimeout: Self = this.set("connectionBorrowTimeout", js.undefined)
    
    @scala.inline
    def setInitQuery(value: Input[String]): Self = this.set("initQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitQuery: Self = this.set("initQuery", js.undefined)
    
    @scala.inline
    def setMaxConnectionsPercent(value: Input[Double]): Self = this.set("maxConnectionsPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxConnectionsPercent: Self = this.set("maxConnectionsPercent", js.undefined)
    
    @scala.inline
    def setMaxIdleConnectionsPercent(value: Input[Double]): Self = this.set("maxIdleConnectionsPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxIdleConnectionsPercent: Self = this.set("maxIdleConnectionsPercent", js.undefined)
    
    @scala.inline
    def setSessionPinningFiltersVarargs(value: Input[String]*): Self = this.set("sessionPinningFilters", js.Array(value :_*))
    
    @scala.inline
    def setSessionPinningFilters(value: Input[js.Array[Input[String]]]): Self = this.set("sessionPinningFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionPinningFilters: Self = this.set("sessionPinningFilters", js.undefined)
  }
}
