package typings.atPulumiKubernetes.typesInputMod

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`autoscaling/v1`
import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`autoscaling/v2beta1`
import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`autoscaling/v2beta2`
import typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v1Ns.CrossVersionObjectReference
import typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v1Ns.HorizontalPodAutoscaler
import typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v1Ns.HorizontalPodAutoscalerSpec
import typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v1Ns.HorizontalPodAutoscalerStatus
import typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v1Ns.ScaleSpec
import typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v1Ns.ScaleStatus
import typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v2beta1Ns.ExternalMetricSource
import typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v2beta1Ns.ExternalMetricStatus
import typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v2beta1Ns.HorizontalPodAutoscalerCondition
import typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v2beta1Ns.MetricSpec
import typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v2beta1Ns.MetricStatus
import typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v2beta1Ns.ObjectMetricSource
import typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v2beta1Ns.ObjectMetricStatus
import typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v2beta1Ns.PodsMetricSource
import typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v2beta1Ns.PodsMetricStatus
import typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v2beta1Ns.ResourceMetricSource
import typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v2beta1Ns.ResourceMetricStatus
import typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v2beta2Ns.MetricIdentifier
import typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v2beta2Ns.MetricTarget
import typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v2beta2Ns.MetricValueStatus
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.LabelSelector
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.ListMeta
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.ObjectMeta
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/types/input", "autoscaling")
@js.native
object autoscalingNs extends js.Object {
  @JSName("v1")
  @js.native
  object v1Ns extends js.Object {
    /**
      * CrossVersionObjectReference contains enough information to let you identify the referred
      * resource.
      */
    trait CrossVersionObjectReference extends js.Object {
      /**
        * API version of the referent
        */
      var apiVersion: js.UndefOr[Input[String]] = js.undefined
      /**
        * Kind of the referent; More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds"
        */
      var kind: Input[String]
      /**
        * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
        */
      var name: Input[String]
    }
    
    /**
      * configuration of a horizontal pod autoscaler.
      */
    trait HorizontalPodAutoscaler extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`autoscaling/v1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.HorizontalPodAutoscaler]
          ] = js.undefined
      /**
        * Standard object metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * behaviour of autoscaler. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
        */
      var spec: js.UndefOr[Input[HorizontalPodAutoscalerSpec]] = js.undefined
      /**
        * current information about the autoscaler.
        */
      var status: js.UndefOr[Input[HorizontalPodAutoscalerStatus]] = js.undefined
    }
    
    /**
      * list of horizontal pod autoscaler objects.
      */
    trait HorizontalPodAutoscalerList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`autoscaling/v1`]] = js.undefined
      /**
        * list of horizontal pod autoscaler objects.
        */
      var items: Input[js.Array[Input[HorizontalPodAutoscaler]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.HorizontalPodAutoscalerList]
          ] = js.undefined
      /**
        * Standard list metadata.
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
    }
    
    /**
      * specification of a horizontal pod autoscaler.
      */
    trait HorizontalPodAutoscalerSpec extends js.Object {
      /**
        * upper limit for the number of pods that can be set by the autoscaler; cannot be smaller
        * than MinReplicas.
        */
      var maxReplicas: Input[Double]
      /**
        * lower limit for the number of pods that can be set by the autoscaler, default 1.
        */
      var minReplicas: js.UndefOr[Input[Double]] = js.undefined
      /**
        * reference to scaled resource; horizontal pod autoscaler will learn the current resource
        * consumption and will set the desired number of pods by using its Scale subresource.
        */
      var scaleTargetRef: Input[CrossVersionObjectReference]
      /**
        * target average CPU utilization (represented as a percentage of requested CPU) over all the
        * pods; if not specified the default autoscaling policy will be used.
        */
      var targetCPUUtilizationPercentage: js.UndefOr[Input[Double]] = js.undefined
    }
    
    /**
      * current status of a horizontal pod autoscaler
      */
    trait HorizontalPodAutoscalerStatus extends js.Object {
      /**
        * current average CPU utilization over all pods, represented as a percentage of requested
        * CPU, e.g. 70 means that an average pod is using now 70% of its requested CPU.
        */
      var currentCPUUtilizationPercentage: js.UndefOr[Input[Double]] = js.undefined
      /**
        * current number of replicas of pods managed by this autoscaler.
        */
      var currentReplicas: Input[Double]
      /**
        * desired number of replicas of pods managed by this autoscaler.
        */
      var desiredReplicas: Input[Double]
      /**
        * last time the HorizontalPodAutoscaler scaled the number of pods; used by the autoscaler to
        * control how often the number of pods is changed.
        */
      var lastScaleTime: js.UndefOr[Input[String]] = js.undefined
      /**
        * most recent generation observed by this autoscaler.
        */
      var observedGeneration: js.UndefOr[Input[Double]] = js.undefined
    }
    
    /**
      * Scale represents a scaling request for a resource.
      */
    trait Scale extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[String]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[String]] = js.undefined
      /**
        * Standard object metadata; More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * defines the behavior of the scale. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
        */
      var spec: js.UndefOr[Input[ScaleSpec]] = js.undefined
      /**
        * current status of the scale. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
        * Read-only.
        */
      var status: js.UndefOr[Input[ScaleStatus]] = js.undefined
    }
    
    /**
      * ScaleSpec describes the attributes of a scale subresource.
      */
    trait ScaleSpec extends js.Object {
      /**
        * desired number of instances for the scaled object.
        */
      var replicas: js.UndefOr[Input[Double]] = js.undefined
    }
    
    /**
      * ScaleStatus represents the current status of a scale subresource.
      */
    trait ScaleStatus extends js.Object {
      /**
        * actual number of observed instances of the scaled object.
        */
      var replicas: Input[Double]
      /**
        * label query over pods that should match the replicas count. This is same as the label
        * selector but in the string format to avoid introspection by clients. The string will be in
        * the same format as the query-param syntax. More info about label selectors:
        * http://kubernetes.io/docs/user-guide/labels#label-selectors
        */
      var selector: js.UndefOr[Input[String]] = js.undefined
    }
    
    def isCrossVersionObjectReference(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.autoscaling.v1.CrossVersionObjectReference */ Boolean = js.native
    def isHorizontalPodAutoscaler(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.autoscaling.v1.HorizontalPodAutoscaler */ Boolean = js.native
    def isHorizontalPodAutoscalerList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.autoscaling.v1.HorizontalPodAutoscalerList */ Boolean = js.native
    def isScale(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.autoscaling.v1.Scale */ Boolean = js.native
  }
  
  @JSName("v2beta1")
  @js.native
  object v2beta1Ns extends js.Object {
    /**
      * CrossVersionObjectReference contains enough information to let you identify the referred
      * resource.
      */
    trait CrossVersionObjectReference extends js.Object {
      /**
        * API version of the referent
        */
      var apiVersion: js.UndefOr[Input[String]] = js.undefined
      /**
        * Kind of the referent; More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds"
        */
      var kind: Input[String]
      /**
        * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
        */
      var name: Input[String]
    }
    
    /**
      * ExternalMetricSource indicates how to scale on a metric not associated with any Kubernetes
      * object (for example length of queue in cloud messaging service, or QPS from loadbalancer
      * running outside of cluster). Exactly one "target" type should be set.
      */
    trait ExternalMetricSource extends js.Object {
      /**
        * metricName is the name of the metric in question.
        */
      var metricName: Input[String]
      /**
        * metricSelector is used to identify a specific time series within a given metric.
        */
      var metricSelector: js.UndefOr[Input[LabelSelector]] = js.undefined
      /**
        * targetAverageValue is the target per-pod value of global metric (as a quantity). Mutually
        * exclusive with TargetValue.
        */
      var targetAverageValue: js.UndefOr[Input[String]] = js.undefined
      /**
        * targetValue is the target value of the metric (as a quantity). Mutually exclusive with
        * TargetAverageValue.
        */
      var targetValue: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * ExternalMetricStatus indicates the current value of a global metric not associated with any
      * Kubernetes object.
      */
    trait ExternalMetricStatus extends js.Object {
      /**
        * currentAverageValue is the current value of metric averaged over autoscaled pods.
        */
      var currentAverageValue: js.UndefOr[Input[String]] = js.undefined
      /**
        * currentValue is the current value of the metric (as a quantity)
        */
      var currentValue: Input[String]
      /**
        * metricName is the name of a metric used for autoscaling in metric system.
        */
      var metricName: Input[String]
      /**
        * metricSelector is used to identify a specific time series within a given metric.
        */
      var metricSelector: js.UndefOr[Input[LabelSelector]] = js.undefined
    }
    
    /**
      * HorizontalPodAutoscaler is the configuration for a horizontal pod autoscaler, which
      * automatically manages the replica count of any resource implementing the scale subresource
      * based on the metrics specified.
      */
    trait HorizontalPodAutoscaler extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`autoscaling/v2beta1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.HorizontalPodAutoscaler]
          ] = js.undefined
      /**
        * metadata is the standard object metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * spec is the specification for the behaviour of the autoscaler. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
        */
      var spec: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v2beta1Ns.HorizontalPodAutoscalerSpec
            ]
          ] = js.undefined
      /**
        * status is the current information about the autoscaler.
        */
      var status: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v2beta1Ns.HorizontalPodAutoscalerStatus
            ]
          ] = js.undefined
    }
    
    /**
      * HorizontalPodAutoscalerCondition describes the state of a HorizontalPodAutoscaler at a
      * certain point.
      */
    trait HorizontalPodAutoscalerCondition extends js.Object {
      /**
        * lastTransitionTime is the last time the condition transitioned from one status to another
        */
      var lastTransitionTime: js.UndefOr[Input[String]] = js.undefined
      /**
        * message is a human-readable explanation containing details about the transition
        */
      var message: js.UndefOr[Input[String]] = js.undefined
      /**
        * reason is the reason for the condition's last transition.
        */
      var reason: js.UndefOr[Input[String]] = js.undefined
      /**
        * status is the status of the condition (True, False, Unknown)
        */
      var status: Input[String]
      /**
        * type describes the current condition
        */
      var `type`: Input[String]
    }
    
    /**
      * HorizontalPodAutoscaler is a list of horizontal pod autoscaler objects.
      */
    trait HorizontalPodAutoscalerList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`autoscaling/v2beta1`]] = js.undefined
      /**
        * items is the list of horizontal pod autoscaler objects.
        */
      var items: Input[
            js.Array[
              Input[
                typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v2beta1Ns.HorizontalPodAutoscaler
              ]
            ]
          ]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.HorizontalPodAutoscalerList]
          ] = js.undefined
      /**
        * metadata is the standard list metadata.
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
    }
    
    /**
      * HorizontalPodAutoscalerSpec describes the desired functionality of the
      * HorizontalPodAutoscaler.
      */
    trait HorizontalPodAutoscalerSpec extends js.Object {
      /**
        * maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale
        * up. It cannot be less that minReplicas.
        */
      var maxReplicas: Input[Double]
      /**
        * metrics contains the specifications for which to use to calculate the desired replica count
        * (the maximum replica count across all metrics will be used).  The desired replica count is
        * calculated multiplying the ratio between the target value and the current value by the
        * current number of pods.  Ergo, metrics used must decrease as the pod count is increased,
        * and vice-versa.  See the individual metric source types for more information about how each
        * type of metric must respond.
        */
      var metrics: js.UndefOr[Input[js.Array[Input[MetricSpec]]]] = js.undefined
      /**
        * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale
        * down. It defaults to 1 pod.
        */
      var minReplicas: js.UndefOr[Input[Double]] = js.undefined
      /**
        * scaleTargetRef points to the target resource to scale, and is used to the pods for which
        * metrics should be collected, as well as to actually change the replica count.
        */
      var scaleTargetRef: Input[
            typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v2beta1Ns.CrossVersionObjectReference
          ]
    }
    
    /**
      * HorizontalPodAutoscalerStatus describes the current status of a horizontal pod autoscaler.
      */
    trait HorizontalPodAutoscalerStatus extends js.Object {
      /**
        * conditions is the set of conditions required for this autoscaler to scale its target, and
        * indicates whether or not those conditions are met.
        */
      var conditions: Input[js.Array[Input[HorizontalPodAutoscalerCondition]]]
      /**
        * currentMetrics is the last read state of the metrics used by this autoscaler.
        */
      var currentMetrics: js.UndefOr[Input[js.Array[Input[MetricStatus]]]] = js.undefined
      /**
        * currentReplicas is current number of replicas of pods managed by this autoscaler, as last
        * seen by the autoscaler.
        */
      var currentReplicas: Input[Double]
      /**
        * desiredReplicas is the desired number of replicas of pods managed by this autoscaler, as
        * last calculated by the autoscaler.
        */
      var desiredReplicas: Input[Double]
      /**
        * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods, used
        * by the autoscaler to control how often the number of pods is changed.
        */
      var lastScaleTime: js.UndefOr[Input[String]] = js.undefined
      /**
        * observedGeneration is the most recent generation observed by this autoscaler.
        */
      var observedGeneration: js.UndefOr[Input[Double]] = js.undefined
    }
    
    /**
      * MetricSpec specifies how to scale based on a single metric (only `type` and one other
      * matching field should be set at once).
      */
    trait MetricSpec extends js.Object {
      /**
        * external refers to a global metric that is not associated with any Kubernetes object. It
        * allows autoscaling based on information coming from components running outside of cluster
        * (for example length of queue in cloud messaging service, or QPS from loadbalancer running
        * outside of cluster).
        */
      var external: js.UndefOr[Input[ExternalMetricSource]] = js.undefined
      /**
        * object refers to a metric describing a single kubernetes object (for example,
        * hits-per-second on an Ingress object).
        */
      var `object`: js.UndefOr[Input[ObjectMetricSource]] = js.undefined
      /**
        * pods refers to a metric describing each pod in the current scale target (for example,
        * transactions-processed-per-second).  The values will be averaged together before being
        * compared to the target value.
        */
      var pods: js.UndefOr[Input[PodsMetricSource]] = js.undefined
      /**
        * resource refers to a resource metric (such as those specified in requests and limits) known
        * to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such
        * metrics are built in to Kubernetes, and have special scaling options on top of those
        * available to normal per-pod metrics using the "pods" source.
        */
      var resource: js.UndefOr[Input[ResourceMetricSource]] = js.undefined
      /**
        * type is the type of metric source.  It should be one of "Object", "Pods" or "Resource",
        * each mapping to a matching field in the object.
        */
      var `type`: Input[String]
    }
    
    /**
      * MetricStatus describes the last-read state of a single metric.
      */
    trait MetricStatus extends js.Object {
      /**
        * external refers to a global metric that is not associated with any Kubernetes object. It
        * allows autoscaling based on information coming from components running outside of cluster
        * (for example length of queue in cloud messaging service, or QPS from loadbalancer running
        * outside of cluster).
        */
      var external: js.UndefOr[Input[ExternalMetricStatus]] = js.undefined
      /**
        * object refers to a metric describing a single kubernetes object (for example,
        * hits-per-second on an Ingress object).
        */
      var `object`: js.UndefOr[Input[ObjectMetricStatus]] = js.undefined
      /**
        * pods refers to a metric describing each pod in the current scale target (for example,
        * transactions-processed-per-second).  The values will be averaged together before being
        * compared to the target value.
        */
      var pods: js.UndefOr[Input[PodsMetricStatus]] = js.undefined
      /**
        * resource refers to a resource metric (such as those specified in requests and limits) known
        * to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such
        * metrics are built in to Kubernetes, and have special scaling options on top of those
        * available to normal per-pod metrics using the "pods" source.
        */
      var resource: js.UndefOr[Input[ResourceMetricStatus]] = js.undefined
      /**
        * type is the type of metric source.  It will be one of "Object", "Pods" or "Resource", each
        * corresponds to a matching field in the object.
        */
      var `type`: Input[String]
    }
    
    /**
      * ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for
      * example, hits-per-second on an Ingress object).
      */
    trait ObjectMetricSource extends js.Object {
      /**
        * averageValue is the target value of the average of the metric across all relevant pods (as
        * a quantity)
        */
      var averageValue: js.UndefOr[Input[String]] = js.undefined
      /**
        * metricName is the name of the metric in question.
        */
      var metricName: Input[String]
      /**
        * selector is the string-encoded form of a standard kubernetes label selector for the given
        * metric When set, it is passed as an additional parameter to the metrics server for more
        * specific metrics scoping When unset, just the metricName will be used to gather metrics.
        */
      var selector: js.UndefOr[Input[LabelSelector]] = js.undefined
      /**
        * target is the described Kubernetes object.
        */
      var target: Input[
            typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v2beta1Ns.CrossVersionObjectReference
          ]
      /**
        * targetValue is the target value of the metric (as a quantity).
        */
      var targetValue: Input[String]
    }
    
    /**
      * ObjectMetricStatus indicates the current value of a metric describing a kubernetes object
      * (for example, hits-per-second on an Ingress object).
      */
    trait ObjectMetricStatus extends js.Object {
      /**
        * averageValue is the current value of the average of the metric across all relevant pods (as
        * a quantity)
        */
      var averageValue: js.UndefOr[Input[String]] = js.undefined
      /**
        * currentValue is the current value of the metric (as a quantity).
        */
      var currentValue: Input[String]
      /**
        * metricName is the name of the metric in question.
        */
      var metricName: Input[String]
      /**
        * selector is the string-encoded form of a standard kubernetes label selector for the given
        * metric When set in the ObjectMetricSource, it is passed as an additional parameter to the
        * metrics server for more specific metrics scoping. When unset, just the metricName will be
        * used to gather metrics.
        */
      var selector: js.UndefOr[Input[LabelSelector]] = js.undefined
      /**
        * target is the described Kubernetes object.
        */
      var target: Input[
            typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v2beta1Ns.CrossVersionObjectReference
          ]
    }
    
    /**
      * PodsMetricSource indicates how to scale on a metric describing each pod in the current scale
      * target (for example, transactions-processed-per-second). The values will be averaged together
      * before being compared to the target value.
      */
    trait PodsMetricSource extends js.Object {
      /**
        * metricName is the name of the metric in question
        */
      var metricName: Input[String]
      /**
        * selector is the string-encoded form of a standard kubernetes label selector for the given
        * metric When set, it is passed as an additional parameter to the metrics server for more
        * specific metrics scoping When unset, just the metricName will be used to gather metrics.
        */
      var selector: js.UndefOr[Input[LabelSelector]] = js.undefined
      /**
        * targetAverageValue is the target value of the average of the metric across all relevant
        * pods (as a quantity)
        */
      var targetAverageValue: Input[String]
    }
    
    /**
      * PodsMetricStatus indicates the current value of a metric describing each pod in the current
      * scale target (for example, transactions-processed-per-second).
      */
    trait PodsMetricStatus extends js.Object {
      /**
        * currentAverageValue is the current value of the average of the metric across all relevant
        * pods (as a quantity)
        */
      var currentAverageValue: Input[String]
      /**
        * metricName is the name of the metric in question
        */
      var metricName: Input[String]
      /**
        * selector is the string-encoded form of a standard kubernetes label selector for the given
        * metric When set in the PodsMetricSource, it is passed as an additional parameter to the
        * metrics server for more specific metrics scoping. When unset, just the metricName will be
        * used to gather metrics.
        */
      var selector: js.UndefOr[Input[LabelSelector]] = js.undefined
    }
    
    /**
      * ResourceMetricSource indicates how to scale on a resource metric known to Kubernetes, as
      * specified in requests and limits, describing each pod in the current scale target (e.g. CPU
      * or memory).  The values will be averaged together before being compared to the target.  Such
      * metrics are built in to Kubernetes, and have special scaling options on top of those
      * available to normal per-pod metrics using the "pods" source.  Only one "target" type should
      * be set.
      */
    trait ResourceMetricSource extends js.Object {
      /**
        * name is the name of the resource in question.
        */
      var name: Input[String]
      /**
        * targetAverageUtilization is the target value of the average of the resource metric across
        * all relevant pods, represented as a percentage of the requested value of the resource for
        * the pods.
        */
      var targetAverageUtilization: js.UndefOr[Input[Double]] = js.undefined
      /**
        * targetAverageValue is the target value of the average of the resource metric across all
        * relevant pods, as a raw value (instead of as a percentage of the request), similar to the
        * "pods" metric source type.
        */
      var targetAverageValue: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * ResourceMetricStatus indicates the current value of a resource metric known to Kubernetes, as
      * specified in requests and limits, describing each pod in the current scale target (e.g. CPU
      * or memory).  Such metrics are built in to Kubernetes, and have special scaling options on top
      * of those available to normal per-pod metrics using the "pods" source.
      */
    trait ResourceMetricStatus extends js.Object {
      /**
        * currentAverageUtilization is the current value of the average of the resource metric across
        * all relevant pods, represented as a percentage of the requested value of the resource for
        * the pods.  It will only be present if `targetAverageValue` was set in the corresponding
        * metric specification.
        */
      var currentAverageUtilization: js.UndefOr[Input[Double]] = js.undefined
      /**
        * currentAverageValue is the current value of the average of the resource metric across all
        * relevant pods, as a raw value (instead of as a percentage of the request), similar to the
        * "pods" metric source type. It will always be set, regardless of the corresponding metric
        * specification.
        */
      var currentAverageValue: Input[String]
      /**
        * name is the name of the resource in question.
        */
      var name: Input[String]
    }
    
    def isCrossVersionObjectReference(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.autoscaling.v2beta1.CrossVersionObjectReference */ Boolean = js.native
    def isHorizontalPodAutoscaler(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.autoscaling.v2beta1.HorizontalPodAutoscaler */ Boolean = js.native
    def isHorizontalPodAutoscalerList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.autoscaling.v2beta1.HorizontalPodAutoscalerList */ Boolean = js.native
  }
  
  @JSName("v2beta2")
  @js.native
  object v2beta2Ns extends js.Object {
    /**
      * CrossVersionObjectReference contains enough information to let you identify the referred
      * resource.
      */
    trait CrossVersionObjectReference extends js.Object {
      /**
        * API version of the referent
        */
      var apiVersion: js.UndefOr[Input[String]] = js.undefined
      /**
        * Kind of the referent; More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds"
        */
      var kind: Input[String]
      /**
        * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
        */
      var name: Input[String]
    }
    
    /**
      * ExternalMetricSource indicates how to scale on a metric not associated with any Kubernetes
      * object (for example length of queue in cloud messaging service, or QPS from loadbalancer
      * running outside of cluster).
      */
    trait ExternalMetricSource extends js.Object {
      /**
        * metric identifies the target metric by name and selector
        */
      var metric: Input[MetricIdentifier]
      /**
        * target specifies the target value for the given metric
        */
      var target: Input[MetricTarget]
    }
    
    /**
      * ExternalMetricStatus indicates the current value of a global metric not associated with any
      * Kubernetes object.
      */
    trait ExternalMetricStatus extends js.Object {
      /**
        * current contains the current value for the given metric
        */
      var current: Input[MetricValueStatus]
      /**
        * metric identifies the target metric by name and selector
        */
      var metric: Input[MetricIdentifier]
    }
    
    /**
      * HorizontalPodAutoscaler is the configuration for a horizontal pod autoscaler, which
      * automatically manages the replica count of any resource implementing the scale subresource
      * based on the metrics specified.
      */
    trait HorizontalPodAutoscaler extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`autoscaling/v2beta2`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.HorizontalPodAutoscaler]
          ] = js.undefined
      /**
        * metadata is the standard object metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * spec is the specification for the behaviour of the autoscaler. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
        */
      var spec: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscalerSpec
            ]
          ] = js.undefined
      /**
        * status is the current information about the autoscaler.
        */
      var status: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscalerStatus
            ]
          ] = js.undefined
    }
    
    /**
      * HorizontalPodAutoscalerCondition describes the state of a HorizontalPodAutoscaler at a
      * certain point.
      */
    trait HorizontalPodAutoscalerCondition extends js.Object {
      /**
        * lastTransitionTime is the last time the condition transitioned from one status to another
        */
      var lastTransitionTime: js.UndefOr[Input[String]] = js.undefined
      /**
        * message is a human-readable explanation containing details about the transition
        */
      var message: js.UndefOr[Input[String]] = js.undefined
      /**
        * reason is the reason for the condition's last transition.
        */
      var reason: js.UndefOr[Input[String]] = js.undefined
      /**
        * status is the status of the condition (True, False, Unknown)
        */
      var status: Input[String]
      /**
        * type describes the current condition
        */
      var `type`: Input[String]
    }
    
    /**
      * HorizontalPodAutoscalerList is a list of horizontal pod autoscaler objects.
      */
    trait HorizontalPodAutoscalerList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`autoscaling/v2beta2`]] = js.undefined
      /**
        * items is the list of horizontal pod autoscaler objects.
        */
      var items: Input[
            js.Array[
              Input[
                typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscaler
              ]
            ]
          ]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.HorizontalPodAutoscalerList]
          ] = js.undefined
      /**
        * metadata is the standard list metadata.
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
    }
    
    /**
      * HorizontalPodAutoscalerSpec describes the desired functionality of the
      * HorizontalPodAutoscaler.
      */
    trait HorizontalPodAutoscalerSpec extends js.Object {
      /**
        * maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale
        * up. It cannot be less that minReplicas.
        */
      var maxReplicas: Input[Double]
      /**
        * metrics contains the specifications for which to use to calculate the desired replica count
        * (the maximum replica count across all metrics will be used).  The desired replica count is
        * calculated multiplying the ratio between the target value and the current value by the
        * current number of pods.  Ergo, metrics used must decrease as the pod count is increased,
        * and vice-versa.  See the individual metric source types for more information about how each
        * type of metric must respond. If not set, the default metric will be set to 80% average CPU
        * utilization.
        */
      var metrics: js.UndefOr[
            Input[
              js.Array[
                Input[typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v2beta2Ns.MetricSpec]
              ]
            ]
          ] = js.undefined
      /**
        * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale
        * down. It defaults to 1 pod.
        */
      var minReplicas: js.UndefOr[Input[Double]] = js.undefined
      /**
        * scaleTargetRef points to the target resource to scale, and is used to the pods for which
        * metrics should be collected, as well as to actually change the replica count.
        */
      var scaleTargetRef: Input[
            typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v2beta2Ns.CrossVersionObjectReference
          ]
    }
    
    /**
      * HorizontalPodAutoscalerStatus describes the current status of a horizontal pod autoscaler.
      */
    trait HorizontalPodAutoscalerStatus extends js.Object {
      /**
        * conditions is the set of conditions required for this autoscaler to scale its target, and
        * indicates whether or not those conditions are met.
        */
      var conditions: Input[
            js.Array[
              Input[
                typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscalerCondition
              ]
            ]
          ]
      /**
        * currentMetrics is the last read state of the metrics used by this autoscaler.
        */
      var currentMetrics: js.UndefOr[
            Input[
              js.Array[
                Input[typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v2beta2Ns.MetricStatus]
              ]
            ]
          ] = js.undefined
      /**
        * currentReplicas is current number of replicas of pods managed by this autoscaler, as last
        * seen by the autoscaler.
        */
      var currentReplicas: Input[Double]
      /**
        * desiredReplicas is the desired number of replicas of pods managed by this autoscaler, as
        * last calculated by the autoscaler.
        */
      var desiredReplicas: Input[Double]
      /**
        * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods, used
        * by the autoscaler to control how often the number of pods is changed.
        */
      var lastScaleTime: js.UndefOr[Input[String]] = js.undefined
      /**
        * observedGeneration is the most recent generation observed by this autoscaler.
        */
      var observedGeneration: js.UndefOr[Input[Double]] = js.undefined
    }
    
    /**
      * MetricIdentifier defines the name and optionally selector for a metric
      */
    trait MetricIdentifier extends js.Object {
      /**
        * name is the name of the given metric
        */
      var name: Input[String]
      /**
        * selector is the string-encoded form of a standard kubernetes label selector for the given
        * metric When set, it is passed as an additional parameter to the metrics server for more
        * specific metrics scoping. When unset, just the metricName will be used to gather metrics.
        */
      var selector: js.UndefOr[Input[LabelSelector]] = js.undefined
    }
    
    /**
      * MetricSpec specifies how to scale based on a single metric (only `type` and one other
      * matching field should be set at once).
      */
    trait MetricSpec extends js.Object {
      /**
        * external refers to a global metric that is not associated with any Kubernetes object. It
        * allows autoscaling based on information coming from components running outside of cluster
        * (for example length of queue in cloud messaging service, or QPS from loadbalancer running
        * outside of cluster).
        */
      var external: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v2beta2Ns.ExternalMetricSource
            ]
          ] = js.undefined
      /**
        * object refers to a metric describing a single kubernetes object (for example,
        * hits-per-second on an Ingress object).
        */
      var `object`: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v2beta2Ns.ObjectMetricSource
            ]
          ] = js.undefined
      /**
        * pods refers to a metric describing each pod in the current scale target (for example,
        * transactions-processed-per-second).  The values will be averaged together before being
        * compared to the target value.
        */
      var pods: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v2beta2Ns.PodsMetricSource
            ]
          ] = js.undefined
      /**
        * resource refers to a resource metric (such as those specified in requests and limits) known
        * to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such
        * metrics are built in to Kubernetes, and have special scaling options on top of those
        * available to normal per-pod metrics using the "pods" source.
        */
      var resource: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v2beta2Ns.ResourceMetricSource
            ]
          ] = js.undefined
      /**
        * type is the type of metric source.  It should be one of "Object", "Pods" or "Resource",
        * each mapping to a matching field in the object.
        */
      var `type`: Input[String]
    }
    
    /**
      * MetricStatus describes the last-read state of a single metric.
      */
    trait MetricStatus extends js.Object {
      /**
        * external refers to a global metric that is not associated with any Kubernetes object. It
        * allows autoscaling based on information coming from components running outside of cluster
        * (for example length of queue in cloud messaging service, or QPS from loadbalancer running
        * outside of cluster).
        */
      var external: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v2beta2Ns.ExternalMetricStatus
            ]
          ] = js.undefined
      /**
        * object refers to a metric describing a single kubernetes object (for example,
        * hits-per-second on an Ingress object).
        */
      var `object`: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v2beta2Ns.ObjectMetricStatus
            ]
          ] = js.undefined
      /**
        * pods refers to a metric describing each pod in the current scale target (for example,
        * transactions-processed-per-second).  The values will be averaged together before being
        * compared to the target value.
        */
      var pods: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v2beta2Ns.PodsMetricStatus
            ]
          ] = js.undefined
      /**
        * resource refers to a resource metric (such as those specified in requests and limits) known
        * to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such
        * metrics are built in to Kubernetes, and have special scaling options on top of those
        * available to normal per-pod metrics using the "pods" source.
        */
      var resource: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v2beta2Ns.ResourceMetricStatus
            ]
          ] = js.undefined
      /**
        * type is the type of metric source.  It will be one of "Object", "Pods" or "Resource", each
        * corresponds to a matching field in the object.
        */
      var `type`: Input[String]
    }
    
    /**
      * MetricTarget defines the target value, average value, or average utilization of a specific
      * metric
      */
    trait MetricTarget extends js.Object {
      /**
        * averageUtilization is the target value of the average of the resource metric across all
        * relevant pods, represented as a percentage of the requested value of the resource for the
        * pods. Currently only valid for Resource metric source type
        */
      var averageUtilization: js.UndefOr[Input[Double]] = js.undefined
      /**
        * averageValue is the target value of the average of the metric across all relevant pods (as
        * a quantity)
        */
      var averageValue: js.UndefOr[Input[String]] = js.undefined
      /**
        * type represents whether the metric type is Utilization, Value, or AverageValue
        */
      var `type`: Input[String]
      /**
        * value is the target value of the metric (as a quantity).
        */
      var value: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * MetricValueStatus holds the current value for a metric
      */
    trait MetricValueStatus extends js.Object {
      /**
        * currentAverageUtilization is the current value of the average of the resource metric across
        * all relevant pods, represented as a percentage of the requested value of the resource for
        * the pods.
        */
      var averageUtilization: js.UndefOr[Input[Double]] = js.undefined
      /**
        * averageValue is the current value of the average of the metric across all relevant pods (as
        * a quantity)
        */
      var averageValue: js.UndefOr[Input[String]] = js.undefined
      /**
        * value is the current value of the metric (as a quantity).
        */
      var value: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for
      * example, hits-per-second on an Ingress object).
      */
    trait ObjectMetricSource extends js.Object {
      var describedObject: Input[
            typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v2beta2Ns.CrossVersionObjectReference
          ]
      /**
        * metric identifies the target metric by name and selector
        */
      var metric: Input[MetricIdentifier]
      /**
        * target specifies the target value for the given metric
        */
      var target: Input[MetricTarget]
    }
    
    /**
      * ObjectMetricStatus indicates the current value of a metric describing a kubernetes object
      * (for example, hits-per-second on an Ingress object).
      */
    trait ObjectMetricStatus extends js.Object {
      /**
        * current contains the current value for the given metric
        */
      var current: Input[MetricValueStatus]
      var describedObject: Input[
            typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v2beta2Ns.CrossVersionObjectReference
          ]
      /**
        * metric identifies the target metric by name and selector
        */
      var metric: Input[MetricIdentifier]
    }
    
    /**
      * PodsMetricSource indicates how to scale on a metric describing each pod in the current scale
      * target (for example, transactions-processed-per-second). The values will be averaged together
      * before being compared to the target value.
      */
    trait PodsMetricSource extends js.Object {
      /**
        * metric identifies the target metric by name and selector
        */
      var metric: Input[MetricIdentifier]
      /**
        * target specifies the target value for the given metric
        */
      var target: Input[MetricTarget]
    }
    
    /**
      * PodsMetricStatus indicates the current value of a metric describing each pod in the current
      * scale target (for example, transactions-processed-per-second).
      */
    trait PodsMetricStatus extends js.Object {
      /**
        * current contains the current value for the given metric
        */
      var current: Input[MetricValueStatus]
      /**
        * metric identifies the target metric by name and selector
        */
      var metric: Input[MetricIdentifier]
    }
    
    /**
      * ResourceMetricSource indicates how to scale on a resource metric known to Kubernetes, as
      * specified in requests and limits, describing each pod in the current scale target (e.g. CPU
      * or memory).  The values will be averaged together before being compared to the target.  Such
      * metrics are built in to Kubernetes, and have special scaling options on top of those
      * available to normal per-pod metrics using the "pods" source.  Only one "target" type should
      * be set.
      */
    trait ResourceMetricSource extends js.Object {
      /**
        * name is the name of the resource in question.
        */
      var name: Input[String]
      /**
        * target specifies the target value for the given metric
        */
      var target: Input[MetricTarget]
    }
    
    /**
      * ResourceMetricStatus indicates the current value of a resource metric known to Kubernetes, as
      * specified in requests and limits, describing each pod in the current scale target (e.g. CPU
      * or memory).  Such metrics are built in to Kubernetes, and have special scaling options on top
      * of those available to normal per-pod metrics using the "pods" source.
      */
    trait ResourceMetricStatus extends js.Object {
      /**
        * current contains the current value for the given metric
        */
      var current: Input[MetricValueStatus]
      /**
        * Name is the name of the resource in question.
        */
      var name: Input[String]
    }
    
    def isCrossVersionObjectReference(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.autoscaling.v2beta2.CrossVersionObjectReference */ Boolean = js.native
    def isHorizontalPodAutoscaler(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.autoscaling.v2beta2.HorizontalPodAutoscaler */ Boolean = js.native
    def isHorizontalPodAutoscalerList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.autoscaling.v2beta2.HorizontalPodAutoscalerList */ Boolean = js.native
  }
  
}

