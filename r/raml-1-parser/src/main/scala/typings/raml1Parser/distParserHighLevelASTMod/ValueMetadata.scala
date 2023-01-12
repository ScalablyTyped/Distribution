package typings.raml1Parser.distParserHighLevelASTMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueMetadata extends StObject {
  
  /**
    * Returns 'true', if the actual value is missing, and returned value has
    * been obtained from the RAML document by means of some rule.
    * @default false
    */
  def calculated(): Boolean
  
  /**
    * Returns 'true', if the actual value is missing, and returned value is
    * stated in the RAML spec as default for the property
    * @default false
    */
  def insertedAsDefault(): Boolean
  
  /**
    * Returns 'true', if all values are default.
    */
  def isDefault(): Boolean
  
  /**
    * Returns 'true' for optional siblings of traits and resource types
    * @default false
    */
  def optional(): Boolean
  
  def toJSON(): Any
}
object ValueMetadata {
  
  inline def apply(
    calculated: () => Boolean,
    insertedAsDefault: () => Boolean,
    isDefault: () => Boolean,
    optional: () => Boolean,
    toJSON: () => Any
  ): ValueMetadata = {
    val __obj = js.Dynamic.literal(calculated = js.Any.fromFunction0(calculated), insertedAsDefault = js.Any.fromFunction0(insertedAsDefault), isDefault = js.Any.fromFunction0(isDefault), optional = js.Any.fromFunction0(optional), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[ValueMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueMetadata] (val x: Self) extends AnyVal {
    
    inline def setCalculated(value: () => Boolean): Self = StObject.set(x, "calculated", js.Any.fromFunction0(value))
    
    inline def setInsertedAsDefault(value: () => Boolean): Self = StObject.set(x, "insertedAsDefault", js.Any.fromFunction0(value))
    
    inline def setIsDefault(value: () => Boolean): Self = StObject.set(x, "isDefault", js.Any.fromFunction0(value))
    
    inline def setOptional(value: () => Boolean): Self = StObject.set(x, "optional", js.Any.fromFunction0(value))
    
    inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
