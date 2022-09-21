package typings.raml1Parser.raml08parserMod

import typings.raml1Parser.highLevelASTMod.IAttribute
import typings.raml1Parser.highLevelASTMod.IStructuredValue
import typings.raml1Parser.parserCoreApiMod.BasicNode
import typings.raml1Parser.parserCoreApiMod.ValueMetadata
import typings.raml1Parser.raml08parserapiMod.Trait
import typings.raml1Parser.raml08parserapiMod.TraitRef
import typings.raml1Parser.raml08parserapiMod.TypeInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-1-parser/dist/parser/artifacts/raml08parser", "TraitRefImpl")
@js.native
open class TraitRefImpl protected ()
  extends ReferenceImpl
     with TraitRef {
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
    * Returns name of referenced object
    **/
  /* CompleteClass */
  override def name(): String = js.native
  
  /**
    * @return Whether the element is an optional sibling of trait or resource type
    **/
  /* CompleteClass */
  override def optional(): Boolean = js.native
  
  /* CompleteClass */
  override def parent(): BasicNode = js.native
  
  /**
    * Returns a structured object if the reference point to one.
    **/
  /* CompleteClass */
  override def structuredValue(): TypeInstance = js.native
  
  /**
    * JSON representation of the attribute value
    **/
  /* CompleteClass */
  override def toJSON(): Any = js.native
  
  /**
    * Returns referenced trait
    **/
  /* CompleteClass */
  override def `trait`(): Trait = js.native
  
  /**
    * @return StructuredValue object representing the node value
    **/
  /* CompleteClass */
  override def value(): IStructuredValue = js.native
  
  /**
    * @hidden
    **/
  /* CompleteClass */
  override def wrapperClassName(): String = js.native
}
/* static members */
object TraitRefImpl {
  
  @JSImport("raml-1-parser/dist/parser/artifacts/raml08parser", "TraitRefImpl")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @return Whether specified object is an instance of this class
    **/
  inline def isInstance(instance: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
