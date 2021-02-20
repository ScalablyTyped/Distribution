package typings.pulumiKubernetes

import typings.pulumiKubernetes.v1ControllerRevisionListMod.ControllerRevisionListArgs
import typings.pulumiKubernetes.v1ControllerRevisionMod.ControllerRevisionArgs
import typings.pulumiKubernetes.v1DaemonSetListMod.DaemonSetListArgs
import typings.pulumiKubernetes.v1DaemonSetMod.DaemonSetArgs
import typings.pulumiKubernetes.v1DeploymentListMod.DeploymentListArgs
import typings.pulumiKubernetes.v1DeploymentMod.DeploymentArgs
import typings.pulumiKubernetes.v1ReplicaSetListMod.ReplicaSetListArgs
import typings.pulumiKubernetes.v1ReplicaSetMod.ReplicaSetArgs
import typings.pulumiKubernetes.v1StatefulSetListMod.StatefulSetListArgs
import typings.pulumiKubernetes.v1StatefulSetMod.StatefulSetArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appsV1Mod {
  
  @JSImport("@pulumi/kubernetes/apps/v1", "ControllerRevision")
  @js.native
  class ControllerRevision protected ()
    extends typings.pulumiKubernetes.v1ControllerRevisionMod.ControllerRevision {
    /**
      * Create a ControllerRevision resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ControllerRevisionArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ControllerRevisionArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ControllerRevision {
    
    /**
      * Get an existing ControllerRevision resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/apps/v1", "ControllerRevision.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1ControllerRevisionMod.ControllerRevision = js.native
    @JSImport("@pulumi/kubernetes/apps/v1", "ControllerRevision.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1ControllerRevisionMod.ControllerRevision = js.native
    
    /**
      * Returns true if the given object is an instance of ControllerRevision.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/apps/v1", "ControllerRevision.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1/controllerRevision.ControllerRevision */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/apps/v1", "ControllerRevisionList")
  @js.native
  class ControllerRevisionList protected ()
    extends typings.pulumiKubernetes.v1ControllerRevisionListMod.ControllerRevisionList {
    /**
      * Create a ControllerRevisionList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ControllerRevisionListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ControllerRevisionListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ControllerRevisionList {
    
    /**
      * Get an existing ControllerRevisionList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/apps/v1", "ControllerRevisionList.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1ControllerRevisionListMod.ControllerRevisionList = js.native
    @JSImport("@pulumi/kubernetes/apps/v1", "ControllerRevisionList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1ControllerRevisionListMod.ControllerRevisionList = js.native
    
    /**
      * Returns true if the given object is an instance of ControllerRevisionList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/apps/v1", "ControllerRevisionList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1/controllerRevisionList.ControllerRevisionList */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/apps/v1", "DaemonSet")
  @js.native
  class DaemonSet protected ()
    extends typings.pulumiKubernetes.v1DaemonSetMod.DaemonSet {
    /**
      * Create a DaemonSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
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
    @JSImport("@pulumi/kubernetes/apps/v1", "DaemonSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1DaemonSetMod.DaemonSet = js.native
    @JSImport("@pulumi/kubernetes/apps/v1", "DaemonSet.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1DaemonSetMod.DaemonSet = js.native
    
    /**
      * Returns true if the given object is an instance of DaemonSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/apps/v1", "DaemonSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1/daemonSet.DaemonSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/apps/v1", "DaemonSetList")
  @js.native
  class DaemonSetList protected ()
    extends typings.pulumiKubernetes.v1DaemonSetListMod.DaemonSetList {
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
    @JSImport("@pulumi/kubernetes/apps/v1", "DaemonSetList.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1DaemonSetListMod.DaemonSetList = js.native
    @JSImport("@pulumi/kubernetes/apps/v1", "DaemonSetList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1DaemonSetListMod.DaemonSetList = js.native
    
    /**
      * Returns true if the given object is an instance of DaemonSetList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/apps/v1", "DaemonSetList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1/daemonSetList.DaemonSetList */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/apps/v1", "Deployment")
  @js.native
  class Deployment protected ()
    extends typings.pulumiKubernetes.v1DeploymentMod.Deployment {
    /**
      * Create a Deployment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
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
    @JSImport("@pulumi/kubernetes/apps/v1", "Deployment.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1DeploymentMod.Deployment = js.native
    @JSImport("@pulumi/kubernetes/apps/v1", "Deployment.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1DeploymentMod.Deployment = js.native
    
    /**
      * Returns true if the given object is an instance of Deployment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/apps/v1", "Deployment.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1/deployment.Deployment */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/apps/v1", "DeploymentList")
  @js.native
  class DeploymentList protected ()
    extends typings.pulumiKubernetes.v1DeploymentListMod.DeploymentList {
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
    @JSImport("@pulumi/kubernetes/apps/v1", "DeploymentList.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1DeploymentListMod.DeploymentList = js.native
    @JSImport("@pulumi/kubernetes/apps/v1", "DeploymentList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1DeploymentListMod.DeploymentList = js.native
    
    /**
      * Returns true if the given object is an instance of DeploymentList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/apps/v1", "DeploymentList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1/deploymentList.DeploymentList */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/apps/v1", "ReplicaSet")
  @js.native
  class ReplicaSet protected ()
    extends typings.pulumiKubernetes.v1ReplicaSetMod.ReplicaSet {
    /**
      * Create a ReplicaSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
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
    @JSImport("@pulumi/kubernetes/apps/v1", "ReplicaSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1ReplicaSetMod.ReplicaSet = js.native
    @JSImport("@pulumi/kubernetes/apps/v1", "ReplicaSet.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1ReplicaSetMod.ReplicaSet = js.native
    
    /**
      * Returns true if the given object is an instance of ReplicaSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/apps/v1", "ReplicaSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1/replicaSet.ReplicaSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/apps/v1", "ReplicaSetList")
  @js.native
  class ReplicaSetList protected ()
    extends typings.pulumiKubernetes.v1ReplicaSetListMod.ReplicaSetList {
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
    @JSImport("@pulumi/kubernetes/apps/v1", "ReplicaSetList.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1ReplicaSetListMod.ReplicaSetList = js.native
    @JSImport("@pulumi/kubernetes/apps/v1", "ReplicaSetList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1ReplicaSetListMod.ReplicaSetList = js.native
    
    /**
      * Returns true if the given object is an instance of ReplicaSetList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/apps/v1", "ReplicaSetList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1/replicaSetList.ReplicaSetList */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/apps/v1", "StatefulSet")
  @js.native
  class StatefulSet protected ()
    extends typings.pulumiKubernetes.v1StatefulSetMod.StatefulSet {
    /**
      * Create a StatefulSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: StatefulSetArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: StatefulSetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object StatefulSet {
    
    /**
      * Get an existing StatefulSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/apps/v1", "StatefulSet.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1StatefulSetMod.StatefulSet = js.native
    @JSImport("@pulumi/kubernetes/apps/v1", "StatefulSet.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1StatefulSetMod.StatefulSet = js.native
    
    /**
      * Returns true if the given object is an instance of StatefulSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/apps/v1", "StatefulSet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1/statefulSet.StatefulSet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes/apps/v1", "StatefulSetList")
  @js.native
  class StatefulSetList protected ()
    extends typings.pulumiKubernetes.v1StatefulSetListMod.StatefulSetList {
    /**
      * Create a StatefulSetList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: StatefulSetListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: StatefulSetListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object StatefulSetList {
    
    /**
      * Get an existing StatefulSetList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes/apps/v1", "StatefulSetList.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1StatefulSetListMod.StatefulSetList = js.native
    @JSImport("@pulumi/kubernetes/apps/v1", "StatefulSetList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1StatefulSetListMod.StatefulSetList = js.native
    
    /**
      * Returns true if the given object is an instance of StatefulSetList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes/apps/v1", "StatefulSetList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1/statefulSetList.StatefulSetList */ Boolean = js.native
  }
}
