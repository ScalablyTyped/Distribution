package typings.pulumiKubernetes.rbacMod

import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/rbac", "v1alpha1")
@js.native
object v1alpha1 extends js.Object {
  @js.native
  class ClusterRole protected ()
    extends typings.pulumiKubernetes.rbacV1alpha1Mod.ClusterRole {
    /**
      * Create a rbac.v1alpha1.ClusterRole resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.pulumiKubernetes.inputMod.rbac.v1alpha1.ClusterRole) = this()
    def this(
      name: String,
      args: typings.pulumiKubernetes.inputMod.rbac.v1alpha1.ClusterRole,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class ClusterRoleBinding protected ()
    extends typings.pulumiKubernetes.rbacV1alpha1Mod.ClusterRoleBinding {
    /**
      * Create a rbac.v1alpha1.ClusterRoleBinding resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.pulumiKubernetes.inputMod.rbac.v1alpha1.ClusterRoleBinding) = this()
    def this(
      name: String,
      args: typings.pulumiKubernetes.inputMod.rbac.v1alpha1.ClusterRoleBinding,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class ClusterRoleBindingList protected ()
    extends typings.pulumiKubernetes.rbacV1alpha1Mod.ClusterRoleBindingList {
    /**
      * Create a rbac.v1alpha1.ClusterRoleBindingList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.pulumiKubernetes.inputMod.rbac.v1alpha1.ClusterRoleBindingList) = this()
    def this(
      name: String,
      args: typings.pulumiKubernetes.inputMod.rbac.v1alpha1.ClusterRoleBindingList,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class ClusterRoleList protected ()
    extends typings.pulumiKubernetes.rbacV1alpha1Mod.ClusterRoleList {
    /**
      * Create a rbac.v1alpha1.ClusterRoleList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.pulumiKubernetes.inputMod.rbac.v1alpha1.ClusterRoleList) = this()
    def this(
      name: String,
      args: typings.pulumiKubernetes.inputMod.rbac.v1alpha1.ClusterRoleList,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class Role protected ()
    extends typings.pulumiKubernetes.rbacV1alpha1Mod.Role {
    /**
      * Create a rbac.v1alpha1.Role resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.pulumiKubernetes.inputMod.rbac.v1alpha1.Role) = this()
    def this(
      name: String,
      args: typings.pulumiKubernetes.inputMod.rbac.v1alpha1.Role,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class RoleBinding protected ()
    extends typings.pulumiKubernetes.rbacV1alpha1Mod.RoleBinding {
    /**
      * Create a rbac.v1alpha1.RoleBinding resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.pulumiKubernetes.inputMod.rbac.v1alpha1.RoleBinding) = this()
    def this(
      name: String,
      args: typings.pulumiKubernetes.inputMod.rbac.v1alpha1.RoleBinding,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class RoleBindingList protected ()
    extends typings.pulumiKubernetes.rbacV1alpha1Mod.RoleBindingList {
    /**
      * Create a rbac.v1alpha1.RoleBindingList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.pulumiKubernetes.inputMod.rbac.v1alpha1.RoleBindingList) = this()
    def this(
      name: String,
      args: typings.pulumiKubernetes.inputMod.rbac.v1alpha1.RoleBindingList,
      opts: CustomResourceOptions
    ) = this()
  }
  
  @js.native
  class RoleList protected ()
    extends typings.pulumiKubernetes.rbacV1alpha1Mod.RoleList {
    /**
      * Create a rbac.v1alpha1.RoleList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: typings.pulumiKubernetes.inputMod.rbac.v1alpha1.RoleList) = this()
    def this(
      name: String,
      args: typings.pulumiKubernetes.inputMod.rbac.v1alpha1.RoleList,
      opts: CustomResourceOptions
    ) = this()
  }
  
  /* static members */
  @js.native
  object ClusterRole extends js.Object {
    /**
      * Get the state of an existing `ClusterRole` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.clusterRoleMod.ClusterRole = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.clusterRoleMod.ClusterRole = js.native
    /**
      * Returns true if the given object is an instance of ClusterRole.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/ClusterRole.ClusterRole */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ClusterRoleBinding extends js.Object {
    /**
      * Get the state of an existing `ClusterRoleBinding` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.clusterRoleBindingMod.ClusterRoleBinding = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.clusterRoleBindingMod.ClusterRoleBinding = js.native
    /**
      * Returns true if the given object is an instance of ClusterRoleBinding.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/ClusterRoleBinding.ClusterRoleBinding */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ClusterRoleBindingList extends js.Object {
    /**
      * Get the state of an existing `ClusterRoleBindingList` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.clusterRoleBindingListMod.ClusterRoleBindingList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.clusterRoleBindingListMod.ClusterRoleBindingList = js.native
    /**
      * Returns true if the given object is an instance of ClusterRoleBindingList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/ClusterRoleBindingList.ClusterRoleBindingList */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ClusterRoleList extends js.Object {
    /**
      * Get the state of an existing `ClusterRoleList` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.clusterRoleListMod.ClusterRoleList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.clusterRoleListMod.ClusterRoleList = js.native
    /**
      * Returns true if the given object is an instance of ClusterRoleList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/ClusterRoleList.ClusterRoleList */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Role extends js.Object {
    /**
      * Get the state of an existing `Role` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.roleMod.Role = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.roleMod.Role = js.native
    /**
      * Returns true if the given object is an instance of Role.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/Role.Role */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object RoleBinding extends js.Object {
    /**
      * Get the state of an existing `RoleBinding` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.roleBindingMod.RoleBinding = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.roleBindingMod.RoleBinding = js.native
    /**
      * Returns true if the given object is an instance of RoleBinding.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/RoleBinding.RoleBinding */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object RoleBindingList extends js.Object {
    /**
      * Get the state of an existing `RoleBindingList` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.roleBindingListMod.RoleBindingList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.roleBindingListMod.RoleBindingList = js.native
    /**
      * Returns true if the given object is an instance of RoleBindingList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/RoleBindingList.RoleBindingList */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object RoleList extends js.Object {
    /**
      * Get the state of an existing `RoleList` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): typings.pulumiKubernetes.roleListMod.RoleList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.roleListMod.RoleList = js.native
    /**
      * Returns true if the given object is an instance of RoleList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/rbac/v1alpha1/RoleList.RoleList */ Boolean = js.native
  }
  
}

