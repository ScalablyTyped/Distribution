package typings.raml1Parser.raml10parserMod

import typings.raml1Parser.highLevelASTMod.IHighLevelNode
import typings.raml1Parser.raml10parserapiMod.ArrayTypeDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-1-parser/dist/parser/artifacts/raml10parser", "ArrayTypeDeclarationImpl")
@js.native
open class ArrayTypeDeclarationImpl protected ()
  extends TypeDeclarationImpl
     with ArrayTypeDeclaration {
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
    * Array component type.
    * @hidden
    **/
  def items_original(): js.Array[String] = js.native
  
  /**
    * @return Actual name of instance interface
    **/
  /* CompleteClass */
  override def kind(): String = js.native
  
  /**
    * @hidden
    * Set items value
    **/
  def setItems(param: String): this.type = js.native
  
  /**
    * @hidden
    * Set maxItems value
    **/
  def setMaxItems(param: Double): this.type = js.native
  
  /**
    * @hidden
    * Set minItems value
    **/
  def setMinItems(param: Double): this.type = js.native
  
  /**
    * @hidden
    * Set uniqueItems value
    **/
  def setUniqueItems(param: Boolean): this.type = js.native
  
  /**
    * @hidden
    **/
  /* CompleteClass */
  override def wrapperClassName(): String = js.native
}
/* static members */
object ArrayTypeDeclarationImpl {
  
  @JSImport("raml-1-parser/dist/parser/artifacts/raml10parser", "ArrayTypeDeclarationImpl")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @return Whether specified object is an instance of this class
    **/
  inline def isInstance(instance: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
