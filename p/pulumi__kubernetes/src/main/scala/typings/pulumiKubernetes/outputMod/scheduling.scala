package typings.pulumiKubernetes.outputMod

import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.schedulingDotk8sDotioSlashv1
import typings.pulumiKubernetes.pulumiKubernetesStrings.schedulingDotk8sDotioSlashv1alpha1
import typings.pulumiKubernetes.pulumiKubernetesStrings.schedulingDotk8sDotioSlashv1beta1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scheduling {
  
  object v1 {
    
    /**
      * PriorityClass defines mapping from a priority class name to the priority integer value. The value can be any valid integer.
      */
    trait PriorityClass extends StObject {
      
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: schedulingDotk8sDotioSlashv1
      
      /**
        * description is an arbitrary string that usually provides guidelines on when this priority class should be used.
        */
      var description: String
      
      /**
        * globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class. Only one PriorityClass can be marked as `globalDefault`. However, if more than one PriorityClasses exists with their `globalDefault` field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
        */
      var globalDefault: Boolean
      
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.PriorityClass
      
      /**
        * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: ObjectMeta
      
      /**
        * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is beta-level, gated by the NonPreemptingPriority feature-gate.
        */
      var preemptionPolicy: String
      
      /**
        * The value of this priority class. This is the actual priority that pods receive when they have the name of this class in their pod spec.
        */
      var value: Double
    }
    object PriorityClass {
      
      inline def apply(
        description: String,
        globalDefault: Boolean,
        metadata: ObjectMeta,
        preemptionPolicy: String,
        value: Double
      ): PriorityClass = {
        val __obj = js.Dynamic.literal(apiVersion = "scheduling.k8s.io/v1", description = description.asInstanceOf[js.Any], globalDefault = globalDefault.asInstanceOf[js.Any], kind = "PriorityClass", metadata = metadata.asInstanceOf[js.Any], preemptionPolicy = preemptionPolicy.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[PriorityClass]
      }
      
      extension [Self <: PriorityClass](x: Self) {
        
        inline def setApiVersion(value: schedulingDotk8sDotioSlashv1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setGlobalDefault(value: Boolean): Self = StObject.set(x, "globalDefault", value.asInstanceOf[js.Any])
        
        inline def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.PriorityClass): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setPreemptionPolicy(value: String): Self = StObject.set(x, "preemptionPolicy", value.asInstanceOf[js.Any])
        
        inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object v1alpha1 {
    
    /**
      * DEPRECATED - This group version of PriorityClass is deprecated by scheduling.k8s.io/v1/PriorityClass. PriorityClass defines mapping from a priority class name to the priority integer value. The value can be any valid integer.
      */
    trait PriorityClass extends StObject {
      
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: schedulingDotk8sDotioSlashv1alpha1
      
      /**
        * description is an arbitrary string that usually provides guidelines on when this priority class should be used.
        */
      var description: String
      
      /**
        * globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class. Only one PriorityClass can be marked as `globalDefault`. However, if more than one PriorityClasses exists with their `globalDefault` field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
        */
      var globalDefault: Boolean
      
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.PriorityClass
      
      /**
        * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: ObjectMeta
      
      /**
        * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is beta-level, gated by the NonPreemptingPriority feature-gate.
        */
      var preemptionPolicy: String
      
      /**
        * The value of this priority class. This is the actual priority that pods receive when they have the name of this class in their pod spec.
        */
      var value: Double
    }
    object PriorityClass {
      
      inline def apply(
        description: String,
        globalDefault: Boolean,
        metadata: ObjectMeta,
        preemptionPolicy: String,
        value: Double
      ): PriorityClass = {
        val __obj = js.Dynamic.literal(apiVersion = "scheduling.k8s.io/v1alpha1", description = description.asInstanceOf[js.Any], globalDefault = globalDefault.asInstanceOf[js.Any], kind = "PriorityClass", metadata = metadata.asInstanceOf[js.Any], preemptionPolicy = preemptionPolicy.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[PriorityClass]
      }
      
      extension [Self <: PriorityClass](x: Self) {
        
        inline def setApiVersion(value: schedulingDotk8sDotioSlashv1alpha1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setGlobalDefault(value: Boolean): Self = StObject.set(x, "globalDefault", value.asInstanceOf[js.Any])
        
        inline def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.PriorityClass): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setPreemptionPolicy(value: String): Self = StObject.set(x, "preemptionPolicy", value.asInstanceOf[js.Any])
        
        inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object v1beta1 {
    
    /**
      * DEPRECATED - This group version of PriorityClass is deprecated by scheduling.k8s.io/v1/PriorityClass. PriorityClass defines mapping from a priority class name to the priority integer value. The value can be any valid integer.
      */
    trait PriorityClass extends StObject {
      
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: schedulingDotk8sDotioSlashv1beta1
      
      /**
        * description is an arbitrary string that usually provides guidelines on when this priority class should be used.
        */
      var description: String
      
      /**
        * globalDefault specifies whether this PriorityClass should be considered as the default priority for pods that do not have any priority class. Only one PriorityClass can be marked as `globalDefault`. However, if more than one PriorityClasses exists with their `globalDefault` field set to true, the smallest value of such global default PriorityClasses will be used as the default priority.
        */
      var globalDefault: Boolean
      
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.PriorityClass
      
      /**
        * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: ObjectMeta
      
      /**
        * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never, PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is beta-level, gated by the NonPreemptingPriority feature-gate.
        */
      var preemptionPolicy: String
      
      /**
        * The value of this priority class. This is the actual priority that pods receive when they have the name of this class in their pod spec.
        */
      var value: Double
    }
    object PriorityClass {
      
      inline def apply(
        description: String,
        globalDefault: Boolean,
        metadata: ObjectMeta,
        preemptionPolicy: String,
        value: Double
      ): PriorityClass = {
        val __obj = js.Dynamic.literal(apiVersion = "scheduling.k8s.io/v1beta1", description = description.asInstanceOf[js.Any], globalDefault = globalDefault.asInstanceOf[js.Any], kind = "PriorityClass", metadata = metadata.asInstanceOf[js.Any], preemptionPolicy = preemptionPolicy.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[PriorityClass]
      }
      
      extension [Self <: PriorityClass](x: Self) {
        
        inline def setApiVersion(value: schedulingDotk8sDotioSlashv1beta1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setGlobalDefault(value: Boolean): Self = StObject.set(x, "globalDefault", value.asInstanceOf[js.Any])
        
        inline def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.PriorityClass): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setPreemptionPolicy(value: String): Self = StObject.set(x, "preemptionPolicy", value.asInstanceOf[js.Any])
        
        inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
  }
}
