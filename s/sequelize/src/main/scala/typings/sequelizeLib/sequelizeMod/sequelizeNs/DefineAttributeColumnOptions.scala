package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Column options for the model schema attributes
  *
  * @see Attributes
  */
trait DefineAttributeColumnOptions extends ColumnOptions {
  /**
    * Is this field an auto increment field
    */
  var autoIncrement: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Comment for the database
    */
  var comment: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Provide a custom getter for this column. Use `this.getDataValue(String)` to manipulate the underlying
    * values.
    */
  var get: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * What should happen when the referenced key is deleted. One of CASCADE, RESTRICT, SET DEFAULT, SET NULL or
    * NO ACTION
    */
  var onDelete: js.UndefOr[java.lang.String] = js.undefined
  /**
    * What should happen when the referenced key is updated. One of CASCADE, RESTRICT, SET DEFAULT, SET NULL or
    * NO ACTION
    */
  var onUpdate: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Primary key flag
    */
  var primaryKey: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An object with reference configurations
    */
  var references: js.UndefOr[DefineAttributeColumnReferencesOptions] = js.undefined
  /**
    * Provide a custom setter for this column. Use `this.setDataValue(String, Value)` to manipulate the
    * underlying values.
    */
  var set: js.UndefOr[js.Function1[/* val */ js.Any, scala.Unit]] = js.undefined
  /**
    * A string or a data type
    */
  var `type`: java.lang.String | DataTypeAbstract
  /**
    * If true, the column will get a unique constraint. If a string is provided, the column will be part of a
    * composite unique index. If multiple columns have the same string, they will be part of the same unique
    * index
    */
  var unique: js.UndefOr[scala.Boolean | java.lang.String | sequelizeLib.Anon_Msg] = js.undefined
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
  var values: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

