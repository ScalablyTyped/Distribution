package typings
package atPulumiKubernetesLib.typesInputMod

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
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind of the referent; More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds"
                   */
      var kind: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
                   */
      var name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
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
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * behaviour of autoscaler. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
                   */
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[HorizontalPodAutoscalerSpec]] = js.undefined
      /**
                   * current information about the autoscaler.
                   */
      var status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[HorizontalPodAutoscalerStatus]] = js.undefined
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
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * list of horizontal pod autoscaler objects.
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[HorizontalPodAutoscaler]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard list metadata.
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * specification of a horizontal pod autoscaler.
             */
    
    trait HorizontalPodAutoscalerSpec extends js.Object {
      /**
                   * upper limit for the number of pods that can be set by the autoscaler; cannot be smaller
                   * than MinReplicas.
                   */
      var maxReplicas: atPulumiPulumiLib.resourceMod.Input[scala.Double]
      /**
                   * lower limit for the number of pods that can be set by the autoscaler, default 1.
                   */
      var minReplicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * reference to scaled resource; horizontal pod autoscaler will learn the current resource
                   * consumption and will set the desired number of pods by using its Scale subresource.
                   */
      var scaleTargetRef: atPulumiPulumiLib.resourceMod.Input[CrossVersionObjectReference]
      /**
                   * target average CPU utilization (represented as a percentage of requested CPU) over all the
                   * pods; if not specified the default autoscaling policy will be used.
                   */
      var targetCPUUtilizationPercentage: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
    }
    
    /**
             * current status of a horizontal pod autoscaler
             */
    
    trait HorizontalPodAutoscalerStatus extends js.Object {
      /**
                   * current average CPU utilization over all pods, represented as a percentage of requested
                   * CPU, e.g. 70 means that an average pod is using now 70% of its requested CPU.
                   */
      var currentCPUUtilizationPercentage: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * current number of replicas of pods managed by this autoscaler.
                   */
      var currentReplicas: atPulumiPulumiLib.resourceMod.Input[scala.Double]
      /**
                   * desired number of replicas of pods managed by this autoscaler.
                   */
      var desiredReplicas: atPulumiPulumiLib.resourceMod.Input[scala.Double]
      /**
                   * last time the HorizontalPodAutoscaler scaled the number of pods; used by the autoscaler to
                   * control how often the number of pods is changed.
                   */
      var lastScaleTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * most recent generation observed by this autoscaler.
                   */
      var observedGeneration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
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
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Standard object metadata; More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * defines the behavior of the scale. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
                   */
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ScaleSpec]] = js.undefined
      /**
                   * current status of the scale. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
                   * Read-only.
                   */
      var status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ScaleStatus]] = js.undefined
    }
    
    /**
             * ScaleSpec describes the attributes of a scale subresource.
             */
    
    trait ScaleSpec extends js.Object {
      /**
                   * desired number of instances for the scaled object.
                   */
      var replicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
    }
    
    /**
             * ScaleStatus represents the current status of a scale subresource.
             */
    
    trait ScaleStatus extends js.Object {
      /**
                   * actual number of observed instances of the scaled object.
                   */
      var replicas: atPulumiPulumiLib.resourceMod.Input[scala.Double]
      /**
                   * label query over pods that should match the replicas count. This is same as the label
                   * selector but in the string format to avoid introspection by clients. The string will be in
                   * the same format as the query-param syntax. More info about label selectors:
                   * http://kubernetes.io/docs/user-guide/labels#label-selectors
                   */
      var selector: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    def isCrossVersionObjectReference(o: js.Any): /* is CrossVersionObjectReference */scala.Boolean = js.native
    def isHorizontalPodAutoscaler(o: js.Any): /* is HorizontalPodAutoscaler */scala.Boolean = js.native
    def isHorizontalPodAutoscalerList(o: js.Any): /* is HorizontalPodAutoscalerList */scala.Boolean = js.native
    def isScale(o: js.Any): /* is Scale */scala.Boolean = js.native
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
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind of the referent; More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds"
                   */
      var kind: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
                   */
      var name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
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
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * metadata is the standard object metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * spec is the specification for the behaviour of the autoscaler. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status.
                   */
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[HorizontalPodAutoscalerSpec]] = js.undefined
      /**
                   * status is the current information about the autoscaler.
                   */
      var status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[HorizontalPodAutoscalerStatus]] = js.undefined
    }
    
    /**
             * HorizontalPodAutoscalerCondition describes the state of a HorizontalPodAutoscaler at a
             * certain point.
             */
    
    trait HorizontalPodAutoscalerCondition extends js.Object {
      /**
                   * lastTransitionTime is the last time the condition transitioned from one status to another
                   */
      var lastTransitionTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * message is a human-readable explanation containing details about the transition
                   */
      var message: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * reason is the reason for the condition's last transition.
                   */
      var reason: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * status is the status of the condition (True, False, Unknown)
                   */
      var status: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * type describes the current condition
                   */
      var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
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
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * items is the list of horizontal pod autoscaler objects.
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[HorizontalPodAutoscaler]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * metadata is the standard list metadata.
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
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
      var maxReplicas: atPulumiPulumiLib.resourceMod.Input[scala.Double]
      /**
                   * metrics contains the specifications for which to use to calculate the desired replica count
                   * (the maximum replica count across all metrics will be used).  The desired replica count is
                   * calculated multiplying the ratio between the target value and the current value by the
                   * current number of pods.  Ergo, metrics used must decrease as the pod count is increased,
                   * and vice-versa.  See the individual metric source types for more information about how each
                   * type of metric must respond.
                   */
      var metrics: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[MetricSpec]]] = js.undefined
      /**
                   * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale
                   * down. It defaults to 1 pod.
                   */
      var minReplicas: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * scaleTargetRef points to the target resource to scale, and is used to the pods for which
                   * metrics should be collected, as well as to actually change the replica count.
                   */
      var scaleTargetRef: atPulumiPulumiLib.resourceMod.Input[CrossVersionObjectReference]
    }
    
    /**
             * HorizontalPodAutoscalerStatus describes the current status of a horizontal pod autoscaler.
             */
    
    trait HorizontalPodAutoscalerStatus extends js.Object {
      /**
                   * conditions is the set of conditions required for this autoscaler to scale its target, and
                   * indicates whether or not those conditions are met.
                   */
      var conditions: atPulumiPulumiLib.resourceMod.Input[js.Array[HorizontalPodAutoscalerCondition]]
      /**
                   * currentMetrics is the last read state of the metrics used by this autoscaler.
                   */
      var currentMetrics: atPulumiPulumiLib.resourceMod.Input[js.Array[MetricStatus]]
      /**
                   * currentReplicas is current number of replicas of pods managed by this autoscaler, as last
                   * seen by the autoscaler.
                   */
      var currentReplicas: atPulumiPulumiLib.resourceMod.Input[scala.Double]
      /**
                   * desiredReplicas is the desired number of replicas of pods managed by this autoscaler, as
                   * last calculated by the autoscaler.
                   */
      var desiredReplicas: atPulumiPulumiLib.resourceMod.Input[scala.Double]
      /**
                   * lastScaleTime is the last time the HorizontalPodAutoscaler scaled the number of pods, used
                   * by the autoscaler to control how often the number of pods is changed.
                   */
      var lastScaleTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * observedGeneration is the most recent generation observed by this autoscaler.
                   */
      var observedGeneration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
    }
    
    /**
             * MetricSpec specifies how to scale based on a single metric (only `type` and one other
             * matching field should be set at once).
             */
    
    trait MetricSpec extends js.Object {
      /**
                   * object refers to a metric describing a single kubernetes object (for example,
                   * hits-per-second on an Ingress object).
                   */
      var `object`: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ObjectMetricSource]] = js.undefined
      /**
                   * pods refers to a metric describing each pod in the current scale target (for example,
                   * transactions-processed-per-second).  The values will be averaged together before being
                   * compared to the target value.
                   */
      var pods: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[PodsMetricSource]] = js.undefined
      /**
                   * resource refers to a resource metric (such as those specified in requests and limits) known
                   * to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such
                   * metrics are built in to Kubernetes, and have special scaling options on top of those
                   * available to normal per-pod metrics using the "pods" source.
                   */
      var resource: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ResourceMetricSource]] = js.undefined
      /**
                   * type is the type of metric source.  It should match one of the fields below.
                   */
      var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * MetricStatus describes the last-read state of a single metric.
             */
    
    trait MetricStatus extends js.Object {
      /**
                   * object refers to a metric describing a single kubernetes object (for example,
                   * hits-per-second on an Ingress object).
                   */
      var `object`: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ObjectMetricStatus]] = js.undefined
      /**
                   * pods refers to a metric describing each pod in the current scale target (for example,
                   * transactions-processed-per-second).  The values will be averaged together before being
                   * compared to the target value.
                   */
      var pods: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[PodsMetricStatus]] = js.undefined
      /**
                   * resource refers to a resource metric (such as those specified in requests and limits) known
                   * to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such
                   * metrics are built in to Kubernetes, and have special scaling options on top of those
                   * available to normal per-pod metrics using the "pods" source.
                   */
      var resource: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ResourceMetricStatus]] = js.undefined
      /**
                   * type is the type of metric source.  It will match one of the fields below.
                   */
      var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for
             * example, hits-per-second on an Ingress object).
             */
    
    trait ObjectMetricSource extends js.Object {
      /**
                   * metricName is the name of the metric in question.
                   */
      var metricName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * target is the described Kubernetes object.
                   */
      var target: atPulumiPulumiLib.resourceMod.Input[CrossVersionObjectReference]
      /**
                   * targetValue is the target value of the metric (as a quantity).
                   */
      var targetValue: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * ObjectMetricStatus indicates the current value of a metric describing a kubernetes object
             * (for example, hits-per-second on an Ingress object).
             */
    
    trait ObjectMetricStatus extends js.Object {
      /**
                   * currentValue is the current value of the metric (as a quantity).
                   */
      var currentValue: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * metricName is the name of the metric in question.
                   */
      var metricName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * target is the described Kubernetes object.
                   */
      var target: atPulumiPulumiLib.resourceMod.Input[CrossVersionObjectReference]
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
      var metricName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * targetAverageValue is the target value of the average of the metric across all relevant
                   * pods (as a quantity)
                   */
      var targetAverageValue: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
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
      var currentAverageValue: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * metricName is the name of the metric in question
                   */
      var metricName: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
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
      var name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * targetAverageUtilization is the target value of the average of the resource metric across
                   * all relevant pods, represented as a percentage of the requested value of the resource for
                   * the pods.
                   */
      var targetAverageUtilization: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * targetAverageValue is the target value of the average of the resource metric across all
                   * relevant pods, as a raw value (instead of as a percentage of the request), similar to the
                   * "pods" metric source type.
                   */
      var targetAverageValue: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
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
      var currentAverageUtilization: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
                   * currentAverageValue is the current value of the average of the resource metric across all
                   * relevant pods, as a raw value (instead of as a percentage of the request), similar to the
                   * "pods" metric source type. It will always be set, regardless of the corresponding metric
                   * specification.
                   */
      var currentAverageValue: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
                   * name is the name of the resource in question.
                   */
      var name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    def isCrossVersionObjectReference(o: js.Any): /* is CrossVersionObjectReference */scala.Boolean = js.native
    def isHorizontalPodAutoscaler(o: js.Any): /* is HorizontalPodAutoscaler */scala.Boolean = js.native
    def isHorizontalPodAutoscalerList(o: js.Any): /* is HorizontalPodAutoscalerList */scala.Boolean = js.native
  }
  
}

