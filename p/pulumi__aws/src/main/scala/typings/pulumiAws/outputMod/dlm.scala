package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dlm {
  
  @js.native
  trait LifecyclePolicyPolicyDetails extends StObject {
    
    /**
      * A list of resource types that should be targeted by the lifecycle policy. `VOLUME` is currently the only allowed value.
      */
    var resourceTypes: js.Array[String] = js.native
    
    /**
      * See the `schedule` configuration block.
      */
    var schedules: js.Array[LifecyclePolicyPolicyDetailsSchedule] = js.native
    
    /**
      * A map of tag keys and their values. Any resources that match the `resourceTypes` and are tagged with _any_ of these tags will be targeted.
      */
    var targetTags: StringDictionary[String] = js.native
  }
  object LifecyclePolicyPolicyDetails {
    
    @scala.inline
    def apply(
      resourceTypes: js.Array[String],
      schedules: js.Array[LifecyclePolicyPolicyDetailsSchedule],
      targetTags: StringDictionary[String]
    ): LifecyclePolicyPolicyDetails = {
      val __obj = js.Dynamic.literal(resourceTypes = resourceTypes.asInstanceOf[js.Any], schedules = schedules.asInstanceOf[js.Any], targetTags = targetTags.asInstanceOf[js.Any])
      __obj.asInstanceOf[LifecyclePolicyPolicyDetails]
    }
    
    @scala.inline
    implicit class LifecyclePolicyPolicyDetailsMutableBuilder[Self <: LifecyclePolicyPolicyDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResourceTypes(value: js.Array[String]): Self = StObject.set(x, "resourceTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceTypesVarargs(value: String*): Self = StObject.set(x, "resourceTypes", js.Array(value :_*))
      
      @scala.inline
      def setSchedules(value: js.Array[LifecyclePolicyPolicyDetailsSchedule]): Self = StObject.set(x, "schedules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchedulesVarargs(value: LifecyclePolicyPolicyDetailsSchedule*): Self = StObject.set(x, "schedules", js.Array(value :_*))
      
      @scala.inline
      def setTargetTags(value: StringDictionary[String]): Self = StObject.set(x, "targetTags", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LifecyclePolicyPolicyDetailsSchedule extends StObject {
    
    /**
      * Copy all user-defined tags on a source volume to snapshots of the volume created by this policy.
      */
    var copyTags: Boolean = js.native
    
    /**
      * See the `createRule` block. Max of 1 per schedule.
      */
    var createRule: LifecyclePolicyPolicyDetailsScheduleCreateRule = js.native
    
    /**
      * A name for the schedule.
      */
    var name: String = js.native
    
    /**
      * See the `retainRule` block. Max of 1 per schedule.
      */
    var retainRule: LifecyclePolicyPolicyDetailsScheduleRetainRule = js.native
    
    /**
      * A map of tag keys and their values. DLM lifecycle policies will already tag the snapshot with the tags on the volume. This configuration adds extra tags on top of these.
      */
    var tagsToAdd: js.UndefOr[StringDictionary[String]] = js.native
  }
  object LifecyclePolicyPolicyDetailsSchedule {
    
    @scala.inline
    def apply(
      copyTags: Boolean,
      createRule: LifecyclePolicyPolicyDetailsScheduleCreateRule,
      name: String,
      retainRule: LifecyclePolicyPolicyDetailsScheduleRetainRule
    ): LifecyclePolicyPolicyDetailsSchedule = {
      val __obj = js.Dynamic.literal(copyTags = copyTags.asInstanceOf[js.Any], createRule = createRule.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], retainRule = retainRule.asInstanceOf[js.Any])
      __obj.asInstanceOf[LifecyclePolicyPolicyDetailsSchedule]
    }
    
    @scala.inline
    implicit class LifecyclePolicyPolicyDetailsScheduleMutableBuilder[Self <: LifecyclePolicyPolicyDetailsSchedule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCopyTags(value: Boolean): Self = StObject.set(x, "copyTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateRule(value: LifecyclePolicyPolicyDetailsScheduleCreateRule): Self = StObject.set(x, "createRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetainRule(value: LifecyclePolicyPolicyDetailsScheduleRetainRule): Self = StObject.set(x, "retainRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsToAdd(value: StringDictionary[String]): Self = StObject.set(x, "tagsToAdd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsToAddUndefined: Self = StObject.set(x, "tagsToAdd", js.undefined)
    }
  }
  
  @js.native
  trait LifecyclePolicyPolicyDetailsScheduleCreateRule extends StObject {
    
    /**
      * How often this lifecycle policy should be evaluated. `1`, `2`,`3`,`4`,`6`,`8`,`12` or `24` are valid values.
      */
    var interval: Double = js.native
    
    /**
      * The unit for how often the lifecycle policy should be evaluated. `HOURS` is currently the only allowed value and also the default value.
      */
    var intervalUnit: js.UndefOr[String] = js.native
    
    /**
      * A list of times in 24 hour clock format that sets when the lifecycle policy should be evaluated. Max of 1.
      */
    var times: String = js.native
  }
  object LifecyclePolicyPolicyDetailsScheduleCreateRule {
    
    @scala.inline
    def apply(interval: Double, times: String): LifecyclePolicyPolicyDetailsScheduleCreateRule = {
      val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], times = times.asInstanceOf[js.Any])
      __obj.asInstanceOf[LifecyclePolicyPolicyDetailsScheduleCreateRule]
    }
    
    @scala.inline
    implicit class LifecyclePolicyPolicyDetailsScheduleCreateRuleMutableBuilder[Self <: LifecyclePolicyPolicyDetailsScheduleCreateRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUnit(value: String): Self = StObject.set(x, "intervalUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUnitUndefined: Self = StObject.set(x, "intervalUnit", js.undefined)
      
      @scala.inline
      def setTimes(value: String): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LifecyclePolicyPolicyDetailsScheduleRetainRule extends StObject {
    
    /**
      * How many snapshots to keep. Must be an integer between 1 and 1000.
      */
    var count: Double = js.native
  }
  object LifecyclePolicyPolicyDetailsScheduleRetainRule {
    
    @scala.inline
    def apply(count: Double): LifecyclePolicyPolicyDetailsScheduleRetainRule = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
      __obj.asInstanceOf[LifecyclePolicyPolicyDetailsScheduleRetainRule]
    }
    
    @scala.inline
    implicit class LifecyclePolicyPolicyDetailsScheduleRetainRuleMutableBuilder[Self <: LifecyclePolicyPolicyDetailsScheduleRetainRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    }
  }
}
