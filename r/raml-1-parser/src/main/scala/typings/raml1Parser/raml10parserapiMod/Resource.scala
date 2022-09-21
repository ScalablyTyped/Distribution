package typings.raml1Parser.raml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resource
  extends StObject
     with ResourceBase {
  
  /**
    * baseUri of owning Api concatenated with completeRelativeUri
    **/
  def absoluteUri(): String = js.native
  
  /**
    * Retrieve an ordered list of all absolute uri parameters. Returns a union of `Api.baseUriParameters()`
    * for `Api` owning the `Resource` and `Resource.uriParameters()`.
    **/
  def absoluteUriParameters(): js.Array[TypeDeclaration] = js.native
  
  /**
    * Get child method by its name
    **/
  def childMethod(method: String): js.Array[Method] = js.native
  
  /**
    * Get child resource by its relative path
    **/
  def childResource(relPath: String): Resource = js.native
  
  /**
    * Path relative to API root
    **/
  def completeRelativeUri(): String = js.native
  
  /**
    * The displayName attribute specifies the resource display name. It is a friendly name used only for  display or documentation purposes. If displayName is not specified, it defaults to the element's key (the name of the property itself).
    **/
  def displayName(): String = js.native
  
  /**
    * Api owning the resource as a sibling
    **/
  def ownerApi(): Api = js.native
  
  /**
    * Parent resource for non top level resources
    **/
  def parentResource(): Resource = js.native
  
  /**
    * Relative URL of this resource from the parent resource
    **/
  def relativeUri(): RelativeUriString = js.native
  
  /**
    * A nested resource is identified as any property whose name begins with a slash ("/") and is therefore treated as a relative URI.
    **/
  def resources(): js.Array[Resource] = js.native
}
