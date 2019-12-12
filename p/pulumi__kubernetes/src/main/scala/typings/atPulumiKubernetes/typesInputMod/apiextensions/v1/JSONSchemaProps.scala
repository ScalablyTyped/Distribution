package typings.atPulumiKubernetes.typesInputMod.apiextensions.v1

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSONSchemaProps is a JSON-Schema following Specification Draft 4 (http://json-schema.org/).
  */
@js.native
trait JSONSchemaProps extends js.Object {
  @JSName("$ref")
  var $ref: js.UndefOr[Input[String]] = js.native
  @JSName("$schema")
  var $schema: js.UndefOr[Input[String]] = js.native
  var additionalItems: js.UndefOr[Input[JSONSchemaProps | Boolean]] = js.native
  var additionalProperties: js.UndefOr[Input[JSONSchemaProps | Boolean]] = js.native
  var allOf: js.UndefOr[Input[js.Array[Input[JSONSchemaProps]]]] = js.native
  var anyOf: js.UndefOr[Input[js.Array[Input[JSONSchemaProps]]]] = js.native
  /**
    * default is a default value for undefined object fields. Defaulting is a beta feature under
    * the CustomResourceDefaulting feature gate. Defaulting requires spec.preserveUnknownFields
    * to be false.
    */
  var default: js.UndefOr[Input[_]] = js.native
  var definitions: js.UndefOr[Input[js.Object]] = js.native
  var dependencies: js.UndefOr[Input[js.Object]] = js.native
  var description: js.UndefOr[Input[String]] = js.native
  var enum: js.UndefOr[Input[js.Array[Input[_]]]] = js.native
  var example: js.UndefOr[Input[_]] = js.native
  var exclusiveMaximum: js.UndefOr[Input[Boolean]] = js.native
  var exclusiveMinimum: js.UndefOr[Input[Boolean]] = js.native
  var externalDocs: js.UndefOr[Input[ExternalDocumentation]] = js.native
  var format: js.UndefOr[Input[String]] = js.native
  var id: js.UndefOr[Input[String]] = js.native
  var items: js.UndefOr[Input[JSONSchemaProps | js.Array[_]]] = js.native
  var maxItems: js.UndefOr[Input[Double]] = js.native
  var maxLength: js.UndefOr[Input[Double]] = js.native
  var maxProperties: js.UndefOr[Input[Double]] = js.native
  var maximum: js.UndefOr[Input[Double]] = js.native
  var minItems: js.UndefOr[Input[Double]] = js.native
  var minLength: js.UndefOr[Input[Double]] = js.native
  var minProperties: js.UndefOr[Input[Double]] = js.native
  var minimum: js.UndefOr[Input[Double]] = js.native
  var multipleOf: js.UndefOr[Input[Double]] = js.native
  var not: js.UndefOr[Input[JSONSchemaProps]] = js.native
  var nullable: js.UndefOr[Input[Boolean]] = js.native
  var oneOf: js.UndefOr[Input[js.Array[Input[JSONSchemaProps]]]] = js.native
  var pattern: js.UndefOr[Input[String]] = js.native
  var patternProperties: js.UndefOr[Input[js.Object]] = js.native
  var properties: js.UndefOr[Input[js.Object]] = js.native
  var required: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  var title: js.UndefOr[Input[String]] = js.native
  var `type`: js.UndefOr[Input[String]] = js.native
  var uniqueItems: js.UndefOr[Input[Boolean]] = js.native
  /**
    * x-kubernetes-embedded-resource defines that the value is an embedded Kubernetes
    * runtime.Object, with TypeMeta and ObjectMeta. The type must be object. It is allowed to
    * further restrict the embedded object. kind, apiVersion and metadata are validated
    * automatically. x-kubernetes-preserve-unknown-fields is allowed to be true, but does not
    * have to be if the object is fully specified (up to kind, apiVersion, metadata).
    */
  var x_kubernetes_embedded_resource: js.UndefOr[Input[Boolean]] = js.native
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
  var x_kubernetes_int_or_string: js.UndefOr[Input[Boolean]] = js.native
  /**
    * x-kubernetes-list-map-keys annotates an array with the x-kubernetes-list-type `map` by
    * specifying the keys used as the index of the map.
    *
    * This tag MUST only be used on lists that have the "x-kubernetes-list-type" extension set to
    * "map". Also, the values specified for this attribute must be a scalar typed field of the
    * child structure (no nesting is supported).
    */
  var x_kubernetes_list_map_keys: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
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
  var x_kubernetes_list_type: js.UndefOr[Input[String]] = js.native
  /**
    * x-kubernetes-preserve-unknown-fields stops the API server decoding step from pruning fields
    * which are not specified in the validation schema. This affects fields recursively, but
    * switches back to normal pruning behaviour if nested properties or additionalProperties are
    * specified in the schema. This can either be true or undefined. False is forbidden.
    */
  var x_kubernetes_preserve_unknown_fields: js.UndefOr[Input[Boolean]] = js.native
}

