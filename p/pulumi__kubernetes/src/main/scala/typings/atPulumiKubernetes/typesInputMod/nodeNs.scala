package typings.atPulumiKubernetes.typesInputMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`nodeDOTk8sDOTio/v1alpha1`
import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`nodeDOTk8sDOTio/v1beta1`
import typings.atPulumiKubernetes.typesInputMod.coreNs.v1Ns.Toleration
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.ListMeta
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.ObjectMeta
import typings.atPulumiKubernetes.typesInputMod.nodeNs.v1alpha1Ns.Overhead
import typings.atPulumiKubernetes.typesInputMod.nodeNs.v1alpha1Ns.RuntimeClass
import typings.atPulumiKubernetes.typesInputMod.nodeNs.v1alpha1Ns.RuntimeClassSpec
import typings.atPulumiKubernetes.typesInputMod.nodeNs.v1alpha1Ns.Scheduling
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/types/input", "node")
@js.native
object nodeNs extends js.Object {
  @JSName("v1alpha1")
  @js.native
  object v1alpha1Ns extends js.Object {
    /**
      * Overhead structure represents the resource overhead associated with running a pod.
      */
    trait Overhead extends js.Object {
      /**
        * PodFixed represents the fixed resource overhead associated with running a pod.
        */
      var podFixed: js.UndefOr[Input[js.Object]] = js.undefined
    }
    
    /**
      * RuntimeClass defines a class of container runtime supported in the cluster. The RuntimeClass
      * is used to determine which container runtime is used to run all containers in a pod.
      * RuntimeClasses are (currently) manually defined by a user or cluster provisioner, and
      * referenced in the PodSpec. The Kubelet is responsible for resolving the RuntimeClassName
      * reference before running the pod.  For more details, see
      * https://git.k8s.io/enhancements/keps/sig-node/runtime-class.md
      */
    trait RuntimeClass extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`nodeDOTk8sDOTio/v1alpha1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.RuntimeClass]] = js.undefined
      /**
        * More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * Specification of the RuntimeClass More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        */
      var spec: Input[RuntimeClassSpec]
    }
    
    /**
      * RuntimeClassList is a list of RuntimeClass objects.
      */
    trait RuntimeClassList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`nodeDOTk8sDOTio/v1alpha1`]] = js.undefined
      /**
        * Items is a list of schema objects.
        */
      var items: Input[js.Array[Input[RuntimeClass]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.RuntimeClassList]] = js.undefined
      /**
        * Standard list metadata. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
    }
    
    /**
      * RuntimeClassSpec is a specification of a RuntimeClass. It contains parameters that are
      * required to describe the RuntimeClass to the Container Runtime Interface (CRI)
      * implementation, as well as any other components that need to understand how the pod will be
      * run. The RuntimeClassSpec is immutable.
      */
    trait RuntimeClassSpec extends js.Object {
      /**
        * Overhead represents the resource overhead associated with running a pod for a given
        * RuntimeClass. For more details, see
        * https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is
        * alpha-level as of Kubernetes v1.15, and is only honored by servers that enable the
        * PodOverhead feature.
        */
      var overhead: js.UndefOr[Input[Overhead]] = js.undefined
      /**
        * RuntimeHandler specifies the underlying runtime and configuration that the CRI
        * implementation will use to handle pods of this class. The possible values are specific to
        * the node & CRI configuration.  It is assumed that all handlers are available on every node,
        * and handlers of the same name are equivalent on every node. For example, a handler called
        * "runc" might specify that the runc OCI runtime (using native Linux containers) will be used
        * to run the containers in a pod. The RuntimeHandler must conform to the DNS Label (RFC 1123)
        * requirements and is immutable.
        */
      var runtimeHandler: Input[String]
      /**
        * Scheduling holds the scheduling constraints to ensure that pods running with this
        * RuntimeClass are scheduled to nodes that support it. If scheduling is nil, this
        * RuntimeClass is assumed to be supported by all nodes.
        */
      var scheduling: js.UndefOr[Input[Scheduling]] = js.undefined
    }
    
    /**
      * Scheduling specifies the scheduling constraints for nodes supporting a RuntimeClass.
      */
    trait Scheduling extends js.Object {
      /**
        * nodeSelector lists labels that must be present on nodes that support this RuntimeClass.
        * Pods using this RuntimeClass can only be scheduled to a node matched by this selector. The
        * RuntimeClass nodeSelector is merged with a pod's existing nodeSelector. Any conflicts will
        * cause the pod to be rejected in admission.
        */
      var nodeSelector: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
      /**
        * tolerations are appended (excluding duplicates) to pods running with this RuntimeClass
        * during admission, effectively unioning the set of nodes tolerated by the pod and the
        * RuntimeClass.
        */
      var tolerations: js.UndefOr[Input[js.Array[Input[Toleration]]]] = js.undefined
    }
    
    def isRuntimeClass(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.node.v1alpha1.RuntimeClass */ Boolean = js.native
    def isRuntimeClassList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.node.v1alpha1.RuntimeClassList */ Boolean = js.native
  }
  
  @JSName("v1beta1")
  @js.native
  object v1beta1Ns extends js.Object {
    /**
      * Overhead structure represents the resource overhead associated with running a pod.
      */
    trait Overhead extends js.Object {
      /**
        * PodFixed represents the fixed resource overhead associated with running a pod.
        */
      var podFixed: js.UndefOr[Input[js.Object]] = js.undefined
    }
    
    /**
      * RuntimeClass defines a class of container runtime supported in the cluster. The RuntimeClass
      * is used to determine which container runtime is used to run all containers in a pod.
      * RuntimeClasses are (currently) manually defined by a user or cluster provisioner, and
      * referenced in the PodSpec. The Kubelet is responsible for resolving the RuntimeClassName
      * reference before running the pod.  For more details, see
      * https://git.k8s.io/enhancements/keps/sig-node/runtime-class.md
      */
    trait RuntimeClass extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`nodeDOTk8sDOTio/v1beta1`]] = js.undefined
      /**
        * Handler specifies the underlying runtime and configuration that the CRI implementation will
        * use to handle pods of this class. The possible values are specific to the node & CRI
        * configuration.  It is assumed that all handlers are available on every node, and handlers
        * of the same name are equivalent on every node. For example, a handler called "runc" might
        * specify that the runc OCI runtime (using native Linux containers) will be used to run the
        * containers in a pod. The Handler must conform to the DNS Label (RFC 1123) requirements, and
        * is immutable.
        */
      var handler: Input[String]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.RuntimeClass]] = js.undefined
      /**
        * More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * Overhead represents the resource overhead associated with running a pod for a given
        * RuntimeClass. For more details, see
        * https://git.k8s.io/enhancements/keps/sig-node/20190226-pod-overhead.md This field is
        * alpha-level as of Kubernetes v1.15, and is only honored by servers that enable the
        * PodOverhead feature.
        */
      var overhead: js.UndefOr[Input[typings.atPulumiKubernetes.typesInputMod.nodeNs.v1beta1Ns.Overhead]] = js.undefined
      /**
        * Scheduling holds the scheduling constraints to ensure that pods running with this
        * RuntimeClass are scheduled to nodes that support it. If scheduling is nil, this
        * RuntimeClass is assumed to be supported by all nodes.
        */
      var scheduling: js.UndefOr[Input[typings.atPulumiKubernetes.typesInputMod.nodeNs.v1beta1Ns.Scheduling]] = js.undefined
    }
    
    /**
      * RuntimeClassList is a list of RuntimeClass objects.
      */
    trait RuntimeClassList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`nodeDOTk8sDOTio/v1beta1`]] = js.undefined
      /**
        * Items is a list of schema objects.
        */
      var items: Input[
            js.Array[Input[typings.atPulumiKubernetes.typesInputMod.nodeNs.v1beta1Ns.RuntimeClass]]
          ]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.RuntimeClassList]] = js.undefined
      /**
        * Standard list metadata. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
    }
    
    /**
      * Scheduling specifies the scheduling constraints for nodes supporting a RuntimeClass.
      */
    trait Scheduling extends js.Object {
      /**
        * nodeSelector lists labels that must be present on nodes that support this RuntimeClass.
        * Pods using this RuntimeClass can only be scheduled to a node matched by this selector. The
        * RuntimeClass nodeSelector is merged with a pod's existing nodeSelector. Any conflicts will
        * cause the pod to be rejected in admission.
        */
      var nodeSelector: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
      /**
        * tolerations are appended (excluding duplicates) to pods running with this RuntimeClass
        * during admission, effectively unioning the set of nodes tolerated by the pod and the
        * RuntimeClass.
        */
      var tolerations: js.UndefOr[Input[js.Array[Input[Toleration]]]] = js.undefined
    }
    
    def isRuntimeClass(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.node.v1beta1.RuntimeClass */ Boolean = js.native
    def isRuntimeClassList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.node.v1beta1.RuntimeClassList */ Boolean = js.native
  }
  
}

