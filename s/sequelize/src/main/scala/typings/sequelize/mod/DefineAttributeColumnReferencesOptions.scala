package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * References options for the column's attributes
  *
  * @see AttributeColumnOptions
  */
trait DefineAttributeColumnReferencesOptions extends StObject {
  
  /**
    * When to check for the foreign key constraing
    *
    * PostgreSQL only
    */
  var deferrable: js.UndefOr[
    DeferrableInitiallyDeferred | DeferrableInitiallyImmediate | DeferrableNot | DeferrableSetDeferred | DeferrableSetImmediate
  ] = js.undefined
  
  /**
    * The column of the foreign table that this column references
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * If this column references another table, provide it here as a Model, or a string
    */
  var model: String | (Model[Any, Any, Any])
}
object DefineAttributeColumnReferencesOptions {
  
  inline def apply(model: String | (Model[Any, Any, Any])): DefineAttributeColumnReferencesOptions = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineAttributeColumnReferencesOptions]
  }
  
  extension [Self <: DefineAttributeColumnReferencesOptions](x: Self) {
    
    inline def setDeferrable(
      value: DeferrableInitiallyDeferred | DeferrableInitiallyImmediate | DeferrableNot | DeferrableSetDeferred | DeferrableSetImmediate
    ): Self = StObject.set(x, "deferrable", value.asInstanceOf[js.Any])
    
    inline def setDeferrableUndefined: Self = StObject.set(x, "deferrable", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setModel(value: String | (Model[Any, Any, Any])): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
  }
}
