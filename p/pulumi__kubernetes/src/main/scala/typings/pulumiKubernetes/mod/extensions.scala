package typings.pulumiKubernetes.mod

import typings.pulumiKubernetes.ingressListMod.IngressListArgs
import typings.pulumiKubernetes.ingressMod.IngressArgs
import typings.pulumiKubernetes.networkPolicyListMod.NetworkPolicyListArgs
import typings.pulumiKubernetes.networkPolicyMod.NetworkPolicyArgs
import typings.pulumiKubernetes.podSecurityPolicyListMod.PodSecurityPolicyListArgs
import typings.pulumiKubernetes.podSecurityPolicyMod.PodSecurityPolicyArgs
import typings.pulumiKubernetes.v1beta1DaemonSetListMod.DaemonSetListArgs
import typings.pulumiKubernetes.v1beta1DaemonSetMod.DaemonSetArgs
import typings.pulumiKubernetes.v1beta1DeploymentListMod.DeploymentListArgs
import typings.pulumiKubernetes.v1beta1DeploymentMod.DeploymentArgs
import typings.pulumiKubernetes.v1beta1ReplicaSetListMod.ReplicaSetListArgs
import typings.pulumiKubernetes.v1beta1ReplicaSetMod.ReplicaSetArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extensions {
  
  object v1beta1 {
    
    @JSImport("@pulumi/kubernetes", "extensions.v1beta1.DaemonSet")
    @js.native
    class DaemonSet protected ()
      extends typings.pulumiKubernetes.extensionsMod.v1beta1.DaemonSet {
      /**
        * Create a DaemonSet resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      /** @deprecated extensions/v1beta1/DaemonSet is deprecated by apps/v1/DaemonSet and not supported by Kubernetes v1.16+ clusters. */
      def this(name: String) = this()
      def this(name: String, args: DaemonSetArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: DaemonSetArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object DaemonSet {
      
      /**
        * Get an existing DaemonSet resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes", "extensions.v1beta1.DaemonSet.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1beta1DaemonSetMod.DaemonSet = js.native
      @JSImport("@pulumi/kubernetes", "extensions.v1beta1.DaemonSet.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1beta1DaemonSetMod.DaemonSet = js.native
      
      /**
        * Returns true if the given object is an instance of DaemonSet.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes", "extensions.v1beta1.DaemonSet.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/daemonSet.DaemonSet */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes", "extensions.v1beta1.DaemonSetList")
    @js.native
    class DaemonSetList protected ()
      extends typings.pulumiKubernetes.extensionsMod.v1beta1.DaemonSetList {
      /**
        * Create a DaemonSetList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: DaemonSetListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: DaemonSetListArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object DaemonSetList {
      
      /**
        * Get an existing DaemonSetList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes", "extensions.v1beta1.DaemonSetList.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1beta1DaemonSetListMod.DaemonSetList = js.native
      @JSImport("@pulumi/kubernetes", "extensions.v1beta1.DaemonSetList.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1beta1DaemonSetListMod.DaemonSetList = js.native
      
      /**
        * Returns true if the given object is an instance of DaemonSetList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes", "extensions.v1beta1.DaemonSetList.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/daemonSetList.DaemonSetList */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes", "extensions.v1beta1.Deployment")
    @js.native
    class Deployment protected ()
      extends typings.pulumiKubernetes.extensionsMod.v1beta1.Deployment {
      /**
        * Create a Deployment resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      /** @deprecated extensions/v1beta1/Deployment is deprecated by apps/v1/Deployment and not supported by Kubernetes v1.16+ clusters. */
      def this(name: String) = this()
      def this(name: String, args: DeploymentArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: DeploymentArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object Deployment {
      
      /**
        * Get an existing Deployment resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes", "extensions.v1beta1.Deployment.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1beta1DeploymentMod.Deployment = js.native
      @JSImport("@pulumi/kubernetes", "extensions.v1beta1.Deployment.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1beta1DeploymentMod.Deployment = js.native
      
      /**
        * Returns true if the given object is an instance of Deployment.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes", "extensions.v1beta1.Deployment.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/deployment.Deployment */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes", "extensions.v1beta1.DeploymentList")
    @js.native
    class DeploymentList protected ()
      extends typings.pulumiKubernetes.extensionsMod.v1beta1.DeploymentList {
      /**
        * Create a DeploymentList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: DeploymentListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: DeploymentListArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object DeploymentList {
      
      /**
        * Get an existing DeploymentList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes", "extensions.v1beta1.DeploymentList.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1beta1DeploymentListMod.DeploymentList = js.native
      @JSImport("@pulumi/kubernetes", "extensions.v1beta1.DeploymentList.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1beta1DeploymentListMod.DeploymentList = js.native
      
      /**
        * Returns true if the given object is an instance of DeploymentList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes", "extensions.v1beta1.DeploymentList.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/deploymentList.DeploymentList */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes", "extensions.v1beta1.Ingress")
    @js.native
    class Ingress protected ()
      extends typings.pulumiKubernetes.extensionsMod.v1beta1.Ingress {
      /**
        * Create a Ingress resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      /** @deprecated extensions/v1beta1/Ingress is deprecated by networking.k8s.io/v1beta1/Ingress and not supported by Kubernetes v1.20+ clusters. */
      def this(name: String) = this()
      def this(name: String, args: IngressArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: IngressArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object Ingress {
      
      /**
        * Get an existing Ingress resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes", "extensions.v1beta1.Ingress.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.ingressMod.Ingress = js.native
      @JSImport("@pulumi/kubernetes", "extensions.v1beta1.Ingress.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.ingressMod.Ingress = js.native
      
      /**
        * Returns true if the given object is an instance of Ingress.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes", "extensions.v1beta1.Ingress.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/ingress.Ingress */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes", "extensions.v1beta1.IngressList")
    @js.native
    class IngressList protected ()
      extends typings.pulumiKubernetes.extensionsMod.v1beta1.IngressList {
      /**
        * Create a IngressList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: IngressListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: IngressListArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object IngressList {
      
      /**
        * Get an existing IngressList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes", "extensions.v1beta1.IngressList.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.ingressListMod.IngressList = js.native
      @JSImport("@pulumi/kubernetes", "extensions.v1beta1.IngressList.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.ingressListMod.IngressList = js.native
      
      /**
        * Returns true if the given object is an instance of IngressList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes", "extensions.v1beta1.IngressList.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/ingressList.IngressList */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes", "extensions.v1beta1.NetworkPolicy")
    @js.native
    class NetworkPolicy protected ()
      extends typings.pulumiKubernetes.extensionsMod.v1beta1.NetworkPolicy {
      /**
        * Create a NetworkPolicy resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: NetworkPolicyArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: NetworkPolicyArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object NetworkPolicy {
      
      /**
        * Get an existing NetworkPolicy resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes", "extensions.v1beta1.NetworkPolicy.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.networkPolicyMod.NetworkPolicy = js.native
      @JSImport("@pulumi/kubernetes", "extensions.v1beta1.NetworkPolicy.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.networkPolicyMod.NetworkPolicy = js.native
      
      /**
        * Returns true if the given object is an instance of NetworkPolicy.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes", "extensions.v1beta1.NetworkPolicy.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/networkPolicy.NetworkPolicy */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes", "extensions.v1beta1.NetworkPolicyList")
    @js.native
    class NetworkPolicyList protected ()
      extends typings.pulumiKubernetes.extensionsMod.v1beta1.NetworkPolicyList {
      /**
        * Create a NetworkPolicyList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: NetworkPolicyListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: NetworkPolicyListArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object NetworkPolicyList {
      
      /**
        * Get an existing NetworkPolicyList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes", "extensions.v1beta1.NetworkPolicyList.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.networkPolicyListMod.NetworkPolicyList = js.native
      @JSImport("@pulumi/kubernetes", "extensions.v1beta1.NetworkPolicyList.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.networkPolicyListMod.NetworkPolicyList = js.native
      
      /**
        * Returns true if the given object is an instance of NetworkPolicyList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes", "extensions.v1beta1.NetworkPolicyList.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/networkPolicyList.NetworkPolicyList */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes", "extensions.v1beta1.PodSecurityPolicy")
    @js.native
    class PodSecurityPolicy protected ()
      extends typings.pulumiKubernetes.extensionsMod.v1beta1.PodSecurityPolicy {
      /**
        * Create a PodSecurityPolicy resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PodSecurityPolicyArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: PodSecurityPolicyArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object PodSecurityPolicy {
      
      /**
        * Get an existing PodSecurityPolicy resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes", "extensions.v1beta1.PodSecurityPolicy.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.podSecurityPolicyMod.PodSecurityPolicy = js.native
      @JSImport("@pulumi/kubernetes", "extensions.v1beta1.PodSecurityPolicy.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.podSecurityPolicyMod.PodSecurityPolicy = js.native
      
      /**
        * Returns true if the given object is an instance of PodSecurityPolicy.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes", "extensions.v1beta1.PodSecurityPolicy.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/podSecurityPolicy.PodSecurityPolicy */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes", "extensions.v1beta1.PodSecurityPolicyList")
    @js.native
    class PodSecurityPolicyList protected ()
      extends typings.pulumiKubernetes.extensionsMod.v1beta1.PodSecurityPolicyList {
      /**
        * Create a PodSecurityPolicyList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PodSecurityPolicyListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: PodSecurityPolicyListArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object PodSecurityPolicyList {
      
      /**
        * Get an existing PodSecurityPolicyList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes", "extensions.v1beta1.PodSecurityPolicyList.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.podSecurityPolicyListMod.PodSecurityPolicyList = js.native
      @JSImport("@pulumi/kubernetes", "extensions.v1beta1.PodSecurityPolicyList.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.podSecurityPolicyListMod.PodSecurityPolicyList = js.native
      
      /**
        * Returns true if the given object is an instance of PodSecurityPolicyList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes", "extensions.v1beta1.PodSecurityPolicyList.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/podSecurityPolicyList.PodSecurityPolicyList */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes", "extensions.v1beta1.ReplicaSet")
    @js.native
    class ReplicaSet protected ()
      extends typings.pulumiKubernetes.extensionsMod.v1beta1.ReplicaSet {
      /**
        * Create a ReplicaSet resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      /** @deprecated extensions/v1beta1/ReplicaSet is deprecated by apps/v1/ReplicaSet and not supported by Kubernetes v1.16+ clusters. */
      def this(name: String) = this()
      def this(name: String, args: ReplicaSetArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: ReplicaSetArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object ReplicaSet {
      
      /**
        * Get an existing ReplicaSet resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes", "extensions.v1beta1.ReplicaSet.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1beta1ReplicaSetMod.ReplicaSet = js.native
      @JSImport("@pulumi/kubernetes", "extensions.v1beta1.ReplicaSet.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1beta1ReplicaSetMod.ReplicaSet = js.native
      
      /**
        * Returns true if the given object is an instance of ReplicaSet.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes", "extensions.v1beta1.ReplicaSet.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/replicaSet.ReplicaSet */ Boolean = js.native
    }
    
    @JSImport("@pulumi/kubernetes", "extensions.v1beta1.ReplicaSetList")
    @js.native
    class ReplicaSetList protected ()
      extends typings.pulumiKubernetes.extensionsMod.v1beta1.ReplicaSetList {
      /**
        * Create a ReplicaSetList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: ReplicaSetListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: ReplicaSetListArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object ReplicaSetList {
      
      /**
        * Get an existing ReplicaSetList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @JSImport("@pulumi/kubernetes", "extensions.v1beta1.ReplicaSetList.get")
      @js.native
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1beta1ReplicaSetListMod.ReplicaSetList = js.native
      @JSImport("@pulumi/kubernetes", "extensions.v1beta1.ReplicaSetList.get")
      @js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1beta1ReplicaSetListMod.ReplicaSetList = js.native
      
      /**
        * Returns true if the given object is an instance of ReplicaSetList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @JSImport("@pulumi/kubernetes", "extensions.v1beta1.ReplicaSetList.isInstance")
      @js.native
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/replicaSetList.ReplicaSetList */ Boolean = js.native
    }
  }
}
