package typings.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketReplicationConfigurationRule extends js.Object {
  
  /**
    * Specifies the destination for the rule (documented below).
    */
  var destination: BucketReplicationConfigurationRuleDestination = js.native
  
  /**
    * Filter that identifies subset of objects to which the replication rule applies (documented below).
    */
  var filter: js.UndefOr[BucketReplicationConfigurationRuleFilter] = js.native
  
  /**
    * Unique identifier for the rule. Must be less than or equal to 255 characters in length.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Object keyname prefix identifying one or more objects to which the rule applies. Must be less than or equal to 1024 characters in length.
    */
  var prefix: js.UndefOr[String] = js.native
  
  /**
    * is optional (with a default value of `0`) but must be unique between multiple rules
    */
  var priority: js.UndefOr[Double] = js.native
  
  /**
    * Specifies special object selection criteria (documented below).
    */
  var sourceSelectionCriteria: js.UndefOr[BucketReplicationConfigurationRuleSourceSelectionCriteria] = js.native
  
  /**
    * The status of the rule. Either `Enabled` or `Disabled`. The rule is ignored if status is not Enabled.
    */
  var status: String = js.native
}
object BucketReplicationConfigurationRule {
  
  @scala.inline
  def apply(destination: BucketReplicationConfigurationRuleDestination, status: String): BucketReplicationConfigurationRule = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketReplicationConfigurationRule]
  }
  
  @scala.inline
  implicit class BucketReplicationConfigurationRuleOps[Self <: BucketReplicationConfigurationRule] (val x: Self) extends AnyVal {
    
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
    def setDestination(value: BucketReplicationConfigurationRuleDestination): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: BucketReplicationConfigurationRuleFilter): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setSourceSelectionCriteria(value: BucketReplicationConfigurationRuleSourceSelectionCriteria): Self = this.set("sourceSelectionCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceSelectionCriteria: Self = this.set("sourceSelectionCriteria", js.undefined)
  }
}
