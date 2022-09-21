package typings.raml1Parser.raml10parserMod

import typings.raml1Parser.highLevelASTMod.IAttribute
import typings.raml1Parser.parserCoreApiMod.BasicNode
import typings.raml1Parser.parserCoreApiMod.ValueMetadata
import typings.raml1Parser.parserCoreMod.AttributeNodeImpl
import typings.raml1Parser.raml10parserapiMod.ValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-1-parser/dist/parser/artifacts/raml10parser", "ValueTypeImpl")
@js.native
open class ValueTypeImpl protected ()
  extends AttributeNodeImpl
     with ValueType {
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
object ValueTypeImpl {
  
  @JSImport("raml-1-parser/dist/parser/artifacts/raml10parser", "ValueTypeImpl")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @return Whether specified object is an instance of this class
    **/
  inline def isInstance(instance: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
