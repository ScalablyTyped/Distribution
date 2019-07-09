package typings
package atPulumiKubernetesLib.typesOutputMod.apiextensionsNs.v1beta1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSONSchemaProps is a JSON-Schema following Specification Draft 4 (http://json-schema.org/).
  */
trait JSONSchemaProps extends js.Object {
  @JSName("$ref")
  val $ref: java.lang.String
  @JSName("$schema")
  val $schema: java.lang.String
  val additionalItems: JSONSchemaProps | scala.Boolean
  val additionalProperties: JSONSchemaProps | scala.Boolean
  val allOf: js.Array[JSONSchemaProps]
  val anyOf: js.Array[JSONSchemaProps]
  /**
    * default is a default value for undefined object fields. Defaulting is an alpha feature
    * under the CustomResourceDefaulting feature gate. Defaulting requires
    * spec.preserveUnknownFields to be false.
    */
  val default: js.Any
  val definitions: js.Object
  val dependencies: js.Object
  val description: java.lang.String
  val enum: js.Array[_]
  val example: js.Any
  val exclusiveMaximum: scala.Boolean
  val exclusiveMinimum: scala.Boolean
  val externalDocs: ExternalDocumentation
  val format: java.lang.String
  val id: java.lang.String
  val items: JSONSchemaProps | js.Array[_]
  val maxItems: scala.Double
  val maxLength: scala.Double
  val maxProperties: scala.Double
  val maximum: scala.Double
  val minItems: scala.Double
  val minLength: scala.Double
  val minProperties: scala.Double
  val minimum: scala.Double
  val multipleOf: scala.Double
  val not: JSONSchemaProps
  val nullable: scala.Boolean
  val oneOf: js.Array[JSONSchemaProps]
  val pattern: java.lang.String
  val patternProperties: js.Object
  val properties: js.Object
  val required: js.Array[java.lang.String]
  val title: java.lang.String
  val `type`: java.lang.String
  val uniqueItems: scala.Boolean
  /**
    * x-kubernetes-embedded-resource defines that the value is an embedded Kubernetes
    * runtime.Object, with TypeMeta and ObjectMeta. The type must be object. It is allowed to
    * further restrict the embedded object. kind, apiVersion and metadata are validated
    * automatically. x-kubernetes-preserve-unknown-fields is allowed to be true, but does not
    * have to be if the object is fully specified (up to kind, apiVersion, metadata).
    */
  val x_kubernetes_embedded_resource: scala.Boolean
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
  val x_kubernetes_int_or_string: scala.Boolean
  /**
    * x-kubernetes-preserve-unknown-fields stops the API server decoding step from pruning fields
    * which are not specified in the validation schema. This affects fields recursively, but
    * switches back to normal pruning behaviour if nested properties or additionalProperties are
    * specified in the schema. This can either be true or undefined. False is forbidden.
    */
  val x_kubernetes_preserve_unknown_fields: scala.Boolean
}

object JSONSchemaProps {
  @scala.inline
  def apply(
    $ref: java.lang.String,
    $schema: java.lang.String,
    additionalItems: JSONSchemaProps | scala.Boolean,
    additionalProperties: JSONSchemaProps | scala.Boolean,
    allOf: js.Array[JSONSchemaProps],
    anyOf: js.Array[JSONSchemaProps],
    default: js.Any,
    definitions: js.Object,
    dependencies: js.Object,
    description: java.lang.String,
    enum: js.Array[_],
    example: js.Any,
    exclusiveMaximum: scala.Boolean,
    exclusiveMinimum: scala.Boolean,
    externalDocs: ExternalDocumentation,
    format: java.lang.String,
    id: java.lang.String,
    items: JSONSchemaProps | js.Array[_],
    maxItems: scala.Double,
    maxLength: scala.Double,
    maxProperties: scala.Double,
    maximum: scala.Double,
    minItems: scala.Double,
    minLength: scala.Double,
    minProperties: scala.Double,
    minimum: scala.Double,
    multipleOf: scala.Double,
    not: JSONSchemaProps,
    nullable: scala.Boolean,
    oneOf: js.Array[JSONSchemaProps],
    pattern: java.lang.String,
    patternProperties: js.Object,
    properties: js.Object,
    required: js.Array[java.lang.String],
    title: java.lang.String,
    `type`: java.lang.String,
    uniqueItems: scala.Boolean,
    x_kubernetes_embedded_resource: scala.Boolean,
    x_kubernetes_int_or_string: scala.Boolean,
    x_kubernetes_preserve_unknown_fields: scala.Boolean
  ): JSONSchemaProps = {
    val __obj = js.Dynamic.literal($ref = $ref, $schema = $schema, additionalItems = additionalItems.asInstanceOf[js.Any], additionalProperties = additionalProperties.asInstanceOf[js.Any], allOf = allOf, anyOf = anyOf, default = default, definitions = definitions, dependencies = dependencies, description = description, enum = enum, example = example, exclusiveMaximum = exclusiveMaximum, exclusiveMinimum = exclusiveMinimum, externalDocs = externalDocs, format = format, id = id, items = items.asInstanceOf[js.Any], maxItems = maxItems, maxLength = maxLength, maxProperties = maxProperties, maximum = maximum, minItems = minItems, minLength = minLength, minProperties = minProperties, minimum = minimum, multipleOf = multipleOf, not = not, nullable = nullable, oneOf = oneOf, pattern = pattern, patternProperties = patternProperties, properties = properties, required = required, title = title, uniqueItems = uniqueItems, x_kubernetes_embedded_resource = x_kubernetes_embedded_resource, x_kubernetes_int_or_string = x_kubernetes_int_or_string, x_kubernetes_preserve_unknown_fields = x_kubernetes_preserve_unknown_fields)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[JSONSchemaProps]
  }
}

