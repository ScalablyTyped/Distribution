package typings
package atPulumiKubernetesLib.typesInputMod

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
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1alpha1`]
          ] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RuntimeClass]
          ] = js.undefined
      /**
        * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
        * Specification of the RuntimeClass More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
        */
      var spec: atPulumiPulumiLib.outputMod.Input[RuntimeClassSpec]
    }
    
    /**
      * RuntimeClassList is a list of RuntimeClass objects.
      */
    trait RuntimeClassList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1alpha1`]
          ] = js.undefined
      /**
        * Items is a list of schema objects.
        */
      var items: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[RuntimeClass]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RuntimeClassList]
          ] = js.undefined
      /**
        * Standard list metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
      * RuntimeClassSpec is a specification of a RuntimeClass. It contains parameters that are
      * required to describe the RuntimeClass to the Container Runtime Interface (CRI)
      * implementation, as well as any other components that need to understand how the pod will be
      * run. The RuntimeClassSpec is immutable.
      */
    trait RuntimeClassSpec extends js.Object {
      /**
        * RuntimeHandler specifies the underlying runtime and configuration that the CRI
        * implementation will use to handle pods of this class. The possible values are specific to
        * the node & CRI configuration.  It is assumed that all handlers are available on every node,
        * and handlers of the same name are equivalent on every node. For example, a handler called
        * "runc" might specify that the runc OCI runtime (using native Linux containers) will be used
        * to run the containers in a pod. The RuntimeHandler must conform to the DNS Label (RFC 1123)
        * requirements and is immutable.
        */
      var runtimeHandler: atPulumiPulumiLib.outputMod.Input[java.lang.String]
    }
    
    def isRuntimeClass(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.node.v1alpha1.RuntimeClass */ scala.Boolean = js.native
    def isRuntimeClassList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.node.v1alpha1.RuntimeClassList */ scala.Boolean = js.native
  }
  
  @JSName("v1beta1")
  @js.native
  object v1beta1Ns extends js.Object {
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
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1beta1`]
          ] = js.undefined
      /**
        * Handler specifies the underlying runtime and configuration that the CRI implementation will
        * use to handle pods of this class. The possible values are specific to the node & CRI
        * configuration.  It is assumed that all handlers are available on every node, and handlers
        * of the same name are equivalent on every node. For example, a handler called "runc" might
        * specify that the runc OCI runtime (using native Linux containers) will be used to run the
        * containers in a pod. The Handler must conform to the DNS Label (RFC 1123) requirements, and
        * is immutable.
        */
      var handler: atPulumiPulumiLib.outputMod.Input[java.lang.String]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RuntimeClass]
          ] = js.undefined
      /**
        * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
    }
    
    /**
      * RuntimeClassList is a list of RuntimeClass objects.
      */
    trait RuntimeClassList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1beta1`]
          ] = js.undefined
      /**
        * Items is a list of schema objects.
        */
      var items: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[RuntimeClass]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RuntimeClassList]
          ] = js.undefined
      /**
        * Standard list metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    def isRuntimeClass(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.node.v1beta1.RuntimeClass */ scala.Boolean = js.native
    def isRuntimeClassList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.node.v1beta1.RuntimeClassList */ scala.Boolean = js.native
  }
  
}

