package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Options for model definition
     *
     * @see Sequelize.define
     */

trait DefineOptions[TInstance] extends js.Object {
  var charset: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Provide functions that are added to the model (Model). If you override methods provided by sequelize,
           * you can access the original method using `this.constructor.prototype`, e.g.
           * `this.constructor.prototype.find.apply(this, arguments)`
           */
  var classMethods: js.UndefOr[js.Object] = js.undefined
  var collate: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Finaly you can specify a comment for the table in MySQL and PG
           */
  var comment: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Override the name of the createdAt column if a string is provided, or disable it if false. Timestamps
           * must be true. Not affected by underscored setting.
           */
  var createdAt: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
           * Define the default search scope to use for this model. Scopes have the same form as the options passed to
           * find / findAll.
           */
  var defaultScope: js.UndefOr[AnyFindOptions] = js.undefined
  /**
           * Override the name of the deletedAt column if a string is provided, or disable it if false. Timestamps
           * must be true. Not affected by underscored setting.
           */
  var deletedAt: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
           * You can also change the database engine, e.g. to MyISAM. InnoDB is the default.
           */
  var engine: js.UndefOr[java.lang.String] = js.undefined
  /**
           * If freezeTableName is true, sequelize will not try to alter the DAO name to get the table name.
           * Otherwise, the dao name will be pluralized. Default false.
           */
  var freezeTableName: js.UndefOr[scala.Boolean] = js.undefined
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
  var hasTrigger: js.UndefOr[scala.Boolean] = js.undefined
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
  var initialAutoIncrement: js.UndefOr[java.lang.String] = js.undefined
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
  var omitNull: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Calling destroy will not delete the model, but instead set a deletedAt timestamp if this is true. Needs
           * timestamps=true to work. Default false.
           */
  var paranoid: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Throws an error when no records found
           */
  var rejectOnError: js.UndefOr[scala.Boolean | nodeLib.Error] = js.undefined
  /**
           * Change the database schema. PG only feature, but also works with other dialects.
           */
  var schema: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Change the database schema delimiter. Defaults to "." on PG but for other dialects can be also changed to "_".
           */
  var schemaDelimiter: js.UndefOr[java.lang.String] = js.undefined
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
  var tableName: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Adds createdAt and updatedAt timestamps to the model. Default true.
           */
  var timestamps: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Converts all camelCased columns to underscored if true. Default false.
           */
  var underscored: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Converts camelCased model names to underscored tablenames if true. Default false.
           */
  var underscoredAll: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Override the name of the updatedAt column if a string is provided, or disable it if false. Timestamps
           * must be true. Not affected by underscored setting.
           */
  var updatedAt: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
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
  var version: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
}

