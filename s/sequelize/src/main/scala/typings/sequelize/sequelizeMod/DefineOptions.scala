package typings.sequelize.sequelizeMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for model definition
  *
  * @see Sequelize.define
  */
trait DefineOptions[TInstance] extends js.Object {
  var charset: js.UndefOr[String] = js.undefined
  /**
    * Provide functions that are added to the model (Model). If you override methods provided by sequelize,
    * you can access the original method using `this.constructor.prototype`, e.g.
    * `this.constructor.prototype.find.apply(this, arguments)`
    */
  var classMethods: js.UndefOr[js.Object] = js.undefined
  var collate: js.UndefOr[String] = js.undefined
  /**
    * Finaly you can specify a comment for the table in MySQL and PG
    */
  var comment: js.UndefOr[String] = js.undefined
  /**
    * Override the name of the createdAt column if a string is provided, or disable it if false. Timestamps
    * must be true. Not affected by underscored setting.
    */
  var createdAt: js.UndefOr[String | Boolean] = js.undefined
  /**
    * Define the default search scope to use for this model. Scopes have the same form as the options passed to
    * find / findAll.
    */
  var defaultScope: js.UndefOr[AnyFindOptions] = js.undefined
  /**
    * Override the name of the deletedAt column if a string is provided, or disable it if false. Timestamps
    * must be true. Not affected by underscored setting.
    */
  var deletedAt: js.UndefOr[String | Boolean] = js.undefined
  /**
    * You can also change the database engine, e.g. to MyISAM. InnoDB is the default.
    */
  var engine: js.UndefOr[String] = js.undefined
  /**
    * If freezeTableName is true, sequelize will not try to alter the DAO name to get the table name.
    * Otherwise, the dao name will be pluralized. Default false.
    */
  var freezeTableName: js.UndefOr[Boolean] = js.undefined
  /**
    * Provide getter functions that work like those defined per column. If you provide a getter method with
    * the
    * same name as a column, it will be used to access the value of that column. If you provide a name that
    * does not match a column, this function will act as a virtual getter, that can fetch multiple other
    * values
    */
  var getterMethods: js.UndefOr[DefineGetterMethodsOptions] = js.undefined
  /**
    * Indicates if the model's table has a trigger associated with it. Default false.
    */
  var hasTrigger: js.UndefOr[Boolean] = js.undefined
  /**
    * An object of hook function that are called before and after certain lifecycle events.
    * The possible hooks are: beforeValidate, afterValidate, beforeBulkCreate, beforeBulkDestroy,
    * beforeBulkUpdate, beforeCreate, beforeDestroy, beforeSave, beforeUpdate, afterCreate, afterDestroy,
    * afterSave, afterUpdate, afterBulkCreate, afterBulkDestory and afterBulkUpdate.
    * See Hooks for more information about hook functions and their signatures. Each property can either
    * be a function, or an array of functions.
    */
  var hooks: js.UndefOr[HooksDefineOptions[TInstance]] = js.undefined
  /**
    * Indexes for the provided database table
    */
  var indexes: js.UndefOr[js.Array[DefineIndexesOptions]] = js.undefined
  /**
    * Set the initial AUTO_INCREMENT value for the table in MySQL.
    */
  var initialAutoIncrement: js.UndefOr[String] = js.undefined
  /**
    * Provide functions that are added to each instance (DAO). If you override methods provided by sequelize,
    * you can access the original method using `this.constructor.super_.prototype`, e.g.
    * `this.constructor.super_.prototype.toJSON.apply(this, arguments)`
    */
  var instanceMethods: js.UndefOr[js.Object] = js.undefined
  /**
    * An object with two attributes, `singular` and `plural`, which are used when this model is associated to
    * others.
    */
  var name: js.UndefOr[DefineNameOptions] = js.undefined
  /**
    * Don't persits null values. This means that all columns with null values will not be saved.
    */
  var omitNull: js.UndefOr[Boolean] = js.undefined
  /**
    * Calling destroy will not delete the model, but instead set a deletedAt timestamp if this is true. Needs
    * timestamps=true to work. Default false.
    */
  var paranoid: js.UndefOr[Boolean] = js.undefined
  /**
    * Throws an error when no records found
    */
  var rejectOnError: js.UndefOr[Boolean | Error] = js.undefined
  /**
    * Specify the ROW_FORMAT for use with the MySQL InnoDB engine.
    */
  var rowFormat: js.UndefOr[String] = js.undefined
  /**
    * Change the database schema. PG only feature, but also works with other dialects.
    */
  var schema: js.UndefOr[String] = js.undefined
  /**
    * Change the database schema delimiter. Defaults to "." on PG but for other dialects can be also changed to "_".
    */
  var schemaDelimiter: js.UndefOr[String] = js.undefined
  /**
    * More scopes, defined in the same way as defaultScope above. See `Model.scope` for more information about
    * how scopes are defined, and what you can do with them
    */
  var scopes: js.UndefOr[DefineScopeOptions] = js.undefined
  /**
    * Provide setter functions that work like those defined per column. If you provide a setter method with
    * the
    * same name as a column, it will be used to update the value of that column. If you provide a name that
    * does not match a column, this function will act as a virtual setter, that can act on and set other
    * values, but will not be persisted
    */
  var setterMethods: js.UndefOr[DefineSetterMethodsOptions] = js.undefined
  /**
    * Defaults to pluralized model name, unless freezeTableName is true, in which case it uses model name
    * verbatim
    */
  var tableName: js.UndefOr[String] = js.undefined
  /**
    * Adds createdAt and updatedAt timestamps to the model. Default true.
    */
  var timestamps: js.UndefOr[Boolean] = js.undefined
  /**
    * Converts all camelCased columns to underscored if true. Default false.
    */
  var underscored: js.UndefOr[Boolean] = js.undefined
  /**
    * Converts camelCased model names to underscored tablenames if true. Default false.
    */
  var underscoredAll: js.UndefOr[Boolean] = js.undefined
  /**
    * Override the name of the updatedAt column if a string is provided, or disable it if false. Timestamps
    * must be true. Not affected by underscored setting.
    */
  var updatedAt: js.UndefOr[String | Boolean] = js.undefined
  /**
    * An object of model wide validations. Validations have access to all model values via `this`. If the
    * validator function takes an argument, it is asumed to be async, and is called with a callback that
    * accepts an optional error.
    */
  var validate: js.UndefOr[DefineValidateOptions] = js.undefined
  /**
    * Enable optimistic locking.  When enabled, sequelize will add a version count attribute
    * to the model and throw an OptimisticLockingError error when stale instances are saved.
    * Set to true or a string with the attribute name you want to use to enable.
    */
  var version: js.UndefOr[Boolean | String] = js.undefined
}

object DefineOptions {
  @scala.inline
  def apply[TInstance](
    charset: String = null,
    classMethods: js.Object = null,
    collate: String = null,
    comment: String = null,
    createdAt: String | Boolean = null,
    defaultScope: AnyFindOptions = null,
    deletedAt: String | Boolean = null,
    engine: String = null,
    freezeTableName: js.UndefOr[Boolean] = js.undefined,
    getterMethods: DefineGetterMethodsOptions = null,
    hasTrigger: js.UndefOr[Boolean] = js.undefined,
    hooks: HooksDefineOptions[TInstance] = null,
    indexes: js.Array[DefineIndexesOptions] = null,
    initialAutoIncrement: String = null,
    instanceMethods: js.Object = null,
    name: DefineNameOptions = null,
    omitNull: js.UndefOr[Boolean] = js.undefined,
    paranoid: js.UndefOr[Boolean] = js.undefined,
    rejectOnError: Boolean | Error = null,
    rowFormat: String = null,
    schema: String = null,
    schemaDelimiter: String = null,
    scopes: DefineScopeOptions = null,
    setterMethods: DefineSetterMethodsOptions = null,
    tableName: String = null,
    timestamps: js.UndefOr[Boolean] = js.undefined,
    underscored: js.UndefOr[Boolean] = js.undefined,
    underscoredAll: js.UndefOr[Boolean] = js.undefined,
    updatedAt: String | Boolean = null,
    validate: DefineValidateOptions = null,
    version: Boolean | String = null
  ): DefineOptions[TInstance] = {
    val __obj = js.Dynamic.literal()
    if (charset != null) __obj.updateDynamic("charset")(charset.asInstanceOf[js.Any])
    if (classMethods != null) __obj.updateDynamic("classMethods")(classMethods.asInstanceOf[js.Any])
    if (collate != null) __obj.updateDynamic("collate")(collate.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (defaultScope != null) __obj.updateDynamic("defaultScope")(defaultScope.asInstanceOf[js.Any])
    if (deletedAt != null) __obj.updateDynamic("deletedAt")(deletedAt.asInstanceOf[js.Any])
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    if (!js.isUndefined(freezeTableName)) __obj.updateDynamic("freezeTableName")(freezeTableName.asInstanceOf[js.Any])
    if (getterMethods != null) __obj.updateDynamic("getterMethods")(getterMethods.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTrigger)) __obj.updateDynamic("hasTrigger")(hasTrigger.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (indexes != null) __obj.updateDynamic("indexes")(indexes.asInstanceOf[js.Any])
    if (initialAutoIncrement != null) __obj.updateDynamic("initialAutoIncrement")(initialAutoIncrement.asInstanceOf[js.Any])
    if (instanceMethods != null) __obj.updateDynamic("instanceMethods")(instanceMethods.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(omitNull)) __obj.updateDynamic("omitNull")(omitNull.asInstanceOf[js.Any])
    if (!js.isUndefined(paranoid)) __obj.updateDynamic("paranoid")(paranoid.asInstanceOf[js.Any])
    if (rejectOnError != null) __obj.updateDynamic("rejectOnError")(rejectOnError.asInstanceOf[js.Any])
    if (rowFormat != null) __obj.updateDynamic("rowFormat")(rowFormat.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (schemaDelimiter != null) __obj.updateDynamic("schemaDelimiter")(schemaDelimiter.asInstanceOf[js.Any])
    if (scopes != null) __obj.updateDynamic("scopes")(scopes.asInstanceOf[js.Any])
    if (setterMethods != null) __obj.updateDynamic("setterMethods")(setterMethods.asInstanceOf[js.Any])
    if (tableName != null) __obj.updateDynamic("tableName")(tableName.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamps)) __obj.updateDynamic("timestamps")(timestamps.asInstanceOf[js.Any])
    if (!js.isUndefined(underscored)) __obj.updateDynamic("underscored")(underscored.asInstanceOf[js.Any])
    if (!js.isUndefined(underscoredAll)) __obj.updateDynamic("underscoredAll")(underscoredAll.asInstanceOf[js.Any])
    if (updatedAt != null) __obj.updateDynamic("updatedAt")(updatedAt.asInstanceOf[js.Any])
    if (validate != null) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineOptions[TInstance]]
  }
}

