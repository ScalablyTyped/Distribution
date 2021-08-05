package typings.pulumiKubernetes.inputMod

import typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.coordinationDotk8sDotioSlashv1
import typings.pulumiKubernetes.pulumiKubernetesStrings.coordinationDotk8sDotioSlashv1beta1
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coordination {
  
  object v1 {
    
    /**
      * Lease defines a lease concept.
      */
    trait Lease extends StObject {
      
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[coordinationDotk8sDotioSlashv1]] = js.undefined
      
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.Lease]] = js.undefined
      
      /**
        * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      
      /**
        * Specification of the Lease. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        */
      var spec: js.UndefOr[Input[LeaseSpec]] = js.undefined
    }
    object Lease {
      
      inline def apply(): Lease = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Lease]
      }
      
      extension [Self <: Lease](x: Self) {
        
        inline def setApiVersion(value: Input[coordinationDotk8sDotioSlashv1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
        
        inline def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.Lease]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setSpec(value: Input[LeaseSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
        
        inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
      }
    }
    
    /**
      * LeaseSpec is a specification of a Lease.
      */
    trait LeaseSpec extends StObject {
      
      /**
        * acquireTime is a time when the current lease was acquired.
        */
      var acquireTime: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * holderIdentity contains the identity of the holder of a current lease.
        */
      var holderIdentity: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it. This is measure against time of last observed RenewTime.
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
    object LeaseSpec {
      
      inline def apply(): LeaseSpec = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LeaseSpec]
      }
      
      extension [Self <: LeaseSpec](x: Self) {
        
        inline def setAcquireTime(value: Input[String]): Self = StObject.set(x, "acquireTime", value.asInstanceOf[js.Any])
        
        inline def setAcquireTimeUndefined: Self = StObject.set(x, "acquireTime", js.undefined)
        
        inline def setHolderIdentity(value: Input[String]): Self = StObject.set(x, "holderIdentity", value.asInstanceOf[js.Any])
        
        inline def setHolderIdentityUndefined: Self = StObject.set(x, "holderIdentity", js.undefined)
        
        inline def setLeaseDurationSeconds(value: Input[Double]): Self = StObject.set(x, "leaseDurationSeconds", value.asInstanceOf[js.Any])
        
        inline def setLeaseDurationSecondsUndefined: Self = StObject.set(x, "leaseDurationSeconds", js.undefined)
        
        inline def setLeaseTransitions(value: Input[Double]): Self = StObject.set(x, "leaseTransitions", value.asInstanceOf[js.Any])
        
        inline def setLeaseTransitionsUndefined: Self = StObject.set(x, "leaseTransitions", js.undefined)
        
        inline def setRenewTime(value: Input[String]): Self = StObject.set(x, "renewTime", value.asInstanceOf[js.Any])
        
        inline def setRenewTimeUndefined: Self = StObject.set(x, "renewTime", js.undefined)
      }
    }
  }
  
  object v1beta1 {
    
    /**
      * Lease defines a lease concept.
      */
    trait Lease extends StObject {
      
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[coordinationDotk8sDotioSlashv1beta1]] = js.undefined
      
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.Lease]] = js.undefined
      
      /**
        * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      
      /**
        * Specification of the Lease. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        */
      var spec: js.UndefOr[Input[LeaseSpec]] = js.undefined
    }
    object Lease {
      
      inline def apply(): Lease = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Lease]
      }
      
      extension [Self <: Lease](x: Self) {
        
        inline def setApiVersion(value: Input[coordinationDotk8sDotioSlashv1beta1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
        
        inline def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.Lease]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setSpec(value: Input[LeaseSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
        
        inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
      }
    }
    
    /**
      * LeaseSpec is a specification of a Lease.
      */
    trait LeaseSpec extends StObject {
      
      /**
        * acquireTime is a time when the current lease was acquired.
        */
      var acquireTime: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * holderIdentity contains the identity of the holder of a current lease.
        */
      var holderIdentity: js.UndefOr[Input[String]] = js.undefined
      
      /**
        * leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it. This is measure against time of last observed RenewTime.
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
    object LeaseSpec {
      
      inline def apply(): LeaseSpec = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[LeaseSpec]
      }
      
      extension [Self <: LeaseSpec](x: Self) {
        
        inline def setAcquireTime(value: Input[String]): Self = StObject.set(x, "acquireTime", value.asInstanceOf[js.Any])
        
        inline def setAcquireTimeUndefined: Self = StObject.set(x, "acquireTime", js.undefined)
        
        inline def setHolderIdentity(value: Input[String]): Self = StObject.set(x, "holderIdentity", value.asInstanceOf[js.Any])
        
        inline def setHolderIdentityUndefined: Self = StObject.set(x, "holderIdentity", js.undefined)
        
        inline def setLeaseDurationSeconds(value: Input[Double]): Self = StObject.set(x, "leaseDurationSeconds", value.asInstanceOf[js.Any])
        
        inline def setLeaseDurationSecondsUndefined: Self = StObject.set(x, "leaseDurationSeconds", js.undefined)
        
        inline def setLeaseTransitions(value: Input[Double]): Self = StObject.set(x, "leaseTransitions", value.asInstanceOf[js.Any])
        
        inline def setLeaseTransitionsUndefined: Self = StObject.set(x, "leaseTransitions", js.undefined)
        
        inline def setRenewTime(value: Input[String]): Self = StObject.set(x, "renewTime", value.asInstanceOf[js.Any])
        
        inline def setRenewTimeUndefined: Self = StObject.set(x, "renewTime", js.undefined)
      }
    }
  }
}
