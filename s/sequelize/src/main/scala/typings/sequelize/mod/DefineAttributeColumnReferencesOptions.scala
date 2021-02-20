package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * References options for the column's attributes
  *
  * @see AttributeColumnOptions
  */
@js.native
trait DefineAttributeColumnReferencesOptions extends StObject {
  
  /**
    * When to check for the foreign key constraing
    *
    * PostgreSQL only
    */
  var deferrable: js.UndefOr[
    DeferrableInitiallyDeferred | DeferrableInitiallyImmediate | DeferrableNot | DeferrableSetDeferred | DeferrableSetImmediate
  ] = js.native
  
  /**
    * The column of the foreign table that this column references
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * If this column references another table, provide it here as a Model, or a string
    */
  var model: String | (Model[_, _, _]) = js.native
}
object DefineAttributeColumnReferencesOptions {
  
  @scala.inline
  def apply(model: String | (Model[_, _, _])): DefineAttributeColumnReferencesOptions = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineAttributeColumnReferencesOptions]
  }
  
  @scala.inline
  implicit class DefineAttributeColumnReferencesOptionsMutableBuilder[Self <: DefineAttributeColumnReferencesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeferrable(
      value: DeferrableInitiallyDeferred | DeferrableInitiallyImmediate | DeferrableNot | DeferrableSetDeferred | DeferrableSetImmediate
    ): Self = StObject.set(x, "deferrable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeferrableUndefined: Self = StObject.set(x, "deferrable", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setModel(value: String | (Model[_, _, _])): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
  }
}
