package typings.raml1Parser.raml08parserMod

import typings.raml1Parser.highLevelASTMod.IHighLevelNode
import typings.raml1Parser.parserCoreMod.BasicNodeImpl
import typings.raml1Parser.raml08parserapiMod.Parameter
import typings.raml1Parser.raml08parserapiMod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-1-parser/dist/parser/artifacts/raml08parser", "ResourceImpl")
@js.native
open class ResourceImpl protected ()
  extends BasicNodeImpl
     with Resource {
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
    * Set displayName value
    **/
  def setDisplayName(param: String): this.type = js.native
  
  /**
    * Uri parameters of this resource
    * @hidden
    **/
  def uriParameters_original(): js.Array[Parameter] = js.native
  
  /**
    * @hidden
    **/
  /* CompleteClass */
  override def wrapperClassName(): String = js.native
}
/* static members */
object ResourceImpl {
  
  @JSImport("raml-1-parser/dist/parser/artifacts/raml08parser", "ResourceImpl")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @return Whether specified object is an instance of this class
    **/
  inline def isInstance(instance: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
