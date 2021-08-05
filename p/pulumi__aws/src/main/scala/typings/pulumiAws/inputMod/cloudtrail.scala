package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudtrail {
  
  trait TrailEventSelector extends StObject {
    
    /**
      * Specifies logging data events. Fields documented below.
      */
    var dataResources: js.UndefOr[Input[js.Array[Input[TrailEventSelectorDataResource]]]] = js.undefined
    
    /**
      * Specify if you want your event selector to include management events for your trail.
      */
    var includeManagementEvents: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Specify if you want your trail to log read-only events, write-only events, or all. By default, the value is All. You can specify only the following value: "ReadOnly", "WriteOnly", "All". Defaults to `All`.
      */
    var readWriteType: js.UndefOr[Input[String]] = js.undefined
  }
  object TrailEventSelector {
    
    inline def apply(): TrailEventSelector = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrailEventSelector]
    }
    
    extension [Self <: TrailEventSelector](x: Self) {
      
      inline def setDataResources(value: Input[js.Array[Input[TrailEventSelectorDataResource]]]): Self = StObject.set(x, "dataResources", value.asInstanceOf[js.Any])
      
      inline def setDataResourcesUndefined: Self = StObject.set(x, "dataResources", js.undefined)
      
      inline def setDataResourcesVarargs(value: Input[TrailEventSelectorDataResource]*): Self = StObject.set(x, "dataResources", js.Array(value :_*))
      
      inline def setIncludeManagementEvents(value: Input[Boolean]): Self = StObject.set(x, "includeManagementEvents", value.asInstanceOf[js.Any])
      
      inline def setIncludeManagementEventsUndefined: Self = StObject.set(x, "includeManagementEvents", js.undefined)
      
      inline def setReadWriteType(value: Input[String]): Self = StObject.set(x, "readWriteType", value.asInstanceOf[js.Any])
      
      inline def setReadWriteTypeUndefined: Self = StObject.set(x, "readWriteType", js.undefined)
    }
  }
  
  trait TrailEventSelectorDataResource extends StObject {
    
    /**
      * The resource type in which you want to log data events. You can specify only the following value: "AWS::S3::Object", "AWS::Lambda::Function"
      */
    var `type`: Input[String]
    
    /**
      * A list of ARN for the specified S3 buckets and object prefixes..
      */
    var values: Input[js.Array[Input[String]]]
  }
  object TrailEventSelectorDataResource {
    
    inline def apply(`type`: Input[String], values: Input[js.Array[Input[String]]]): TrailEventSelectorDataResource = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrailEventSelectorDataResource]
    }
    
    extension [Self <: TrailEventSelectorDataResource](x: Self) {
      
      inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValues(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Input[String]*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  trait TrailInsightSelector extends StObject {
    
    /**
      * The type of insights to log on a trail. In this release, only `ApiCallRateInsight` is supported as an insight type.
      */
    var insightType: Input[String]
  }
  object TrailInsightSelector {
    
    inline def apply(insightType: Input[String]): TrailInsightSelector = {
      val __obj = js.Dynamic.literal(insightType = insightType.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrailInsightSelector]
    }
    
    extension [Self <: TrailInsightSelector](x: Self) {
      
      inline def setInsightType(value: Input[String]): Self = StObject.set(x, "insightType", value.asInstanceOf[js.Any])
    }
  }
}
