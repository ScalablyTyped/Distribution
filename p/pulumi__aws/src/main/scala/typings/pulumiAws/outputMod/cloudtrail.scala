package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudtrail {
  
  @js.native
  trait TrailEventSelector extends StObject {
    
    /**
      * Specifies logging data events. Fields documented below.
      */
    var dataResources: js.UndefOr[js.Array[TrailEventSelectorDataResource]] = js.native
    
    /**
      * Specify if you want your event selector to include management events for your trail.
      */
    var includeManagementEvents: js.UndefOr[Boolean] = js.native
    
    /**
      * Specify if you want your trail to log read-only events, write-only events, or all. By default, the value is All. You can specify only the following value: "ReadOnly", "WriteOnly", "All". Defaults to `All`.
      */
    var readWriteType: js.UndefOr[String] = js.native
  }
  object TrailEventSelector {
    
    @scala.inline
    def apply(): TrailEventSelector = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrailEventSelector]
    }
    
    @scala.inline
    implicit class TrailEventSelectorMutableBuilder[Self <: TrailEventSelector] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataResources(value: js.Array[TrailEventSelectorDataResource]): Self = StObject.set(x, "dataResources", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataResourcesUndefined: Self = StObject.set(x, "dataResources", js.undefined)
      
      @scala.inline
      def setDataResourcesVarargs(value: TrailEventSelectorDataResource*): Self = StObject.set(x, "dataResources", js.Array(value :_*))
      
      @scala.inline
      def setIncludeManagementEvents(value: Boolean): Self = StObject.set(x, "includeManagementEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeManagementEventsUndefined: Self = StObject.set(x, "includeManagementEvents", js.undefined)
      
      @scala.inline
      def setReadWriteType(value: String): Self = StObject.set(x, "readWriteType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadWriteTypeUndefined: Self = StObject.set(x, "readWriteType", js.undefined)
    }
  }
  
  @js.native
  trait TrailEventSelectorDataResource extends StObject {
    
    /**
      * The resource type in which you want to log data events. You can specify only the following value: "AWS::S3::Object", "AWS::Lambda::Function"
      */
    var `type`: String = js.native
    
    /**
      * A list of ARN for the specified S3 buckets and object prefixes..
      */
    var values: js.Array[String] = js.native
  }
  object TrailEventSelectorDataResource {
    
    @scala.inline
    def apply(`type`: String, values: js.Array[String]): TrailEventSelectorDataResource = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrailEventSelectorDataResource]
    }
    
    @scala.inline
    implicit class TrailEventSelectorDataResourceMutableBuilder[Self <: TrailEventSelectorDataResource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  @js.native
  trait TrailInsightSelector extends StObject {
    
    /**
      * The type of insights to log on a trail. In this release, only `ApiCallRateInsight` is supported as an insight type.
      */
    var insightType: String = js.native
  }
  object TrailInsightSelector {
    
    @scala.inline
    def apply(insightType: String): TrailInsightSelector = {
      val __obj = js.Dynamic.literal(insightType = insightType.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrailInsightSelector]
    }
    
    @scala.inline
    implicit class TrailInsightSelectorMutableBuilder[Self <: TrailInsightSelector] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInsightType(value: String): Self = StObject.set(x, "insightType", value.asInstanceOf[js.Any])
    }
  }
}
