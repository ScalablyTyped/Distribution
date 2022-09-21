package typings.raml1Parser.raml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceBase
  extends StObject
     with Annotable {
  
  /**
    * Returns security schemes, resource or method is secured with. If no security schemes are set at resource or method level,
    * returns schemes defined with `securedBy` at API level.
    * @deprecated
    **/
  def allSecuredBy(): js.Array[SecuritySchemeRef] = js.native
  
  /**
    * Retrieve an ordered list of all uri parameters including those which are not described in the `uriParameters` node.
    * Consider a fragment of RAML specification:
    * ```yaml
    * /resource/{objectId}/{propertyId}:
    * uriParameters:
    * objectId:
    * ```
    * Here `propertyId` uri parameter is not described in the `uriParameters` node,
    * but it is among Resource.allUriParameters().
    * @deprecated
    **/
  def allUriParameters(): js.Array[TypeDeclaration] = js.native
  
  def description(): MarkdownString = js.native
  
  /**
    * A list of the traits to apply to all methods declared (implicitly or explicitly) for this resource. Individual methods may override this declaration
    **/
  def is(): js.Array[TraitRef] = js.native
  
  /**
    * Methods that are part of this resource type definition
    **/
  def methods(): js.Array[Method] = js.native
  
  /**
    * Scalar properties annotations accessor
    **/
  def scalarsAnnotations(): ResourceBaseScalarsAnnotations = js.native
  
  /**
    * The security schemes that apply to all methods declared (implicitly or explicitly) for this resource.
    **/
  def securedBy(): js.Array[SecuritySchemeRef] = js.native
  
  /**
    * The resource type which this resource inherits.
    **/
  def `type`(): ResourceTypeRef = js.native
  
  /**
    * Retrieve an ordered list of all uri parameters including those which are not described in the `uriParameters` node.
    * Consider a fragment of RAML specification:
    * ```yaml
    * /resource/{objectId}/{propertyId}:
    * uriParameters:
    * objectId:
    * ```
    * Here `propertyId` uri parameter is not described in the `uriParameters` node,
    * but it is among Resource.uriParameters().
    **/
  def uriParameters(): js.Array[TypeDeclaration] = js.native
}
