package typings.pulumiKubernetes

import typings.pulumiKubernetes.outputMod.core.v1.EventSeries
import typings.pulumiKubernetes.outputMod.core.v1.EventSource
import typings.pulumiKubernetes.outputMod.core.v1.ObjectReference
import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.v1
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventMod {
  
  @JSImport("@pulumi/kubernetes/core/v1/event", "Event")
  @js.native
  class Event protected () extends CustomResource {
    /**
      * Create a Event resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: EventArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: EventArgs, opts: CustomResourceOptions) = this()
    
    /**
      * What action was taken/failed regarding to the Regarding object.
      */
    val action: Output_[String] = js.native
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[v1] = js.native
    
    /**
      * The number of times this event has occurred.
      */
    val count: Output_[Double] = js.native
    
    /**
      * Time when this Event was first observed.
      */
    val eventTime: Output_[String] = js.native
    
    /**
      * The time at which the event was first recorded. (Time of server receipt is in TypeMeta.)
      */
    val firstTimestamp: Output_[String] = js.native
    
    /**
      * The object that this event is about.
      */
    val involvedObject: Output_[ObjectReference] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typings.pulumiKubernetes.pulumiKubernetesStrings.Event] = js.native
    
    /**
      * The time at which the most recent occurrence of this event was recorded.
      */
    val lastTimestamp: Output_[String] = js.native
    
    /**
      * A human-readable description of the status of this operation.
      */
    val message: Output_[String] = js.native
    
    /**
      * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: Output_[ObjectMeta] = js.native
    
    /**
      * This should be a short, machine understandable string that gives the reason for the transition into the object's current status.
      */
    val reason: Output_[String] = js.native
    
    /**
      * Optional secondary object for more complex actions.
      */
    val related: Output_[ObjectReference] = js.native
    
    /**
      * Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
      */
    val reportingComponent: Output_[String] = js.native
    
    /**
      * ID of the controller instance, e.g. `kubelet-xyzf`.
      */
    val reportingInstance: Output_[String] = js.native
    
    /**
      * Data about the Event series this event represents or nil if it's a singleton Event.
      */
    val series: Output_[EventSeries] = js.native
    
    /**
      * The component reporting this event. Should be a short machine understandable string.
      */
    val source: Output_[EventSource] = js.native
    
    /**
      * Type of this event (Normal, Warning), new types could be added in the future
      */
    val `type`: Output_[String] = js.native
  }
  /* static members */
  object Event {
    
    /**
      * Get an existing Event resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/core/v1/event", "Event.get")
    @js.native
    def get(name: String, id: Input[ID]): Event = js.native
    @JSImport("@pulumi/kubernetes/core/v1/event", "Event.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): Event = js.native
    
    /**
      * Returns true if the given object is an instance of Event.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/core/v1/event", "Event.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/core/v1/event.Event */ Boolean = js.native
  }
  
  @js.native
  trait EventArgs extends StObject {
    
    /**
      * What action was taken/failed regarding to the Regarding object.
      */
    val action: js.UndefOr[Input[String]] = js.native
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: js.UndefOr[Input[v1]] = js.native
    
    /**
      * The number of times this event has occurred.
      */
    val count: js.UndefOr[Input[Double]] = js.native
    
    /**
      * Time when this Event was first observed.
      */
    val eventTime: js.UndefOr[Input[String]] = js.native
    
    /**
      * The time at which the event was first recorded. (Time of server receipt is in TypeMeta.)
      */
    val firstTimestamp: js.UndefOr[Input[String]] = js.native
    
    /**
      * The object that this event is about.
      */
    val involvedObject: Input[typings.pulumiKubernetes.inputMod.core.v1.ObjectReference] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.Event]] = js.native
    
    /**
      * The time at which the most recent occurrence of this event was recorded.
      */
    val lastTimestamp: js.UndefOr[Input[String]] = js.native
    
    /**
      * A human-readable description of the status of this operation.
      */
    val message: js.UndefOr[Input[String]] = js.native
    
    /**
      * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    val metadata: Input[typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta] = js.native
    
    /**
      * This should be a short, machine understandable string that gives the reason for the transition into the object's current status.
      */
    val reason: js.UndefOr[Input[String]] = js.native
    
    /**
      * Optional secondary object for more complex actions.
      */
    val related: js.UndefOr[Input[typings.pulumiKubernetes.inputMod.core.v1.ObjectReference]] = js.native
    
    /**
      * Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
      */
    val reportingComponent: js.UndefOr[Input[String]] = js.native
    
    /**
      * ID of the controller instance, e.g. `kubelet-xyzf`.
      */
    val reportingInstance: js.UndefOr[Input[String]] = js.native
    
    /**
      * Data about the Event series this event represents or nil if it's a singleton Event.
      */
    val series: js.UndefOr[Input[typings.pulumiKubernetes.inputMod.core.v1.EventSeries]] = js.native
    
    /**
      * The component reporting this event. Should be a short machine understandable string.
      */
    val source: js.UndefOr[Input[typings.pulumiKubernetes.inputMod.core.v1.EventSource]] = js.native
    
    /**
      * Type of this event (Normal, Warning), new types could be added in the future
      */
    val `type`: js.UndefOr[Input[String]] = js.native
  }
  object EventArgs {
    
    @scala.inline
    def apply(
      involvedObject: Input[typings.pulumiKubernetes.inputMod.core.v1.ObjectReference],
      metadata: Input[typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]
    ): EventArgs = {
      val __obj = js.Dynamic.literal(involvedObject = involvedObject.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventArgs]
    }
    
    @scala.inline
    implicit class EventArgsMutableBuilder[Self <: EventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: Input[String]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setApiVersion(value: Input[v1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      @scala.inline
      def setCount(value: Input[Double]): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setEventTime(value: Input[String]): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventTimeUndefined: Self = StObject.set(x, "eventTime", js.undefined)
      
      @scala.inline
      def setFirstTimestamp(value: Input[String]): Self = StObject.set(x, "firstTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstTimestampUndefined: Self = StObject.set(x, "firstTimestamp", js.undefined)
      
      @scala.inline
      def setInvolvedObject(value: Input[typings.pulumiKubernetes.inputMod.core.v1.ObjectReference]): Self = StObject.set(x, "involvedObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.Event]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setLastTimestamp(value: Input[String]): Self = StObject.set(x, "lastTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastTimestampUndefined: Self = StObject.set(x, "lastTimestamp", js.undefined)
      
      @scala.inline
      def setMessage(value: Input[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setMetadata(value: Input[typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReason(value: Input[String]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      @scala.inline
      def setRelated(value: Input[typings.pulumiKubernetes.inputMod.core.v1.ObjectReference]): Self = StObject.set(x, "related", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelatedUndefined: Self = StObject.set(x, "related", js.undefined)
      
      @scala.inline
      def setReportingComponent(value: Input[String]): Self = StObject.set(x, "reportingComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportingComponentUndefined: Self = StObject.set(x, "reportingComponent", js.undefined)
      
      @scala.inline
      def setReportingInstance(value: Input[String]): Self = StObject.set(x, "reportingInstance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportingInstanceUndefined: Self = StObject.set(x, "reportingInstance", js.undefined)
      
      @scala.inline
      def setSeries(value: Input[typings.pulumiKubernetes.inputMod.core.v1.EventSeries]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
      
      @scala.inline
      def setSource(value: Input[typings.pulumiKubernetes.inputMod.core.v1.EventSource]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
