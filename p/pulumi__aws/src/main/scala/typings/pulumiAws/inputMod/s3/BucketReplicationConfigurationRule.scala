package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketReplicationConfigurationRule extends StObject {
  
  /**
    * Specifies the destination for the rule (documented below).
    */
  var destination: Input[BucketReplicationConfigurationRuleDestination]
  
  /**
    * Filter that identifies subset of objects to which the replication rule applies (documented below).
    */
  var filter: js.UndefOr[Input[BucketReplicationConfigurationRuleFilter]] = js.undefined
  
  /**
    * Unique identifier for the rule. Must be less than or equal to 255 characters in length.
    */
  var id: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Object keyname prefix identifying one or more objects to which the rule applies. Must be less than or equal to 1024 characters in length.
    */
  var prefix: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * is optional (with a default value of `0`) but must be unique between multiple rules
    */
  var priority: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Specifies special object selection criteria (documented below).
    */
  var sourceSelectionCriteria: js.UndefOr[Input[BucketReplicationConfigurationRuleSourceSelectionCriteria]] = js.undefined
  
  /**
    * The status of the rule. Either `Enabled` or `Disabled`. The rule is ignored if status is not Enabled.
    */
  var status: Input[String]
}
object BucketReplicationConfigurationRule {
  
  @scala.inline
  def apply(destination: Input[BucketReplicationConfigurationRuleDestination], status: Input[String]): BucketReplicationConfigurationRule = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketReplicationConfigurationRule]
  }
  
  @scala.inline
  implicit class BucketReplicationConfigurationRuleMutableBuilder[Self <: BucketReplicationConfigurationRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: Input[BucketReplicationConfigurationRuleDestination]): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilter(value: Input[BucketReplicationConfigurationRuleFilter]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setId(value: Input[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setPrefix(value: Input[String]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setPriority(value: Input[Double]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setSourceSelectionCriteria(value: Input[BucketReplicationConfigurationRuleSourceSelectionCriteria]): Self = StObject.set(x, "sourceSelectionCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceSelectionCriteriaUndefined: Self = StObject.set(x, "sourceSelectionCriteria", js.undefined)
    
    @scala.inline
    def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
