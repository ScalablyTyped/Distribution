package typings.pulumiKubernetes.mod.rbac

import typings.pulumiKubernetes.v1beta1ClusterRoleBindingListMod.ClusterRoleBindingListArgs
import typings.pulumiKubernetes.v1beta1ClusterRoleBindingMod.ClusterRoleBindingArgs
import typings.pulumiKubernetes.v1beta1ClusterRoleListMod.ClusterRoleListArgs
import typings.pulumiKubernetes.v1beta1ClusterRoleMod.ClusterRoleArgs
import typings.pulumiKubernetes.v1beta1RoleBindingListMod.RoleBindingListArgs
import typings.pulumiKubernetes.v1beta1RoleBindingMod.RoleBindingArgs
import typings.pulumiKubernetes.v1beta1RoleListMod.RoleListArgs
import typings.pulumiKubernetes.v1beta1RoleMod.RoleArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1beta1 {
  
  @JSImport("@pulumi/kubernetes", "rbac.v1beta1.ClusterRole")
  @js.native
  class ClusterRole protected ()
    extends typings.pulumiKubernetes.rbacMod.v1beta1.ClusterRole {
    /**
      * Create a ClusterRole resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClusterRoleArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ClusterRoleArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ClusterRole {
    
    @JSImport("@pulumi/kubernetes", "rbac.v1beta1.ClusterRole")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ClusterRole resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1beta1ClusterRoleMod.ClusterRole = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1beta1ClusterRoleMod.ClusterRole]
    @scala.inline
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1beta1ClusterRoleMod.ClusterRole = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1beta1ClusterRoleMod.ClusterRole]
    
    /**
      * Returns true if the given object is an instance of ClusterRole.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1beta1/clusterRole.ClusterRole */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1beta1/clusterRole.ClusterRole */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes", "rbac.v1beta1.ClusterRoleBinding")
  @js.native
  class ClusterRoleBinding protected ()
    extends typings.pulumiKubernetes.rbacMod.v1beta1.ClusterRoleBinding {
    /**
      * Create a ClusterRoleBinding resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClusterRoleBindingArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ClusterRoleBindingArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ClusterRoleBinding {
    
    @JSImport("@pulumi/kubernetes", "rbac.v1beta1.ClusterRoleBinding")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ClusterRoleBinding resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1beta1ClusterRoleBindingMod.ClusterRoleBinding = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1beta1ClusterRoleBindingMod.ClusterRoleBinding]
    @scala.inline
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1beta1ClusterRoleBindingMod.ClusterRoleBinding = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1beta1ClusterRoleBindingMod.ClusterRoleBinding]
    
    /**
      * Returns true if the given object is an instance of ClusterRoleBinding.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1beta1/clusterRoleBinding.ClusterRoleBinding */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1beta1/clusterRoleBinding.ClusterRoleBinding */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes", "rbac.v1beta1.ClusterRoleBindingList")
  @js.native
  class ClusterRoleBindingList protected ()
    extends typings.pulumiKubernetes.rbacMod.v1beta1.ClusterRoleBindingList {
    /**
      * Create a ClusterRoleBindingList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClusterRoleBindingListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ClusterRoleBindingListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ClusterRoleBindingList {
    
    @JSImport("@pulumi/kubernetes", "rbac.v1beta1.ClusterRoleBindingList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ClusterRoleBindingList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1beta1ClusterRoleBindingListMod.ClusterRoleBindingList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1beta1ClusterRoleBindingListMod.ClusterRoleBindingList]
    @scala.inline
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1beta1ClusterRoleBindingListMod.ClusterRoleBindingList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1beta1ClusterRoleBindingListMod.ClusterRoleBindingList]
    
    /**
      * Returns true if the given object is an instance of ClusterRoleBindingList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1beta1/clusterRoleBindingList.ClusterRoleBindingList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1beta1/clusterRoleBindingList.ClusterRoleBindingList */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes", "rbac.v1beta1.ClusterRoleList")
  @js.native
  class ClusterRoleList protected ()
    extends typings.pulumiKubernetes.rbacMod.v1beta1.ClusterRoleList {
    /**
      * Create a ClusterRoleList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: ClusterRoleListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: ClusterRoleListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object ClusterRoleList {
    
    @JSImport("@pulumi/kubernetes", "rbac.v1beta1.ClusterRoleList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ClusterRoleList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1beta1ClusterRoleListMod.ClusterRoleList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1beta1ClusterRoleListMod.ClusterRoleList]
    @scala.inline
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1beta1ClusterRoleListMod.ClusterRoleList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1beta1ClusterRoleListMod.ClusterRoleList]
    
    /**
      * Returns true if the given object is an instance of ClusterRoleList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1beta1/clusterRoleList.ClusterRoleList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1beta1/clusterRoleList.ClusterRoleList */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes", "rbac.v1beta1.Role")
  @js.native
  class Role protected ()
    extends typings.pulumiKubernetes.rbacMod.v1beta1.Role {
    /**
      * Create a Role resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: RoleArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: RoleArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Role {
    
    @JSImport("@pulumi/kubernetes", "rbac.v1beta1.Role")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Role resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1beta1RoleMod.Role = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1beta1RoleMod.Role]
    @scala.inline
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1beta1RoleMod.Role = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1beta1RoleMod.Role]
    
    /**
      * Returns true if the given object is an instance of Role.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1beta1/role.Role */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1beta1/role.Role */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes", "rbac.v1beta1.RoleBinding")
  @js.native
  class RoleBinding protected ()
    extends typings.pulumiKubernetes.rbacMod.v1beta1.RoleBinding {
    /**
      * Create a RoleBinding resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: RoleBindingArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: RoleBindingArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object RoleBinding {
    
    @JSImport("@pulumi/kubernetes", "rbac.v1beta1.RoleBinding")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing RoleBinding resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1beta1RoleBindingMod.RoleBinding = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1beta1RoleBindingMod.RoleBinding]
    @scala.inline
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1beta1RoleBindingMod.RoleBinding = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1beta1RoleBindingMod.RoleBinding]
    
    /**
      * Returns true if the given object is an instance of RoleBinding.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1beta1/roleBinding.RoleBinding */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1beta1/roleBinding.RoleBinding */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes", "rbac.v1beta1.RoleBindingList")
  @js.native
  class RoleBindingList protected ()
    extends typings.pulumiKubernetes.rbacMod.v1beta1.RoleBindingList {
    /**
      * Create a RoleBindingList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: RoleBindingListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: RoleBindingListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object RoleBindingList {
    
    @JSImport("@pulumi/kubernetes", "rbac.v1beta1.RoleBindingList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing RoleBindingList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1beta1RoleBindingListMod.RoleBindingList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1beta1RoleBindingListMod.RoleBindingList]
    @scala.inline
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1beta1RoleBindingListMod.RoleBindingList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1beta1RoleBindingListMod.RoleBindingList]
    
    /**
      * Returns true if the given object is an instance of RoleBindingList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1beta1/roleBindingList.RoleBindingList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1beta1/roleBindingList.RoleBindingList */ Boolean]
  }
  
  @JSImport("@pulumi/kubernetes", "rbac.v1beta1.RoleList")
  @js.native
  class RoleList protected ()
    extends typings.pulumiKubernetes.rbacMod.v1beta1.RoleList {
    /**
      * Create a RoleList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: RoleListArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: RoleListArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object RoleList {
    
    @JSImport("@pulumi/kubernetes", "rbac.v1beta1.RoleList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing RoleList resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1beta1RoleListMod.RoleList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1beta1RoleListMod.RoleList]
    @scala.inline
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1beta1RoleListMod.RoleList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1beta1RoleListMod.RoleList]
    
    /**
      * Returns true if the given object is an instance of RoleList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1beta1/roleList.RoleList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1beta1/roleList.RoleList */ Boolean]
  }
}
