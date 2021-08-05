package typings.pulumiKubernetes.outputMod

import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.coordinationDotk8sDotioSlashv1
import typings.pulumiKubernetes.pulumiKubernetesStrings.coordinationDotk8sDotioSlashv1beta1
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
      var apiVersion: coordinationDotk8sDotioSlashv1
      
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.Lease
      
      /**
        * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: ObjectMeta
      
      /**
        * Specification of the Lease. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        */
      var spec: LeaseSpec
    }
    object Lease {
      
      inline def apply(metadata: ObjectMeta, spec: LeaseSpec): Lease = {
        val __obj = js.Dynamic.literal(apiVersion = "coordination.k8s.io/v1", kind = "Lease", metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
        __obj.asInstanceOf[Lease]
      }
      
      extension [Self <: Lease](x: Self) {
        
        inline def setApiVersion(value: coordinationDotk8sDotioSlashv1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        inline def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.Lease): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setSpec(value: LeaseSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * LeaseSpec is a specification of a Lease.
      */
    trait LeaseSpec extends StObject {
      
      /**
        * acquireTime is a time when the current lease was acquired.
        */
      var acquireTime: String
      
      /**
        * holderIdentity contains the identity of the holder of a current lease.
        */
      var holderIdentity: String
      
      /**
        * leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it. This is measure against time of last observed RenewTime.
        */
      var leaseDurationSeconds: Double
      
      /**
        * leaseTransitions is the number of transitions of a lease between holders.
        */
      var leaseTransitions: Double
      
      /**
        * renewTime is a time when the current holder of a lease has last updated the lease.
        */
      var renewTime: String
    }
    object LeaseSpec {
      
      inline def apply(
        acquireTime: String,
        holderIdentity: String,
        leaseDurationSeconds: Double,
        leaseTransitions: Double,
        renewTime: String
      ): LeaseSpec = {
        val __obj = js.Dynamic.literal(acquireTime = acquireTime.asInstanceOf[js.Any], holderIdentity = holderIdentity.asInstanceOf[js.Any], leaseDurationSeconds = leaseDurationSeconds.asInstanceOf[js.Any], leaseTransitions = leaseTransitions.asInstanceOf[js.Any], renewTime = renewTime.asInstanceOf[js.Any])
        __obj.asInstanceOf[LeaseSpec]
      }
      
      extension [Self <: LeaseSpec](x: Self) {
        
        inline def setAcquireTime(value: String): Self = StObject.set(x, "acquireTime", value.asInstanceOf[js.Any])
        
        inline def setHolderIdentity(value: String): Self = StObject.set(x, "holderIdentity", value.asInstanceOf[js.Any])
        
        inline def setLeaseDurationSeconds(value: Double): Self = StObject.set(x, "leaseDurationSeconds", value.asInstanceOf[js.Any])
        
        inline def setLeaseTransitions(value: Double): Self = StObject.set(x, "leaseTransitions", value.asInstanceOf[js.Any])
        
        inline def setRenewTime(value: String): Self = StObject.set(x, "renewTime", value.asInstanceOf[js.Any])
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
      var apiVersion: coordinationDotk8sDotioSlashv1beta1
      
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.Lease
      
      /**
        * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: ObjectMeta
      
      /**
        * Specification of the Lease. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status
        */
      var spec: LeaseSpec
    }
    object Lease {
      
      inline def apply(metadata: ObjectMeta, spec: LeaseSpec): Lease = {
        val __obj = js.Dynamic.literal(apiVersion = "coordination.k8s.io/v1beta1", kind = "Lease", metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
        __obj.asInstanceOf[Lease]
      }
      
      extension [Self <: Lease](x: Self) {
        
        inline def setApiVersion(value: coordinationDotk8sDotioSlashv1beta1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        inline def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.Lease): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setSpec(value: LeaseSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * LeaseSpec is a specification of a Lease.
      */
    trait LeaseSpec extends StObject {
      
      /**
        * acquireTime is a time when the current lease was acquired.
        */
      var acquireTime: String
      
      /**
        * holderIdentity contains the identity of the holder of a current lease.
        */
      var holderIdentity: String
      
      /**
        * leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it. This is measure against time of last observed RenewTime.
        */
      var leaseDurationSeconds: Double
      
      /**
        * leaseTransitions is the number of transitions of a lease between holders.
        */
      var leaseTransitions: Double
      
      /**
        * renewTime is a time when the current holder of a lease has last updated the lease.
        */
      var renewTime: String
    }
    object LeaseSpec {
      
      inline def apply(
        acquireTime: String,
        holderIdentity: String,
        leaseDurationSeconds: Double,
        leaseTransitions: Double,
        renewTime: String
      ): LeaseSpec = {
        val __obj = js.Dynamic.literal(acquireTime = acquireTime.asInstanceOf[js.Any], holderIdentity = holderIdentity.asInstanceOf[js.Any], leaseDurationSeconds = leaseDurationSeconds.asInstanceOf[js.Any], leaseTransitions = leaseTransitions.asInstanceOf[js.Any], renewTime = renewTime.asInstanceOf[js.Any])
        __obj.asInstanceOf[LeaseSpec]
      }
      
      extension [Self <: LeaseSpec](x: Self) {
        
        inline def setAcquireTime(value: String): Self = StObject.set(x, "acquireTime", value.asInstanceOf[js.Any])
        
        inline def setHolderIdentity(value: String): Self = StObject.set(x, "holderIdentity", value.asInstanceOf[js.Any])
        
        inline def setLeaseDurationSeconds(value: Double): Self = StObject.set(x, "leaseDurationSeconds", value.asInstanceOf[js.Any])
        
        inline def setLeaseTransitions(value: Double): Self = StObject.set(x, "leaseTransitions", value.asInstanceOf[js.Any])
        
        inline def setRenewTime(value: String): Self = StObject.set(x, "renewTime", value.asInstanceOf[js.Any])
      }
    }
  }
}
