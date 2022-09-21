package typings.raml1Parser.raml10parserapiMod

import typings.raml1Parser.highLevelASTMod.ITypeDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeDeclaration
  extends StObject
     with Annotable {
  
  /**
    * Provides default value for a property
    **/
  def default(): Any = js.native
  
  /**
    * Restrictions on where annotations of this type can be applied. If this property is specified, annotations of this type may only be applied on a property corresponding to one of the target names specified as the value of this property.
    **/
  def allowedTargets(): js.Array[AnnotationTarget] = js.native
  
  /**
    * A longer, human-friendly description of the type
    **/
  def description(): MarkdownString = js.native
  
  /**
    * The displayName attribute specifies the type display name. It is a friendly name used only for  display or documentation purposes. If displayName is not specified, it defaults to the element's key (the name of the property itself).
    **/
  def displayName(): String = js.native
  
  /**
    * An example of this type instance represented as string or yaml map/sequence. This can be used, e.g., by documentation generators to generate sample values for an object of this type. Cannot be present if the examples property is present.
    **/
  def example(): ExampleSpec = js.native
  
  /**
    * An example of this type instance represented as string. This can be used, e.g., by documentation generators to generate sample values for an object of this type. Cannot be present if the example property is present.
    **/
  def examples(): js.Array[ExampleSpec] = js.native
  
  /**
    * When extending from a type you can define new facets (which can then be set to concrete values by subtypes).
    **/
  def facets(): js.Array[TypeDeclaration] = js.native
  
  /**
    * Returns facets fixed by the type. Value is an object with properties named after facets fixed. Value of each property is a value of the corresponding facet.
    **/
  def fixedFacets(): TypeInstance = js.native
  
  /**
    * Whether the type represents annotation
    **/
  def isAnnotation(): Boolean = js.native
  
  /**
    * Location of the parameter (can not be edited by user)
    **/
  def location(): ModelLocation = js.native
  
  /**
    * Kind of location
    **/
  def locationKind(): LocationKind = js.native
  
  /**
    * Type name for top level types. For properties and parameters -- property o parameter name, respectively. For bodies -- media type.
    **/
  def name(): String = js.native
  
  /**
    * For types defined in traits or resource types returns object representation of parametrized properties
    **/
  def parametrizedProperties(): TypeInstance = js.native
  
  /**
    * For property or parameter states if it is required.
    **/
  def required(): Boolean = js.native
  
  /**
    * Runtime representation of type represented by this AST node
    **/
  def runtimeType(): ITypeDefinition = js.native
  
  /**
    * Scalar properties annotations accessor
    **/
  def scalarsAnnotations(): TypeDeclarationScalarsAnnotations = js.native
  
  /**
    * A base type which the current type extends, or more generally a type expression.
    **/
  def schema(): js.Array[String] = js.native
  
  /**
    * Inlined supertype definition.
    **/
  def structuredType(): TypeInstance = js.native
  
  /**
    * A base type which the current type extends, or more generally a type expression.
    **/
  def `type`(): js.Array[String] = js.native
  
  /**
    * validate an instance against type
    **/
  def validateInstance(value: Any): js.Array[String] = js.native
  
  /**
    * validate an instance against type
    **/
  def validateInstanceWithDetailedStatuses(value: Any): Any = js.native
  
  def xml(): XMLFacetInfo = js.native
}
