package typings.pulumiKubernetes

import typings.pulumiKubernetes.outputMod.core.v1.EventSource
import typings.pulumiKubernetes.outputMod.core.v1.ObjectReference
import typings.pulumiKubernetes.outputMod.events.v1.EventSeries
import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.eventsDotk8sDotioSlashv1
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1EventMod {
  
  @JSImport("@pulumi/kubernetes/events/v1/event", "Event")
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
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: EventArgs, opts: CustomResourceOptions) = this()
    
    /**
      * action is what action was taken/failed regarding to the regarding object. It is machine-readable. This field can have at most 128 characters.
      */
    val action: Output_[String] = js.native
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output_[eventsDotk8sDotioSlashv1] = js.native
    
    /**
      * deprecatedCount is the deprecated field assuring backward compatibility with core.v1 Event type.
      */
    val deprecatedCount: Output_[Double] = js.native
    
    /**
      * deprecatedFirstTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
      */
    val deprecatedFirstTimestamp: Output_[String] = js.native
    
    /**
      * deprecatedLastTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
      */
    val deprecatedLastTimestamp: Output_[String] = js.native
    
    /**
      * deprecatedSource is the deprecated field assuring backward compatibility with core.v1 Event type.
      */
    val deprecatedSource: Output_[EventSource] = js.native
    
    /**
      * eventTime is the time when this Event was first observed. It is required.
      */
    val eventTime: Output_[String] = js.native
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output_[typings.pulumiKubernetes.pulumiKubernetesStrings.Event] = js.native
    
    val metadata: Output_[ObjectMeta] = js.native
    
    /**
      * note is a human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB.
      */
    val note: Output_[String] = js.native
    
    /**
      * reason is why the action was taken. It is human-readable. This field can have at most 128 characters.
      */
    val reason: Output_[String] = js.native
    
    /**
      * regarding contains the object this Event is about. In most cases it's an Object reporting controller implements, e.g. ReplicaSetController implements ReplicaSets and this event is emitted because it acts on some changes in a ReplicaSet object.
      */
    val regarding: Output_[ObjectReference] = js.native
    
    /**
      * related is the optional secondary object for more complex actions. E.g. when regarding object triggers a creation or deletion of related object.
      */
    val related: Output_[ObjectReference] = js.native
    
    /**
      * reportingController is the name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`. This field cannot be empty for new Events.
      */
    val reportingController: Output_[String] = js.native
    
    /**
      * reportingInstance is the ID of the controller instance, e.g. `kubelet-xyzf`. This field cannot be empty for new Events and it can have at most 128 characters.
      */
    val reportingInstance: Output_[String] = js.native
    
    /**
      * series is data about the Event series this event represents or nil if it's a singleton Event.
      */
    val series: Output_[EventSeries] = js.native
    
    /**
      * type is the type of this event (Normal, Warning), new types could be added in the future. It is machine-readable.
      */
    val `type`: Output_[String] = js.native
  }
  /* static members */
  object Event {
    
    @JSImport("@pulumi/kubernetes/events/v1/event", "Event")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Event resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Event]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): Event = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Event]
    
    /**
      * Returns true if the given object is an instance of Event.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/events/v1/event.Event */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/events/v1/event.Event */ Boolean]
  }
  
  trait EventArgs extends StObject {
    
    /**
      * action is what action was taken/failed regarding to the regarding object. It is machine-readable. This field can have at most 128 characters.
      */
    val action: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: js.UndefOr[Input[eventsDotk8sDotioSlashv1]] = js.undefined
    
    /**
      * deprecatedCount is the deprecated field assuring backward compatibility with core.v1 Event type.
      */
    val deprecatedCount: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * deprecatedFirstTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
      */
    val deprecatedFirstTimestamp: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * deprecatedLastTimestamp is the deprecated field assuring backward compatibility with core.v1 Event type.
      */
    val deprecatedLastTimestamp: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * deprecatedSource is the deprecated field assuring backward compatibility with core.v1 Event type.
      */
    val deprecatedSource: js.UndefOr[Input[typings.pulumiKubernetes.inputMod.core.v1.EventSource]] = js.undefined
    
    /**
      * eventTime is the time when this Event was first observed. It is required.
      */
    val eventTime: Input[String]
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.Event]] = js.undefined
    
    val metadata: js.UndefOr[Input[typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]] = js.undefined
    
    /**
      * note is a human-readable description of the status of this operation. Maximal length of the note is 1kB, but libraries should be prepared to handle values up to 64kB.
      */
    val note: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * reason is why the action was taken. It is human-readable. This field can have at most 128 characters.
      */
    val reason: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * regarding contains the object this Event is about. In most cases it's an Object reporting controller implements, e.g. ReplicaSetController implements ReplicaSets and this event is emitted because it acts on some changes in a ReplicaSet object.
      */
    val regarding: js.UndefOr[Input[typings.pulumiKubernetes.inputMod.core.v1.ObjectReference]] = js.undefined
    
    /**
      * related is the optional secondary object for more complex actions. E.g. when regarding object triggers a creation or deletion of related object.
      */
    val related: js.UndefOr[Input[typings.pulumiKubernetes.inputMod.core.v1.ObjectReference]] = js.undefined
    
    /**
      * reportingController is the name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`. This field cannot be empty for new Events.
      */
    val reportingController: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * reportingInstance is the ID of the controller instance, e.g. `kubelet-xyzf`. This field cannot be empty for new Events and it can have at most 128 characters.
      */
    val reportingInstance: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * series is data about the Event series this event represents or nil if it's a singleton Event.
      */
    val series: js.UndefOr[Input[typings.pulumiKubernetes.inputMod.events.v1.EventSeries]] = js.undefined
    
    /**
      * type is the type of this event (Normal, Warning), new types could be added in the future. It is machine-readable.
      */
    val `type`: js.UndefOr[Input[String]] = js.undefined
  }
  object EventArgs {
    
    inline def apply(eventTime: Input[String]): EventArgs = {
      val __obj = js.Dynamic.literal(eventTime = eventTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventArgs]
    }
    
    extension [Self <: EventArgs](x: Self) {
      
      inline def setAction(value: Input[String]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setApiVersion(value: Input[eventsDotk8sDotioSlashv1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setDeprecatedCount(value: Input[Double]): Self = StObject.set(x, "deprecatedCount", value.asInstanceOf[js.Any])
      
      inline def setDeprecatedCountUndefined: Self = StObject.set(x, "deprecatedCount", js.undefined)
      
      inline def setDeprecatedFirstTimestamp(value: Input[String]): Self = StObject.set(x, "deprecatedFirstTimestamp", value.asInstanceOf[js.Any])
      
      inline def setDeprecatedFirstTimestampUndefined: Self = StObject.set(x, "deprecatedFirstTimestamp", js.undefined)
      
      inline def setDeprecatedLastTimestamp(value: Input[String]): Self = StObject.set(x, "deprecatedLastTimestamp", value.asInstanceOf[js.Any])
      
      inline def setDeprecatedLastTimestampUndefined: Self = StObject.set(x, "deprecatedLastTimestamp", js.undefined)
      
      inline def setDeprecatedSource(value: Input[typings.pulumiKubernetes.inputMod.core.v1.EventSource]): Self = StObject.set(x, "deprecatedSource", value.asInstanceOf[js.Any])
      
      inline def setDeprecatedSourceUndefined: Self = StObject.set(x, "deprecatedSource", js.undefined)
      
      inline def setEventTime(value: Input[String]): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
      
      inline def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.Event]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMetadata(value: Input[typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setNote(value: Input[String]): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
      
      inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
      
      inline def setReason(value: Input[String]): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setRegarding(value: Input[typings.pulumiKubernetes.inputMod.core.v1.ObjectReference]): Self = StObject.set(x, "regarding", value.asInstanceOf[js.Any])
      
      inline def setRegardingUndefined: Self = StObject.set(x, "regarding", js.undefined)
      
      inline def setRelated(value: Input[typings.pulumiKubernetes.inputMod.core.v1.ObjectReference]): Self = StObject.set(x, "related", value.asInstanceOf[js.Any])
      
      inline def setRelatedUndefined: Self = StObject.set(x, "related", js.undefined)
      
      inline def setReportingController(value: Input[String]): Self = StObject.set(x, "reportingController", value.asInstanceOf[js.Any])
      
      inline def setReportingControllerUndefined: Self = StObject.set(x, "reportingController", js.undefined)
      
      inline def setReportingInstance(value: Input[String]): Self = StObject.set(x, "reportingInstance", value.asInstanceOf[js.Any])
      
      inline def setReportingInstanceUndefined: Self = StObject.set(x, "reportingInstance", js.undefined)
      
      inline def setSeries(value: Input[typings.pulumiKubernetes.inputMod.events.v1.EventSeries]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
      
      inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
      
      inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
