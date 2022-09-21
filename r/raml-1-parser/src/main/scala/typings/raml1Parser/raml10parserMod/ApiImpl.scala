package typings.raml1Parser.raml10parserMod

import typings.raml1Parser.highLevelASTMod.IHighLevelNode
import typings.raml1Parser.raml10parserapiMod.Api
import typings.raml1Parser.raml10parserapiMod.TypeDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-1-parser/dist/parser/artifacts/raml10parser", "ApiImpl")
@js.native
open class ApiImpl protected ()
  extends LibraryBaseImpl
     with Api {
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
    * @return RAML version of the node
    * @hidden
    **/
  def RAMLVersion_original(): String = js.native
  
  /**
    * Named parameters used in the baseUri (template)
    * @hidden
    **/
  def baseUriParameters_original(): js.Array[TypeDeclaration] = js.native
  
  /**
    * @return Actual name of instance interface
    **/
  /* CompleteClass */
  override def kind(): String = js.native
  
  /**
    * @hidden
    * Set protocols value
    **/
  def setProtocols(param: String): this.type = js.native
  
  /**
    * @hidden
    * Set title value
    **/
  def setTitle(param: String): this.type = js.native
  
  /**
    * @hidden
    * Set version value
    **/
  def setVersion(param: String): this.type = js.native
  
  /**
    * @hidden
    **/
  /* CompleteClass */
  override def wrapperClassName(): String = js.native
}
/* static members */
object ApiImpl {
  
  @JSImport("raml-1-parser/dist/parser/artifacts/raml10parser", "ApiImpl")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @return Whether specified object is an instance of this class
    **/
  inline def isInstance(instance: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
