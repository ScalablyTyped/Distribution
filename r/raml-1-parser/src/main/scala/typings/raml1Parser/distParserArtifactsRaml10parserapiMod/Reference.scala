package typings.raml1Parser.distParserArtifactsRaml10parserapiMod

import typings.raml1Parser.distParserHighLevelASTMod.IAttribute
import typings.raml1Parser.distParserHighLevelASTMod.IStructuredValue
import typings.raml1Parser.distParserWrappedAstParserCoreApiMod.AttributeNode
import typings.raml1Parser.distParserWrappedAstParserCoreApiMod.BasicNode
import typings.raml1Parser.distParserWrappedAstParserCoreApiMod.ValueMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reference
  extends StObject
     with AttributeNode {
  
  /**
    * Returns name of referenced object
    **/
  def name(): String
  
  /**
    * Returns a structured object if the reference point to one.
    **/
  def structuredValue(): TypeInstance
  
  /**
    * @return StructuredValue object representing the node value
    **/
  def value(): IStructuredValue
}
object Reference {
  
  inline def apply(
    RAMLVersion: () => String,
    highLevel: () => IAttribute,
    kind: () => String,
    meta: () => ValueMetadata,
    name: () => String,
    optional: () => Boolean,
    parent: () => BasicNode,
    structuredValue: () => TypeInstance,
    toJSON: () => Any,
    value: () => IStructuredValue,
    wrapperClassName: () => String
  ): Reference = {
    val __obj = js.Dynamic.literal(RAMLVersion = js.Any.fromFunction0(RAMLVersion), highLevel = js.Any.fromFunction0(highLevel), kind = js.Any.fromFunction0(kind), meta = js.Any.fromFunction0(meta), name = js.Any.fromFunction0(name), optional = js.Any.fromFunction0(optional), parent = js.Any.fromFunction0(parent), structuredValue = js.Any.fromFunction0(structuredValue), toJSON = js.Any.fromFunction0(toJSON), value = js.Any.fromFunction0(value), wrapperClassName = js.Any.fromFunction0(wrapperClassName))
    __obj.asInstanceOf[Reference]
  }
  
  extension [Self <: Reference](x: Self) {
    
    inline def setName(value: () => String): Self = StObject.set(x, "name", js.Any.fromFunction0(value))
    
    inline def setStructuredValue(value: () => TypeInstance): Self = StObject.set(x, "structuredValue", js.Any.fromFunction0(value))
    
    inline def setValue(value: () => IStructuredValue): Self = StObject.set(x, "value", js.Any.fromFunction0(value))
  }
}
