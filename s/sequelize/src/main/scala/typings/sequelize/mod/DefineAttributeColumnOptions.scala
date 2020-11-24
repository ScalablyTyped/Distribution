package typings.sequelize.mod

import typings.sequelize.anon.Msg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Column options for the model schema attributes
  *
  * @see Attributes
  */
@js.native
trait DefineAttributeColumnOptions extends ColumnOptions {
  
  /**
    * Is this field an auto increment field
    */
  var autoIncrement: js.UndefOr[Boolean] = js.native
  
  /**
    * Comment for the database
    */
  var comment: js.UndefOr[String] = js.native
  
  /**
    * Provide a custom getter for this column. Use `this.getDataValue(String)` to manipulate the underlying
    * values.
    */
  var get: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * What should happen when the referenced key is deleted. One of CASCADE, RESTRICT, SET DEFAULT, SET NULL or
    * NO ACTION
    */
  var onDelete: js.UndefOr[String] = js.native
  
  /**
    * What should happen when the referenced key is updated. One of CASCADE, RESTRICT, SET DEFAULT, SET NULL or
    * NO ACTION
    */
  var onUpdate: js.UndefOr[String] = js.native
  
  /**
    * Primary key flag
    */
  var primaryKey: js.UndefOr[Boolean] = js.native
  
  /**
    * An object with reference configurations
    */
  var references: js.UndefOr[DefineAttributeColumnReferencesOptions] = js.native
  
  /**
    * Provide a custom setter for this column. Use `this.setDataValue(String, Value)` to manipulate the
    * underlying values.
    */
  var set: js.UndefOr[js.Function1[/* val */ js.Any, Unit]] = js.native
  
  /**
    * A string or a data type
    */
  var `type`: String | DataTypeAbstract = js.native
  
  /**
    * If true, the column will get a unique constraint. If a string is provided, the column will be part of a
    * composite unique index. If multiple columns have the same string, they will be part of the same unique
    * index
    */
  var unique: js.UndefOr[Boolean | String | Msg] = js.native
  
  /**
    * An object of validations to execute for this column every time the model is saved. Can be either the
    * name of a validation provided by validator.js, a validation function provided by extending validator.js
    * (see the
    * `DAOValidator` property for more details), or a custom validation function. Custom validation functions
    * are called with the value of the field, and can possibly take a second callback argument, to signal that
    * they are asynchronous. If the validator is sync, it should throw in the case of a failed validation, it
    * it is async, the callback should be called with the error text.
    */
  var validate: js.UndefOr[DefineValidateOptions] = js.native
  
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
  var values: js.UndefOr[js.Array[String]] = js.native
}
object DefineAttributeColumnOptions {
  
  @scala.inline
  def apply(`type`: String | DataTypeAbstract): DefineAttributeColumnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineAttributeColumnOptions]
  }
  
  @scala.inline
  implicit class DefineAttributeColumnOptionsOps[Self <: DefineAttributeColumnOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: String | DataTypeAbstract): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoIncrement(value: Boolean): Self = this.set("autoIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoIncrement: Self = this.set("autoIncrement", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setGet(value: () => _): Self = this.set("get", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGet: Self = this.set("get", js.undefined)
    
    @scala.inline
    def setOnDelete(value: String): Self = this.set("onDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnDelete: Self = this.set("onDelete", js.undefined)
    
    @scala.inline
    def setOnUpdate(value: String): Self = this.set("onUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
    
    @scala.inline
    def setPrimaryKey(value: Boolean): Self = this.set("primaryKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryKey: Self = this.set("primaryKey", js.undefined)
    
    @scala.inline
    def setReferences(value: DefineAttributeColumnReferencesOptions): Self = this.set("references", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferences: Self = this.set("references", js.undefined)
    
    @scala.inline
    def setSet(value: /* val */ js.Any => Unit): Self = this.set("set", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSet: Self = this.set("set", js.undefined)
    
    @scala.inline
    def setUnique(value: Boolean | String | Msg): Self = this.set("unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnique: Self = this.set("unique", js.undefined)
    
    @scala.inline
    def setValidate(value: DefineValidateOptions): Self = this.set("validate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
