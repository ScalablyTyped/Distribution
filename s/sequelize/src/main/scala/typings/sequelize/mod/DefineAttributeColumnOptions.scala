package typings.sequelize.mod

import typings.sequelize.anon.Msg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Column options for the model schema attributes
  *
  * @see Attributes
  */
trait DefineAttributeColumnOptions
  extends StObject
     with ColumnOptions {
  
  /**
    * Is this field an auto increment field
    */
  var autoIncrement: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Comment for the database
    */
  var comment: js.UndefOr[String] = js.undefined
  
  /**
    * Provide a custom getter for this column. Use `this.getDataValue(String)` to manipulate the underlying
    * values.
    */
  var get: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  /**
    * What should happen when the referenced key is deleted. One of CASCADE, RESTRICT, SET DEFAULT, SET NULL or
    * NO ACTION
    */
  var onDelete: js.UndefOr[String] = js.undefined
  
  /**
    * What should happen when the referenced key is updated. One of CASCADE, RESTRICT, SET DEFAULT, SET NULL or
    * NO ACTION
    */
  var onUpdate: js.UndefOr[String] = js.undefined
  
  /**
    * Primary key flag
    */
  var primaryKey: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An object with reference configurations
    */
  var references: js.UndefOr[DefineAttributeColumnReferencesOptions] = js.undefined
  
  /**
    * Provide a custom setter for this column. Use `this.setDataValue(String, Value)` to manipulate the
    * underlying values.
    */
  var set: js.UndefOr[js.Function1[/* val */ js.Any, Unit]] = js.undefined
  
  /**
    * A string or a data type
    */
  var `type`: String | DataTypeAbstract
  
  /**
    * If true, the column will get a unique constraint. If a string is provided, the column will be part of a
    * composite unique index. If multiple columns have the same string, they will be part of the same unique
    * index
    */
  var unique: js.UndefOr[Boolean | String | Msg] = js.undefined
  
  /**
    * An object of validations to execute for this column every time the model is saved. Can be either the
    * name of a validation provided by validator.js, a validation function provided by extending validator.js
    * (see the
    * `DAOValidator` property for more details), or a custom validation function. Custom validation functions
    * are called with the value of the field, and can possibly take a second callback argument, to signal that
    * they are asynchronous. If the validator is sync, it should throw in the case of a failed validation, it
    * it is async, the callback should be called with the error text.
    */
  var validate: js.UndefOr[DefineValidateOptions] = js.undefined
  
  /**
    * Usage in object notation
    *
    * ```js
    * sequelize.define('model', {
    *     states: {
    *       type:   Sequelize.ENUM,
    *       values: ['active', 'pending', 'deleted']
    *     }
    *   })
    * ```
    */
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object DefineAttributeColumnOptions {
  
  @scala.inline
  def apply(`type`: String | DataTypeAbstract): DefineAttributeColumnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineAttributeColumnOptions]
  }
  
  @scala.inline
  implicit class DefineAttributeColumnOptionsMutableBuilder[Self <: DefineAttributeColumnOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoIncrement(value: Boolean): Self = StObject.set(x, "autoIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoIncrementUndefined: Self = StObject.set(x, "autoIncrement", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setGet(value: () => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    @scala.inline
    def setOnDelete(value: String): Self = StObject.set(x, "onDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDeleteUndefined: Self = StObject.set(x, "onDelete", js.undefined)
    
    @scala.inline
    def setOnUpdate(value: String): Self = StObject.set(x, "onUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
    
    @scala.inline
    def setPrimaryKey(value: Boolean): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
    
    @scala.inline
    def setReferences(value: DefineAttributeColumnReferencesOptions): Self = StObject.set(x, "references", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferencesUndefined: Self = StObject.set(x, "references", js.undefined)
    
    @scala.inline
    def setSet(value: /* val */ js.Any => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    
    @scala.inline
    def setType(value: String | DataTypeAbstract): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnique(value: Boolean | String | Msg): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
    
    @scala.inline
    def setValidate(value: DefineValidateOptions): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
