package typings.atPulumiKubernetes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/types", JSImport.Namespace)
@js.native
object typesMod extends js.Object {
  @JSName("input")
  @js.native
  object inputNs extends js.Object {
    @JSName("admissionregistration")
    @js.native
    object admissionregistrationNs extends js.Object {
      @JSName("v1beta1")
      @js.native
      object v1beta1Ns extends js.Object {
        def isMutatingWebhookConfiguration(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.admissionregistration.v1beta1.MutatingWebhookConfiguration */ Boolean = js.native
        def isMutatingWebhookConfigurationList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.admissionregistration.v1beta1.MutatingWebhookConfigurationList */ Boolean = js.native
        def isValidatingWebhookConfiguration(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.admissionregistration.v1beta1.ValidatingWebhookConfiguration */ Boolean = js.native
        def isValidatingWebhookConfigurationList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.admissionregistration.v1beta1.ValidatingWebhookConfigurationList */ Boolean = js.native
      }
      
    }
    
    @JSName("apiextensions")
    @js.native
    object apiextensionsNs extends js.Object {
      @JSName("v1beta1")
      @js.native
      object v1beta1Ns extends js.Object {
        def isCustomResourceDefinition(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apiextensions.v1beta1.CustomResourceDefinition */ Boolean = js.native
        def isCustomResourceDefinitionList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apiextensions.v1beta1.CustomResourceDefinitionList */ Boolean = js.native
      }
      
    }
    
    @JSName("apiregistration")
    @js.native
    object apiregistrationNs extends js.Object {
      @JSName("v1")
      @js.native
      object v1Ns extends js.Object {
        def isAPIService(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apiregistration.v1.APIService */ Boolean = js.native
        def isAPIServiceList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apiregistration.v1.APIServiceList */ Boolean = js.native
      }
      
      @JSName("v1beta1")
      @js.native
      object v1beta1Ns extends js.Object {
        def isAPIService(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apiregistration.v1beta1.APIService */ Boolean = js.native
        def isAPIServiceList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apiregistration.v1beta1.APIServiceList */ Boolean = js.native
      }
      
    }
    
    @JSName("apps")
    @js.native
    object appsNs extends js.Object {
      @JSName("v1")
      @js.native
      object v1Ns extends js.Object {
        def isControllerRevision(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1.ControllerRevision */ Boolean = js.native
        def isControllerRevisionList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1.ControllerRevisionList */ Boolean = js.native
        def isDaemonSet(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1.DaemonSet */ Boolean = js.native
        def isDaemonSetList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1.DaemonSetList */ Boolean = js.native
        def isDeployment(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1.Deployment */ Boolean = js.native
        def isDeploymentList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1.DeploymentList */ Boolean = js.native
        def isReplicaSet(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1.ReplicaSet */ Boolean = js.native
        def isReplicaSetList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1.ReplicaSetList */ Boolean = js.native
        def isStatefulSet(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1.StatefulSet */ Boolean = js.native
        def isStatefulSetList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1.StatefulSetList */ Boolean = js.native
      }
      
      @JSName("v1beta1")
      @js.native
      object v1beta1Ns extends js.Object {
        def isControllerRevision(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1beta1.ControllerRevision */ Boolean = js.native
        def isControllerRevisionList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1beta1.ControllerRevisionList */ Boolean = js.native
        def isDeployment(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1beta1.Deployment */ Boolean = js.native
        def isDeploymentList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1beta1.DeploymentList */ Boolean = js.native
        def isDeploymentRollback(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1beta1.DeploymentRollback */ Boolean = js.native
        def isScale(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1beta1.Scale */ Boolean = js.native
        def isStatefulSet(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1beta1.StatefulSet */ Boolean = js.native
        def isStatefulSetList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1beta1.StatefulSetList */ Boolean = js.native
      }
      
      @JSName("v1beta2")
      @js.native
      object v1beta2Ns extends js.Object {
        def isControllerRevision(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1beta2.ControllerRevision */ Boolean = js.native
        def isControllerRevisionList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1beta2.ControllerRevisionList */ Boolean = js.native
        def isDaemonSet(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1beta2.DaemonSet */ Boolean = js.native
        def isDaemonSetList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1beta2.DaemonSetList */ Boolean = js.native
        def isDeployment(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1beta2.Deployment */ Boolean = js.native
        def isDeploymentList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1beta2.DeploymentList */ Boolean = js.native
        def isReplicaSet(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1beta2.ReplicaSet */ Boolean = js.native
        def isReplicaSetList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1beta2.ReplicaSetList */ Boolean = js.native
        def isScale(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1beta2.Scale */ Boolean = js.native
        def isStatefulSet(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1beta2.StatefulSet */ Boolean = js.native
        def isStatefulSetList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apps.v1beta2.StatefulSetList */ Boolean = js.native
      }
      
    }
    
    @JSName("auditregistration")
    @js.native
    object auditregistrationNs extends js.Object {
      @JSName("v1alpha1")
      @js.native
      object v1alpha1Ns extends js.Object {
        def isAuditSink(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.auditregistration.v1alpha1.AuditSink */ Boolean = js.native
        def isAuditSinkList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.auditregistration.v1alpha1.AuditSinkList */ Boolean = js.native
      }
      
    }
    
    @JSName("authentication")
    @js.native
    object authenticationNs extends js.Object {
      @JSName("v1")
      @js.native
      object v1Ns extends js.Object {
        def isTokenReview(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.authentication.v1.TokenReview */ Boolean = js.native
      }
      
      @JSName("v1beta1")
      @js.native
      object v1beta1Ns extends js.Object {
        def isTokenReview(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.authentication.v1beta1.TokenReview */ Boolean = js.native
      }
      
    }
    
    @JSName("authorization")
    @js.native
    object authorizationNs extends js.Object {
      @JSName("v1")
      @js.native
      object v1Ns extends js.Object {
        def isLocalSubjectAccessReview(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.authorization.v1.LocalSubjectAccessReview */ Boolean = js.native
        def isSelfSubjectAccessReview(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.authorization.v1.SelfSubjectAccessReview */ Boolean = js.native
        def isSelfSubjectRulesReview(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.authorization.v1.SelfSubjectRulesReview */ Boolean = js.native
        def isSubjectAccessReview(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.authorization.v1.SubjectAccessReview */ Boolean = js.native
      }
      
      @JSName("v1beta1")
      @js.native
      object v1beta1Ns extends js.Object {
        def isLocalSubjectAccessReview(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.authorization.v1beta1.LocalSubjectAccessReview */ Boolean = js.native
        def isSelfSubjectAccessReview(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.authorization.v1beta1.SelfSubjectAccessReview */ Boolean = js.native
        def isSelfSubjectRulesReview(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.authorization.v1beta1.SelfSubjectRulesReview */ Boolean = js.native
        def isSubjectAccessReview(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.authorization.v1beta1.SubjectAccessReview */ Boolean = js.native
      }
      
    }
    
    @JSName("autoscaling")
    @js.native
    object autoscalingNs extends js.Object {
      @JSName("v1")
      @js.native
      object v1Ns extends js.Object {
        def isCrossVersionObjectReference(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.autoscaling.v1.CrossVersionObjectReference */ Boolean = js.native
        def isHorizontalPodAutoscaler(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.autoscaling.v1.HorizontalPodAutoscaler */ Boolean = js.native
        def isHorizontalPodAutoscalerList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.autoscaling.v1.HorizontalPodAutoscalerList */ Boolean = js.native
        def isScale(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.autoscaling.v1.Scale */ Boolean = js.native
      }
      
      @JSName("v2beta1")
      @js.native
      object v2beta1Ns extends js.Object {
        def isCrossVersionObjectReference(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.autoscaling.v2beta1.CrossVersionObjectReference */ Boolean = js.native
        def isHorizontalPodAutoscaler(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.autoscaling.v2beta1.HorizontalPodAutoscaler */ Boolean = js.native
        def isHorizontalPodAutoscalerList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.autoscaling.v2beta1.HorizontalPodAutoscalerList */ Boolean = js.native
      }
      
      @JSName("v2beta2")
      @js.native
      object v2beta2Ns extends js.Object {
        def isCrossVersionObjectReference(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.autoscaling.v2beta2.CrossVersionObjectReference */ Boolean = js.native
        def isHorizontalPodAutoscaler(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.autoscaling.v2beta2.HorizontalPodAutoscaler */ Boolean = js.native
        def isHorizontalPodAutoscalerList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.autoscaling.v2beta2.HorizontalPodAutoscalerList */ Boolean = js.native
      }
      
    }
    
    @JSName("batch")
    @js.native
    object batchNs extends js.Object {
      @JSName("v1")
      @js.native
      object v1Ns extends js.Object {
        def isJob(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.batch.v1.Job */ Boolean = js.native
        def isJobList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.batch.v1.JobList */ Boolean = js.native
      }
      
      @JSName("v1beta1")
      @js.native
      object v1beta1Ns extends js.Object {
        def isCronJob(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.batch.v1beta1.CronJob */ Boolean = js.native
        def isCronJobList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.batch.v1beta1.CronJobList */ Boolean = js.native
      }
      
      @JSName("v2alpha1")
      @js.native
      object v2alpha1Ns extends js.Object {
        def isCronJob(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.batch.v2alpha1.CronJob */ Boolean = js.native
        def isCronJobList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.batch.v2alpha1.CronJobList */ Boolean = js.native
      }
      
    }
    
    @JSName("certificates")
    @js.native
    object certificatesNs extends js.Object {
      @JSName("v1beta1")
      @js.native
      object v1beta1Ns extends js.Object {
        def isCertificateSigningRequest(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.certificates.v1beta1.CertificateSigningRequest */ Boolean = js.native
        def isCertificateSigningRequestList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.certificates.v1beta1.CertificateSigningRequestList */ Boolean = js.native
      }
      
    }
    
    @JSName("coordination")
    @js.native
    object coordinationNs extends js.Object {
      @JSName("v1")
      @js.native
      object v1Ns extends js.Object {
        def isLease(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.coordination.v1.Lease */ Boolean = js.native
        def isLeaseList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.coordination.v1.LeaseList */ Boolean = js.native
      }
      
      @JSName("v1beta1")
      @js.native
      object v1beta1Ns extends js.Object {
        def isLease(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.coordination.v1beta1.Lease */ Boolean = js.native
        def isLeaseList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.coordination.v1beta1.LeaseList */ Boolean = js.native
      }
      
    }
    
    @JSName("core")
    @js.native
    object coreNs extends js.Object {
      @JSName("v1")
      @js.native
      object v1Ns extends js.Object {
        def isBinding(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.core.v1.Binding */ Boolean = js.native
        def isComponentStatus(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.core.v1.ComponentStatus */ Boolean = js.native
        def isComponentStatusList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.core.v1.ComponentStatusList */ Boolean = js.native
        def isConfigMap(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.core.v1.ConfigMap */ Boolean = js.native
        def isConfigMapList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.core.v1.ConfigMapList */ Boolean = js.native
        def isEndpoints(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.core.v1.Endpoints */ Boolean = js.native
        def isEndpointsList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.core.v1.EndpointsList */ Boolean = js.native
        def isEvent(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.core.v1.Event */ Boolean = js.native
        def isEventList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.core.v1.EventList */ Boolean = js.native
        def isLimitRange(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.core.v1.LimitRange */ Boolean = js.native
        def isLimitRangeList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.core.v1.LimitRangeList */ Boolean = js.native
        def isNamespace(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.core.v1.Namespace */ Boolean = js.native
        def isNamespaceList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.core.v1.NamespaceList */ Boolean = js.native
        def isNode(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.core.v1.Node */ Boolean = js.native
        def isNodeList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.core.v1.NodeList */ Boolean = js.native
        def isObjectFieldSelector(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.core.v1.ObjectFieldSelector */ Boolean = js.native
        def isObjectReference(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.core.v1.ObjectReference */ Boolean = js.native
        def isPersistentVolume(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.core.v1.PersistentVolume */ Boolean = js.native
        def isPersistentVolumeClaim(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.core.v1.PersistentVolumeClaim */ Boolean = js.native
        def isPersistentVolumeClaimList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.core.v1.PersistentVolumeClaimList */ Boolean = js.native
        def isPersistentVolumeList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.core.v1.PersistentVolumeList */ Boolean = js.native
        def isPod(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.core.v1.Pod */ Boolean = js.native
        def isPodList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.core.v1.PodList */ Boolean = js.native
        def isPodTemplate(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.core.v1.PodTemplate */ Boolean = js.native
        def isPodTemplateList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.core.v1.PodTemplateList */ Boolean = js.native
        def isReplicationController(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.core.v1.ReplicationController */ Boolean = js.native
        def isReplicationControllerList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.core.v1.ReplicationControllerList */ Boolean = js.native
        def isResourceQuota(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.core.v1.ResourceQuota */ Boolean = js.native
        def isResourceQuotaList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.core.v1.ResourceQuotaList */ Boolean = js.native
        def isSecret(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.core.v1.Secret */ Boolean = js.native
        def isSecretList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.core.v1.SecretList */ Boolean = js.native
        def isService(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.core.v1.Service */ Boolean = js.native
        def isServiceAccount(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.core.v1.ServiceAccount */ Boolean = js.native
        def isServiceAccountList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.core.v1.ServiceAccountList */ Boolean = js.native
        def isServiceList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.core.v1.ServiceList */ Boolean = js.native
      }
      
    }
    
    @JSName("events")
    @js.native
    object eventsNs extends js.Object {
      @JSName("v1beta1")
      @js.native
      object v1beta1Ns extends js.Object {
        def isEvent(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.events.v1beta1.Event */ Boolean = js.native
        def isEventList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.events.v1beta1.EventList */ Boolean = js.native
      }
      
    }
    
    @JSName("extensions")
    @js.native
    object extensionsNs extends js.Object {
      @JSName("v1beta1")
      @js.native
      object v1beta1Ns extends js.Object {
        def isDaemonSet(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.extensions.v1beta1.DaemonSet */ Boolean = js.native
        def isDaemonSetList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.extensions.v1beta1.DaemonSetList */ Boolean = js.native
        def isDeployment(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.extensions.v1beta1.Deployment */ Boolean = js.native
        def isDeploymentList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.extensions.v1beta1.DeploymentList */ Boolean = js.native
        def isDeploymentRollback(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.extensions.v1beta1.DeploymentRollback */ Boolean = js.native
        def isIngress(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.extensions.v1beta1.Ingress */ Boolean = js.native
        def isIngressList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.extensions.v1beta1.IngressList */ Boolean = js.native
        def isNetworkPolicy(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.extensions.v1beta1.NetworkPolicy */ Boolean = js.native
        def isNetworkPolicyList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.extensions.v1beta1.NetworkPolicyList */ Boolean = js.native
        def isPodSecurityPolicy(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.extensions.v1beta1.PodSecurityPolicy */ Boolean = js.native
        def isPodSecurityPolicyList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.extensions.v1beta1.PodSecurityPolicyList */ Boolean = js.native
        def isReplicaSet(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.extensions.v1beta1.ReplicaSet */ Boolean = js.native
        def isReplicaSetList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.extensions.v1beta1.ReplicaSetList */ Boolean = js.native
        def isScale(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.extensions.v1beta1.Scale */ Boolean = js.native
      }
      
    }
    
    @JSName("meta")
    @js.native
    object metaNs extends js.Object {
      @JSName("v1")
      @js.native
      object v1Ns extends js.Object {
        def isAPIGroup(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.meta.v1.APIGroup */ Boolean = js.native
        def isAPIGroupList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.meta.v1.APIGroupList */ Boolean = js.native
        def isAPIResourceList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.meta.v1.APIResourceList */ Boolean = js.native
        def isAPIVersions(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.meta.v1.APIVersions */ Boolean = js.native
        def isDeleteOptions(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.meta.v1.DeleteOptions */ Boolean = js.native
        def isManagedFieldsEntry(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.meta.v1.ManagedFieldsEntry */ Boolean = js.native
        def isOwnerReference(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.meta.v1.OwnerReference */ Boolean = js.native
        def isStatus(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.meta.v1.Status */ Boolean = js.native
      }
      
    }
    
    @JSName("networking")
    @js.native
    object networkingNs extends js.Object {
      @JSName("v1")
      @js.native
      object v1Ns extends js.Object {
        def isNetworkPolicy(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.networking.v1.NetworkPolicy */ Boolean = js.native
        def isNetworkPolicyList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.networking.v1.NetworkPolicyList */ Boolean = js.native
      }
      
      @JSName("v1beta1")
      @js.native
      object v1beta1Ns extends js.Object {
        def isIngress(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.networking.v1beta1.Ingress */ Boolean = js.native
        def isIngressList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.networking.v1beta1.IngressList */ Boolean = js.native
      }
      
    }
    
    @JSName("node")
    @js.native
    object nodeNs extends js.Object {
      @JSName("v1alpha1")
      @js.native
      object v1alpha1Ns extends js.Object {
        def isRuntimeClass(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.node.v1alpha1.RuntimeClass */ Boolean = js.native
        def isRuntimeClassList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.node.v1alpha1.RuntimeClassList */ Boolean = js.native
      }
      
      @JSName("v1beta1")
      @js.native
      object v1beta1Ns extends js.Object {
        def isRuntimeClass(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.node.v1beta1.RuntimeClass */ Boolean = js.native
        def isRuntimeClassList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.node.v1beta1.RuntimeClassList */ Boolean = js.native
      }
      
    }
    
    @JSName("policy")
    @js.native
    object policyNs extends js.Object {
      @JSName("v1beta1")
      @js.native
      object v1beta1Ns extends js.Object {
        def isEviction(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.policy.v1beta1.Eviction */ Boolean = js.native
        def isPodDisruptionBudget(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.policy.v1beta1.PodDisruptionBudget */ Boolean = js.native
        def isPodDisruptionBudgetList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.policy.v1beta1.PodDisruptionBudgetList */ Boolean = js.native
        def isPodSecurityPolicy(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.policy.v1beta1.PodSecurityPolicy */ Boolean = js.native
        def isPodSecurityPolicyList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.policy.v1beta1.PodSecurityPolicyList */ Boolean = js.native
      }
      
    }
    
    @JSName("rbac")
    @js.native
    object rbacNs extends js.Object {
      @JSName("v1")
      @js.native
      object v1Ns extends js.Object {
        def isClusterRole(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1.ClusterRole */ Boolean = js.native
        def isClusterRoleBinding(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1.ClusterRoleBinding */ Boolean = js.native
        def isClusterRoleBindingList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1.ClusterRoleBindingList */ Boolean = js.native
        def isClusterRoleList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1.ClusterRoleList */ Boolean = js.native
        def isRole(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1.Role */ Boolean = js.native
        def isRoleBinding(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1.RoleBinding */ Boolean = js.native
        def isRoleBindingList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1.RoleBindingList */ Boolean = js.native
        def isRoleList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1.RoleList */ Boolean = js.native
      }
      
      @JSName("v1alpha1")
      @js.native
      object v1alpha1Ns extends js.Object {
        def isClusterRole(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1alpha1.ClusterRole */ Boolean = js.native
        def isClusterRoleBinding(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1alpha1.ClusterRoleBinding */ Boolean = js.native
        def isClusterRoleBindingList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1alpha1.ClusterRoleBindingList */ Boolean = js.native
        def isClusterRoleList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1alpha1.ClusterRoleList */ Boolean = js.native
        def isRole(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1alpha1.Role */ Boolean = js.native
        def isRoleBinding(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1alpha1.RoleBinding */ Boolean = js.native
        def isRoleBindingList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1alpha1.RoleBindingList */ Boolean = js.native
        def isRoleList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1alpha1.RoleList */ Boolean = js.native
        def isSubject(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1alpha1.Subject */ Boolean = js.native
      }
      
      @JSName("v1beta1")
      @js.native
      object v1beta1Ns extends js.Object {
        def isClusterRole(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1beta1.ClusterRole */ Boolean = js.native
        def isClusterRoleBinding(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1beta1.ClusterRoleBinding */ Boolean = js.native
        def isClusterRoleBindingList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1beta1.ClusterRoleBindingList */ Boolean = js.native
        def isClusterRoleList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1beta1.ClusterRoleList */ Boolean = js.native
        def isRole(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1beta1.Role */ Boolean = js.native
        def isRoleBinding(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1beta1.RoleBinding */ Boolean = js.native
        def isRoleBindingList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1beta1.RoleBindingList */ Boolean = js.native
        def isRoleList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.rbac.v1beta1.RoleList */ Boolean = js.native
      }
      
    }
    
    @JSName("scheduling")
    @js.native
    object schedulingNs extends js.Object {
      @JSName("v1")
      @js.native
      object v1Ns extends js.Object {
        def isPriorityClass(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.scheduling.v1.PriorityClass */ Boolean = js.native
        def isPriorityClassList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.scheduling.v1.PriorityClassList */ Boolean = js.native
      }
      
      @JSName("v1alpha1")
      @js.native
      object v1alpha1Ns extends js.Object {
        def isPriorityClass(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.scheduling.v1alpha1.PriorityClass */ Boolean = js.native
        def isPriorityClassList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.scheduling.v1alpha1.PriorityClassList */ Boolean = js.native
      }
      
      @JSName("v1beta1")
      @js.native
      object v1beta1Ns extends js.Object {
        def isPriorityClass(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.scheduling.v1beta1.PriorityClass */ Boolean = js.native
        def isPriorityClassList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.scheduling.v1beta1.PriorityClassList */ Boolean = js.native
      }
      
    }
    
    @JSName("settings")
    @js.native
    object settingsNs extends js.Object {
      @JSName("v1alpha1")
      @js.native
      object v1alpha1Ns extends js.Object {
        def isPodPreset(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.settings.v1alpha1.PodPreset */ Boolean = js.native
        def isPodPresetList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.settings.v1alpha1.PodPresetList */ Boolean = js.native
      }
      
    }
    
    @JSName("storage")
    @js.native
    object storageNs extends js.Object {
      @JSName("v1")
      @js.native
      object v1Ns extends js.Object {
        def isStorageClass(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.storage.v1.StorageClass */ Boolean = js.native
        def isStorageClassList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.storage.v1.StorageClassList */ Boolean = js.native
        def isVolumeAttachment(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.storage.v1.VolumeAttachment */ Boolean = js.native
        def isVolumeAttachmentList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.storage.v1.VolumeAttachmentList */ Boolean = js.native
      }
      
      @JSName("v1alpha1")
      @js.native
      object v1alpha1Ns extends js.Object {
        def isVolumeAttachment(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.storage.v1alpha1.VolumeAttachment */ Boolean = js.native
        def isVolumeAttachmentList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.storage.v1alpha1.VolumeAttachmentList */ Boolean = js.native
      }
      
      @JSName("v1beta1")
      @js.native
      object v1beta1Ns extends js.Object {
        def isCSIDriver(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.storage.v1beta1.CSIDriver */ Boolean = js.native
        def isCSIDriverList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.storage.v1beta1.CSIDriverList */ Boolean = js.native
        def isCSINode(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.storage.v1beta1.CSINode */ Boolean = js.native
        def isCSINodeList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.storage.v1beta1.CSINodeList */ Boolean = js.native
        def isStorageClass(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.storage.v1beta1.StorageClass */ Boolean = js.native
        def isStorageClassList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.storage.v1beta1.StorageClassList */ Boolean = js.native
        def isVolumeAttachment(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.storage.v1beta1.VolumeAttachment */ Boolean = js.native
        def isVolumeAttachmentList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.storage.v1beta1.VolumeAttachmentList */ Boolean = js.native
      }
      
    }
    
  }
  
}

