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

