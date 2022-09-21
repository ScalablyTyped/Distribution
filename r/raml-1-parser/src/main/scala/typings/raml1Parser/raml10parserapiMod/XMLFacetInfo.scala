package typings.raml1Parser.raml10parserapiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XMLFacetInfo
  extends StObject
     with Annotable {
  
  /**
    * If attribute is set to true, a type instance should be serialized as an XML attribute. It can only be true for scalar types.
    **/
  def attribute(): Boolean = js.native
  
  /**
    * Allows to override the name of the XML element or XML attribute in it's XML representation.
    **/
  def name(): String = js.native
  
  /**
    * Allows to configure the name of the XML namespace.
    **/
  def namespace(): String = js.native
  
  /**
    * Allows to configure the prefix which will be used during serialization to XML.
    **/
  def prefix(): String = js.native
  
  /**
    * Scalar properties annotations accessor
    **/
  def scalarsAnnotations(): XMLFacetInfoScalarsAnnotations = js.native
  
  /**
    * If wrapped is set to true, a type instance should be wrapped in its own XML element. It can not be true for scalar types and it can not be true at the same moment when attribute is true.
    **/
  def wrapped(): Boolean = js.native
}
