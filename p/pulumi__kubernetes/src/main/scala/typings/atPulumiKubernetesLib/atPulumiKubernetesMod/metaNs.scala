package typings
package atPulumiKubernetesLib.atPulumiKubernetesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes", "meta")
@js.native
object metaNs extends js.Object {
  @JSName("v1")
  @js.native
  object v1Ns extends js.Object {
    /**
      * APIGroup contains the name, the supported versions, and the preferred version of a group.
      */
    @js.native
    class APIGroup protected ()
      extends atPulumiKubernetesLib.providerMod.metaNs.v1Ns.APIGroup {
      /**
        * Create a meta.v1.APIGroup resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.APIGroup) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.APIGroup, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * APIGroupList is a list of APIGroup, to allow clients to discover the API at /apis.
      */
    @js.native
    class APIGroupList protected ()
      extends atPulumiKubernetesLib.providerMod.metaNs.v1Ns.APIGroupList {
      /**
        * Create a meta.v1.APIGroupList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.APIGroupList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.APIGroupList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * APIResourceList is a list of APIResource, it is used to expose the name of the resources
      * supported in a specific group and version, and if the resource is namespaced.
      */
    @js.native
    class APIResourceList protected ()
      extends atPulumiKubernetesLib.providerMod.metaNs.v1Ns.APIResourceList {
      /**
        * Create a meta.v1.APIResourceList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.APIResourceList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.APIResourceList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * APIVersions lists the versions that are available, to allow clients to discover the API at
      * /api, which is the root path of the legacy v1 API.
      */
    @js.native
    class APIVersions protected ()
      extends atPulumiKubernetesLib.providerMod.metaNs.v1Ns.APIVersions {
      /**
        * Create a meta.v1.APIVersions resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.APIVersions) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.APIVersions, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * DeleteOptions may be provided when deleting an API object.
      */
    @js.native
    class DeleteOptions protected ()
      extends atPulumiKubernetesLib.providerMod.metaNs.v1Ns.DeleteOptions {
      /**
        * Create a meta.v1.DeleteOptions resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.DeleteOptions) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.DeleteOptions, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * OwnerReference contains enough information to let you identify an owning object. An owning
      * object must be in the same namespace as the dependent, or be cluster-scoped, so there is no
      * namespace field.
      */
    @js.native
    class OwnerReference protected ()
      extends atPulumiKubernetesLib.providerMod.metaNs.v1Ns.OwnerReference {
      /**
        * Create a meta.v1.OwnerReference resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.OwnerReference) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.OwnerReference, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * Status is a return value for calls that don't return other objects.
      */
    @js.native
    class Status protected ()
      extends atPulumiKubernetesLib.providerMod.metaNs.v1Ns.Status {
      /**
        * Create a meta.v1.Status resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.Status) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.Status, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
    }
    
    /**
      * APIGroup contains the name, the supported versions, and the preferred version of a group.
      */
    @js.native
    object APIGroup extends js.Object {
      /**
        * Get the state of an existing `APIGroup` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.metaNs.v1Ns.APIGroup = js.native
    }
    
    /**
      * APIGroupList is a list of APIGroup, to allow clients to discover the API at /apis.
      */
    @js.native
    object APIGroupList extends js.Object {
      /**
        * Get the state of an existing `APIGroupList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.metaNs.v1Ns.APIGroupList = js.native
    }
    
    /**
      * APIResourceList is a list of APIResource, it is used to expose the name of the resources
      * supported in a specific group and version, and if the resource is namespaced.
      */
    @js.native
    object APIResourceList extends js.Object {
      /**
        * Get the state of an existing `APIResourceList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.metaNs.v1Ns.APIResourceList = js.native
    }
    
    /**
      * APIVersions lists the versions that are available, to allow clients to discover the API at
      * /api, which is the root path of the legacy v1 API.
      */
    @js.native
    object APIVersions extends js.Object {
      /**
        * Get the state of an existing `APIVersions` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.metaNs.v1Ns.APIVersions = js.native
    }
    
    /**
      * DeleteOptions may be provided when deleting an API object.
      */
    @js.native
    object DeleteOptions extends js.Object {
      /**
        * Get the state of an existing `DeleteOptions` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.metaNs.v1Ns.DeleteOptions = js.native
    }
    
    /**
      * OwnerReference contains enough information to let you identify an owning object. An owning
      * object must be in the same namespace as the dependent, or be cluster-scoped, so there is no
      * namespace field.
      */
    @js.native
    object OwnerReference extends js.Object {
      /**
        * Get the state of an existing `OwnerReference` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.metaNs.v1Ns.OwnerReference = js.native
    }
    
    /**
      * Status is a return value for calls that don't return other objects.
      */
    @js.native
    object Status extends js.Object {
      /**
        * Get the state of an existing `Status` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.metaNs.v1Ns.Status = js.native
    }
    
  }
  
}

