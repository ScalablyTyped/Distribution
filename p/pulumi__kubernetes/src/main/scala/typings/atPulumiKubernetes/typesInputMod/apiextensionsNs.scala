package typings.atPulumiKubernetes.typesInputMod

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`apiextensionsDOTk8sDOTio/v1`
import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`apiextensionsDOTk8sDOTio/v1beta1`
import typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1Ns.CustomResourceColumnDefinition
import typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1Ns.CustomResourceConversion
import typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1Ns.CustomResourceDefinition
import typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1Ns.CustomResourceDefinitionCondition
import typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1Ns.CustomResourceDefinitionNames
import typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1Ns.CustomResourceDefinitionSpec
import typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1Ns.CustomResourceDefinitionVersion
import typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1Ns.CustomResourceSubresourceScale
import typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1Ns.CustomResourceSubresources
import typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1Ns.CustomResourceValidation
import typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1Ns.ExternalDocumentation
import typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1Ns.JSONSchemaProps
import typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1Ns.ServiceReference
import typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1Ns.WebhookClientConfig
import typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1Ns.WebhookConversion
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.ListMeta
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.ObjectMeta
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/types/input", "apiextensions")
@js.native
object apiextensionsNs extends js.Object {
  @JSName("v1")
  @js.native
  object v1Ns extends js.Object {
    /**
      * CustomResourceColumnDefinition specifies a column for server side printing.
      */
    trait CustomResourceColumnDefinition extends js.Object {
      /**
        * description is a human readable description of this column.
        */
      var description: js.UndefOr[Input[String]] = js.undefined
      /**
        * format is an optional OpenAPI type definition for this column. The 'name' format is applied
        * to the primary identifier column to assist in clients identifying column is the resource
        * name. See
        * https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for
        * details.
        */
      var format: js.UndefOr[Input[String]] = js.undefined
      /**
        * jsonPath is a simple JSON path (i.e. with array notation) which is evaluated against each
        * custom resource to produce the value for this column.
        */
      var jsonPath: Input[String]
      /**
        * name is a human readable name for the column.
        */
      var name: Input[String]
      /**
        * priority is an integer defining the relative importance of this column compared to others.
        * Lower numbers are considered higher priority. Columns that may be omitted in limited space
        * scenarios should be given a priority greater than 0.
        */
      var priority: js.UndefOr[Input[Double]] = js.undefined
      /**
        * type is an OpenAPI type definition for this column. See
        * https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for
        * details.
        */
      var `type`: Input[String]
    }
    
    /**
      * CustomResourceConversion describes how to convert different versions of a CR.
      */
    trait CustomResourceConversion extends js.Object {
      /**
        * strategy specifies how custom resources are converted between versions. Allowed values are:
        * - `None`: The converter only change the apiVersion and would not touch any other field in
        * the custom resource. - `Webhook`: API Server will call to an external webhook to do the
        * conversion. Additional information
        *   is needed for this option. This requires spec.preserveUnknownFields to be false, and
        * spec.conversion.webhook to be set.
        */
      var strategy: Input[String]
      /**
        * webhook describes how to call the conversion webhook. Required when `strategy` is set to
        * `Webhook`.
        */
      var webhook: js.UndefOr[Input[WebhookConversion]] = js.undefined
    }
    
    /**
      * CustomResourceDefinition represents a resource that should be exposed on the API server.  Its
      * name MUST be in the format <.spec.name>.<.spec.group>.
      */
    trait CustomResourceDefinition extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`apiextensionsDOTk8sDOTio/v1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.CustomResourceDefinition]
          ] = js.undefined
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * spec describes how the user wants the resources to appear
        */
      var spec: Input[CustomResourceDefinitionSpec]
    }
    
    /**
      * CustomResourceDefinitionCondition contains details for the current condition of this pod.
      */
    trait CustomResourceDefinitionCondition extends js.Object {
      /**
        * lastTransitionTime last time the condition transitioned from one status to another.
        */
      var lastTransitionTime: js.UndefOr[Input[String]] = js.undefined
      /**
        * message is a human-readable message indicating details about last transition.
        */
      var message: js.UndefOr[Input[String]] = js.undefined
      /**
        * reason is a unique, one-word, CamelCase reason for the condition's last transition.
        */
      var reason: js.UndefOr[Input[String]] = js.undefined
      /**
        * status is the status of the condition. Can be True, False, Unknown.
        */
      var status: Input[String]
      /**
        * type is the type of the condition. Types include Established, NamesAccepted and
        * Terminating.
        */
      var `type`: Input[String]
    }
    
    /**
      * CustomResourceDefinitionList is a list of CustomResourceDefinition objects.
      */
    trait CustomResourceDefinitionList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`apiextensionsDOTk8sDOTio/v1`]] = js.undefined
      /**
        * items list individual CustomResourceDefinition objects
        */
      var items: Input[js.Array[Input[CustomResourceDefinition]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.atPulumiKubernetesStrings.CustomResourceDefinitionList
            ]
          ] = js.undefined
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
    }
    
    /**
      * CustomResourceDefinitionNames indicates the names to serve this CustomResourceDefinition
      */
    trait CustomResourceDefinitionNames extends js.Object {
      /**
        * categories is a list of grouped resources this custom resource belongs to (e.g. 'all').
        * This is published in API discovery documents, and used by clients to support invocations
        * like `kubectl get all`.
        */
      var categories: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * kind is the serialized kind of the resource. It is normally CamelCase and singular. Custom
        * resource instances will use this value as the `kind` attribute in API calls.
        */
      var kind: Input[String]
      /**
        * listKind is the serialized kind of the list for this resource. Defaults to "`kind`List".
        */
      var listKind: js.UndefOr[Input[String]] = js.undefined
      /**
        * plural is the plural name of the resource to serve. The custom resources are served under
        * `/apis/<group>/<version>/.../<plural>`. Must match the name of the CustomResourceDefinition
        * (in the form `<names.plural>.<group>`). Must be all lowercase.
        */
      var plural: Input[String]
      /**
        * shortNames are short names for the resource, exposed in API discovery documents, and used
        * by clients to support invocations like `kubectl get <shortname>`. It must be all lowercase.
        */
      var shortNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * singular is the singular name of the resource. It must be all lowercase. Defaults to
        * lowercased `kind`.
        */
      var singular: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * CustomResourceDefinitionSpec describes how a user wants their resource to appear
      */
    trait CustomResourceDefinitionSpec extends js.Object {
      /**
        * conversion defines conversion settings for the CRD.
        */
      var conversion: js.UndefOr[Input[CustomResourceConversion]] = js.undefined
      /**
        * group is the API group of the defined custom resource. The custom resources are served
        * under `/apis/<group>/...`. Must match the name of the CustomResourceDefinition (in the form
        * `<names.plural>.<group>`).
        */
      var group: Input[String]
      /**
        * names specify the resource and kind names for the custom resource.
        */
      var names: Input[CustomResourceDefinitionNames]
      /**
        * preserveUnknownFields indicates that object fields which are not specified in the OpenAPI
        * schema should be preserved when persisting to storage. apiVersion, kind, metadata and known
        * fields inside metadata are always preserved. This field is deprecated in favor of setting
        * `x-preserve-unknown-fields` to true in `spec.versions[*].schema.openAPIV3Schema`. See
        * https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions/#pruning-versus-preserving-unknown-fields
        * for details.
        */
      var preserveUnknownFields: js.UndefOr[Input[Boolean]] = js.undefined
      /**
        * scope indicates whether the defined custom resource is cluster- or namespace-scoped.
        * Allowed values are `Cluster` and `Namespaced`. Default is `Namespaced`.
        */
      var scope: Input[String]
      /**
        * versions is the list of all API versions of the defined custom resource. Version names are
        * used to compute the order in which served versions are listed in API discovery. If the
        * version string is "kube-like", it will sort above non "kube-like" version strings, which
        * are ordered lexicographically. "Kube-like" versions start with a "v", then are followed by
        * a number (the major version), then optionally the string "alpha" or "beta" and another
        * number (the minor version). These are sorted first by GA > beta > alpha (where GA is a
        * version with no suffix such as beta or alpha), and then by comparing major version, then
        * minor version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3,
        * v3beta1, v12alpha1, v11alpha2, foo1, foo10.
        */
      var versions: Input[js.Array[Input[CustomResourceDefinitionVersion]]]
    }
    
    /**
      * CustomResourceDefinitionStatus indicates the state of the CustomResourceDefinition
      */
    trait CustomResourceDefinitionStatus extends js.Object {
      /**
        * acceptedNames are the names that are actually being used to serve discovery. They may be
        * different than the names in spec.
        */
      var acceptedNames: Input[CustomResourceDefinitionNames]
      /**
        * conditions indicate state for particular aspects of a CustomResourceDefinition
        */
      var conditions: js.UndefOr[Input[js.Array[Input[CustomResourceDefinitionCondition]]]] = js.undefined
      /**
        * storedVersions lists all versions of CustomResources that were ever persisted. Tracking
        * these versions allows a migration path for stored versions in etcd. The field is mutable so
        * a migration controller can finish a migration to another version (ensuring no old objects
        * are left in storage), and then remove the rest of the versions from this list. Versions may
        * not be removed from `spec.versions` while they exist in this list.
        */
      var storedVersions: Input[js.Array[Input[String]]]
    }
    
    /**
      * CustomResourceDefinitionVersion describes a version for CRD.
      */
    trait CustomResourceDefinitionVersion extends js.Object {
      /**
        * additionalPrinterColumns specifies additional columns returned in Table output. See
        * https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables
        * for details. If no columns are specified, a single column displaying the age of the custom
        * resource is used.
        */
      var additionalPrinterColumns: js.UndefOr[Input[js.Array[Input[CustomResourceColumnDefinition]]]] = js.undefined
      /**
        * name is the version name, e.g. “v1”, “v2beta1”, etc. The custom resources are
        * served under this version at `/apis/<group>/<version>/...` if `served` is true.
        */
      var name: Input[String]
      /**
        * schema describes the schema used for validation, pruning, and defaulting of this version of
        * the custom resource.
        */
      var schema: js.UndefOr[Input[CustomResourceValidation]] = js.undefined
      /**
        * served is a flag enabling/disabling this version from being served via REST APIs
        */
      var served: Input[Boolean]
      /**
        * storage indicates this version should be used when persisting custom resources to storage.
        * There must be exactly one version with storage=true.
        */
      var storage: Input[Boolean]
      /**
        * subresources specify what subresources this version of the defined custom resource have.
        */
      var subresources: js.UndefOr[Input[CustomResourceSubresources]] = js.undefined
    }
    
    /**
      * CustomResourceSubresourceScale defines how to serve the scale subresource for
      * CustomResources.
      */
    trait CustomResourceSubresourceScale extends js.Object {
      /**
        * labelSelectorPath defines the JSON path inside of a custom resource that corresponds to
        * Scale `status.selector`. Only JSON paths without the array notation are allowed. Must be a
        * JSON Path under `.status` or `.spec`. Must be set to work with HorizontalPodAutoscaler. The
        * field pointed by this JSON path must be a string field (not a complex selector struct)
        * which contains a serialized label selector in string form. More info:
        * https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions#scale-subresource
        * If there is no value under the given path in the custom resource, the `status.selector`
        * value in the `/scale` subresource will default to the empty string.
        */
      var labelSelectorPath: js.UndefOr[Input[String]] = js.undefined
      /**
        * specReplicasPath defines the JSON path inside of a custom resource that corresponds to
        * Scale `spec.replicas`. Only JSON paths without the array notation are allowed. Must be a
        * JSON Path under `.spec`. If there is no value under the given path in the custom resource,
        * the `/scale` subresource will return an error on GET.
        */
      var specReplicasPath: Input[String]
      /**
        * statusReplicasPath defines the JSON path inside of a custom resource that corresponds to
        * Scale `status.replicas`. Only JSON paths without the array notation are allowed. Must be a
        * JSON Path under `.status`. If there is no value under the given path in the custom
        * resource, the `status.replicas` value in the `/scale` subresource will default to 0.
        */
      var statusReplicasPath: Input[String]
    }
    
    /**
      * CustomResourceSubresources defines the status and scale subresources for CustomResources.
      */
    trait CustomResourceSubresources extends js.Object {
      /**
        * scale indicates the custom resource should serve a `/scale` subresource that returns an
        * `autoscaling/v1` Scale object.
        */
      var scale: js.UndefOr[Input[CustomResourceSubresourceScale]] = js.undefined
    }
    
    /**
      * CustomResourceValidation is a list of validation methods for CustomResources.
      */
    trait CustomResourceValidation extends js.Object {
      /**
        * openAPIV3Schema is the OpenAPI v3 schema to use for validation and pruning.
        */
      var openAPIV3Schema: js.UndefOr[Input[JSONSchemaProps]] = js.undefined
    }
    
    /**
      * ExternalDocumentation allows referencing an external resource for extended documentation.
      */
    trait ExternalDocumentation extends js.Object {
      var description: js.UndefOr[Input[String]] = js.undefined
      var url: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * JSONSchemaProps is a JSON-Schema following Specification Draft 4 (http://json-schema.org/).
      */
    trait JSONSchemaProps extends js.Object {
      @JSName("$ref")
      var $ref: js.UndefOr[Input[String]] = js.undefined
      @JSName("$schema")
      var $schema: js.UndefOr[Input[String]] = js.undefined
      var additionalItems: js.UndefOr[Input[JSONSchemaProps | Boolean]] = js.undefined
      var additionalProperties: js.UndefOr[Input[JSONSchemaProps | Boolean]] = js.undefined
      var allOf: js.UndefOr[Input[js.Array[Input[JSONSchemaProps]]]] = js.undefined
      var anyOf: js.UndefOr[Input[js.Array[Input[JSONSchemaProps]]]] = js.undefined
      /**
        * default is a default value for undefined object fields. Defaulting is a beta feature under
        * the CustomResourceDefaulting feature gate. Defaulting requires spec.preserveUnknownFields
        * to be false.
        */
      var default: js.UndefOr[Input[_]] = js.undefined
      var definitions: js.UndefOr[Input[js.Object]] = js.undefined
      var dependencies: js.UndefOr[Input[js.Object]] = js.undefined
      var description: js.UndefOr[Input[String]] = js.undefined
      var enum: js.UndefOr[Input[js.Array[Input[_]]]] = js.undefined
      var example: js.UndefOr[Input[_]] = js.undefined
      var exclusiveMaximum: js.UndefOr[Input[Boolean]] = js.undefined
      var exclusiveMinimum: js.UndefOr[Input[Boolean]] = js.undefined
      var externalDocs: js.UndefOr[Input[ExternalDocumentation]] = js.undefined
      var format: js.UndefOr[Input[String]] = js.undefined
      var id: js.UndefOr[Input[String]] = js.undefined
      var items: js.UndefOr[Input[JSONSchemaProps | js.Array[_]]] = js.undefined
      var maxItems: js.UndefOr[Input[Double]] = js.undefined
      var maxLength: js.UndefOr[Input[Double]] = js.undefined
      var maxProperties: js.UndefOr[Input[Double]] = js.undefined
      var maximum: js.UndefOr[Input[Double]] = js.undefined
      var minItems: js.UndefOr[Input[Double]] = js.undefined
      var minLength: js.UndefOr[Input[Double]] = js.undefined
      var minProperties: js.UndefOr[Input[Double]] = js.undefined
      var minimum: js.UndefOr[Input[Double]] = js.undefined
      var multipleOf: js.UndefOr[Input[Double]] = js.undefined
      var not: js.UndefOr[Input[JSONSchemaProps]] = js.undefined
      var nullable: js.UndefOr[Input[Boolean]] = js.undefined
      var oneOf: js.UndefOr[Input[js.Array[Input[JSONSchemaProps]]]] = js.undefined
      var pattern: js.UndefOr[Input[String]] = js.undefined
      var patternProperties: js.UndefOr[Input[js.Object]] = js.undefined
      var properties: js.UndefOr[Input[js.Object]] = js.undefined
      var required: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      var title: js.UndefOr[Input[String]] = js.undefined
      var `type`: js.UndefOr[Input[String]] = js.undefined
      var uniqueItems: js.UndefOr[Input[Boolean]] = js.undefined
      /**
        * x-kubernetes-embedded-resource defines that the value is an embedded Kubernetes
        * runtime.Object, with TypeMeta and ObjectMeta. The type must be object. It is allowed to
        * further restrict the embedded object. kind, apiVersion and metadata are validated
        * automatically. x-kubernetes-preserve-unknown-fields is allowed to be true, but does not
        * have to be if the object is fully specified (up to kind, apiVersion, metadata).
        */
      var x_kubernetes_embedded_resource: js.UndefOr[Input[Boolean]] = js.undefined
      /**
        * x-kubernetes-int-or-string specifies that this value is either an integer or a string. If
        * this is true, an empty type is allowed and type as child of anyOf is permitted if following
        * one of the following patterns:
        *
        * 1) anyOf:
        *    - type: integer
        *    - type: string
        * 2) allOf:
        *    - anyOf:
        *      - type: integer
        *      - type: string
        *    - ... zero or more
        */
      var x_kubernetes_int_or_string: js.UndefOr[Input[Boolean]] = js.undefined
      /**
        * x-kubernetes-list-map-keys annotates an array with the x-kubernetes-list-type `map` by
        * specifying the keys used as the index of the map.
        *
        * This tag MUST only be used on lists that have the "x-kubernetes-list-type" extension set to
        * "map". Also, the values specified for this attribute must be a scalar typed field of the
        * child structure (no nesting is supported).
        */
      var x_kubernetes_list_map_keys: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * x-kubernetes-list-type annotates an array to further describe its topology. This extension
        * must only be used on lists and may have 3 possible values:
        *
        * 1) `atomic`: the list is treated as a single entity, like a scalar.
        *      Atomic lists will be entirely replaced when updated. This extension
        *      may be used on any type of list (struct, scalar, ...).
        * 2) `set`:
        *      Sets are lists that must not have multiple items with the same value. Each
        *      value must be a scalar (or another atomic type).
        * 3) `map`:
        *      These lists are like maps in that their elements have a non-index key
        *      used to identify them. Order is preserved upon merge. The map tag
        *      must only be used on a list with elements of type object.
        * Defaults to atomic for arrays.
        */
      var x_kubernetes_list_type: js.UndefOr[Input[String]] = js.undefined
      /**
        * x-kubernetes-preserve-unknown-fields stops the API server decoding step from pruning fields
        * which are not specified in the validation schema. This affects fields recursively, but
        * switches back to normal pruning behaviour if nested properties or additionalProperties are
        * specified in the schema. This can either be true or undefined. False is forbidden.
        */
      var x_kubernetes_preserve_unknown_fields: js.UndefOr[Input[Boolean]] = js.undefined
    }
    
    /**
      * ServiceReference holds a reference to Service.legacy.k8s.io
      */
    trait ServiceReference extends js.Object {
      /**
        * name is the name of the service. Required
        */
      var name: Input[String]
      /**
        * namespace is the namespace of the service. Required
        */
      var namespace: Input[String]
      /**
        * path is an optional URL path at which the webhook will be contacted.
        */
      var path: js.UndefOr[Input[String]] = js.undefined
      /**
        * port is an optional service port at which the webhook will be contacted. `port` should be a
        * valid port number (1-65535, inclusive). Defaults to 443 for backward compatibility.
        */
      var port: js.UndefOr[Input[Double]] = js.undefined
    }
    
    /**
      * WebhookClientConfig contains the information to make a TLS connection with the webhook.
      */
    trait WebhookClientConfig extends js.Object {
      /**
        * caBundle is a PEM encoded CA bundle which will be used to validate the webhook's server
        * certificate. If unspecified, system trust roots on the apiserver are used.
        */
      var caBundle: js.UndefOr[Input[String]] = js.undefined
      /**
        * service is a reference to the service for this webhook. Either service or url must be
        * specified.
        *
        * If the webhook is running within the cluster, then you should use `service`.
        */
      var service: js.UndefOr[Input[ServiceReference]] = js.undefined
      /**
        * url gives the location of the webhook, in standard URL form (`scheme://host:port/path`).
        * Exactly one of `url` or `service` must be specified.
        *
        * The `host` should not refer to a service running in the cluster; use the `service` field
        * instead. The host might be resolved via external DNS in some apiservers (e.g.,
        * `kube-apiserver` cannot resolve in-cluster DNS as that would be a layering violation).
        * `host` may also be an IP address.
        *
        * Please note that using `localhost` or `127.0.0.1` as a `host` is risky unless you take
        * great care to run this webhook on all hosts which run an apiserver which might need to make
        * calls to this webhook. Such installs are likely to be non-portable, i.e., not easy to turn
        * up in a new cluster.
        *
        * The scheme must be "https"; the URL must begin with "https://".
        *
        * A path is optional, and if present may be any string permissible in a URL. You may use the
        * path to pass an arbitrary string to the webhook, for example, a cluster identifier.
        *
        * Attempting to use a user or basic auth e.g. "user:password@" is not allowed. Fragments
        * ("#...") and query parameters ("?...") are not allowed, either.
        */
      var url: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * WebhookConversion describes how to call a conversion webhook
      */
    trait WebhookConversion extends js.Object {
      /**
        * clientConfig is the instructions for how to call the webhook if strategy is `Webhook`.
        */
      var clientConfig: js.UndefOr[Input[WebhookClientConfig]] = js.undefined
      /**
        * conversionReviewVersions is an ordered list of preferred `ConversionReview` versions the
        * Webhook expects. The API server will use the first version in the list which it supports.
        * If none of the versions specified in this list are supported by API server, conversion will
        * fail for the custom resource. If a persisted Webhook configuration specifies allowed
        * versions and does not include any versions known to the API Server, calls to the webhook
        * will fail.
        */
      var conversionReviewVersions: Input[js.Array[Input[String]]]
    }
    
    def isCustomResourceDefinition(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apiextensions.v1.CustomResourceDefinition */ Boolean = js.native
    def isCustomResourceDefinitionList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apiextensions.v1.CustomResourceDefinitionList */ Boolean = js.native
  }
  
  @JSName("v1beta1")
  @js.native
  object v1beta1Ns extends js.Object {
    /**
      * CustomResourceColumnDefinition specifies a column for server side printing.
      */
    trait CustomResourceColumnDefinition extends js.Object {
      /**
        * JSONPath is a simple JSON path (i.e. with array notation) which is evaluated against each
        * custom resource to produce the value for this column.
        */
      var JSONPath: Input[String]
      /**
        * description is a human readable description of this column.
        */
      var description: js.UndefOr[Input[String]] = js.undefined
      /**
        * format is an optional OpenAPI type definition for this column. The 'name' format is applied
        * to the primary identifier column to assist in clients identifying column is the resource
        * name. See
        * https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for
        * details.
        */
      var format: js.UndefOr[Input[String]] = js.undefined
      /**
        * name is a human readable name for the column.
        */
      var name: Input[String]
      /**
        * priority is an integer defining the relative importance of this column compared to others.
        * Lower numbers are considered higher priority. Columns that may be omitted in limited space
        * scenarios should be given a priority greater than 0.
        */
      var priority: js.UndefOr[Input[Double]] = js.undefined
      /**
        * type is an OpenAPI type definition for this column. See
        * https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for
        * details.
        */
      var `type`: Input[String]
    }
    
    /**
      * CustomResourceConversion describes how to convert different versions of a CR.
      */
    trait CustomResourceConversion extends js.Object {
      /**
        * conversionReviewVersions is an ordered list of preferred `ConversionReview` versions the
        * Webhook expects. The API server will use the first version in the list which it supports.
        * If none of the versions specified in this list are supported by API server, conversion will
        * fail for the custom resource. If a persisted Webhook configuration specifies allowed
        * versions and does not include any versions known to the API Server, calls to the webhook
        * will fail. Defaults to `["v1beta1"]`.
        */
      var conversionReviewVersions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * strategy specifies how custom resources are converted between versions. Allowed values are:
        * - `None`: The converter only change the apiVersion and would not touch any other field in
        * the custom resource. - `Webhook`: API Server will call to an external webhook to do the
        * conversion. Additional information
        *   is needed for this option. This requires spec.preserveUnknownFields to be false, and
        * spec.conversion.webhookClientConfig to be set.
        */
      var strategy: Input[String]
      /**
        * webhookClientConfig is the instructions for how to call the webhook if strategy is
        * `Webhook`. Required when `strategy` is set to `Webhook`.
        */
      var webhookClientConfig: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.WebhookClientConfig
            ]
          ] = js.undefined
    }
    
    /**
      * CustomResourceDefinition represents a resource that should be exposed on the API server.  Its
      * name MUST be in the format <.spec.name>.<.spec.group>. Deprecated in v1.16, planned for
      * removal in v1.19. Use apiextensions.k8s.io/v1 CustomResourceDefinition instead.
      */
    trait CustomResourceDefinition extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`apiextensionsDOTk8sDOTio/v1beta1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.CustomResourceDefinition]
          ] = js.undefined
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * spec describes how the user wants the resources to appear
        */
      var spec: Input[
            typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinitionSpec
          ]
    }
    
    /**
      * CustomResourceDefinitionCondition contains details for the current condition of this pod.
      */
    trait CustomResourceDefinitionCondition extends js.Object {
      /**
        * lastTransitionTime last time the condition transitioned from one status to another.
        */
      var lastTransitionTime: js.UndefOr[Input[String]] = js.undefined
      /**
        * message is a human-readable message indicating details about last transition.
        */
      var message: js.UndefOr[Input[String]] = js.undefined
      /**
        * reason is a unique, one-word, CamelCase reason for the condition's last transition.
        */
      var reason: js.UndefOr[Input[String]] = js.undefined
      /**
        * status is the status of the condition. Can be True, False, Unknown.
        */
      var status: Input[String]
      /**
        * type is the type of the condition. Types include Established, NamesAccepted and
        * Terminating.
        */
      var `type`: Input[String]
    }
    
    /**
      * CustomResourceDefinitionList is a list of CustomResourceDefinition objects.
      */
    trait CustomResourceDefinitionList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`apiextensionsDOTk8sDOTio/v1beta1`]] = js.undefined
      /**
        * items list individual CustomResourceDefinition objects
        */
      var items: Input[
            js.Array[
              Input[
                typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinition
              ]
            ]
          ]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.atPulumiKubernetesStrings.CustomResourceDefinitionList
            ]
          ] = js.undefined
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
    }
    
    /**
      * CustomResourceDefinitionNames indicates the names to serve this CustomResourceDefinition
      */
    trait CustomResourceDefinitionNames extends js.Object {
      /**
        * categories is a list of grouped resources this custom resource belongs to (e.g. 'all').
        * This is published in API discovery documents, and used by clients to support invocations
        * like `kubectl get all`.
        */
      var categories: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * kind is the serialized kind of the resource. It is normally CamelCase and singular. Custom
        * resource instances will use this value as the `kind` attribute in API calls.
        */
      var kind: Input[String]
      /**
        * listKind is the serialized kind of the list for this resource. Defaults to "`kind`List".
        */
      var listKind: js.UndefOr[Input[String]] = js.undefined
      /**
        * plural is the plural name of the resource to serve. The custom resources are served under
        * `/apis/<group>/<version>/.../<plural>`. Must match the name of the CustomResourceDefinition
        * (in the form `<names.plural>.<group>`). Must be all lowercase.
        */
      var plural: Input[String]
      /**
        * shortNames are short names for the resource, exposed in API discovery documents, and used
        * by clients to support invocations like `kubectl get <shortname>`. It must be all lowercase.
        */
      var shortNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * singular is the singular name of the resource. It must be all lowercase. Defaults to
        * lowercased `kind`.
        */
      var singular: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * CustomResourceDefinitionSpec describes how a user wants their resource to appear
      */
    trait CustomResourceDefinitionSpec extends js.Object {
      /**
        * additionalPrinterColumns specifies additional columns returned in Table output. See
        * https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables
        * for details. If present, this field configures columns for all versions. Top-level and
        * per-version columns are mutually exclusive. If no top-level or per-version columns are
        * specified, a single column displaying the age of the custom resource is used.
        */
      var additionalPrinterColumns: js.UndefOr[
            Input[
              js.Array[
                Input[
                  typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.CustomResourceColumnDefinition
                ]
              ]
            ]
          ] = js.undefined
      /**
        * conversion defines conversion settings for the CRD.
        */
      var conversion: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.CustomResourceConversion
            ]
          ] = js.undefined
      /**
        * group is the API group of the defined custom resource. The custom resources are served
        * under `/apis/<group>/...`. Must match the name of the CustomResourceDefinition (in the form
        * `<names.plural>.<group>`).
        */
      var group: Input[String]
      /**
        * names specify the resource and kind names for the custom resource.
        */
      var names: Input[
            typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinitionNames
          ]
      /**
        * preserveUnknownFields indicates that object fields which are not specified in the OpenAPI
        * schema should be preserved when persisting to storage. apiVersion, kind, metadata and known
        * fields inside metadata are always preserved. If false, schemas must be defined for all
        * versions. Defaults to true in v1beta for backwards compatibility. Deprecated: will be
        * required to be false in v1. Preservation of unknown fields can be specified in the
        * validation schema using the `x-kubernetes-preserve-unknown-fields: true` extension. See
        * https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions/#pruning-versus-preserving-unknown-fields
        * for details.
        */
      var preserveUnknownFields: js.UndefOr[Input[Boolean]] = js.undefined
      /**
        * scope indicates whether the defined custom resource is cluster- or namespace-scoped.
        * Allowed values are `Cluster` and `Namespaced`. Default is `Namespaced`.
        */
      var scope: Input[String]
      /**
        * subresources specify what subresources the defined custom resource has. If present, this
        * field configures subresources for all versions. Top-level and per-version subresources are
        * mutually exclusive.
        */
      var subresources: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.CustomResourceSubresources
            ]
          ] = js.undefined
      /**
        * validation describes the schema used for validation and pruning of the custom resource. If
        * present, this validation schema is used to validate all versions. Top-level and per-version
        * schemas are mutually exclusive.
        */
      var validation: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.CustomResourceValidation
            ]
          ] = js.undefined
      /**
        * version is the API version of the defined custom resource. The custom resources are served
        * under `/apis/<group>/<version>/...`. Must match the name of the first item in the
        * `versions` list if `version` and `versions` are both specified. Optional if `versions` is
        * specified. Deprecated: use `versions` instead.
        */
      var version: js.UndefOr[Input[String]] = js.undefined
      /**
        * versions is the list of all API versions of the defined custom resource. Optional if
        * `version` is specified. The name of the first item in the `versions` list must match the
        * `version` field if `version` and `versions` are both specified. Version names are used to
        * compute the order in which served versions are listed in API discovery. If the version
        * string is "kube-like", it will sort above non "kube-like" version strings, which are
        * ordered lexicographically. "Kube-like" versions start with a "v", then are followed by a
        * number (the major version), then optionally the string "alpha" or "beta" and another number
        * (the minor version). These are sorted first by GA > beta > alpha (where GA is a version
        * with no suffix such as beta or alpha), and then by comparing major version, then minor
        * version. An example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1,
        * v12alpha1, v11alpha2, foo1, foo10.
        */
      var versions: js.UndefOr[
            Input[
              js.Array[
                Input[
                  typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinitionVersion
                ]
              ]
            ]
          ] = js.undefined
    }
    
    /**
      * CustomResourceDefinitionStatus indicates the state of the CustomResourceDefinition
      */
    trait CustomResourceDefinitionStatus extends js.Object {
      /**
        * acceptedNames are the names that are actually being used to serve discovery. They may be
        * different than the names in spec.
        */
      var acceptedNames: Input[
            typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinitionNames
          ]
      /**
        * conditions indicate state for particular aspects of a CustomResourceDefinition
        */
      var conditions: js.UndefOr[
            Input[
              js.Array[
                Input[
                  typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinitionCondition
                ]
              ]
            ]
          ] = js.undefined
      /**
        * storedVersions lists all versions of CustomResources that were ever persisted. Tracking
        * these versions allows a migration path for stored versions in etcd. The field is mutable so
        * a migration controller can finish a migration to another version (ensuring no old objects
        * are left in storage), and then remove the rest of the versions from this list. Versions may
        * not be removed from `spec.versions` while they exist in this list.
        */
      var storedVersions: Input[js.Array[Input[String]]]
    }
    
    /**
      * CustomResourceDefinitionVersion describes a version for CRD.
      */
    trait CustomResourceDefinitionVersion extends js.Object {
      /**
        * additionalPrinterColumns specifies additional columns returned in Table output. See
        * https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables
        * for details. Top-level and per-version columns are mutually exclusive. Per-version columns
        * must not all be set to identical values (top-level columns should be used instead). If no
        * top-level or per-version columns are specified, a single column displaying the age of the
        * custom resource is used.
        */
      var additionalPrinterColumns: js.UndefOr[
            Input[
              js.Array[
                Input[
                  typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.CustomResourceColumnDefinition
                ]
              ]
            ]
          ] = js.undefined
      /**
        * name is the version name, e.g. “v1”, “v2beta1”, etc. The custom resources are
        * served under this version at `/apis/<group>/<version>/...` if `served` is true.
        */
      var name: Input[String]
      /**
        * schema describes the schema used for validation and pruning of this version of the custom
        * resource. Top-level and per-version schemas are mutually exclusive. Per-version schemas
        * must not all be set to identical values (top-level validation schema should be used
        * instead).
        */
      var schema: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.CustomResourceValidation
            ]
          ] = js.undefined
      /**
        * served is a flag enabling/disabling this version from being served via REST APIs
        */
      var served: Input[Boolean]
      /**
        * storage indicates this version should be used when persisting custom resources to storage.
        * There must be exactly one version with storage=true.
        */
      var storage: Input[Boolean]
      /**
        * subresources specify what subresources this version of the defined custom resource have.
        * Top-level and per-version subresources are mutually exclusive. Per-version subresources
        * must not all be set to identical values (top-level subresources should be used instead).
        */
      var subresources: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.CustomResourceSubresources
            ]
          ] = js.undefined
    }
    
    /**
      * CustomResourceSubresourceScale defines how to serve the scale subresource for
      * CustomResources.
      */
    trait CustomResourceSubresourceScale extends js.Object {
      /**
        * labelSelectorPath defines the JSON path inside of a custom resource that corresponds to
        * Scale `status.selector`. Only JSON paths without the array notation are allowed. Must be a
        * JSON Path under `.status` or `.spec`. Must be set to work with HorizontalPodAutoscaler. The
        * field pointed by this JSON path must be a string field (not a complex selector struct)
        * which contains a serialized label selector in string form. More info:
        * https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions#scale-subresource
        * If there is no value under the given path in the custom resource, the `status.selector`
        * value in the `/scale` subresource will default to the empty string.
        */
      var labelSelectorPath: js.UndefOr[Input[String]] = js.undefined
      /**
        * specReplicasPath defines the JSON path inside of a custom resource that corresponds to
        * Scale `spec.replicas`. Only JSON paths without the array notation are allowed. Must be a
        * JSON Path under `.spec`. If there is no value under the given path in the custom resource,
        * the `/scale` subresource will return an error on GET.
        */
      var specReplicasPath: Input[String]
      /**
        * statusReplicasPath defines the JSON path inside of a custom resource that corresponds to
        * Scale `status.replicas`. Only JSON paths without the array notation are allowed. Must be a
        * JSON Path under `.status`. If there is no value under the given path in the custom
        * resource, the `status.replicas` value in the `/scale` subresource will default to 0.
        */
      var statusReplicasPath: Input[String]
    }
    
    /**
      * CustomResourceSubresources defines the status and scale subresources for CustomResources.
      */
    trait CustomResourceSubresources extends js.Object {
      /**
        * scale indicates the custom resource should serve a `/scale` subresource that returns an
        * `autoscaling/v1` Scale object.
        */
      var scale: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.CustomResourceSubresourceScale
            ]
          ] = js.undefined
    }
    
    /**
      * CustomResourceValidation is a list of validation methods for CustomResources.
      */
    trait CustomResourceValidation extends js.Object {
      /**
        * openAPIV3Schema is the OpenAPI v3 schema to use for validation and pruning.
        */
      var openAPIV3Schema: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.JSONSchemaProps
            ]
          ] = js.undefined
    }
    
    /**
      * ExternalDocumentation allows referencing an external resource for extended documentation.
      */
    trait ExternalDocumentation extends js.Object {
      var description: js.UndefOr[Input[String]] = js.undefined
      var url: js.UndefOr[Input[String]] = js.undefined
    }
    
    /**
      * JSONSchemaProps is a JSON-Schema following Specification Draft 4 (http://json-schema.org/).
      */
    trait JSONSchemaProps extends js.Object {
      @JSName("$ref")
      var $ref: js.UndefOr[Input[String]] = js.undefined
      @JSName("$schema")
      var $schema: js.UndefOr[Input[String]] = js.undefined
      var additionalItems: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.JSONSchemaProps | Boolean
            ]
          ] = js.undefined
      var additionalProperties: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.JSONSchemaProps | Boolean
            ]
          ] = js.undefined
      var allOf: js.UndefOr[
            Input[
              js.Array[
                Input[
                  typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.JSONSchemaProps
                ]
              ]
            ]
          ] = js.undefined
      var anyOf: js.UndefOr[
            Input[
              js.Array[
                Input[
                  typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.JSONSchemaProps
                ]
              ]
            ]
          ] = js.undefined
      /**
        * default is a default value for undefined object fields. Defaulting is a beta feature under
        * the CustomResourceDefaulting feature gate. CustomResourceDefinitions with defaults must be
        * created using the v1 (or newer) CustomResourceDefinition API.
        */
      var default: js.UndefOr[Input[_]] = js.undefined
      var definitions: js.UndefOr[Input[js.Object]] = js.undefined
      var dependencies: js.UndefOr[Input[js.Object]] = js.undefined
      var description: js.UndefOr[Input[String]] = js.undefined
      var enum: js.UndefOr[Input[js.Array[Input[_]]]] = js.undefined
      var example: js.UndefOr[Input[_]] = js.undefined
      var exclusiveMaximum: js.UndefOr[Input[Boolean]] = js.undefined
      var exclusiveMinimum: js.UndefOr[Input[Boolean]] = js.undefined
      var externalDocs: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.ExternalDocumentation
            ]
          ] = js.undefined
      var format: js.UndefOr[Input[String]] = js.undefined
      var id: js.UndefOr[Input[String]] = js.undefined
      var items: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.JSONSchemaProps | js.Array[_]
            ]
          ] = js.undefined
      var maxItems: js.UndefOr[Input[Double]] = js.undefined
      var maxLength: js.UndefOr[Input[Double]] = js.undefined
      var maxProperties: js.UndefOr[Input[Double]] = js.undefined
      var maximum: js.UndefOr[Input[Double]] = js.undefined
      var minItems: js.UndefOr[Input[Double]] = js.undefined
      var minLength: js.UndefOr[Input[Double]] = js.undefined
      var minProperties: js.UndefOr[Input[Double]] = js.undefined
      var minimum: js.UndefOr[Input[Double]] = js.undefined
      var multipleOf: js.UndefOr[Input[Double]] = js.undefined
      var not: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.JSONSchemaProps
            ]
          ] = js.undefined
      var nullable: js.UndefOr[Input[Boolean]] = js.undefined
      var oneOf: js.UndefOr[
            Input[
              js.Array[
                Input[
                  typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.JSONSchemaProps
                ]
              ]
            ]
          ] = js.undefined
      var pattern: js.UndefOr[Input[String]] = js.undefined
      var patternProperties: js.UndefOr[Input[js.Object]] = js.undefined
      var properties: js.UndefOr[Input[js.Object]] = js.undefined
      var required: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      var title: js.UndefOr[Input[String]] = js.undefined
      var `type`: js.UndefOr[Input[String]] = js.undefined
      var uniqueItems: js.UndefOr[Input[Boolean]] = js.undefined
      /**
        * x-kubernetes-embedded-resource defines that the value is an embedded Kubernetes
        * runtime.Object, with TypeMeta and ObjectMeta. The type must be object. It is allowed to
        * further restrict the embedded object. kind, apiVersion and metadata are validated
        * automatically. x-kubernetes-preserve-unknown-fields is allowed to be true, but does not
        * have to be if the object is fully specified (up to kind, apiVersion, metadata).
        */
      var x_kubernetes_embedded_resource: js.UndefOr[Input[Boolean]] = js.undefined
      /**
        * x-kubernetes-int-or-string specifies that this value is either an integer or a string. If
        * this is true, an empty type is allowed and type as child of anyOf is permitted if following
        * one of the following patterns:
        *
        * 1) anyOf:
        *    - type: integer
        *    - type: string
        * 2) allOf:
        *    - anyOf:
        *      - type: integer
        *      - type: string
        *    - ... zero or more
        */
      var x_kubernetes_int_or_string: js.UndefOr[Input[Boolean]] = js.undefined
      /**
        * x-kubernetes-list-map-keys annotates an array with the x-kubernetes-list-type `map` by
        * specifying the keys used as the index of the map.
        *
        * This tag MUST only be used on lists that have the "x-kubernetes-list-type" extension set to
        * "map". Also, the values specified for this attribute must be a scalar typed field of the
        * child structure (no nesting is supported).
        */
      var x_kubernetes_list_map_keys: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * x-kubernetes-list-type annotates an array to further describe its topology. This extension
        * must only be used on lists and may have 3 possible values:
        *
        * 1) `atomic`: the list is treated as a single entity, like a scalar.
        *      Atomic lists will be entirely replaced when updated. This extension
        *      may be used on any type of list (struct, scalar, ...).
        * 2) `set`:
        *      Sets are lists that must not have multiple items with the same value. Each
        *      value must be a scalar (or another atomic type).
        * 3) `map`:
        *      These lists are like maps in that their elements have a non-index key
        *      used to identify them. Order is preserved upon merge. The map tag
        *      must only be used on a list with elements of type object.
        * Defaults to atomic for arrays.
        */
      var x_kubernetes_list_type: js.UndefOr[Input[String]] = js.undefined
      /**
        * x-kubernetes-preserve-unknown-fields stops the API server decoding step from pruning fields
        * which are not specified in the validation schema. This affects fields recursively, but
        * switches back to normal pruning behaviour if nested properties or additionalProperties are
        * specified in the schema. This can either be true or undefined. False is forbidden.
        */
      var x_kubernetes_preserve_unknown_fields: js.UndefOr[Input[Boolean]] = js.undefined
    }
    
    /**
      * ServiceReference holds a reference to Service.legacy.k8s.io
      */
    trait ServiceReference extends js.Object {
      /**
        * name is the name of the service. Required
        */
      var name: Input[String]
      /**
        * namespace is the namespace of the service. Required
        */
      var namespace: Input[String]
      /**
        * path is an optional URL path at which the webhook will be contacted.
        */
      var path: js.UndefOr[Input[String]] = js.undefined
      /**
        * port is an optional service port at which the webhook will be contacted. `port` should be a
        * valid port number (1-65535, inclusive). Defaults to 443 for backward compatibility.
        */
      var port: js.UndefOr[Input[Double]] = js.undefined
    }
    
    /**
      * WebhookClientConfig contains the information to make a TLS connection with the webhook.
      */
    trait WebhookClientConfig extends js.Object {
      /**
        * caBundle is a PEM encoded CA bundle which will be used to validate the webhook's server
        * certificate. If unspecified, system trust roots on the apiserver are used.
        */
      var caBundle: js.UndefOr[Input[String]] = js.undefined
      /**
        * service is a reference to the service for this webhook. Either service or url must be
        * specified.
        *
        * If the webhook is running within the cluster, then you should use `service`.
        */
      var service: js.UndefOr[
            Input[
              typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.ServiceReference
            ]
          ] = js.undefined
      /**
        * url gives the location of the webhook, in standard URL form (`scheme://host:port/path`).
        * Exactly one of `url` or `service` must be specified.
        *
        * The `host` should not refer to a service running in the cluster; use the `service` field
        * instead. The host might be resolved via external DNS in some apiservers (e.g.,
        * `kube-apiserver` cannot resolve in-cluster DNS as that would be a layering violation).
        * `host` may also be an IP address.
        *
        * Please note that using `localhost` or `127.0.0.1` as a `host` is risky unless you take
        * great care to run this webhook on all hosts which run an apiserver which might need to make
        * calls to this webhook. Such installs are likely to be non-portable, i.e., not easy to turn
        * up in a new cluster.
        *
        * The scheme must be "https"; the URL must begin with "https://".
        *
        * A path is optional, and if present may be any string permissible in a URL. You may use the
        * path to pass an arbitrary string to the webhook, for example, a cluster identifier.
        *
        * Attempting to use a user or basic auth e.g. "user:password@" is not allowed. Fragments
        * ("#...") and query parameters ("?...") are not allowed, either.
        */
      var url: js.UndefOr[Input[String]] = js.undefined
    }
    
    def isCustomResourceDefinition(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apiextensions.v1beta1.CustomResourceDefinition */ Boolean = js.native
    def isCustomResourceDefinitionList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apiextensions.v1beta1.CustomResourceDefinitionList */ Boolean = js.native
  }
  
}

