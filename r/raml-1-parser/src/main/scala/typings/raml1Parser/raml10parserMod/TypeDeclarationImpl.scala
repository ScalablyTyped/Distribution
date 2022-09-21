package typings.raml1Parser.raml10parserMod

import typings.raml1Parser.highLevelASTMod.IHighLevelNode
import typings.raml1Parser.raml10parserapiMod.ExampleSpec
import typings.raml1Parser.raml10parserapiMod.TypeDeclaration
import typings.raml1Parser.raml10parserapiMod.UsesDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-1-parser/dist/parser/artifacts/raml10parser", "TypeDeclarationImpl")
@js.native
open class TypeDeclarationImpl protected ()
  extends AnnotableImpl
     with TypeDeclaration {
  def this(nodeOrKey: String) = this()
  def this(nodeOrKey: IHighLevelNode) = this()
  def this(nodeOrKey: String, setAsTopLevel: Boolean) = this()
  def this(nodeOrKey: IHighLevelNode, setAsTopLevel: Boolean) = this()
  
  /**
    * @return RAML version of the node. "RAML10" for RAML 1.0 and "RAML08" for RAML 0.8.
    */
  /* CompleteClass */
  override def RAMLVersion(): String = js.native
  
  /**
    * An example of this type instance represented as string or yaml map/sequence. This can be used, e.g., by documentation generators to generate sample values for an object of this type. Cannot be present if the examples property is present.
    * @hidden
    **/
  def example_original(): ExampleSpec = js.native
  
  /**
    * An example of this type instance represented as string. This can be used, e.g., by documentation generators to generate sample values for an object of this type. Cannot be present if the example property is present.
    * @hidden
    **/
  def examples_original(): js.Array[ExampleSpec] = js.native
  
  /**
    * @return Actual name of instance interface
    **/
  /* CompleteClass */
  override def kind(): String = js.native
  
  /* protected */ var nodeOrKey: IHighLevelNode | String = js.native
  
  /**
    * Alias for the equivalent "type" property, for compatibility with RAML 0.8. Deprecated - API definitions should use the "type" property, as the "schema" alias for that property name may be removed in a future RAML version. The "type" property allows for XML and JSON schemas.
    * @hidden
    **/
  def schema_original(): js.Array[String] = js.native
  
  /* protected */ var setAsTopLevel: Boolean = js.native
  
  /**
    * @hidden
    * Set default value
    **/
  def setDefault(param: Any): this.type = js.native
  
  /**
    * @hidden
    * Set displayName value
    **/
  def setDisplayName(param: String): this.type = js.native
  
  /**
    * @hidden
    * Set isAnnotation value
    **/
  def setIsAnnotation(param: Boolean): this.type = js.native
  
  /**
    * @hidden
    * Set name value
    **/
  def setName(param: String): this.type = js.native
  
  /**
    * @hidden
    * Set required value
    **/
  def setRequired(param: Boolean): this.type = js.native
  
  /**
    * @hidden
    * Set schema value
    **/
  def setSchema(param: String): this.type = js.native
  
  /**
    * @hidden
    * Set type value
    **/
  def setType(param: String): this.type = js.native
  
  /**
    * A base type which the current type extends, or more generally a type expression.
    * @hidden
    **/
  def type_original(): js.Array[String] = js.native
  
  def uses(): js.Array[UsesDeclaration] = js.native
  
  /**
    * @hidden
    **/
  /* CompleteClass */
  override def wrapperClassName(): String = js.native
}
/* static members */
object TypeDeclarationImpl {
  
  @JSImport("raml-1-parser/dist/parser/artifacts/raml10parser", "TypeDeclarationImpl")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @return Whether specified object is an instance of this class
    **/
  inline def isInstance(instance: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
