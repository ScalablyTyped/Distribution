package typings.raml1Parser.raml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LibraryBase
  extends StObject
     with FragmentDeclaration {
  
  /**
    * Retrieve all resource types including those defined in libraries
    * @deprecated
    **/
  def allResourceTypes(): js.Array[ResourceType] = js.native
  
  /**
    * Retrieve all traits including those defined in libraries
    * @deprecated
    **/
  def allTraits(): js.Array[Trait] = js.native
  
  /**
    * Declarations of annotation types for use by annotations
    **/
  def annotationTypes(): js.Array[TypeDeclaration] = js.native
  
  /**
    * Retrieve all resource types including those defined in libraries
    **/
  def resourceTypes(): js.Array[ResourceType] = js.native
  
  /**
    * Alias for the equivalent "types" property, for compatibility with RAML 0.8. Deprecated - API definitions should use the "types" property, as the "schemas" alias for that property name may be removed in a future RAML version. The "types" property allows for XML and JSON schemas.
    **/
  def schemas(): js.Array[TypeDeclaration] = js.native
  
  /**
    * Declarations of security schemes for use within this API.
    **/
  def securitySchemes(): js.Array[AbstractSecurityScheme] = js.native
  
  /**
    * Retrieve all traits including those defined in libraries
    **/
  def traits(): js.Array[Trait] = js.native
  
  /**
    * Declarations of (data) types for use within this API
    **/
  def types(): js.Array[TypeDeclaration] = js.native
}
