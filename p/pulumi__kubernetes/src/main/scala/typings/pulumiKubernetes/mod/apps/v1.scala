package typings.pulumiKubernetes.mod.apps

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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1 {
  
  @JSImport("@pulumi/kubernetes", "apps.v1.ControllerRevision")
  @js.native
  class ControllerRevision protected ()
    extends typings.pulumiKubernetes.appsMod.v1.ControllerRevision {
    /**
      * Create a ControllerRevision resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ControllerRevisionArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ControllerRevisionArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ControllerRevision {
    
    @JSImport("@pulumi/kubernetes", "apps.v1.ControllerRevision")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ControllerRevision resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1ControllerRevisionMod.ControllerRevision = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1ControllerRevisionMod.ControllerRevision]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1ControllerRevisionMod.ControllerRevision = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1ControllerRevisionMod.ControllerRevision]
    
    /**
      * Returns true if the given object is an instance of ControllerRevision.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1/controllerRevision.ControllerRevision */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1/controllerRevision.ControllerRevision */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes", "apps.v1.ControllerRevisionList")
  @js.native
  class ControllerRevisionList protected ()
    extends typings.pulumiKubernetes.appsMod.v1.ControllerRevisionList {
    /**
      * Create a ControllerRevisionList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ControllerRevisionListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ControllerRevisionListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ControllerRevisionList {
    
    @JSImport("@pulumi/kubernetes", "apps.v1.ControllerRevisionList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ControllerRevisionList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1ControllerRevisionListMod.ControllerRevisionList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1ControllerRevisionListMod.ControllerRevisionList]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1ControllerRevisionListMod.ControllerRevisionList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1ControllerRevisionListMod.ControllerRevisionList]
    
    /**
      * Returns true if the given object is an instance of ControllerRevisionList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1/controllerRevisionList.ControllerRevisionList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1/controllerRevisionList.ControllerRevisionList */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes", "apps.v1.DaemonSet")
  @js.native
  class DaemonSet protected ()
    extends typings.pulumiKubernetes.appsMod.v1.DaemonSet {
    /**
      * Create a DaemonSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: DaemonSetArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: DaemonSetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object DaemonSet {
    
    @JSImport("@pulumi/kubernetes", "apps.v1.DaemonSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing DaemonSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1DaemonSetMod.DaemonSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1DaemonSetMod.DaemonSet]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1DaemonSetMod.DaemonSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1DaemonSetMod.DaemonSet]
    
    /**
      * Returns true if the given object is an instance of DaemonSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1/daemonSet.DaemonSet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1/daemonSet.DaemonSet */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes", "apps.v1.DaemonSetList")
  @js.native
  class DaemonSetList protected ()
    extends typings.pulumiKubernetes.appsMod.v1.DaemonSetList {
    /**
      * Create a DaemonSetList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: DaemonSetListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: DaemonSetListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object DaemonSetList {
    
    @JSImport("@pulumi/kubernetes", "apps.v1.DaemonSetList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing DaemonSetList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1DaemonSetListMod.DaemonSetList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1DaemonSetListMod.DaemonSetList]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1DaemonSetListMod.DaemonSetList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1DaemonSetListMod.DaemonSetList]
    
    /**
      * Returns true if the given object is an instance of DaemonSetList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1/daemonSetList.DaemonSetList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1/daemonSetList.DaemonSetList */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes", "apps.v1.Deployment")
  @js.native
  class Deployment protected ()
    extends typings.pulumiKubernetes.appsMod.v1.Deployment {
    /**
      * Create a Deployment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: DeploymentArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: DeploymentArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Deployment {
    
    @JSImport("@pulumi/kubernetes", "apps.v1.Deployment")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Deployment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1DeploymentMod.Deployment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1DeploymentMod.Deployment]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1DeploymentMod.Deployment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1DeploymentMod.Deployment]
    
    /**
      * Returns true if the given object is an instance of Deployment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1/deployment.Deployment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1/deployment.Deployment */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes", "apps.v1.DeploymentList")
  @js.native
  class DeploymentList protected ()
    extends typings.pulumiKubernetes.appsMod.v1.DeploymentList {
    /**
      * Create a DeploymentList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: DeploymentListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: DeploymentListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object DeploymentList {
    
    @JSImport("@pulumi/kubernetes", "apps.v1.DeploymentList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing DeploymentList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1DeploymentListMod.DeploymentList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1DeploymentListMod.DeploymentList]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1DeploymentListMod.DeploymentList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1DeploymentListMod.DeploymentList]
    
    /**
      * Returns true if the given object is an instance of DeploymentList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1/deploymentList.DeploymentList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1/deploymentList.DeploymentList */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes", "apps.v1.ReplicaSet")
  @js.native
  class ReplicaSet protected ()
    extends typings.pulumiKubernetes.appsMod.v1.ReplicaSet {
    /**
      * Create a ReplicaSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ReplicaSetArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ReplicaSetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ReplicaSet {
    
    @JSImport("@pulumi/kubernetes", "apps.v1.ReplicaSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ReplicaSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1ReplicaSetMod.ReplicaSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1ReplicaSetMod.ReplicaSet]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1ReplicaSetMod.ReplicaSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1ReplicaSetMod.ReplicaSet]
    
    /**
      * Returns true if the given object is an instance of ReplicaSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1/replicaSet.ReplicaSet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1/replicaSet.ReplicaSet */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes", "apps.v1.ReplicaSetList")
  @js.native
  class ReplicaSetList protected ()
    extends typings.pulumiKubernetes.appsMod.v1.ReplicaSetList {
    /**
      * Create a ReplicaSetList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ReplicaSetListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ReplicaSetListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ReplicaSetList {
    
    @JSImport("@pulumi/kubernetes", "apps.v1.ReplicaSetList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ReplicaSetList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1ReplicaSetListMod.ReplicaSetList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1ReplicaSetListMod.ReplicaSetList]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1ReplicaSetListMod.ReplicaSetList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1ReplicaSetListMod.ReplicaSetList]
    
    /**
      * Returns true if the given object is an instance of ReplicaSetList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1/replicaSetList.ReplicaSetList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1/replicaSetList.ReplicaSetList */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes", "apps.v1.StatefulSet")
  @js.native
  class StatefulSet protected ()
    extends typings.pulumiKubernetes.appsMod.v1.StatefulSet {
    /**
      * Create a StatefulSet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: StatefulSetArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: StatefulSetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object StatefulSet {
    
    @JSImport("@pulumi/kubernetes", "apps.v1.StatefulSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing StatefulSet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1StatefulSetMod.StatefulSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1StatefulSetMod.StatefulSet]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1StatefulSetMod.StatefulSet = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1StatefulSetMod.StatefulSet]
    
    /**
      * Returns true if the given object is an instance of StatefulSet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1/statefulSet.StatefulSet */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1/statefulSet.StatefulSet */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes", "apps.v1.StatefulSetList")
  @js.native
  class StatefulSetList protected ()
    extends typings.pulumiKubernetes.appsMod.v1.StatefulSetList {
    /**
      * Create a StatefulSetList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: StatefulSetListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: StatefulSetListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object StatefulSetList {
    
    @JSImport("@pulumi/kubernetes", "apps.v1.StatefulSetList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing StatefulSetList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1StatefulSetListMod.StatefulSetList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1StatefulSetListMod.StatefulSetList]
    inline def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1StatefulSetListMod.StatefulSetList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1StatefulSetListMod.StatefulSetList]
    
    /**
      * Returns true if the given object is an instance of StatefulSetList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1/statefulSetList.StatefulSetList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1/statefulSetList.StatefulSetList */ Boolean]
  }
}
