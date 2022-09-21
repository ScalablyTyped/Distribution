package typings.ramlTypesystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-typesystem", "TypeConstructor")
@js.native
open class TypeConstructor protected () extends StObject {
  def this(target: IParsedType) = this()
  
  /**
    * adds property declaration to the type
    * @param name
    * @param type
    * @param optional
    * @returns {TypeConstructor}
    */
  def addProperty(name: String, `type`: IParsedType, optional: Boolean): TypeConstructor = js.native
  
  /**
    * adds a built-in facet with a given name and value
    * @param name
    * @param value
    * @returns {TypeConstructor}
    */
  def addSimpleFacet(name: String, value: Any): TypeConstructor = js.native
  
  /**
    * adds annotation to the type
    * @returns {TypeConstructor}
    */
  def annotate(name: String, value: Any): TypeConstructor = js.native
  
  /**
    * closes type
    * @returns {TypeConstructor}
    */
  def closeType(): TypeConstructor = js.native
  
  /**
    * adds custom facet to the type
    * @returns {TypeConstructor}
    */
  def customFacet(name: String, value: Any): TypeConstructor = js.native
  
  /**
    * adds custom facet declaration to the type
    * @returns {TypeConstructor}
    */
  def customFacetDeclaration(name: String, value: IParsedType): TypeConstructor = js.native
  def customFacetDeclaration(name: String, value: IParsedType, optional: Boolean): TypeConstructor = js.native
  
  /**
    * returns a constructed type instance
    * @returns {IParsedType}
    */
  def getResult(): typings.ramlTypesystem.typesystemInterfacesMod.IParsedType = js.native
  
  /* private */ var target: Any = js.native
}
