package typings.pulumiKubernetes.mod.rbac

import typings.pulumiKubernetes.clusterRoleBindingListMod.ClusterRoleBindingListArgs
import typings.pulumiKubernetes.clusterRoleBindingMod.ClusterRoleBindingArgs
import typings.pulumiKubernetes.clusterRoleListMod.ClusterRoleListArgs
import typings.pulumiKubernetes.clusterRoleMod.ClusterRoleArgs
import typings.pulumiKubernetes.roleBindingListMod.RoleBindingListArgs
import typings.pulumiKubernetes.roleBindingMod.RoleBindingArgs
import typings.pulumiKubernetes.roleListMod.RoleListArgs
import typings.pulumiKubernetes.roleMod.RoleArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1alpha1 {
  
  @JSImport("@pulumi/kubernetes", "rbac.v1alpha1.ClusterRole")
  @js.native
  class ClusterRole protected ()
    extends typings.pulumiKubernetes.rbacMod.v1alpha1.ClusterRole {
    /**
      * Create a ClusterRole resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClusterRoleArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ClusterRoleArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ClusterRole {
    
    /**
      * Get an existing ClusterRole resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes", "rbac.v1alpha1.ClusterRole.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.clusterRoleMod.ClusterRole = js.native
    @JSImport("@pulumi/kubernetes", "rbac.v1alpha1.ClusterRole.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.clusterRoleMod.ClusterRole = js.native
    
    /**
      * Returns true if the given object is an instance of ClusterRole.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes", "rbac.v1alpha1.ClusterRole.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/clusterRole.ClusterRole */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes", "rbac.v1alpha1.ClusterRoleBinding")
  @js.native
  class ClusterRoleBinding protected ()
    extends typings.pulumiKubernetes.rbacMod.v1alpha1.ClusterRoleBinding {
    /**
      * Create a ClusterRoleBinding resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClusterRoleBindingArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ClusterRoleBindingArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ClusterRoleBinding {
    
    /**
      * Get an existing ClusterRoleBinding resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes", "rbac.v1alpha1.ClusterRoleBinding.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.clusterRoleBindingMod.ClusterRoleBinding = js.native
    @JSImport("@pulumi/kubernetes", "rbac.v1alpha1.ClusterRoleBinding.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.clusterRoleBindingMod.ClusterRoleBinding = js.native
    
    /**
      * Returns true if the given object is an instance of ClusterRoleBinding.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes", "rbac.v1alpha1.ClusterRoleBinding.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/clusterRoleBinding.ClusterRoleBinding */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes", "rbac.v1alpha1.ClusterRoleBindingList")
  @js.native
  class ClusterRoleBindingList protected ()
    extends typings.pulumiKubernetes.rbacMod.v1alpha1.ClusterRoleBindingList {
    /**
      * Create a ClusterRoleBindingList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClusterRoleBindingListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ClusterRoleBindingListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ClusterRoleBindingList {
    
    /**
      * Get an existing ClusterRoleBindingList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes", "rbac.v1alpha1.ClusterRoleBindingList.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.clusterRoleBindingListMod.ClusterRoleBindingList = js.native
    @JSImport("@pulumi/kubernetes", "rbac.v1alpha1.ClusterRoleBindingList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.clusterRoleBindingListMod.ClusterRoleBindingList = js.native
    
    /**
      * Returns true if the given object is an instance of ClusterRoleBindingList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes", "rbac.v1alpha1.ClusterRoleBindingList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/clusterRoleBindingList.ClusterRoleBindingList */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes", "rbac.v1alpha1.ClusterRoleList")
  @js.native
  class ClusterRoleList protected ()
    extends typings.pulumiKubernetes.rbacMod.v1alpha1.ClusterRoleList {
    /**
      * Create a ClusterRoleList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClusterRoleListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: ClusterRoleListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ClusterRoleList {
    
    /**
      * Get an existing ClusterRoleList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes", "rbac.v1alpha1.ClusterRoleList.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.clusterRoleListMod.ClusterRoleList = js.native
    @JSImport("@pulumi/kubernetes", "rbac.v1alpha1.ClusterRoleList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.clusterRoleListMod.ClusterRoleList = js.native
    
    /**
      * Returns true if the given object is an instance of ClusterRoleList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes", "rbac.v1alpha1.ClusterRoleList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/clusterRoleList.ClusterRoleList */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes", "rbac.v1alpha1.Role")
  @js.native
  class Role protected ()
    extends typings.pulumiKubernetes.rbacMod.v1alpha1.Role {
    /**
      * Create a Role resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: RoleArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: RoleArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Role {
    
    /**
      * Get an existing Role resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes", "rbac.v1alpha1.Role.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.roleMod.Role = js.native
    @JSImport("@pulumi/kubernetes", "rbac.v1alpha1.Role.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.roleMod.Role = js.native
    
    /**
      * Returns true if the given object is an instance of Role.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes", "rbac.v1alpha1.Role.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/role.Role */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes", "rbac.v1alpha1.RoleBinding")
  @js.native
  class RoleBinding protected ()
    extends typings.pulumiKubernetes.rbacMod.v1alpha1.RoleBinding {
    /**
      * Create a RoleBinding resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: RoleBindingArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: RoleBindingArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object RoleBinding {
    
    /**
      * Get an existing RoleBinding resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes", "rbac.v1alpha1.RoleBinding.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.roleBindingMod.RoleBinding = js.native
    @JSImport("@pulumi/kubernetes", "rbac.v1alpha1.RoleBinding.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.roleBindingMod.RoleBinding = js.native
    
    /**
      * Returns true if the given object is an instance of RoleBinding.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes", "rbac.v1alpha1.RoleBinding.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/roleBinding.RoleBinding */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes", "rbac.v1alpha1.RoleBindingList")
  @js.native
  class RoleBindingList protected ()
    extends typings.pulumiKubernetes.rbacMod.v1alpha1.RoleBindingList {
    /**
      * Create a RoleBindingList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: RoleBindingListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: RoleBindingListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object RoleBindingList {
    
    /**
      * Get an existing RoleBindingList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes", "rbac.v1alpha1.RoleBindingList.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.roleBindingListMod.RoleBindingList = js.native
    @JSImport("@pulumi/kubernetes", "rbac.v1alpha1.RoleBindingList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.roleBindingListMod.RoleBindingList = js.native
    
    /**
      * Returns true if the given object is an instance of RoleBindingList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes", "rbac.v1alpha1.RoleBindingList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/roleBindingList.RoleBindingList */ Boolean = js.native
  }
  
  @JSImport("@pulumi/kubernetes", "rbac.v1alpha1.RoleList")
  @js.native
  class RoleList protected ()
    extends typings.pulumiKubernetes.rbacMod.v1alpha1.RoleList {
    /**
      * Create a RoleList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: RoleListArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: RoleListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object RoleList {
    
    /**
      * Get an existing RoleList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/kubernetes", "rbac.v1alpha1.RoleList.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.roleListMod.RoleList = js.native
    @JSImport("@pulumi/kubernetes", "rbac.v1alpha1.RoleList.get")
    @js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.roleListMod.RoleList = js.native
    
    /**
      * Returns true if the given object is an instance of RoleList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/kubernetes", "rbac.v1alpha1.RoleList.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/roleList.RoleList */ Boolean = js.native
  }
}
