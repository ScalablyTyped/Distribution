package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for model definition
  *
  * @see Sequelize.define
  */
trait DefineOptions[TInstance] extends StObject {
  
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
  var rejectOnError: js.UndefOr[Boolean | typings.std.Error] = js.undefined
  
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
  
  inline def apply[TInstance](): DefineOptions[TInstance] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefineOptions[TInstance]]
  }
  
  extension [Self <: DefineOptions[?], TInstance](x: Self & DefineOptions[TInstance]) {
    
    inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
    
    inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
    
    inline def setClassMethods(value: js.Object): Self = StObject.set(x, "classMethods", value.asInstanceOf[js.Any])
    
    inline def setClassMethodsUndefined: Self = StObject.set(x, "classMethods", js.undefined)
    
    inline def setCollate(value: String): Self = StObject.set(x, "collate", value.asInstanceOf[js.Any])
    
    inline def setCollateUndefined: Self = StObject.set(x, "collate", js.undefined)
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setCreatedAt(value: String | Boolean): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setDefaultScope(value: AnyFindOptions): Self = StObject.set(x, "defaultScope", value.asInstanceOf[js.Any])
    
    inline def setDefaultScopeUndefined: Self = StObject.set(x, "defaultScope", js.undefined)
    
    inline def setDeletedAt(value: String | Boolean): Self = StObject.set(x, "deletedAt", value.asInstanceOf[js.Any])
    
    inline def setDeletedAtUndefined: Self = StObject.set(x, "deletedAt", js.undefined)
    
    inline def setEngine(value: String): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    inline def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
    
    inline def setFreezeTableName(value: Boolean): Self = StObject.set(x, "freezeTableName", value.asInstanceOf[js.Any])
    
    inline def setFreezeTableNameUndefined: Self = StObject.set(x, "freezeTableName", js.undefined)
    
    inline def setGetterMethods(value: DefineGetterMethodsOptions): Self = StObject.set(x, "getterMethods", value.asInstanceOf[js.Any])
    
    inline def setGetterMethodsUndefined: Self = StObject.set(x, "getterMethods", js.undefined)
    
    inline def setHasTrigger(value: Boolean): Self = StObject.set(x, "hasTrigger", value.asInstanceOf[js.Any])
    
    inline def setHasTriggerUndefined: Self = StObject.set(x, "hasTrigger", js.undefined)
    
    inline def setHooks(value: HooksDefineOptions[TInstance]): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
    
    inline def setIndexes(value: js.Array[DefineIndexesOptions]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
    
    inline def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
    
    inline def setIndexesVarargs(value: DefineIndexesOptions*): Self = StObject.set(x, "indexes", js.Array(value :_*))
    
    inline def setInitialAutoIncrement(value: String): Self = StObject.set(x, "initialAutoIncrement", value.asInstanceOf[js.Any])
    
    inline def setInitialAutoIncrementUndefined: Self = StObject.set(x, "initialAutoIncrement", js.undefined)
    
    inline def setInstanceMethods(value: js.Object): Self = StObject.set(x, "instanceMethods", value.asInstanceOf[js.Any])
    
    inline def setInstanceMethodsUndefined: Self = StObject.set(x, "instanceMethods", js.undefined)
    
    inline def setName(value: DefineNameOptions): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOmitNull(value: Boolean): Self = StObject.set(x, "omitNull", value.asInstanceOf[js.Any])
    
    inline def setOmitNullUndefined: Self = StObject.set(x, "omitNull", js.undefined)
    
    inline def setParanoid(value: Boolean): Self = StObject.set(x, "paranoid", value.asInstanceOf[js.Any])
    
    inline def setParanoidUndefined: Self = StObject.set(x, "paranoid", js.undefined)
    
    inline def setRejectOnError(value: Boolean | typings.std.Error): Self = StObject.set(x, "rejectOnError", value.asInstanceOf[js.Any])
    
    inline def setRejectOnErrorUndefined: Self = StObject.set(x, "rejectOnError", js.undefined)
    
    inline def setRowFormat(value: String): Self = StObject.set(x, "rowFormat", value.asInstanceOf[js.Any])
    
    inline def setRowFormatUndefined: Self = StObject.set(x, "rowFormat", js.undefined)
    
    inline def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaDelimiter(value: String): Self = StObject.set(x, "schemaDelimiter", value.asInstanceOf[js.Any])
    
    inline def setSchemaDelimiterUndefined: Self = StObject.set(x, "schemaDelimiter", js.undefined)
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setScopes(value: DefineScopeOptions): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
    
    inline def setSetterMethods(value: DefineSetterMethodsOptions): Self = StObject.set(x, "setterMethods", value.asInstanceOf[js.Any])
    
    inline def setSetterMethodsUndefined: Self = StObject.set(x, "setterMethods", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
    
    inline def setTimestamps(value: Boolean): Self = StObject.set(x, "timestamps", value.asInstanceOf[js.Any])
    
    inline def setTimestampsUndefined: Self = StObject.set(x, "timestamps", js.undefined)
    
    inline def setUnderscored(value: Boolean): Self = StObject.set(x, "underscored", value.asInstanceOf[js.Any])
    
    inline def setUnderscoredAll(value: Boolean): Self = StObject.set(x, "underscoredAll", value.asInstanceOf[js.Any])
    
    inline def setUnderscoredAllUndefined: Self = StObject.set(x, "underscoredAll", js.undefined)
    
    inline def setUnderscoredUndefined: Self = StObject.set(x, "underscored", js.undefined)
    
    inline def setUpdatedAt(value: String | Boolean): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
    
    inline def setValidate(value: DefineValidateOptions): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
    
    inline def setVersion(value: Boolean | String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
