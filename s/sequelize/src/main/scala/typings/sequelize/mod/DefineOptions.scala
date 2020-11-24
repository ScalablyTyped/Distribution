package typings.sequelize.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for model definition
  *
  * @see Sequelize.define
  */
@js.native
trait DefineOptions[TInstance] extends js.Object {
  
  var charset: js.UndefOr[String] = js.native
  
  /**
    * Provide functions that are added to the model (Model). If you override methods provided by sequelize,
    * you can access the original method using `this.constructor.prototype`, e.g.
    * `this.constructor.prototype.find.apply(this, arguments)`
    */
  var classMethods: js.UndefOr[js.Object] = js.native
  
  var collate: js.UndefOr[String] = js.native
  
  /**
    * Finaly you can specify a comment for the table in MySQL and PG
    */
  var comment: js.UndefOr[String] = js.native
  
  /**
    * Override the name of the createdAt column if a string is provided, or disable it if false. Timestamps
    * must be true. Not affected by underscored setting.
    */
  var createdAt: js.UndefOr[String | Boolean] = js.native
  
  /**
    * Define the default search scope to use for this model. Scopes have the same form as the options passed to
    * find / findAll.
    */
  var defaultScope: js.UndefOr[AnyFindOptions] = js.native
  
  /**
    * Override the name of the deletedAt column if a string is provided, or disable it if false. Timestamps
    * must be true. Not affected by underscored setting.
    */
  var deletedAt: js.UndefOr[String | Boolean] = js.native
  
  /**
    * You can also change the database engine, e.g. to MyISAM. InnoDB is the default.
    */
  var engine: js.UndefOr[String] = js.native
  
  /**
    * If freezeTableName is true, sequelize will not try to alter the DAO name to get the table name.
    * Otherwise, the dao name will be pluralized. Default false.
    */
  var freezeTableName: js.UndefOr[Boolean] = js.native
  
  /**
    * Provide getter functions that work like those defined per column. If you provide a getter method with
    * the
    * same name as a column, it will be used to access the value of that column. If you provide a name that
    * does not match a column, this function will act as a virtual getter, that can fetch multiple other
    * values
    */
  var getterMethods: js.UndefOr[DefineGetterMethodsOptions] = js.native
  
  /**
    * Indicates if the model's table has a trigger associated with it. Default false.
    */
  var hasTrigger: js.UndefOr[Boolean] = js.native
  
  /**
    * An object of hook function that are called before and after certain lifecycle events.
    * The possible hooks are: beforeValidate, afterValidate, beforeBulkCreate, beforeBulkDestroy,
    * beforeBulkUpdate, beforeCreate, beforeDestroy, beforeSave, beforeUpdate, afterCreate, afterDestroy,
    * afterSave, afterUpdate, afterBulkCreate, afterBulkDestory and afterBulkUpdate.
    * See Hooks for more information about hook functions and their signatures. Each property can either
    * be a function, or an array of functions.
    */
  var hooks: js.UndefOr[HooksDefineOptions[TInstance]] = js.native
  
  /**
    * Indexes for the provided database table
    */
  var indexes: js.UndefOr[js.Array[DefineIndexesOptions]] = js.native
  
  /**
    * Set the initial AUTO_INCREMENT value for the table in MySQL.
    */
  var initialAutoIncrement: js.UndefOr[String] = js.native
  
  /**
    * Provide functions that are added to each instance (DAO). If you override methods provided by sequelize,
    * you can access the original method using `this.constructor.super_.prototype`, e.g.
    * `this.constructor.super_.prototype.toJSON.apply(this, arguments)`
    */
  var instanceMethods: js.UndefOr[js.Object] = js.native
  
  /**
    * An object with two attributes, `singular` and `plural`, which are used when this model is associated to
    * others.
    */
  var name: js.UndefOr[DefineNameOptions] = js.native
  
  /**
    * Don't persits null values. This means that all columns with null values will not be saved.
    */
  var omitNull: js.UndefOr[Boolean] = js.native
  
  /**
    * Calling destroy will not delete the model, but instead set a deletedAt timestamp if this is true. Needs
    * timestamps=true to work. Default false.
    */
  var paranoid: js.UndefOr[Boolean] = js.native
  
  /**
    * Throws an error when no records found
    */
  var rejectOnError: js.UndefOr[Boolean | Error] = js.native
  
  /**
    * Specify the ROW_FORMAT for use with the MySQL InnoDB engine.
    */
  var rowFormat: js.UndefOr[String] = js.native
  
  /**
    * Change the database schema. PG only feature, but also works with other dialects.
    */
  var schema: js.UndefOr[String] = js.native
  
  /**
    * Change the database schema delimiter. Defaults to "." on PG but for other dialects can be also changed to "_".
    */
  var schemaDelimiter: js.UndefOr[String] = js.native
  
  /**
    * More scopes, defined in the same way as defaultScope above. See `Model.scope` for more information about
    * how scopes are defined, and what you can do with them
    */
  var scopes: js.UndefOr[DefineScopeOptions] = js.native
  
  /**
    * Provide setter functions that work like those defined per column. If you provide a setter method with
    * the
    * same name as a column, it will be used to update the value of that column. If you provide a name that
    * does not match a column, this function will act as a virtual setter, that can act on and set other
    * values, but will not be persisted
    */
  var setterMethods: js.UndefOr[DefineSetterMethodsOptions] = js.native
  
  /**
    * Defaults to pluralized model name, unless freezeTableName is true, in which case it uses model name
    * verbatim
    */
  var tableName: js.UndefOr[String] = js.native
  
  /**
    * Adds createdAt and updatedAt timestamps to the model. Default true.
    */
  var timestamps: js.UndefOr[Boolean] = js.native
  
  /**
    * Converts all camelCased columns to underscored if true. Default false.
    */
  var underscored: js.UndefOr[Boolean] = js.native
  
  /**
    * Converts camelCased model names to underscored tablenames if true. Default false.
    */
  var underscoredAll: js.UndefOr[Boolean] = js.native
  
  /**
    * Override the name of the updatedAt column if a string is provided, or disable it if false. Timestamps
    * must be true. Not affected by underscored setting.
    */
  var updatedAt: js.UndefOr[String | Boolean] = js.native
  
  /**
    * An object of model wide validations. Validations have access to all model values via `this`. If the
    * validator function takes an argument, it is asumed to be async, and is called with a callback that
    * accepts an optional error.
    */
  var validate: js.UndefOr[DefineValidateOptions] = js.native
  
  /**
    * Enable optimistic locking.  When enabled, sequelize will add a version count attribute
    * to the model and throw an OptimisticLockingError error when stale instances are saved.
    * Set to true or a string with the attribute name you want to use to enable.
    */
  var version: js.UndefOr[Boolean | String] = js.native
}
object DefineOptions {
  
  @scala.inline
  def apply[TInstance](): DefineOptions[TInstance] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefineOptions[TInstance]]
  }
  
  @scala.inline
  implicit class DefineOptionsOps[Self <: DefineOptions[_], TInstance] (val x: Self with DefineOptions[TInstance]) extends AnyVal {
    
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
    def setCharset(value: String): Self = this.set("charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharset: Self = this.set("charset", js.undefined)
    
    @scala.inline
    def setClassMethods(value: js.Object): Self = this.set("classMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassMethods: Self = this.set("classMethods", js.undefined)
    
    @scala.inline
    def setCollate(value: String): Self = this.set("collate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollate: Self = this.set("collate", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: String | Boolean): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    
    @scala.inline
    def setDefaultScope(value: AnyFindOptions): Self = this.set("defaultScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultScope: Self = this.set("defaultScope", js.undefined)
    
    @scala.inline
    def setDeletedAt(value: String | Boolean): Self = this.set("deletedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletedAt: Self = this.set("deletedAt", js.undefined)
    
    @scala.inline
    def setEngine(value: String): Self = this.set("engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngine: Self = this.set("engine", js.undefined)
    
    @scala.inline
    def setFreezeTableName(value: Boolean): Self = this.set("freezeTableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFreezeTableName: Self = this.set("freezeTableName", js.undefined)
    
    @scala.inline
    def setGetterMethods(value: DefineGetterMethodsOptions): Self = this.set("getterMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGetterMethods: Self = this.set("getterMethods", js.undefined)
    
    @scala.inline
    def setHasTrigger(value: Boolean): Self = this.set("hasTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasTrigger: Self = this.set("hasTrigger", js.undefined)
    
    @scala.inline
    def setHooks(value: HooksDefineOptions[TInstance]): Self = this.set("hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHooks: Self = this.set("hooks", js.undefined)
    
    @scala.inline
    def setIndexesVarargs(value: DefineIndexesOptions*): Self = this.set("indexes", js.Array(value :_*))
    
    @scala.inline
    def setIndexes(value: js.Array[DefineIndexesOptions]): Self = this.set("indexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexes: Self = this.set("indexes", js.undefined)
    
    @scala.inline
    def setInitialAutoIncrement(value: String): Self = this.set("initialAutoIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialAutoIncrement: Self = this.set("initialAutoIncrement", js.undefined)
    
    @scala.inline
    def setInstanceMethods(value: js.Object): Self = this.set("instanceMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceMethods: Self = this.set("instanceMethods", js.undefined)
    
    @scala.inline
    def setName(value: DefineNameOptions): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOmitNull(value: Boolean): Self = this.set("omitNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOmitNull: Self = this.set("omitNull", js.undefined)
    
    @scala.inline
    def setParanoid(value: Boolean): Self = this.set("paranoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParanoid: Self = this.set("paranoid", js.undefined)
    
    @scala.inline
    def setRejectOnError(value: Boolean | Error): Self = this.set("rejectOnError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejectOnError: Self = this.set("rejectOnError", js.undefined)
    
    @scala.inline
    def setRowFormat(value: String): Self = this.set("rowFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowFormat: Self = this.set("rowFormat", js.undefined)
    
    @scala.inline
    def setSchema(value: String): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
    
    @scala.inline
    def setSchemaDelimiter(value: String): Self = this.set("schemaDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchemaDelimiter: Self = this.set("schemaDelimiter", js.undefined)
    
    @scala.inline
    def setScopes(value: DefineScopeOptions): Self = this.set("scopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopes: Self = this.set("scopes", js.undefined)
    
    @scala.inline
    def setSetterMethods(value: DefineSetterMethodsOptions): Self = this.set("setterMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetterMethods: Self = this.set("setterMethods", js.undefined)
    
    @scala.inline
    def setTableName(value: String): Self = this.set("tableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableName: Self = this.set("tableName", js.undefined)
    
    @scala.inline
    def setTimestamps(value: Boolean): Self = this.set("timestamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamps: Self = this.set("timestamps", js.undefined)
    
    @scala.inline
    def setUnderscored(value: Boolean): Self = this.set("underscored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderscored: Self = this.set("underscored", js.undefined)
    
    @scala.inline
    def setUnderscoredAll(value: Boolean): Self = this.set("underscoredAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnderscoredAll: Self = this.set("underscoredAll", js.undefined)
    
    @scala.inline
    def setUpdatedAt(value: String | Boolean): Self = this.set("updatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatedAt: Self = this.set("updatedAt", js.undefined)
    
    @scala.inline
    def setValidate(value: DefineValidateOptions): Self = this.set("validate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
    
    @scala.inline
    def setVersion(value: Boolean | String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
