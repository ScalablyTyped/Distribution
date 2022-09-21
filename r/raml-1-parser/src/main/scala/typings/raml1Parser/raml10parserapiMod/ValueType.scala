package typings.raml1Parser.raml10parserapiMod

import typings.raml1Parser.highLevelASTMod.IAttribute
import typings.raml1Parser.parserCoreApiMod.AttributeNode
import typings.raml1Parser.parserCoreApiMod.BasicNode
import typings.raml1Parser.parserCoreApiMod.ValueMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueType
  extends StObject
     with AttributeNode {
  
  /**
    * @return JS representation of the node value
    **/
  def value(): Any
}
object ValueType {
  
  inline def apply(
    RAMLVersion: () => String,
    highLevel: () => IAttribute,
    kind: () => String,
    meta: () => ValueMetadata,
    optional: () => Boolean,
    parent: () => BasicNode,
    toJSON: () => Any,
    value: () => Any,
    wrapperClassName: () => String
  ): ValueType = {
    val __obj = js.Dynamic.literal(RAMLVersion = js.Any.fromFunction0(RAMLVersion), highLevel = js.Any.fromFunction0(highLevel), kind = js.Any.fromFunction0(kind), meta = js.Any.fromFunction0(meta), optional = js.Any.fromFunction0(optional), parent = js.Any.fromFunction0(parent), toJSON = js.Any.fromFunction0(toJSON), value = js.Any.fromFunction0(value), wrapperClassName = js.Any.fromFunction0(wrapperClassName))
    __obj.asInstanceOf[ValueType]
  }
  
  extension [Self <: ValueType](x: Self) {
    
    inline def setValue(value: () => Any): Self = StObject.set(x, "value", js.Any.fromFunction0(value))
  }
}
