package typings.pulumiAws.inputMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dlm {
  
  trait LifecyclePolicyPolicyDetails extends StObject {
    
    /**
      * A list of resource types that should be targeted by the lifecycle policy. `VOLUME` is currently the only allowed value.
      */
    var resourceTypes: Input[js.Array[Input[String]]]
    
    /**
      * See the `schedule` configuration block.
      */
    var schedules: Input[js.Array[Input[LifecyclePolicyPolicyDetailsSchedule]]]
    
    /**
      * A map of tag keys and their values. Any resources that match the `resourceTypes` and are tagged with _any_ of these tags will be targeted.
      */
    var targetTags: Input[StringDictionary[Input[String]]]
  }
  object LifecyclePolicyPolicyDetails {
    
    @scala.inline
    def apply(
      resourceTypes: Input[js.Array[Input[String]]],
      schedules: Input[js.Array[Input[LifecyclePolicyPolicyDetailsSchedule]]],
      targetTags: Input[StringDictionary[Input[String]]]
    ): LifecyclePolicyPolicyDetails = {
      val __obj = js.Dynamic.literal(resourceTypes = resourceTypes.asInstanceOf[js.Any], schedules = schedules.asInstanceOf[js.Any], targetTags = targetTags.asInstanceOf[js.Any])
      __obj.asInstanceOf[LifecyclePolicyPolicyDetails]
    }
    
    @scala.inline
    implicit class LifecyclePolicyPolicyDetailsMutableBuilder[Self <: LifecyclePolicyPolicyDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResourceTypes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "resourceTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceTypesVarargs(value: Input[String]*): Self = StObject.set(x, "resourceTypes", js.Array(value :_*))
      
      @scala.inline
      def setSchedules(value: Input[js.Array[Input[LifecyclePolicyPolicyDetailsSchedule]]]): Self = StObject.set(x, "schedules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSchedulesVarargs(value: Input[LifecyclePolicyPolicyDetailsSchedule]*): Self = StObject.set(x, "schedules", js.Array(value :_*))
      
      @scala.inline
      def setTargetTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "targetTags", value.asInstanceOf[js.Any])
    }
  }
  
  trait LifecyclePolicyPolicyDetailsSchedule extends StObject {
    
    /**
      * Copy all user-defined tags on a source volume to snapshots of the volume created by this policy.
      */
    var copyTags: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * See the `createRule` block. Max of 1 per schedule.
      */
    var createRule: Input[LifecyclePolicyPolicyDetailsScheduleCreateRule]
    
    /**
      * A name for the schedule.
      */
    var name: Input[String]
    
    /**
      * See the `retainRule` block. Max of 1 per schedule.
      */
    var retainRule: Input[LifecyclePolicyPolicyDetailsScheduleRetainRule]
    
    /**
      * A map of tag keys and their values. DLM lifecycle policies will already tag the snapshot with the tags on the volume. This configuration adds extra tags on top of these.
      */
    var tagsToAdd: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  }
  object LifecyclePolicyPolicyDetailsSchedule {
    
    @scala.inline
    def apply(
      createRule: Input[LifecyclePolicyPolicyDetailsScheduleCreateRule],
      name: Input[String],
      retainRule: Input[LifecyclePolicyPolicyDetailsScheduleRetainRule]
    ): LifecyclePolicyPolicyDetailsSchedule = {
      val __obj = js.Dynamic.literal(createRule = createRule.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], retainRule = retainRule.asInstanceOf[js.Any])
      __obj.asInstanceOf[LifecyclePolicyPolicyDetailsSchedule]
    }
    
    @scala.inline
    implicit class LifecyclePolicyPolicyDetailsScheduleMutableBuilder[Self <: LifecyclePolicyPolicyDetailsSchedule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCopyTags(value: Input[Boolean]): Self = StObject.set(x, "copyTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyTagsUndefined: Self = StObject.set(x, "copyTags", js.undefined)
      
      @scala.inline
      def setCreateRule(value: Input[LifecyclePolicyPolicyDetailsScheduleCreateRule]): Self = StObject.set(x, "createRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetainRule(value: Input[LifecyclePolicyPolicyDetailsScheduleRetainRule]): Self = StObject.set(x, "retainRule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsToAdd(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tagsToAdd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsToAddUndefined: Self = StObject.set(x, "tagsToAdd", js.undefined)
    }
  }
  
  trait LifecyclePolicyPolicyDetailsScheduleCreateRule extends StObject {
    
    /**
      * How often this lifecycle policy should be evaluated. `1`, `2`,`3`,`4`,`6`,`8`,`12` or `24` are valid values.
      */
    var interval: Input[Double]
    
    /**
      * The unit for how often the lifecycle policy should be evaluated. `HOURS` is currently the only allowed value and also the default value.
      */
    var intervalUnit: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of times in 24 hour clock format that sets when the lifecycle policy should be evaluated. Max of 1.
      */
    var times: js.UndefOr[Input[String]] = js.undefined
  }
  object LifecyclePolicyPolicyDetailsScheduleCreateRule {
    
    @scala.inline
    def apply(interval: Input[Double]): LifecyclePolicyPolicyDetailsScheduleCreateRule = {
      val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any])
      __obj.asInstanceOf[LifecyclePolicyPolicyDetailsScheduleCreateRule]
    }
    
    @scala.inline
    implicit class LifecyclePolicyPolicyDetailsScheduleCreateRuleMutableBuilder[Self <: LifecyclePolicyPolicyDetailsScheduleCreateRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInterval(value: Input[Double]): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUnit(value: Input[String]): Self = StObject.set(x, "intervalUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUnitUndefined: Self = StObject.set(x, "intervalUnit", js.undefined)
      
      @scala.inline
      def setTimes(value: Input[String]): Self = StObject.set(x, "times", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimesUndefined: Self = StObject.set(x, "times", js.undefined)
    }
  }
  
  trait LifecyclePolicyPolicyDetailsScheduleRetainRule extends StObject {
    
    /**
      * How many snapshots to keep. Must be an integer between 1 and 1000.
      */
    var count: Input[Double]
  }
  object LifecyclePolicyPolicyDetailsScheduleRetainRule {
    
    @scala.inline
    def apply(count: Input[Double]): LifecyclePolicyPolicyDetailsScheduleRetainRule = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
      __obj.asInstanceOf[LifecyclePolicyPolicyDetailsScheduleRetainRule]
    }
    
    @scala.inline
    implicit class LifecyclePolicyPolicyDetailsScheduleRetainRuleMutableBuilder[Self <: LifecyclePolicyPolicyDetailsScheduleRetainRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Input[Double]): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    }
  }
}
