package typings.raml1Parser.distTypingsNewFormatSpec1Dot0DatamodelMod

import typings.raml1Parser.anon.NameValue
import typings.raml1Parser.anon.Namespace
import typings.raml1Parser.distTypingsNewFormatSpec1Dot0CommonMod.Annotable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeDeclaration
  extends StObject
     with Annotable {
  
  /**
    * Provides default value for a property
    */
  var default: js.UndefOr[Any] = js.undefined
  
  /**
    * Restrictions on where annotations of this type can be applied.
    * If this property is specified, annotations of this type may only
    * be applied on a property corresponding to one of the target names
    * specified as the value of this property.
    */
  var allowedTargets: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Lists available options for union types.
    */
  var anyOf: js.UndefOr[js.Array[TypeReference10]] = js.undefined
  
  /**
    * A longer, human-friendly description of the type
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The displayName attribute specifies the type display name.
    * It is a friendly name used only for  display or documentation purposes.
    * If displayName is not specified, it defaults to the element's name
    * (the name of the property itself
    */
  var displayName: String
  
  /**
    * An example of this type instance represented as string.
    * This can be used, e.g., by documentation generators to generate
    * sample values for an object of this type. Cannot be present
    * if the example property is present
    */
  var examples: js.UndefOr[js.Array[ExampleSpec10]] = js.undefined
  
  /**
    * When extending from a type you can define new facets
    * (which can then be set to concrete values by subtypes).
    */
  var facets: js.UndefOr[js.Array[TypeDeclaration]] = js.undefined
  
  /**
    * Returns facets fixed by the type. Value is an object with
    * properties named after facets fixed. Value of each property is
    * a value of the corresponding facet.
    */
  var fixedFacets: js.UndefOr[js.Array[NameValue]] = js.undefined
  
  /**
    * Type name for top level types. For properties and parameters -- property o parameter name, respectively.
    * For bodies -- media type.
    */
  var name: String
  
  /**
    * For property or parameter states if it is required.
    */
  var required: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An array containing plain example values.String, boolean and number
    * values remain as is, while object and array values are serialized to string.
    */
  var simplifiedExamples: js.UndefOr[js.Array[String | Double | Boolean]] = js.undefined
  
  var `type`: js.Array[TypeReference10]
  
  var xml: js.UndefOr[Namespace] = js.undefined
}
object TypeDeclaration {
  
  inline def apply(displayName: String, name: String, `type`: js.Array[TypeReference10]): TypeDeclaration = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDeclaration]
  }
  
  extension [Self <: TypeDeclaration](x: Self) {
    
    inline def setAllowedTargets(value: js.Array[String]): Self = StObject.set(x, "allowedTargets", value.asInstanceOf[js.Any])
    
    inline def setAllowedTargetsUndefined: Self = StObject.set(x, "allowedTargets", js.undefined)
    
    inline def setAllowedTargetsVarargs(value: String*): Self = StObject.set(x, "allowedTargets", js.Array(value*))
    
    inline def setAnyOf(value: js.Array[TypeReference10]): Self = StObject.set(x, "anyOf", value.asInstanceOf[js.Any])
    
    inline def setAnyOfUndefined: Self = StObject.set(x, "anyOf", js.undefined)
    
    inline def setAnyOfVarargs(value: TypeReference10*): Self = StObject.set(x, "anyOf", js.Array(value*))
    
    inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setExamples(value: js.Array[ExampleSpec10]): Self = StObject.set(x, "examples", value.asInstanceOf[js.Any])
    
    inline def setExamplesUndefined: Self = StObject.set(x, "examples", js.undefined)
    
    inline def setExamplesVarargs(value: ExampleSpec10*): Self = StObject.set(x, "examples", js.Array(value*))
    
    inline def setFacets(value: js.Array[TypeDeclaration]): Self = StObject.set(x, "facets", value.asInstanceOf[js.Any])
    
    inline def setFacetsUndefined: Self = StObject.set(x, "facets", js.undefined)
    
    inline def setFacetsVarargs(value: TypeDeclaration*): Self = StObject.set(x, "facets", js.Array(value*))
    
    inline def setFixedFacets(value: js.Array[NameValue]): Self = StObject.set(x, "fixedFacets", value.asInstanceOf[js.Any])
    
    inline def setFixedFacetsUndefined: Self = StObject.set(x, "fixedFacets", js.undefined)
    
    inline def setFixedFacetsVarargs(value: NameValue*): Self = StObject.set(x, "fixedFacets", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setSimplifiedExamples(value: js.Array[String | Double | Boolean]): Self = StObject.set(x, "simplifiedExamples", value.asInstanceOf[js.Any])
    
    inline def setSimplifiedExamplesUndefined: Self = StObject.set(x, "simplifiedExamples", js.undefined)
    
    inline def setSimplifiedExamplesVarargs(value: (String | Double | Boolean)*): Self = StObject.set(x, "simplifiedExamples", js.Array(value*))
    
    inline def setType(value: js.Array[TypeReference10]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: TypeReference10*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def setXml(value: Namespace): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
    
    inline def setXmlUndefined: Self = StObject.set(x, "xml", js.undefined)
  }
}
