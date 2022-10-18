package typings.raml1Parser.distParserHighLevelASTMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeMetadata
  extends StObject
     with ValueMetadata {
  
  /**
    * Returns metadata for those properties of the node, whose type is primitive or an array of primitive.
    */
  def primitiveValuesMeta(): StringDictionary[ValueMetadata]
}
object NodeMetadata {
  
  inline def apply(
    calculated: () => Boolean,
    insertedAsDefault: () => Boolean,
    isDefault: () => Boolean,
    optional: () => Boolean,
    primitiveValuesMeta: () => StringDictionary[ValueMetadata],
    toJSON: () => Any
  ): NodeMetadata = {
    val __obj = js.Dynamic.literal(calculated = js.Any.fromFunction0(calculated), insertedAsDefault = js.Any.fromFunction0(insertedAsDefault), isDefault = js.Any.fromFunction0(isDefault), optional = js.Any.fromFunction0(optional), primitiveValuesMeta = js.Any.fromFunction0(primitiveValuesMeta), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[NodeMetadata]
  }
  
  extension [Self <: NodeMetadata](x: Self) {
    
    inline def setPrimitiveValuesMeta(value: () => StringDictionary[ValueMetadata]): Self = StObject.set(x, "primitiveValuesMeta", js.Any.fromFunction0(value))
  }
}
