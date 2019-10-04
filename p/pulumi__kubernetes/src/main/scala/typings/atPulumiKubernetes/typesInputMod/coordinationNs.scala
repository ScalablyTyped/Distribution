package typings.atPulumiKubernetes.typesInputMod

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`coordinationDOTk8sDOTio/v1`
import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`coordinationDOTk8sDOTio/v1beta1`
import typings.atPulumiKubernetes.typesInputMod.coordinationNs.v1Ns.Lease
import typings.atPulumiKubernetes.typesInputMod.coordinationNs.v1Ns.LeaseSpec
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.ListMeta
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.ObjectMeta
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/types/input", "coordination")
@js.native
object coordinationNs extends js.Object {
  @JSName("v1")
  @js.native
  object v1Ns extends js.Object {
    /**
      * Lease defines a lease concept.
      */
    trait Lease extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`coordinationDOTk8sDOTio/v1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.Lease]] = js.undefined
      /**
        * More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * Specification of the Lease. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        */
      var spec: js.UndefOr[Input[LeaseSpec]] = js.undefined
    }
    
    /**
      * LeaseList is a list of Lease objects.
      */
    trait LeaseList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`coordinationDOTk8sDOTio/v1`]] = js.undefined
      /**
        * Items is a list of schema objects.
        */
      var items: Input[js.Array[Input[Lease]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.LeaseList]] = js.undefined
      /**
        * Standard list metadata. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
    }
    
    /**
      * LeaseSpec is a specification of a Lease.
      */
    trait LeaseSpec extends js.Object {
      /**
        * acquireTime is a time when the current lease was acquired.
        */
      var acquireTime: js.UndefOr[Input[String]] = js.undefined
      /**
        * holderIdentity contains the identity of the holder of a current lease.
        */
      var holderIdentity: js.UndefOr[Input[String]] = js.undefined
      /**
        * leaseDurationSeconds is a duration that candidates for a lease need to wait to force
        * acquire it. This is measure against time of last observed RenewTime.
        */
      var leaseDurationSeconds: js.UndefOr[Input[Double]] = js.undefined
      /**
        * leaseTransitions is the number of transitions of a lease between holders.
        */
      var leaseTransitions: js.UndefOr[Input[Double]] = js.undefined
      /**
        * renewTime is a time when the current holder of a lease has last updated the lease.
        */
      var renewTime: js.UndefOr[Input[String]] = js.undefined
    }
    
    def isLease(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.coordination.v1.Lease */ Boolean = js.native
    def isLeaseList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.coordination.v1.LeaseList */ Boolean = js.native
  }
  
  @JSName("v1beta1")
  @js.native
  object v1beta1Ns extends js.Object {
    /**
      * Lease defines a lease concept.
      */
    trait Lease extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`coordinationDOTk8sDOTio/v1beta1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.Lease]] = js.undefined
      /**
        * More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * Specification of the Lease. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        */
      var spec: js.UndefOr[
            Input[typings.atPulumiKubernetes.typesInputMod.coordinationNs.v1beta1Ns.LeaseSpec]
          ] = js.undefined
    }
    
    /**
      * LeaseList is a list of Lease objects.
      */
    trait LeaseList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`coordinationDOTk8sDOTio/v1beta1`]] = js.undefined
      /**
        * Items is a list of schema objects.
        */
      var items: Input[
            js.Array[Input[typings.atPulumiKubernetes.typesInputMod.coordinationNs.v1beta1Ns.Lease]]
          ]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.LeaseList]] = js.undefined
      /**
        * Standard list metadata. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
    }
    
    /**
      * LeaseSpec is a specification of a Lease.
      */
    trait LeaseSpec extends js.Object {
      /**
        * acquireTime is a time when the current lease was acquired.
        */
      var acquireTime: js.UndefOr[Input[String]] = js.undefined
      /**
        * holderIdentity contains the identity of the holder of a current lease.
        */
      var holderIdentity: js.UndefOr[Input[String]] = js.undefined
      /**
        * leaseDurationSeconds is a duration that candidates for a lease need to wait to force
        * acquire it. This is measure against time of last observed RenewTime.
        */
      var leaseDurationSeconds: js.UndefOr[Input[Double]] = js.undefined
      /**
        * leaseTransitions is the number of transitions of a lease between holders.
        */
      var leaseTransitions: js.UndefOr[Input[Double]] = js.undefined
      /**
        * renewTime is a time when the current holder of a lease has last updated the lease.
        */
      var renewTime: js.UndefOr[Input[String]] = js.undefined
    }
    
    def isLease(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.coordination.v1beta1.Lease */ Boolean = js.native
    def isLeaseList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.coordination.v1beta1.LeaseList */ Boolean = js.native
  }
  
}

