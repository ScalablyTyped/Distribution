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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("$ref")($ref)
    __obj.updateDynamic("$schema")($schema)
    __obj.updateDynamic("additionalItems")(additionalItems.asInstanceOf[js.Any])
    __obj.updateDynamic("additionalProperties")(additionalProperties.asInstanceOf[js.Any])
    __obj.updateDynamic("allOf")(allOf)
    __obj.updateDynamic("anyOf")(anyOf)
    __obj.updateDynamic("default")(default)
    __obj.updateDynamic("definitions")(definitions)
    __obj.updateDynamic("dependencies")(dependencies)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("enum")(enum)
    __obj.updateDynamic("example")(example)
    __obj.updateDynamic("exclusiveMaximum")(exclusiveMaximum)
    __obj.updateDynamic("exclusiveMinimum")(exclusiveMinimum)
    __obj.updateDynamic("externalDocs")(externalDocs)
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.updateDynamic("maxItems")(maxItems)
    __obj.updateDynamic("maxLength")(maxLength)
    __obj.updateDynamic("maxProperties")(maxProperties)
    __obj.updateDynamic("maximum")(maximum)
    __obj.updateDynamic("minItems")(minItems)
    __obj.updateDynamic("minLength")(minLength)
    __obj.updateDynamic("minProperties")(minProperties)
    __obj.updateDynamic("minimum")(minimum)
    __obj.updateDynamic("multipleOf")(multipleOf)
    __obj.updateDynamic("not")(not)
    __obj.updateDynamic("oneOf")(oneOf)
    __obj.updateDynamic("pattern")(pattern)
    __obj.updateDynamic("patternProperties")(patternProperties)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("required")(required)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("uniqueItems")(uniqueItems)
    __obj.asInstanceOf[JSONSchemaProps]
  }
}

