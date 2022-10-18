package typings.raml1Parser.distParserArtifactsRaml10parserMod

import typings.raml1Parser.distParserArtifactsRaml10parserapiMod.ObjectTypeDeclaration
import typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-1-parser/dist/parser/artifacts/raml10parser", "ObjectTypeDeclarationImpl")
@js.native
open class ObjectTypeDeclarationImpl protected ()
  extends TypeDeclarationImpl
     with ObjectTypeDeclaration {
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
    * @return Actual name of instance interface
    **/
  /* CompleteClass */
  override def kind(): String = js.native
  
  /**
    * @hidden
    * Set additionalProperties value
    **/
  def setAdditionalProperties(param: Boolean): this.type = js.native
  
  /**
    * @hidden
    * Set discriminator value
    **/
  def setDiscriminator(param: String): this.type = js.native
  
  /**
    * @hidden
    * Set discriminatorValue value
    **/
  def setDiscriminatorValue(param: String): this.type = js.native
  
  /**
    * @hidden
    * Set enum value
    **/
  def setEnum(param: Any): this.type = js.native
  
  /**
    * @hidden
    * Set maxProperties value
    **/
  def setMaxProperties(param: Double): this.type = js.native
  
  /**
    * @hidden
    * Set minProperties value
    **/
  def setMinProperties(param: Double): this.type = js.native
  
  /**
    * @hidden
    **/
  /* CompleteClass */
  override def wrapperClassName(): String = js.native
}
/* static members */
object ObjectTypeDeclarationImpl {
  
  @JSImport("raml-1-parser/dist/parser/artifacts/raml10parser", "ObjectTypeDeclarationImpl")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @return Whether specified object is an instance of this class
    **/
  inline def isInstance(instance: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
