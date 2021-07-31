package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codecommit {
  
  trait TriggerTrigger extends StObject {
    
    /**
      * The branches that will be included in the trigger configuration. If no branches are specified, the trigger will apply to all branches.
      */
    var branches: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Any custom data associated with the trigger that will be included in the information sent to the target of the trigger.
      */
    var customData: js.UndefOr[String] = js.undefined
    
    /**
      * The ARN of the resource that is the target for a trigger. For example, the ARN of a topic in Amazon Simple Notification Service (SNS).
      */
    var destinationArn: String
    
    /**
      * The repository events that will cause the trigger to run actions in another service, such as sending a notification through Amazon Simple Notification Service (SNS). If no events are specified, the trigger will run for all repository events. Event types include: `all`, `updateReference`, `createReference`, `deleteReference`.
      */
    var events: js.Array[String]
    
    /**
      * The name of the trigger.
      */
    var name: String
  }
  object TriggerTrigger {
    
    @scala.inline
    def apply(destinationArn: String, events: js.Array[String], name: String): TriggerTrigger = {
      val __obj = js.Dynamic.literal(destinationArn = destinationArn.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TriggerTrigger]
    }
    
    @scala.inline
    implicit class TriggerTriggerMutableBuilder[Self <: TriggerTrigger] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBranches(value: js.Array[String]): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBranchesUndefined: Self = StObject.set(x, "branches", js.undefined)
      
      @scala.inline
      def setBranchesVarargs(value: String*): Self = StObject.set(x, "branches", js.Array(value :_*))
      
      @scala.inline
      def setCustomData(value: String): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
      
      @scala.inline
      def setDestinationArn(value: String): Self = StObject.set(x, "destinationArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvents(value: js.Array[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
