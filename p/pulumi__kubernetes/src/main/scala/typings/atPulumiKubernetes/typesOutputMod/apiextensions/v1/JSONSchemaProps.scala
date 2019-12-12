package typings.atPulumiKubernetes.typesOutputMod.apiextensions.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSONSchemaProps is a JSON-Schema following Specification Draft 4 (http://json-schema.org/).
  */
@js.native
trait JSONSchemaProps extends js.Object {
  @JSName("$ref")
  val $ref: String = js.native
  @JSName("$schema")
  val $schema: String = js.native
  val additionalItems: JSONSchemaProps | Boolean = js.native
  val additionalProperties: JSONSchemaProps | Boolean = js.native
  val allOf: js.Array[JSONSchemaProps] = js.native
  val anyOf: js.Array[JSONSchemaProps] = js.native
  /**
    * default is a default value for undefined object fields. Defaulting is a beta feature under
    * the CustomResourceDefaulting feature gate. Defaulting requires spec.preserveUnknownFields
    * to be false.
    */
  val default: js.Any = js.native
  val definitions: js.Object = js.native
  val dependencies: js.Object = js.native
  val description: String = js.native
  val enum: js.Array[_] = js.native
  val example: js.Any = js.native
  val exclusiveMaximum: Boolean = js.native
  val exclusiveMinimum: Boolean = js.native
  val externalDocs: ExternalDocumentation = js.native
  val format: String = js.native
  val id: String = js.native
  val items: JSONSchemaProps | js.Array[_] = js.native
  val maxItems: Double = js.native
  val maxLength: Double = js.native
  val maxProperties: Double = js.native
  val maximum: Double = js.native
  val minItems: Double = js.native
  val minLength: Double = js.native
  val minProperties: Double = js.native
  val minimum: Double = js.native
  val multipleOf: Double = js.native
  val not: JSONSchemaProps = js.native
  val nullable: Boolean = js.native
  val oneOf: js.Array[JSONSchemaProps] = js.native
  val pattern: String = js.native
  val patternProperties: js.Object = js.native
  val properties: js.Object = js.native
  val required: js.Array[String] = js.native
  val title: String = js.native
  val `type`: String = js.native
  val uniqueItems: Boolean = js.native
  /**
    * x-kubernetes-embedded-resource defines that the value is an embedded Kubernetes
    * runtime.Object, with TypeMeta and ObjectMeta. The type must be object. It is allowed to
    * further restrict the embedded object. kind, apiVersion and metadata are validated
    * automatically. x-kubernetes-preserve-unknown-fields is allowed to be true, but does not
    * have to be if the object is fully specified (up to kind, apiVersion, metadata).
    */
  val x_kubernetes_embedded_resource: Boolean = js.native
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
  val x_kubernetes_int_or_string: Boolean = js.native
  /**
    * x-kubernetes-list-map-keys annotates an array with the x-kubernetes-list-type `map` by
    * specifying the keys used as the index of the map.
    *
    * This tag MUST only be used on lists that have the "x-kubernetes-list-type" extension set to
    * "map". Also, the values specified for this attribute must be a scalar typed field of the
    * child structure (no nesting is supported).
    */
  val x_kubernetes_list_map_keys: js.Array[String] = js.native
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
  val x_kubernetes_list_type: String = js.native
  /**
    * x-kubernetes-preserve-unknown-fields stops the API server decoding step from pruning fields
    * which are not specified in the validation schema. This affects fields recursively, but
    * switches back to normal pruning behaviour if nested properties or additionalProperties are
    * specified in the schema. This can either be true or undefined. False is forbidden.
    */
  val x_kubernetes_preserve_unknown_fields: Boolean = js.native
}

