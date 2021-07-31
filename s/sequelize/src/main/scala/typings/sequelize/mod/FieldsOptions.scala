package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldsOptions extends StObject {
  
  /**
    * The fields to insert / update. Defaults to all fields
    */
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Run validations before the row is inserted
    */
  var validate: js.UndefOr[Boolean] = js.undefined
}
object FieldsOptions {
  
  @scala.inline
  def apply(): FieldsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldsOptions]
  }
  
  @scala.inline
  implicit class FieldsOptionsMutableBuilder[Self <: FieldsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
