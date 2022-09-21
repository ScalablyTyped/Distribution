package typings.raml1Parser.raml08parserMod

import typings.raml1Parser.highLevelASTMod.IHighLevelNode
import typings.raml1Parser.parserCoreMod.BasicNodeImpl
import typings.raml1Parser.raml08parserapiMod.Parameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-1-parser/dist/parser/artifacts/raml08parser", "ParameterImpl")
@js.native
open class ParameterImpl protected ()
  extends BasicNodeImpl
     with Parameter {
  /**
    * @hidden
    **/
  def this(_node: IHighLevelNode) = this()
  def this(_node: IHighLevelNode, setAsWrapper: Boolean) = this()
  
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
    * Set example value
    **/
  def setExample(param: Any): this.type = js.native
  
  /**
    * @hidden
    * Set name value
    **/
  def setName(param: String): this.type = js.native
  
  /**
    * @hidden
    * Set repeat value
    **/
  def setRepeat(param: Boolean): this.type = js.native
  
  /**
    * @hidden
    * Set required value
    **/
  def setRequired(param: Boolean): this.type = js.native
  
  /**
    * @hidden
    * Set type value
    **/
  def setType(param: String): this.type = js.native
  
  /**
    * @hidden
    **/
  /* CompleteClass */
  override def wrapperClassName(): String = js.native
}
/* static members */
object ParameterImpl {
  
  @JSImport("raml-1-parser/dist/parser/artifacts/raml08parser", "ParameterImpl")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @return Whether specified object is an instance of this class
    **/
  inline def isInstance(instance: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
