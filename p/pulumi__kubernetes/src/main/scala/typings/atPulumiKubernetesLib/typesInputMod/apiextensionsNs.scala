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
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
                   * Spec describes how the user wants the resources to appear
                   */
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[CustomResourceDefinitionSpec]] = js.undefined
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
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * Items individual CustomResourceDefinitions
                   */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[CustomResourceDefinition]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * CustomResourceDefinitionNames indicates the names to serve this CustomResourceDefinition
             */
    
    trait CustomResourceDefinitionNames extends js.Object {
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
      var shortNames: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
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
                   * Validation describes the validation methods for CustomResources
                   */
      var validation: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[CustomResourceValidation]] = js.undefined
      /**
                   * Version is the version this resource belongs in
                   */
      var version: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
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
      var conditions: atPulumiPulumiLib.resourceMod.Input[js.Array[CustomResourceDefinitionCondition]]
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
             * JSON represents any valid JSON value. These types are supported: bool, int64, float64,
             * string, []interface{}, map[string]interface{} and nil.
             */
    
    trait JSON extends js.Object {
      var Raw: atPulumiPulumiLib.resourceMod.Input[java.lang.String]
    }
    
    /**
             * JSONSchemaProps is a JSON-Schema following Specification Draft 4 (http://json-schema.org/).
             */
    
    trait JSONSchemaProps extends js.Object {
      @JSName("$ref")
      var $ref: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      @JSName("$schema")
      var $schema: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      var additionalItems: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[JSONSchemaPropsOrBool]] = js.undefined
      var additionalProperties: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[JSONSchemaPropsOrBool]] = js.undefined
      var allOf: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[JSONSchemaProps]]] = js.undefined
      var anyOf: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[JSONSchemaProps]]] = js.undefined
      var default: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[JSON]] = js.undefined
      var definitions: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Object]] = js.undefined
      var dependencies: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Object]] = js.undefined
      var description: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      var enum: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[JSON]]] = js.undefined
      var example: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[JSON]] = js.undefined
      var exclusiveMaximum: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      var exclusiveMinimum: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
      var externalDocs: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[ExternalDocumentation]] = js.undefined
      var format: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      var id: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      var items: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[JSONSchemaPropsOrArray]] = js.undefined
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
      var oneOf: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[JSONSchemaProps]]] = js.undefined
      var pattern: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      var patternProperties: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Object]] = js.undefined
      var properties: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Object]] = js.undefined
      var required: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]] = js.undefined
      var title: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      var `type`: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      var uniqueItems: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Boolean]] = js.undefined
    }
    
    /**
             * JSONSchemaPropsOrArray represents a value that can either be a JSONSchemaProps or an array of
             * JSONSchemaProps. Mainly here for serialization purposes.
             */
    
    trait JSONSchemaPropsOrArray extends js.Object {
      var JSONSchemas: atPulumiPulumiLib.resourceMod.Input[js.Array[JSONSchemaProps]]
      var Schema: atPulumiPulumiLib.resourceMod.Input[JSONSchemaProps]
    }
    
    /**
             * JSONSchemaPropsOrBool represents JSONSchemaProps or a boolean value. Defaults to true for the
             * boolean property.
             */
    
    trait JSONSchemaPropsOrBool extends js.Object {
      var Allows: atPulumiPulumiLib.resourceMod.Input[scala.Boolean]
      var Schema: atPulumiPulumiLib.resourceMod.Input[JSONSchemaProps]
    }
    
    /**
             * JSONSchemaPropsOrStringArray represents a JSONSchemaProps or a string array.
             */
    
    trait JSONSchemaPropsOrStringArray extends js.Object {
      var Property: atPulumiPulumiLib.resourceMod.Input[js.Array[java.lang.String]]
      var Schema: atPulumiPulumiLib.resourceMod.Input[JSONSchemaProps]
    }
    
    def isCustomResourceDefinition(o: js.Any): /* is CustomResourceDefinition */scala.Boolean = js.native
    def isCustomResourceDefinitionList(o: js.Any): /* is CustomResourceDefinitionList */scala.Boolean = js.native
  }
  
}

