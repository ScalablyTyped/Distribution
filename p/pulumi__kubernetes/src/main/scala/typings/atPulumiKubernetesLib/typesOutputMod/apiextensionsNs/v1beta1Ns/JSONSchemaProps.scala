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
  val oneOf: js.Array[JSONSchemaProps]
  val pattern: java.lang.String
  val patternProperties: js.Object
  val properties: js.Object
  val required: js.Array[java.lang.String]
  val title: java.lang.String
  val `type`: java.lang.String
  val uniqueItems: scala.Boolean
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
    oneOf: js.Array[JSONSchemaProps],
    pattern: java.lang.String,
    patternProperties: js.Object,
    properties: js.Object,
    required: js.Array[java.lang.String],
    title: java.lang.String,
    `type`: java.lang.String,
    uniqueItems: scala.Boolean
  ): JSONSchemaProps = {
    val __obj = js.Dynamic.literal($ref = $ref, $schema = $schema, additionalItems = additionalItems.asInstanceOf[js.Any], additionalProperties = additionalProperties.asInstanceOf[js.Any], allOf = allOf, anyOf = anyOf, default = default, definitions = definitions, dependencies = dependencies, description = description, enum = enum, example = example, exclusiveMaximum = exclusiveMaximum, exclusiveMinimum = exclusiveMinimum, externalDocs = externalDocs, format = format, id = id, items = items.asInstanceOf[js.Any], maxItems = maxItems, maxLength = maxLength, maxProperties = maxProperties, maximum = maximum, minItems = minItems, minLength = minLength, minProperties = minProperties, minimum = minimum, multipleOf = multipleOf, not = not, oneOf = oneOf, pattern = pattern, patternProperties = patternProperties, properties = properties, required = required, title = title, uniqueItems = uniqueItems)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[JSONSchemaProps]
  }
}

