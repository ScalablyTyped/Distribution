package typings.raml1Parser.distParserArtifactsRaml08parserMod

import typings.raml1Parser.distParserArtifactsRaml08parserapiMod.Api
import typings.raml1Parser.distParserArtifactsRaml08parserapiMod.Parameter
import typings.raml1Parser.distParserArtifactsRaml08parserapiMod.ResourceType
import typings.raml1Parser.distParserArtifactsRaml08parserapiMod.Trait
import typings.raml1Parser.distParserHighLevelASTMod.IHighLevelNode
import typings.raml1Parser.distParserWrappedAstParserCoreMod.BasicNodeImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-1-parser/dist/parser/artifacts/raml08parser", "ApiImpl")
@js.native
open class ApiImpl protected ()
  extends BasicNodeImpl
     with Api {
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
    * @return RAML version of the node
    * @hidden
    **/
  def RAMLVersion_original(): String = js.native
  
  /**
    * Base uri parameters are named parameters which described template parameters in the base uri
    * @hidden
    **/
  def baseUriParameters_original(): js.Array[Parameter] = js.native
  
  /**
    * @return Actual name of instance interface
    **/
  /* CompleteClass */
  override def kind(): String = js.native
  
  /**
    * Declaration of resource types used in this API
    * @hidden
    **/
  def resourceTypes_original(): js.Array[ResourceType] = js.native
  
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
    * Declarations of traits used in this API
    * @hidden
    **/
  def traits_original(): js.Array[Trait] = js.native
  
  /**
    * @hidden
    **/
  /* CompleteClass */
  override def wrapperClassName(): String = js.native
}
/* static members */
object ApiImpl {
  
  @JSImport("raml-1-parser/dist/parser/artifacts/raml08parser", "ApiImpl")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @return Whether specified object is an instance of this class
    **/
  inline def isInstance(instance: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
