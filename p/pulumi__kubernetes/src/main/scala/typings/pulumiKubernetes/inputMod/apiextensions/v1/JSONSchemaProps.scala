package typings.pulumiKubernetes.inputMod.apiextensions.v1

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
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
    * default is a default value for undefined object fields. Defaulting is a beta feature under the CustomResourceDefaulting feature gate. Defaulting requires spec.preserveUnknownFields to be false.
    */
  var default: js.UndefOr[js.Any] = js.native
  var definitions: js.UndefOr[Input[StringDictionary[Input[JSONSchemaProps]]]] = js.native
  var dependencies: js.UndefOr[Input[StringDictionary[Input[JSONSchemaProps | js.Array[Input[String]]]]]] = js.native
  var description: js.UndefOr[Input[String]] = js.native
  var enum: js.UndefOr[Input[js.Array[_]]] = js.native
  var example: js.UndefOr[js.Any] = js.native
  var exclusiveMaximum: js.UndefOr[Input[Boolean]] = js.native
  var exclusiveMinimum: js.UndefOr[Input[Boolean]] = js.native
  var externalDocs: js.UndefOr[Input[ExternalDocumentation]] = js.native
  /**
    * format is an OpenAPI v3 format string. Unknown formats are ignored. The following formats are validated:
    *
    * - bsonobjectid: a bson object ID, i.e. a 24 characters hex string - uri: an URI as parsed by Golang net/url.ParseRequestURI - email: an email address as parsed by Golang net/mail.ParseAddress - hostname: a valid representation for an Internet host name, as defined by RFC 1034, section 3.1 [RFC1034]. - ipv4: an IPv4 IP as parsed by Golang net.ParseIP - ipv6: an IPv6 IP as parsed by Golang net.ParseIP - cidr: a CIDR as parsed by Golang net.ParseCIDR - mac: a MAC address as parsed by Golang net.ParseMAC - uuid: an UUID that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{4}-?[0-9a-f]{12}$ - uuid3: an UUID3 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?3[0-9a-f]{3}-?[0-9a-f]{4}-?[0-9a-f]{12}$ - uuid4: an UUID4 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?4[0-9a-f]{3}-?[89ab][0-9a-f]{3}-?[0-9a-f]{12}$ - uuid5: an UUID5 that allows uppercase defined by the regex (?i)^[0-9a-f]{8}-?[0-9a-f]{4}-?5[0-9a-f]{3}-?[89ab][0-9a-f]{3}-?[0-9a-f]{12}$ - isbn: an ISBN10 or ISBN13 number string like "0321751043" or "978-0321751041" - isbn10: an ISBN10 number string like "0321751043" - isbn13: an ISBN13 number string like "978-0321751041" - creditcard: a credit card number defined by the regex ^(?:4[0-9]{12}(?:[0-9]{3})?|5[1-5][0-9]{14}|6(?:011|5[0-9][0-9])[0-9]{12}|3[47][0-9]{13}|3(?:0[0-5]|[68][0-9])[0-9]{11}|(?:2131|1800|35\d{3})\d{11})$ with any non digit characters mixed in - ssn: a U.S. social security number following the regex ^\d{3}[- ]?\d{2}[- ]?\d{4}$ - hexcolor: an hexadecimal color code like "#FFFFFF: following the regex ^#?([0-9a-fA-F]{3}|[0-9a-fA-F]{6})$ - rgbcolor: an RGB color code like rgb like "rgb(255,255,2559" - byte: base64 encoded binary data - password: any kind of string - date: a date string like "2006-01-02" as defined by full-date in RFC3339 - duration: a duration string like "22 ns" as parsed by Golang time.ParseDuration or compatible with Scala duration format - datetime: a date time string like "2014-12-15T19:30:20.000Z" as defined by date-time in RFC3339.
    */
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
  var patternProperties: js.UndefOr[Input[StringDictionary[Input[JSONSchemaProps]]]] = js.native
  var properties: js.UndefOr[Input[StringDictionary[Input[JSONSchemaProps]]]] = js.native
  var required: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  var title: js.UndefOr[Input[String]] = js.native
  var `type`: js.UndefOr[Input[String]] = js.native
  var uniqueItems: js.UndefOr[Input[Boolean]] = js.native
  /**
    * x-kubernetes-embedded-resource defines that the value is an embedded Kubernetes runtime.Object, with TypeMeta and ObjectMeta. The type must be object. It is allowed to further restrict the embedded object. kind, apiVersion and metadata are validated automatically. x-kubernetes-preserve-unknown-fields is allowed to be true, but does not have to be if the object is fully specified (up to kind, apiVersion, metadata).
    */
  var x_kubernetes_embedded_resource: js.UndefOr[Input[Boolean]] = js.native
  /**
    * x-kubernetes-int-or-string specifies that this value is either an integer or a string. If this is true, an empty type is allowed and type as child of anyOf is permitted if following one of the following patterns:
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
    * x-kubernetes-list-map-keys annotates an array with the x-kubernetes-list-type `map` by specifying the keys used as the index of the map.
    *
    * This tag MUST only be used on lists that have the "x-kubernetes-list-type" extension set to "map". Also, the values specified for this attribute must be a scalar typed field of the child structure (no nesting is supported).
    *
    * The properties specified must either be required or have a default value, to ensure those properties are present for all list items.
    */
  var x_kubernetes_list_map_keys: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * x-kubernetes-list-type annotates an array to further describe its topology. This extension must only be used on lists and may have 3 possible values:
    *
    * 1) `atomic`: the list is treated as a single entity, like a scalar.
    *      Atomic lists will be entirely replaced when updated. This extension
    *      may be used on any type of list (struct, scalar, ...).
    * 2) `set`:
    *      Sets are lists that must not have multiple items with the same value. Each
    *      value must be a scalar, an object with x-kubernetes-map-type `atomic` or an
    *      array with x-kubernetes-list-type `atomic`.
    * 3) `map`:
    *      These lists are like maps in that their elements have a non-index key
    *      used to identify them. Order is preserved upon merge. The map tag
    *      must only be used on a list with elements of type object.
    * Defaults to atomic for arrays.
    */
  var x_kubernetes_list_type: js.UndefOr[Input[String]] = js.native
  /**
    * x-kubernetes-map-type annotates an object to further describe its topology. This extension must only be used when type is object and may have 2 possible values:
    *
    * 1) `granular`:
    *      These maps are actual maps (key-value pairs) and each fields are independent
    *      from each other (they can each be manipulated by separate actors). This is
    *      the default behaviour for all maps.
    * 2) `atomic`: the list is treated as a single entity, like a scalar.
    *      Atomic maps will be entirely replaced when updated.
    */
  var x_kubernetes_map_type: js.UndefOr[Input[String]] = js.native
  /**
    * x-kubernetes-preserve-unknown-fields stops the API server decoding step from pruning fields which are not specified in the validation schema. This affects fields recursively, but switches back to normal pruning behaviour if nested properties or additionalProperties are specified in the schema. This can either be true or undefined. False is forbidden.
    */
  var x_kubernetes_preserve_unknown_fields: js.UndefOr[Input[Boolean]] = js.native
}

object JSONSchemaProps {
  @scala.inline
  def apply(): JSONSchemaProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONSchemaProps]
  }
  @scala.inline
  implicit class JSONSchemaPropsOps[Self <: JSONSchemaProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$ref(value: Input[String]): Self = this.set("$ref", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$ref: Self = this.set("$ref", js.undefined)
    @scala.inline
    def set$schema(value: Input[String]): Self = this.set("$schema", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$schema: Self = this.set("$schema", js.undefined)
    @scala.inline
    def setAdditionalItems(value: Input[JSONSchemaProps | Boolean]): Self = this.set("additionalItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalItems: Self = this.set("additionalItems", js.undefined)
    @scala.inline
    def setAdditionalProperties(value: Input[JSONSchemaProps | Boolean]): Self = this.set("additionalProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalProperties: Self = this.set("additionalProperties", js.undefined)
    @scala.inline
    def setAllOfVarargs(value: Input[JSONSchemaProps]*): Self = this.set("allOf", js.Array(value :_*))
    @scala.inline
    def setAllOf(value: Input[js.Array[Input[JSONSchemaProps]]]): Self = this.set("allOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllOf: Self = this.set("allOf", js.undefined)
    @scala.inline
    def setAnyOfVarargs(value: Input[JSONSchemaProps]*): Self = this.set("anyOf", js.Array(value :_*))
    @scala.inline
    def setAnyOf(value: Input[js.Array[Input[JSONSchemaProps]]]): Self = this.set("anyOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnyOf: Self = this.set("anyOf", js.undefined)
    @scala.inline
    def setDefault(value: js.Any): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setDefinitions(value: Input[StringDictionary[Input[JSONSchemaProps]]]): Self = this.set("definitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefinitions: Self = this.set("definitions", js.undefined)
    @scala.inline
    def setDependencies(value: Input[StringDictionary[Input[JSONSchemaProps | js.Array[Input[String]]]]]): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEnumVarargs(value: js.Any*): Self = this.set("enum", js.Array(value :_*))
    @scala.inline
    def setEnum(value: Input[js.Array[_]]): Self = this.set("enum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnum: Self = this.set("enum", js.undefined)
    @scala.inline
    def setExample(value: js.Any): Self = this.set("example", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExample: Self = this.set("example", js.undefined)
    @scala.inline
    def setExclusiveMaximum(value: Input[Boolean]): Self = this.set("exclusiveMaximum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusiveMaximum: Self = this.set("exclusiveMaximum", js.undefined)
    @scala.inline
    def setExclusiveMinimum(value: Input[Boolean]): Self = this.set("exclusiveMinimum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusiveMinimum: Self = this.set("exclusiveMinimum", js.undefined)
    @scala.inline
    def setExternalDocs(value: Input[ExternalDocumentation]): Self = this.set("externalDocs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalDocs: Self = this.set("externalDocs", js.undefined)
    @scala.inline
    def setFormat(value: Input[String]): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setId(value: Input[String]): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: Input[JSONSchemaProps | js.Array[_]]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setMaxItems(value: Input[Double]): Self = this.set("maxItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxItems: Self = this.set("maxItems", js.undefined)
    @scala.inline
    def setMaxLength(value: Input[Double]): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    @scala.inline
    def setMaxProperties(value: Input[Double]): Self = this.set("maxProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxProperties: Self = this.set("maxProperties", js.undefined)
    @scala.inline
    def setMaximum(value: Input[Double]): Self = this.set("maximum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximum: Self = this.set("maximum", js.undefined)
    @scala.inline
    def setMinItems(value: Input[Double]): Self = this.set("minItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinItems: Self = this.set("minItems", js.undefined)
    @scala.inline
    def setMinLength(value: Input[Double]): Self = this.set("minLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    @scala.inline
    def setMinProperties(value: Input[Double]): Self = this.set("minProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinProperties: Self = this.set("minProperties", js.undefined)
    @scala.inline
    def setMinimum(value: Input[Double]): Self = this.set("minimum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimum: Self = this.set("minimum", js.undefined)
    @scala.inline
    def setMultipleOf(value: Input[Double]): Self = this.set("multipleOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultipleOf: Self = this.set("multipleOf", js.undefined)
    @scala.inline
    def setNot(value: Input[JSONSchemaProps]): Self = this.set("not", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNot: Self = this.set("not", js.undefined)
    @scala.inline
    def setNullable(value: Input[Boolean]): Self = this.set("nullable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNullable: Self = this.set("nullable", js.undefined)
    @scala.inline
    def setOneOfVarargs(value: Input[JSONSchemaProps]*): Self = this.set("oneOf", js.Array(value :_*))
    @scala.inline
    def setOneOf(value: Input[js.Array[Input[JSONSchemaProps]]]): Self = this.set("oneOf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOneOf: Self = this.set("oneOf", js.undefined)
    @scala.inline
    def setPattern(value: Input[String]): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    @scala.inline
    def setPatternProperties(value: Input[StringDictionary[Input[JSONSchemaProps]]]): Self = this.set("patternProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePatternProperties: Self = this.set("patternProperties", js.undefined)
    @scala.inline
    def setProperties(value: Input[StringDictionary[Input[JSONSchemaProps]]]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setRequiredVarargs(value: Input[String]*): Self = this.set("required", js.Array(value :_*))
    @scala.inline
    def setRequired(value: Input[js.Array[Input[String]]]): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setTitle(value: Input[String]): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUniqueItems(value: Input[Boolean]): Self = this.set("uniqueItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUniqueItems: Self = this.set("uniqueItems", js.undefined)
    @scala.inline
    def setX_kubernetes_embedded_resource(value: Input[Boolean]): Self = this.set("x_kubernetes_embedded_resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX_kubernetes_embedded_resource: Self = this.set("x_kubernetes_embedded_resource", js.undefined)
    @scala.inline
    def setX_kubernetes_int_or_string(value: Input[Boolean]): Self = this.set("x_kubernetes_int_or_string", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX_kubernetes_int_or_string: Self = this.set("x_kubernetes_int_or_string", js.undefined)
    @scala.inline
    def setX_kubernetes_list_map_keysVarargs(value: Input[String]*): Self = this.set("x_kubernetes_list_map_keys", js.Array(value :_*))
    @scala.inline
    def setX_kubernetes_list_map_keys(value: Input[js.Array[Input[String]]]): Self = this.set("x_kubernetes_list_map_keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX_kubernetes_list_map_keys: Self = this.set("x_kubernetes_list_map_keys", js.undefined)
    @scala.inline
    def setX_kubernetes_list_type(value: Input[String]): Self = this.set("x_kubernetes_list_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX_kubernetes_list_type: Self = this.set("x_kubernetes_list_type", js.undefined)
    @scala.inline
    def setX_kubernetes_map_type(value: Input[String]): Self = this.set("x_kubernetes_map_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX_kubernetes_map_type: Self = this.set("x_kubernetes_map_type", js.undefined)
    @scala.inline
    def setX_kubernetes_preserve_unknown_fields(value: Input[Boolean]): Self = this.set("x_kubernetes_preserve_unknown_fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX_kubernetes_preserve_unknown_fields: Self = this.set("x_kubernetes_preserve_unknown_fields", js.undefined)
  }
  
}

