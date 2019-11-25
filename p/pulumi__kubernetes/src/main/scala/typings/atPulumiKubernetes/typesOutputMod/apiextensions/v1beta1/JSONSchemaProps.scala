package typings.atPulumiKubernetes.typesOutputMod.apiextensions.v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSONSchemaProps is a JSON-Schema following Specification Draft 4 (http://json-schema.org/).
  */
trait JSONSchemaProps extends js.Object {
  @JSName("$ref")
  val $ref: String
  @JSName("$schema")
  val $schema: String
  val additionalItems: JSONSchemaProps | Boolean
  val additionalProperties: JSONSchemaProps | Boolean
  val allOf: js.Array[JSONSchemaProps]
  val anyOf: js.Array[JSONSchemaProps]
  /**
    * default is a default value for undefined object fields. Defaulting is a beta feature under
    * the CustomResourceDefaulting feature gate. CustomResourceDefinitions with defaults must be
    * created using the v1 (or newer) CustomResourceDefinition API.
    */
  val default: js.Any
  val definitions: js.Object
  val dependencies: js.Object
  val description: String
  val enum: js.Array[_]
  val example: js.Any
  val exclusiveMaximum: Boolean
  val exclusiveMinimum: Boolean
  val externalDocs: ExternalDocumentation
  val format: String
  val id: String
  val items: JSONSchemaProps | js.Array[_]
  val maxItems: Double
  val maxLength: Double
  val maxProperties: Double
  val maximum: Double
  val minItems: Double
  val minLength: Double
  val minProperties: Double
  val minimum: Double
  val multipleOf: Double
  val not: JSONSchemaProps
  val nullable: Boolean
  val oneOf: js.Array[JSONSchemaProps]
  val pattern: String
  val patternProperties: js.Object
  val properties: js.Object
  val required: js.Array[String]
  val title: String
  val `type`: String
  val uniqueItems: Boolean
  /**
    * x-kubernetes-embedded-resource defines that the value is an embedded Kubernetes
    * runtime.Object, with TypeMeta and ObjectMeta. The type must be object. It is allowed to
    * further restrict the embedded object. kind, apiVersion and metadata are validated
    * automatically. x-kubernetes-preserve-unknown-fields is allowed to be true, but does not
    * have to be if the object is fully specified (up to kind, apiVersion, metadata).
    */
  val x_kubernetes_embedded_resource: Boolean
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
  val x_kubernetes_int_or_string: Boolean
  /**
    * x-kubernetes-list-map-keys annotates an array with the x-kubernetes-list-type `map` by
    * specifying the keys used as the index of the map.
    *
    * This tag MUST only be used on lists that have the "x-kubernetes-list-type" extension set to
    * "map". Also, the values specified for this attribute must be a scalar typed field of the
    * child structure (no nesting is supported).
    */
  val x_kubernetes_list_map_keys: js.Array[String]
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
  val x_kubernetes_list_type: String
  /**
    * x-kubernetes-preserve-unknown-fields stops the API server decoding step from pruning fields
    * which are not specified in the validation schema. This affects fields recursively, but
    * switches back to normal pruning behaviour if nested properties or additionalProperties are
    * specified in the schema. This can either be true or undefined. False is forbidden.
    */
  val x_kubernetes_preserve_unknown_fields: Boolean
}

object JSONSchemaProps {
  @scala.inline
  def apply(
    $ref: String,
    $schema: String,
    additionalItems: JSONSchemaProps | Boolean,
    additionalProperties: JSONSchemaProps | Boolean,
    allOf: js.Array[JSONSchemaProps],
    anyOf: js.Array[JSONSchemaProps],
    default: js.Any,
    definitions: js.Object,
    dependencies: js.Object,
    description: String,
    enum: js.Array[_],
    example: js.Any,
    exclusiveMaximum: Boolean,
    exclusiveMinimum: Boolean,
    externalDocs: ExternalDocumentation,
    format: String,
    id: String,
    items: JSONSchemaProps | js.Array[_],
    maxItems: Double,
    maxLength: Double,
    maxProperties: Double,
    maximum: Double,
    minItems: Double,
    minLength: Double,
    minProperties: Double,
    minimum: Double,
    multipleOf: Double,
    not: JSONSchemaProps,
    nullable: Boolean,
    oneOf: js.Array[JSONSchemaProps],
    pattern: String,
    patternProperties: js.Object,
    properties: js.Object,
    required: js.Array[String],
    title: String,
    `type`: String,
    uniqueItems: Boolean,
    x_kubernetes_embedded_resource: Boolean,
    x_kubernetes_int_or_string: Boolean,
    x_kubernetes_list_map_keys: js.Array[String],
    x_kubernetes_list_type: String,
    x_kubernetes_preserve_unknown_fields: Boolean
  ): JSONSchemaProps = {
    val __obj = js.Dynamic.literal($ref = $ref.asInstanceOf[js.Any], $schema = $schema.asInstanceOf[js.Any], additionalItems = additionalItems.asInstanceOf[js.Any], additionalProperties = additionalProperties.asInstanceOf[js.Any], allOf = allOf.asInstanceOf[js.Any], anyOf = anyOf.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], definitions = definitions.asInstanceOf[js.Any], dependencies = dependencies.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], enum = enum.asInstanceOf[js.Any], example = example.asInstanceOf[js.Any], exclusiveMaximum = exclusiveMaximum.asInstanceOf[js.Any], exclusiveMinimum = exclusiveMinimum.asInstanceOf[js.Any], externalDocs = externalDocs.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], maxItems = maxItems.asInstanceOf[js.Any], maxLength = maxLength.asInstanceOf[js.Any], maxProperties = maxProperties.asInstanceOf[js.Any], maximum = maximum.asInstanceOf[js.Any], minItems = minItems.asInstanceOf[js.Any], minLength = minLength.asInstanceOf[js.Any], minProperties = minProperties.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any], multipleOf = multipleOf.asInstanceOf[js.Any], not = not.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], oneOf = oneOf.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], patternProperties = patternProperties.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uniqueItems = uniqueItems.asInstanceOf[js.Any], x_kubernetes_embedded_resource = x_kubernetes_embedded_resource.asInstanceOf[js.Any], x_kubernetes_int_or_string = x_kubernetes_int_or_string.asInstanceOf[js.Any], x_kubernetes_list_map_keys = x_kubernetes_list_map_keys.asInstanceOf[js.Any], x_kubernetes_list_type = x_kubernetes_list_type.asInstanceOf[js.Any], x_kubernetes_preserve_unknown_fields = x_kubernetes_preserve_unknown_fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONSchemaProps]
  }
}

