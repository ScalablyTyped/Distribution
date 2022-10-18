package typings.raml1Parser.distParserArtifactsRaml10parserMod

import typings.raml1Parser.distParserArtifactsRaml10parserapiMod.BooleanType
import typings.raml1Parser.distParserHighLevelASTMod.IAttribute
import typings.raml1Parser.distParserWrappedAstParserCoreApiMod.BasicNode
import typings.raml1Parser.distParserWrappedAstParserCoreApiMod.ValueMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-1-parser/dist/parser/artifacts/raml10parser", "BooleanTypeImpl")
@js.native
open class BooleanTypeImpl protected ()
  extends ValueTypeImpl
     with BooleanType {
  def this(attr: IAttribute) = this()
  
  /**
    * @return RAML version of the node. "RAML10" for RAML 1.0 and "RAML08" for RAML 0.8.
    */
  /* CompleteClass */
  override def RAMLVersion(): String = js.native
  
  /**
    * @return Underlying High Level attribute node
    **/
  /* CompleteClass */
  override def highLevel(): IAttribute = js.native
  
  /**
    * @return Actual name of instance interface
    **/
  /* CompleteClass */
  override def kind(): String = js.native
  
  /* CompleteClass */
  override def meta(): ValueMetadata = js.native
  
  /**
    * @return Whether the element is an optional sibling of trait or resource type
    **/
  /* CompleteClass */
  override def optional(): Boolean = js.native
  
  /* CompleteClass */
  override def parent(): BasicNode = js.native
  
  /**
    * JSON representation of the attribute value
    **/
  /* CompleteClass */
  override def toJSON(): Any = js.native
  
  /**
    * @return JS representation of the node value
    **/
  /* CompleteClass */
  override def value(): Any = js.native
  
  /**
    * @hidden
    **/
  /* CompleteClass */
  override def wrapperClassName(): String = js.native
}
/* static members */
object BooleanTypeImpl {
  
  @JSImport("raml-1-parser/dist/parser/artifacts/raml10parser", "BooleanTypeImpl")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @return Whether specified object is an instance of this class
    **/
  inline def isInstance(instance: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
