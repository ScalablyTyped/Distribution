package typings.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketReplicationConfigurationRule extends StObject {
  
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
  implicit class BucketReplicationConfigurationRuleMutableBuilder[Self <: BucketReplicationConfigurationRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: BucketReplicationConfigurationRuleDestination): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: BucketReplicationConfigurationRuleFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setSourceSelectionCriteria(value: BucketReplicationConfigurationRuleSourceSelectionCriteria): Self = StObject.set(x, "sourceSelectionCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceSelectionCriteriaUndefined: Self = StObject.set(x, "sourceSelectionCriteria", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
