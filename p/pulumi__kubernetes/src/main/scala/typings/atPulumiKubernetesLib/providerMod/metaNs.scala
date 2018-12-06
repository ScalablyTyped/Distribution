package typings
package atPulumiKubernetesLib.providerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/provider", "meta")
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
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a meta.v1.APIGroup resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a meta.v1.APIGroup resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.APIGroup) = this()
      /**
                  * Create a meta.v1.APIGroup resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.APIGroup, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * name is the name of the group.
                   */
      val name: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * preferredVersion is the version preferred by the API server, which probably is the storage
                   * version.
                   */
      val preferredVersion: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.GroupVersionForDiscovery] = js.native
      /**
                   * a map of client CIDR to server address that is serving this group. This is to help clients
                   * reach servers in the most network-efficient way possible. Clients can use the appropriate
                   * server address as per the CIDR that they match. In case of multiple matches, clients should
                   * use the longest matching CIDR. The server returns only those CIDRs that it thinks that the
                   * client can match. For example: the master will return an internal IP CIDR only, if the
                   * client reaches the server using an internal IP. Server looks at X-Forwarded-For header or
                   * X-Real-Ip header or request.RemoteAddr (in that order) to get the client IP.
                   */
      val serverAddressByClientCIDRs: atPulumiPulumiLib.pulumiMod.Output[
            js.Array[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ServerAddressByClientCIDR]
          ] = js.native
      /**
                   * versions are the versions supported in this group.
                   */
      val versions: atPulumiPulumiLib.pulumiMod.Output[
            js.Array[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.GroupVersionForDiscovery]
          ] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.APIGroup = js.native
    }
    
    /**
             * APIGroupList is a list of APIGroup, to allow clients to discover the API at /apis.
             */
    @js.native
    class APIGroupList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a meta.v1.APIGroupList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a meta.v1.APIGroupList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.APIGroupList) = this()
      /**
                  * Create a meta.v1.APIGroupList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.APIGroupList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * groups is a list of APIGroup.
                   */
      val groups: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.APIGroup]] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.APIGroupList = js.native
    }
    
    /**
             * APIResourceList is a list of APIResource, it is used to expose the name of the resources
             * supported in a specific group and version, and if the resource is namespaced.
             */
    @js.native
    class APIResourceList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a meta.v1.APIResourceList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a meta.v1.APIResourceList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.APIResourceList) = this()
      /**
                  * Create a meta.v1.APIResourceList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.APIResourceList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * groupVersion is the group and version this APIResourceList is for.
                   */
      val groupVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * resources contains the name of the resources and if they are namespaced.
                   */
      val resources: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.APIResource]] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.APIResourceList = js.native
    }
    
    /**
             * APIVersions lists the versions that are available, to allow clients to discover the API at
             * /api, which is the root path of the legacy v1 API.
             */
    @js.native
    class APIVersions protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a meta.v1.APIVersions resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a meta.v1.APIVersions resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.APIVersions) = this()
      /**
                  * Create a meta.v1.APIVersions resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.APIVersions, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * a map of client CIDR to server address that is serving this group. This is to help clients
                   * reach servers in the most network-efficient way possible. Clients can use the appropriate
                   * server address as per the CIDR that they match. In case of multiple matches, clients should
                   * use the longest matching CIDR. The server returns only those CIDRs that it thinks that the
                   * client can match. For example: the master will return an internal IP CIDR only, if the
                   * client reaches the server using an internal IP. Server looks at X-Forwarded-For header or
                   * X-Real-Ip header or request.RemoteAddr (in that order) to get the client IP.
                   */
      val serverAddressByClientCIDRs: atPulumiPulumiLib.pulumiMod.Output[
            js.Array[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ServerAddressByClientCIDR]
          ] = js.native
      /**
                   * versions are the api versions that are available.
                   */
      val versions: atPulumiPulumiLib.pulumiMod.Output[js.Array[java.lang.String]] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.APIVersions = js.native
    }
    
    /**
             * DeleteOptions may be provided when deleting an API object.
             */
    @js.native
    class DeleteOptions protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a meta.v1.DeleteOptions resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a meta.v1.DeleteOptions resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.DeleteOptions) = this()
      /**
                  * Create a meta.v1.DeleteOptions resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.DeleteOptions, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * When present, indicates that modifications should not be persisted. An invalid or
                   * unrecognized dryRun directive will result in an error response and no further processing of
                   * the request. Valid values are: - All: all dry run stages will be processed
                   */
      val dryRun: atPulumiPulumiLib.pulumiMod.Output[js.Array[java.lang.String]] = js.native
      /**
                   * The duration in seconds before the object should be deleted. Value must be non-negative
                   * integer. The value zero indicates delete immediately. If this value is nil, the default
                   * grace period for the specified type will be used. Defaults to a per object value if not
                   * specified. zero means delete immediately.
                   */
      val gracePeriodSeconds: atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Deprecated: please use the PropagationPolicy, this field will be deprecated in 1.7. Should
                   * the dependent objects be orphaned. If true/false, the "orphan" finalizer will be added
                   * to/removed from the object's finalizers list. Either this field or PropagationPolicy may be
                   * set, but not both.
                   */
      val orphanDependents: atPulumiPulumiLib.pulumiMod.Output[scala.Boolean] = js.native
      /**
                   * Must be fulfilled before a deletion is carried out. If not possible, a 409 Conflict status
                   * will be returned.
                   */
      val preconditions: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.Preconditions] = js.native
      /**
                   * Whether and how garbage collection will be performed. Either this field or OrphanDependents
                   * may be set, but not both. The default policy is decided by the existing finalizer set in
                   * the metadata.finalizers and the resource-specific default policy. Acceptable values are:
                   * 'Orphan' - orphan the dependents; 'Background' - allow the garbage collector to delete the
                   * dependents in the background; 'Foreground' - a cascading policy that deletes all dependents
                   * in the foreground.
                   */
      val propagationPolicy: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.DeleteOptions = js.native
    }
    
    /**
             * OwnerReference contains enough information to let you identify an owning object. An owning
             * object must be in the same namespace as the dependent, or be cluster-scoped, so there is no
             * namespace field.
             */
    @js.native
    class OwnerReference protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a meta.v1.OwnerReference resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a meta.v1.OwnerReference resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.OwnerReference) = this()
      /**
                  * Create a meta.v1.OwnerReference resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.OwnerReference, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * API version of the referent.
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * If true, AND if the owner has the "foregroundDeletion" finalizer, then the owner cannot be
                   * deleted from the key-value store until this reference is removed. Defaults to false. To set
                   * this field, a user needs "delete" permission of the owner, otherwise 422 (Unprocessable
                   * Entity) will be returned.
                   */
      val blockOwnerDeletion: atPulumiPulumiLib.pulumiMod.Output[scala.Boolean] = js.native
      /**
                   * If true, this reference points to the managing controller.
                   */
      val controller: atPulumiPulumiLib.pulumiMod.Output[scala.Boolean] = js.native
      /**
                   * Kind of the referent. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Name of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#names
                   */
      val name: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * UID of the referent. More info: http://kubernetes.io/docs/user-guide/identifiers#uids
                   */
      val uid: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.OwnerReference = js.native
    }
    
    /**
             * Status is a return value for calls that don't return other objects.
             */
    @js.native
    class Status protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a meta.v1.Status resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a meta.v1.Status resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.Status) = this()
      /**
                  * Create a meta.v1.Status resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.Status, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Suggested HTTP return code for this status, 0 if not set.
                   */
      val code: atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
      /**
                   * Extended data associated with the reason.  Each reason may define its own extended details.
                   * This field is optional and the data returned is not guaranteed to conform to any schema
                   * except that defined by the reason type.
                   */
      val details: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.StatusDetails] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * A human-readable description of the status of this operation.
                   */
      val message: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Standard list metadata. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      /**
                   * A machine-readable description of why this operation is in the "Failure" status. If this
                   * value is empty there is no information available. A Reason clarifies an HTTP status code
                   * but does not override it.
                   */
      val reason: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Status of the operation. One of: "Success" or "Failure". More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
                   */
      val status: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.Status = js.native
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

