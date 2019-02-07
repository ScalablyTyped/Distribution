package typings
package atPulumiKubernetesLib.typesInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/types/input", "apiextensions")
@js.native
object apiextensionsNs extends js.Object {
  @JSName("v1beta1")
  @js.native
  object v1beta1Ns extends js.Object {
    /**
      * CustomResourceColumnDefinition specifies a column for server side printing.
      */
    trait CustomResourceColumnDefinition extends js.Object {
      /**
        * JSONPath is a simple JSON path, i.e. with array notation.
        */
      var JSONPath: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
        * description is a human readable description of this column.
        */
      var description: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
        * format is an optional OpenAPI type definition for this column. The 'name' format is applied
        * to the primary identifier column to assist in clients identifying column is the resource
        * name. See
        * https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for
        * more.
        */
      var format: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
        * name is a human readable name for the column.
        */
      var name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
        * priority is an integer defining the relative importance of this column compared to others.
        * Lower numbers are considered higher priority. Columns that may be omitted in limited space
        * scenarios should be given a higher priority.
        */
      var priority: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      /**
        * type is an OpenAPI type definition for this column. See
        * https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for
        * more.
        */
      var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
      * CustomResourceConversion describes how to convert different versions of a CR.
      */
    trait CustomResourceConversion extends js.Object {
      /**
        * `strategy` specifies the conversion strategy. Allowed values are: - `None`: The converter
        * only change the apiVersion and would not touch any other field in the CR. - `Webhook`: API
        * Server will call to an external webhook to do the conversion. Additional information is
        * needed for this option.
        */
      var strategy: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
        * `webhookClientConfig` is the instructions for how to call the webhook if strategy is
        * `Webhook`. This field is alpha-level and is only honored by servers that enable the
        * CustomResourceWebhookConversion feature.
        */
      var webhookClientConfig: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[WebhookClientConfig]] = js.undefined
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
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[
              atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1`
            ]
          ] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CustomResourceDefinition]
          ] = js.undefined
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
        * Spec describes how the user wants the resources to appear
        */
      var spec: atPulumiPulumiLib.resourceMod.Input[CustomResourceDefinitionSpec]
      /**
        * Status indicates the actual state of the CustomResourceDefinition
        */
      var status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[CustomResourceDefinitionStatus]] = js.undefined
    }
    
    /**
      * CustomResourceDefinitionCondition contains details for the current condition of this pod.
      */
    trait CustomResourceDefinitionCondition extends js.Object {
      /**
        * Last time the condition transitioned from one status to another.
        */
      var lastTransitionTime: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
        * Human-readable message indicating details about last transition.
        */
      var message: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
        * Unique, one-word, CamelCase reason for the condition's last transition.
        */
      var reason: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
        * Status is the status of the condition. Can be True, False, Unknown.
        */
      var status: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
        * Type is the type of the condition.
        */
      var `type`: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
      * CustomResourceDefinitionList is a list of CustomResourceDefinition objects.
      */
    trait CustomResourceDefinitionList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[
              atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`apiextensionsDOTk8sDOTio/v1beta1`
            ]
          ] = js.undefined
      /**
        * Items individual CustomResourceDefinitions
        */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[CustomResourceDefinition]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.CustomResourceDefinitionList]
          ] = js.undefined
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
      * CustomResourceDefinitionNames indicates the names to serve this CustomResourceDefinition
      */
    trait CustomResourceDefinitionNames extends js.Object {
      /**
        * Categories is a list of grouped resources custom resources belong to (e.g. 'all')
        */
      var categories: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
          ] = js.undefined
      /**
        * Kind is the serialized kind of the resource.  It is normally CamelCase and singular.
        */
      var kind: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
        * ListKind is the serialized kind of the list for this resource.  Defaults to <kind>List.
        */
      var listKind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
        * Plural is the plural name of the resource to serve.  It must match the name of the
        * CustomResourceDefinition-registration too: plural.group and it must be all lowercase.
        */
      var plural: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
        * ShortNames are short names for the resource.  It must be all lowercase.
        */
      var shortNames: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
          ] = js.undefined
      /**
        * Singular is the singular name of the resource.  It must be all lowercase  Defaults to
        * lowercased <kind>
        */
      var singular: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
      * CustomResourceDefinitionSpec describes how a user wants their resource to appear
      */
    trait CustomResourceDefinitionSpec extends js.Object {
      /**
        * AdditionalPrinterColumns are additional columns shown e.g. in kubectl next to the name.
        * Defaults to a created-at column. Optional, the global columns for all versions. Top-level
        * and per-version columns are mutually exclusive.
        */
      var additionalPrinterColumns: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[CustomResourceColumnDefinition]]]
          ] = js.undefined
      /**
        * `conversion` defines conversion settings for the CRD.
        */
      var conversion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[CustomResourceConversion]] = js.undefined
      /**
        * Group is the group this resource belongs in
        */
      var group: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
        * Names are the names used to describe this custom resource
        */
      var names: atPulumiPulumiLib.resourceMod.Input[CustomResourceDefinitionNames]
      /**
        * Scope indicates whether this resource is cluster or namespace scoped.  Default is
        * namespaced
        */
      var scope: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
        * Subresources describes the subresources for CustomResource Optional, the global
        * subresources for all versions. Top-level and per-version subresources are mutually
        * exclusive.
        */
      var subresources: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[CustomResourceSubresources]] = js.undefined
      /**
        * Validation describes the validation methods for CustomResources Optional, the global
        * validation schema for all versions. Top-level and per-version schemas are mutually
        * exclusive.
        */
      var validation: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[CustomResourceValidation]] = js.undefined
      /**
        * Version is the version this resource belongs in Should be always first item in Versions
        * field if provided. Optional, but at least one of Version or Versions must be set.
        * Deprecated: Please use `Versions`.
        */
      var version: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
        * Versions is the list of all supported versions for this resource. If Version field is
        * provided, this field is optional. Validation: All versions must use the same validation
        * schema for now. i.e., top level Validation field is applied to all of these versions.
        * Order: The version name will be used to compute the order. If the version string is
        * "kube-like", it will sort above non "kube-like" version strings, which are ordered
        * lexicographically. "Kube-like" versions start with a "v", then are followed by a number
        * (the major version), then optionally the string "alpha" or "beta" and another number (the
        * minor version). These are sorted first by GA > beta > alpha (where GA is a version with no
        * suffix such as beta or alpha), and then by comparing major version, then minor version. An
        * example sorted list of versions: v10, v2, v1, v11beta2, v10beta3, v3beta1, v12alpha1,
        * v11alpha2, foo1, foo10.
        */
      var versions: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[CustomResourceDefinitionVersion]]]
          ] = js.undefined
    }
    
    /**
      * CustomResourceDefinitionStatus indicates the state of the CustomResourceDefinition
      */
    trait CustomResourceDefinitionStatus extends js.Object {
      /**
        * AcceptedNames are the names that are actually being used to serve discovery They may be
        * different than the names in spec.
        */
      var acceptedNames: atPulumiPulumiLib.resourceMod.Input[CustomResourceDefinitionNames]
      /**
        * Conditions indicate state for particular aspects of a CustomResourceDefinition
        */
      var conditions: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[CustomResourceDefinitionCondition]]]
      /**
        * StoredVersions are all versions of CustomResources that were ever persisted. Tracking these
        * versions allows a migration path for stored versions in etcd. The field is mutable so the
        * migration controller can first finish a migration to another version (i.e. that no old
        * objects are left in the storage), and then remove the rest of the versions from this list.
        * None of the versions in this list can be removed from the spec.Versions field.
        */
      var storedVersions: atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
    }
    
    /**
      * CustomResourceDefinitionVersion describes a version for CRD.
      */
    trait CustomResourceDefinitionVersion extends js.Object {
      /**
        * AdditionalPrinterColumns are additional columns shown e.g. in kubectl next to the name.
        * Defaults to a created-at column. Top-level and per-version columns are mutually exclusive.
        * Per-version columns must not all be set to identical values (top-level columns should be
        * used instead) This field is alpha-level and is only honored by servers that enable the
        * CustomResourceWebhookConversion feature. NOTE: CRDs created prior to 1.13 populated the
        * top-level additionalPrinterColumns field by default. To apply an update that changes to
        * per-version additionalPrinterColumns, the top-level additionalPrinterColumns field must be
        * explicitly set to null
        */
      var additionalPrinterColumns: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[CustomResourceColumnDefinition]]]
          ] = js.undefined
      /**
        * Name is the version name, e.g. “v1”, “v2beta1”, etc.
        */
      var name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
        * Schema describes the schema for CustomResource used in validation, pruning, and defaulting.
        * Top-level and per-version schemas are mutually exclusive. Per-version schemas must not all
        * be set to identical values (top-level validation schema should be used instead) This field
        * is alpha-level and is only honored by servers that enable the
        * CustomResourceWebhookConversion feature.
        */
      var schema: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[CustomResourceValidation]] = js.undefined
      /**
        * Served is a flag enabling/disabling this version from being served via REST APIs
        */
      var served: atPulumiPulumiLib.resourceMod.Input[scala.Boolean]
      /**
        * Storage flags the version as storage version. There must be exactly one flagged as storage
        * version.
        */
      var storage: atPulumiPulumiLib.resourceMod.Input[scala.Boolean]
      /**
        * Subresources describes the subresources for CustomResource Top-level and per-version
        * subresources are mutually exclusive. Per-version subresources must not all be set to
        * identical values (top-level subresources should be used instead) This field is alpha-level
        * and is only honored by servers that enable the CustomResourceWebhookConversion feature.
        */
      var subresources: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[CustomResourceSubresources]] = js.undefined
    }
    
    /**
      * CustomResourceSubresourceScale defines how to serve the scale subresource for
      * CustomResources.
      */
    trait CustomResourceSubresourceScale extends js.Object {
      /**
        * LabelSelectorPath defines the JSON path inside of a CustomResource that corresponds to
        * Scale.Status.Selector. Only JSON paths without the array notation are allowed. Must be a
        * JSON Path under .status. Must be set to work with HPA. If there is no value under the given
        * path in the CustomResource, the status label selector value in the /scale subresource will
        * default to the empty string.
        */
      var labelSelectorPath: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
        * SpecReplicasPath defines the JSON path inside of a CustomResource that corresponds to
        * Scale.Spec.Replicas. Only JSON paths without the array notation are allowed. Must be a JSON
        * Path under .spec. If there is no value under the given path in the CustomResource, the
        * /scale subresource will return an error on GET.
        */
      var specReplicasPath: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
        * StatusReplicasPath defines the JSON path inside of a CustomResource that corresponds to
        * Scale.Status.Replicas. Only JSON paths without the array notation are allowed. Must be a
        * JSON Path under .status. If there is no value under the given path in the CustomResource,
        * the status replica value in the /scale subresource will default to 0.
        */
      var statusReplicasPath: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
      * CustomResourceSubresources defines the status and scale subresources for CustomResources.
      */
    trait CustomResourceSubresources extends js.Object {
      /**
        * Scale denotes the scale subresource for CustomResources
        */
      var scale: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[CustomResourceSubresourceScale]] = js.undefined
      /**
        * Status denotes the status subresource for CustomResources
        */
      var status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[_]] = js.undefined
    }
    
    /**
      * CustomResourceValidation is a list of validation methods for CustomResources.
      */
    trait CustomResourceValidation extends js.Object {
      /**
        * OpenAPIV3Schema is the OpenAPI v3 schema to be validated against.
        */
      var openAPIV3Schema: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[JSONSchemaProps]] = js.undefined
    }
    
    /**
      * ExternalDocumentation allows referencing an external resource for extended documentation.
      */
    trait ExternalDocumentation extends js.Object {
      var description: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      var url: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
      * JSONSchemaProps is a JSON-Schema following Specification Draft 4 (http://json-schema.org/).
      */
    trait JSONSchemaProps extends js.Object {
      @JSName("$ref")
      var $ref: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      @JSName("$schema")
      var $schema: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      var additionalItems: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[JSONSchemaProps | scala.Boolean]] = js.undefined
      var additionalProperties: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[JSONSchemaProps | scala.Boolean]] = js.undefined
      var allOf: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[JSONSchemaProps]]]
          ] = js.undefined
      var anyOf: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[JSONSchemaProps]]]
          ] = js.undefined
      var default: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[_]] = js.undefined
      var definitions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Object]] = js.undefined
      var dependencies: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Object]] = js.undefined
      var description: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      var enum: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[_]]]
          ] = js.undefined
      var example: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[_]] = js.undefined
      var exclusiveMaximum: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      var exclusiveMinimum: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      var externalDocs: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ExternalDocumentation]] = js.undefined
      var format: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      var id: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      var items: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[JSONSchemaProps | js.Array[_]]] = js.undefined
      var maxItems: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      var maxLength: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      var maxProperties: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      var maximum: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      var minItems: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      var minLength: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      var minProperties: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      var minimum: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      var multipleOf: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
      var not: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[JSONSchemaProps]] = js.undefined
      var oneOf: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[JSONSchemaProps]]]
          ] = js.undefined
      var pattern: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      var patternProperties: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Object]] = js.undefined
      var properties: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Object]] = js.undefined
      var required: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiPulumiLib.resourceMod.Input[java.lang.String]]]
          ] = js.undefined
      var title: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      var `type`: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      var uniqueItems: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
    }
    
    /**
      * ServiceReference holds a reference to Service.legacy.k8s.io
      */
    trait ServiceReference extends js.Object {
      /**
        * `name` is the name of the service. Required
        */
      var name: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
        * `namespace` is the namespace of the service. Required
        */
      var namespace: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
      /**
        * `path` is an optional URL path which will be sent in any request to this service.
        */
      var path: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    /**
      * WebhookClientConfig contains the information to make a TLS connection with the webhook. It
      * has the same field as admissionregistration.v1beta1.WebhookClientConfig.
      */
    trait WebhookClientConfig extends js.Object {
      /**
        * `caBundle` is a PEM encoded CA bundle which will be used to validate the webhook's server
        * certificate. If unspecified, system trust roots on the apiserver are used.
        */
      var caBundle: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
        * `service` is a reference to the service for this webhook. Either `service` or `url` must be
        * specified.
        *
        * If the webhook is running within the cluster, then you should use `service`.
        *
        * Port 443 will be used if it is open, otherwise it is an error.
        */
      var service: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ServiceReference]] = js.undefined
      /**
        * `url` gives the location of the webhook, in standard URL form (`scheme://host:port/path`).
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
      var url: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
    }
    
    def isCustomResourceDefinition(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apiextensions.v1beta1.CustomResourceDefinition */ scala.Boolean = js.native
    def isCustomResourceDefinitionList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apiextensions.v1beta1.CustomResourceDefinitionList */ scala.Boolean = js.native
  }
  
}

