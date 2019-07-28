package typings.atPulumiKubernetes.typesInputMod

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`apiextensionsDOTk8sDOTio/v1beta1`
import typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.CustomResourceColumnDefinition
import typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.CustomResourceConversion
import typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinition
import typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinitionCondition
import typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinitionNames
import typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinitionSpec
import typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinitionStatus
import typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinitionVersion
import typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.CustomResourceSubresourceScale
import typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.CustomResourceSubresources
import typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.CustomResourceValidation
import typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.ExternalDocumentation
import typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.JSONSchemaProps
import typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.ServiceReference
import typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.WebhookClientConfig
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.ListMeta
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.ObjectMeta
import typings.atPulumiPulumi.outputMod.Input
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
        * more.
        */
      var format: js.UndefOr[Input[String]] = js.undefined
      /**
        * name is a human readable name for the column.
        */
      var name: Input[String]
      /**
        * priority is an integer defining the relative importance of this column compared to others.
        * Lower numbers are considered higher priority. Columns that may be omitted in limited space
        * scenarios should be given a higher priority.
        */
      var priority: js.UndefOr[Input[Double]] = js.undefined
      /**
        * type is an OpenAPI type definition for this column. See
        * https://github.com/OAI/OpenAPI-Specification/blob/master/versions/2.0.md#data-types for
        * more.
        */
      var `type`: Input[String]
    }
    
    /**
      * CustomResourceConversion describes how to convert different versions of a CR.
      */
    trait CustomResourceConversion extends js.Object {
      /**
        * ConversionReviewVersions is an ordered list of preferred `ConversionReview` versions the
        * Webhook expects. API server will try to use first version in the list which it supports. If
        * none of the versions specified in this list supported by API server, conversion will fail
        * for this object. If a persisted Webhook configuration specifies allowed versions and does
        * not include any versions known to the API Server, calls to the webhook will fail. Default
        * to `['v1beta1']`.
        */
      var conversionReviewVersions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * `strategy` specifies the conversion strategy. Allowed values are: - `None`: The converter
        * only change the apiVersion and would not touch any other field in the CR. - `Webhook`: API
        * Server will call to an external webhook to do the conversion. Additional information
        *   is needed for this option. This requires spec.preserveUnknownFields to be false.
        */
      var strategy: Input[String]
      /**
        * `webhookClientConfig` is the instructions for how to call the webhook if strategy is
        * `Webhook`. This field is alpha-level and is only honored by servers that enable the
        * CustomResourceWebhookConversion feature.
        */
      var webhookClientConfig: js.UndefOr[Input[WebhookClientConfig]] = js.undefined
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
      var apiVersion: js.UndefOr[Input[`apiextensionsDOTk8sDOTio/v1beta1`]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.CustomResourceDefinition]
          ] = js.undefined
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * Spec describes how the user wants the resources to appear
        */
      var spec: Input[CustomResourceDefinitionSpec]
      /**
        * Status indicates the actual state of the CustomResourceDefinition
        */
      var status: js.UndefOr[Input[CustomResourceDefinitionStatus]] = js.undefined
    }
    
    /**
      * CustomResourceDefinitionCondition contains details for the current condition of this pod.
      */
    trait CustomResourceDefinitionCondition extends js.Object {
      /**
        * Last time the condition transitioned from one status to another.
        */
      var lastTransitionTime: js.UndefOr[Input[String]] = js.undefined
      /**
        * Human-readable message indicating details about last transition.
        */
      var message: js.UndefOr[Input[String]] = js.undefined
      /**
        * Unique, one-word, CamelCase reason for the condition's last transition.
        */
      var reason: js.UndefOr[Input[String]] = js.undefined
      /**
        * Status is the status of the condition. Can be True, False, Unknown.
        */
      var status: Input[String]
      /**
        * Type is the type of the condition. Types include Established, NamesAccepted and
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
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[`apiextensionsDOTk8sDOTio/v1beta1`]] = js.undefined
      /**
        * Items individual CustomResourceDefinitions
        */
      var items: Input[js.Array[Input[CustomResourceDefinition]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
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
        * Categories is a list of grouped resources custom resources belong to (e.g. 'all')
        */
      var categories: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * Kind is the serialized kind of the resource.  It is normally CamelCase and singular.
        */
      var kind: Input[String]
      /**
        * ListKind is the serialized kind of the list for this resource.  Defaults to <kind>List.
        */
      var listKind: js.UndefOr[Input[String]] = js.undefined
      /**
        * Plural is the plural name of the resource to serve.  It must match the name of the
        * CustomResourceDefinition-registration too: plural.group and it must be all lowercase.
        */
      var plural: Input[String]
      /**
        * ShortNames are short names for the resource.  It must be all lowercase.
        */
      var shortNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
      /**
        * Singular is the singular name of the resource.  It must be all lowercase  Defaults to
        * lowercased <kind>
        */
      var singular: js.UndefOr[Input[String]] = js.undefined
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
      var additionalPrinterColumns: js.UndefOr[Input[js.Array[Input[CustomResourceColumnDefinition]]]] = js.undefined
      /**
        * `conversion` defines conversion settings for the CRD.
        */
      var conversion: js.UndefOr[Input[CustomResourceConversion]] = js.undefined
      /**
        * Group is the group this resource belongs in
        */
      var group: Input[String]
      /**
        * Names are the names used to describe this custom resource
        */
      var names: Input[CustomResourceDefinitionNames]
      /**
        * preserveUnknownFields disables pruning of object fields which are not specified in the
        * OpenAPI schema. apiVersion, kind, metadata and known fields inside metadata are always
        * preserved. Defaults to true in v1beta and will default to false in v1.
        */
      var preserveUnknownFields: js.UndefOr[Input[Boolean]] = js.undefined
      /**
        * Scope indicates whether this resource is cluster or namespace scoped.  Default is
        * namespaced
        */
      var scope: Input[String]
      /**
        * Subresources describes the subresources for CustomResource Optional, the global
        * subresources for all versions. Top-level and per-version subresources are mutually
        * exclusive.
        */
      var subresources: js.UndefOr[Input[CustomResourceSubresources]] = js.undefined
      /**
        * Validation describes the validation methods for CustomResources Optional, the global
        * validation schema for all versions. Top-level and per-version schemas are mutually
        * exclusive.
        */
      var validation: js.UndefOr[Input[CustomResourceValidation]] = js.undefined
      /**
        * Version is the version this resource belongs in Should be always first item in Versions
        * field if provided. Optional, but at least one of Version or Versions must be set.
        * Deprecated: Please use `Versions`.
        */
      var version: js.UndefOr[Input[String]] = js.undefined
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
      var versions: js.UndefOr[Input[js.Array[Input[CustomResourceDefinitionVersion]]]] = js.undefined
    }
    
    /**
      * CustomResourceDefinitionStatus indicates the state of the CustomResourceDefinition
      */
    trait CustomResourceDefinitionStatus extends js.Object {
      /**
        * AcceptedNames are the names that are actually being used to serve discovery They may be
        * different than the names in spec.
        */
      var acceptedNames: Input[CustomResourceDefinitionNames]
      /**
        * Conditions indicate state for particular aspects of a CustomResourceDefinition
        */
      var conditions: Input[js.Array[Input[CustomResourceDefinitionCondition]]]
      /**
        * StoredVersions are all versions of CustomResources that were ever persisted. Tracking these
        * versions allows a migration path for stored versions in etcd. The field is mutable so the
        * migration controller can first finish a migration to another version (i.e. that no old
        * objects are left in the storage), and then remove the rest of the versions from this list.
        * None of the versions in this list can be removed from the spec.Versions field.
        */
      var storedVersions: Input[js.Array[Input[String]]]
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
      var additionalPrinterColumns: js.UndefOr[Input[js.Array[Input[CustomResourceColumnDefinition]]]] = js.undefined
      /**
        * Name is the version name, e.g. “v1”, “v2beta1”, etc.
        */
      var name: Input[String]
      /**
        * Schema describes the schema for CustomResource used in validation, pruning, and defaulting.
        * Top-level and per-version schemas are mutually exclusive. Per-version schemas must not all
        * be set to identical values (top-level validation schema should be used instead) This field
        * is alpha-level and is only honored by servers that enable the
        * CustomResourceWebhookConversion feature.
        */
      var schema: js.UndefOr[Input[CustomResourceValidation]] = js.undefined
      /**
        * Served is a flag enabling/disabling this version from being served via REST APIs
        */
      var served: Input[Boolean]
      /**
        * Storage flags the version as storage version. There must be exactly one flagged as storage
        * version.
        */
      var storage: Input[Boolean]
      /**
        * Subresources describes the subresources for CustomResource Top-level and per-version
        * subresources are mutually exclusive. Per-version subresources must not all be set to
        * identical values (top-level subresources should be used instead) This field is alpha-level
        * and is only honored by servers that enable the CustomResourceWebhookConversion feature.
        */
      var subresources: js.UndefOr[Input[CustomResourceSubresources]] = js.undefined
    }
    
    /**
      * CustomResourceSubresourceScale defines how to serve the scale subresource for
      * CustomResources.
      */
    trait CustomResourceSubresourceScale extends js.Object {
      /**
        * LabelSelectorPath defines the JSON path inside of a CustomResource that corresponds to
        * Scale.Status.Selector. Only JSON paths without the array notation are allowed. Must be a
        * JSON Path under .status or .spec. Must be set to work with HPA. The field pointed by this
        * JSON path must be a string field (not a complex selector struct) which contains a
        * serialized label selector in string form. More info:
        * https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions#scale-subresource
        * If there is no value under the given path in the CustomResource, the status label selector
        * value in the /scale subresource will default to the empty string.
        */
      var labelSelectorPath: js.UndefOr[Input[String]] = js.undefined
      /**
        * SpecReplicasPath defines the JSON path inside of a CustomResource that corresponds to
        * Scale.Spec.Replicas. Only JSON paths without the array notation are allowed. Must be a JSON
        * Path under .spec. If there is no value under the given path in the CustomResource, the
        * /scale subresource will return an error on GET.
        */
      var specReplicasPath: Input[String]
      /**
        * StatusReplicasPath defines the JSON path inside of a CustomResource that corresponds to
        * Scale.Status.Replicas. Only JSON paths without the array notation are allowed. Must be a
        * JSON Path under .status. If there is no value under the given path in the CustomResource,
        * the status replica value in the /scale subresource will default to 0.
        */
      var statusReplicasPath: Input[String]
    }
    
    /**
      * CustomResourceSubresources defines the status and scale subresources for CustomResources.
      */
    trait CustomResourceSubresources extends js.Object {
      /**
        * Scale denotes the scale subresource for CustomResources
        */
      var scale: js.UndefOr[Input[CustomResourceSubresourceScale]] = js.undefined
      /**
        * Status denotes the status subresource for CustomResources
        */
      var status: js.UndefOr[Input[_]] = js.undefined
    }
    
    /**
      * CustomResourceValidation is a list of validation methods for CustomResources.
      */
    trait CustomResourceValidation extends js.Object {
      /**
        * OpenAPIV3Schema is the OpenAPI v3 schema to be validated against.
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
        * default is a default value for undefined object fields. Defaulting is an alpha feature
        * under the CustomResourceDefaulting feature gate. Defaulting requires
        * spec.preserveUnknownFields to be false.
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
        * `name` is the name of the service. Required
        */
      var name: Input[String]
      /**
        * `namespace` is the namespace of the service. Required
        */
      var namespace: Input[String]
      /**
        * `path` is an optional URL path which will be sent in any request to this service.
        */
      var path: js.UndefOr[Input[String]] = js.undefined
      /**
        * If specified, the port on the service that hosting webhook. Default to 443 for backward
        * compatibility. `port` should be a valid port number (1-65535, inclusive).
        */
      var port: js.UndefOr[Input[Double]] = js.undefined
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
      var caBundle: js.UndefOr[Input[String]] = js.undefined
      /**
        * `service` is a reference to the service for this webhook. Either `service` or `url` must be
        * specified.
        *
        * If the webhook is running within the cluster, then you should use `service`.
        */
      var service: js.UndefOr[Input[ServiceReference]] = js.undefined
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
      var url: js.UndefOr[Input[String]] = js.undefined
    }
    
    def isCustomResourceDefinition(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apiextensions.v1beta1.CustomResourceDefinition */ Boolean = js.native
    def isCustomResourceDefinitionList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.apiextensions.v1beta1.CustomResourceDefinitionList */ Boolean = js.native
  }
  
}

