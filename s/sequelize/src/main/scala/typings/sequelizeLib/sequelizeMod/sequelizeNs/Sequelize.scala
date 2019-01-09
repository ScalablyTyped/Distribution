package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is the main class, the entry point to sequelize. To use it, you just need to
  * import sequelize:
  *
  * ```js
  * var Sequelize = require('sequelize');
  * ```
  *
  * In addition to sequelize, the connection library for the dialect you want to use
  * should also be installed in your project. You don't need to import it however, as
  * sequelize will take care of that.
  */
@js.native
trait Sequelize
  extends SequelizeStaticAndInstance
     with Hooks[js.Any] {
  /**
    * A reference to Sequelize constructor from sequelize. Useful for accessing DataTypes, Errors etc.
    */
  var Sequelize: SequelizeStatic = js.native
  /**
    * Defined models.
    */
  var models: ModelsHashInterface = js.native
  /**
    * Defined options.
    */
  var options: Options = js.native
  /**
    * Test the connection by trying to authenticate
    *
    * @param options Query Options for authentication
    */
  def authenticate(): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def authenticate(options: QueryOptions): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * Close all connections used by this sequelize instance, and free all references so the instance can be
    * garbage collected.
    *
    * Normally this is done on process exit, so you only need to call this method if you are creating multiple
    * instances, and want to garbage collect some of them.
    */
  def close(): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  /**
    * Create a new database schema.
    *
    * Note,that this is a schema in the
    * [postgres sense of the word](http://www.postgresql.org/docs/9.1/static/ddl-schemas.html),
    * not a database table. In mysql and sqlite, this command will do nothing.
    *
    * @param schema Name of the schema
    * @param options Options supplied
    * @param options.logging A function that logs sql queries, or false for no logging
    */
  def createSchema(schema: java.lang.String, options: sequelizeLib.Anon_LoggingBoolean): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  /**
    * Returns the database version
    */
  def databaseVersion(): bluebirdLib.bluebirdMod.namespaced[java.lang.String] = js.native
  /**
    * Define a new model, representing a table in the DB.
    *
    * The table columns are define by the hash that is given as the second argument. Each attribute of the
    * hash
    * represents a column. A short table definition might look like this:
    *
    * ```js
    * sequelize.define('modelName', {
    *     columnA: {
    *         type: Sequelize.BOOLEAN,
    *         validate: {
    *           is: ["[a-z]",'i'],        // will only allow letters
    *           max: 23,                  // only allow values <= 23
    *           isIn: {
    *             args: [['en', 'zh']],
    *             msg: "Must be English or Chinese"
    *           }
    *         },
    *         field: 'column_a'
    *         // Other attributes here
    *     },
    *     columnB: Sequelize.STRING,
    *     columnC: 'MY VERY OWN COLUMN TYPE'
    * })
    *
    * sequelize.models.modelName // The model will now be available in models under the name given to define
    * ```
    *
    * As shown above, column definitions can be either strings, a reference to one of the datatypes that are
    * predefined on the Sequelize constructor, or an object that allows you to specify both the type of the
    * column, and other attributes such as default values, foreign key constraints and custom setters and
    * getters.
    *
    * For a list of possible data types, see
    * http://docs.sequelizejs.com/en/latest/docs/models-definition/#data-types
    *
    * For more about getters and setters, see
    * http://docs.sequelizejs.com/en/latest/docs/models-definition/#getters-setters
    *
    * For more about instance and class methods, see
    * http://docs.sequelizejs.com/en/latest/docs/models-definition/#expansion-of-models
    *
    * For more about validation, see
    * http://docs.sequelizejs.com/en/latest/docs/models-definition/#validations
    *
    * @param modelName  The name of the model. The model will be stored in `sequelize.models` under this name
    * @param attributes An object, where each attribute is a column of the table. Each column can be either a
    *                   DataType, a string or a type-description object, with the properties described below:
    * @param options    These options are merged with the default define options provided to the Sequelize
    *                   constructor
    */
  def define[TInstance, TAttributes](modelName: java.lang.String, attributes: DefineModelAttributes[TAttributes]): Model[TInstance, TAttributes] = js.native
  def define[TInstance, TAttributes](
    modelName: java.lang.String,
    attributes: DefineModelAttributes[TAttributes],
    options: DefineOptions[TInstance]
  ): Model[TInstance, TAttributes] = js.native
  /**
    * Drop all tables defined through this sequelize instance. This is done by calling Model.drop on each model
    * @see {Model#drop} for options
    *
    * @param options The options passed to each call to Model.drop
    */
  def drop(): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def drop(options: DropOptions): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  /**
    * Drop all schemas
    *
    * Note,that this is a schema in the
    * [postgres sense of the word](http://www.postgresql.org/docs/9.1/static/ddl-schemas.html),
    * not a database table. In mysql and sqlite, this is the equivalent of drop all tables.
    *
    * @param options Options supplied
    * @param options.logging A function that logs sql queries, or false for no logging
    */
  def dropAllSchemas(options: sequelizeLib.Anon_LoggingBoolean): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  /**
    * Drop a single schema
    *
    * Note,that this is a schema in the
    * [postgres sense of the word](http://www.postgresql.org/docs/9.1/static/ddl-schemas.html),
    * not a database table. In mysql and sqlite, this drop a table matching the schema name
    *
    * @param schema Name of the schema
    * @param options Options supplied
    * @param options.logging A function that logs sql queries, or false for no logging
    */
  def dropSchema(schema: java.lang.String, options: sequelizeLib.Anon_LoggingBoolean): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  /**
    * Escape value.
    *
    * @param value Value that needs to be escaped
    */
  def escape(value: java.lang.String): java.lang.String = js.native
  /**
    * Returns the specified dialect.
    */
  def getDialect(): java.lang.String = js.native
  /**
    * Returns an instance of QueryInterface.
    */
  def getQueryInterface(): QueryInterface = js.native
  /**
    * Imports a model defined in another file
    *
    * Imported models are cached, so multiple calls to import with the same path will not load the file
    * multiple times
    *
    * See https://github.com/sequelize/sequelize/blob/master/examples/using-multiple-model-files/Task.js for a
    * short example of how to define your models in separate files so that they can be imported by
    * sequelize.import
    *
    * @param path The path to the file that holds the model you want to import. If the part is relative, it
    *     will be resolved relatively to the calling file
    *
    * @param defineFunction An optional function that provides model definitions. Useful if you do not
    *     want to use the module root as the define function
    */
  def `import`[TInstance, TAttributes](path: java.lang.String): Model[TInstance, TAttributes] = js.native
  def `import`[TInstance, TAttributes](
    path: java.lang.String,
    defineFunction: js.Function2[/* sequelize */ this.type, /* dataTypes */ DataTypes, Model[TInstance, TAttributes]]
  ): Model[TInstance, TAttributes] = js.native
  /**
    * Checks whether a model with the given name is defined
    *
    * @param modelName The name of a model defined with Sequelize.define
    */
  def isDefined(modelName: java.lang.String): scala.Boolean = js.native
  /**
    * Fetch a Model which is already defined
    *
    * @param modelName The name of a model defined with Sequelize.define
    */
  def model[TInstance, TAttributes](modelName: java.lang.String): Model[TInstance, TAttributes] = js.native
  /**
    * Execute a query on the DB, with the posibility to bypass all the sequelize goodness.
    *
    * By default, the function will return two arguments: an array of results, and a metadata object,
    * containing number of affected rows etc. Use `.spread` to access the results.
    *
    * If you are running a type of query where you don't need the metadata, for example a `SELECT` query, you
    * can pass in a query type to make sequelize format the results:
    *
    * ```js
    * sequelize.query('SELECT...').spread(function (results, metadata) {
    *   // Raw query - use spread
    * });
    *
    * sequelize.query('SELECT...', { type: sequelize.QueryTypes.SELECT }).then(function (results) {
    *   // SELECT query - use then
    * })
    * ```
    *
    * @param sql
    * @param options Query options
    */
  def query(sql: java.lang.String): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def query(sql: java.lang.String, options: QueryOptions): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def query(sql: sequelizeLib.Anon_Query): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def query(sql: sequelizeLib.Anon_Query, options: QueryOptions): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  /**
    * Get the fn for random based on the dialect
    */
  def random(): fn = js.native
  /**
    * Execute a query which would set an environment or user variable. The variables are set per connection,
    * so this function needs a transaction.
    *
    * Only works for MySQL.
    *
    * @param variables Object with multiple variables.
    * @param options Query options.
    */
  def set(variables: js.Object, options: QueryOptionsTransactionRequired): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  /**
    * Show all defined schemas
    *
    * Note,that this is a schema in the
    * [postgres sense of the word](http://www.postgresql.org/docs/9.1/static/ddl-schemas.html),
    * not a database table. In mysql and sqlite, this will show all tables.
    *
    * @param options Options supplied
    * @param options.logging A function that logs sql queries, or false for no logging
    */
  def showAllSchemas(options: sequelizeLib.Anon_LoggingBoolean): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  /**
    * Sync all defined models to the DB.
    *
    * @param options Sync Options
    */
  def sync(): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def sync(options: SyncOptions): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def transaction(): bluebirdLib.bluebirdMod.namespaced[Transaction] = js.native
  def transaction(options: TransactionOptions): bluebirdLib.bluebirdMod.namespaced[Transaction] = js.native
  def transaction[T](autoCallback: js.Function1[/* t */ Transaction, js.Thenable[T]]): bluebirdLib.bluebirdMod.namespaced[T] = js.native
  /**
    * Start a transaction. When using transactions, you should pass the transaction in the options argument
    * in order for the query to happen under that transaction
    *
    * ```js
    * sequelize.transaction().then(function (t) {
    *   return User.find(..., { transaction: t}).then(function (user) {
    *     return user.updateAttributes(..., { transaction: t});
    *   })
    *   .then(t.commit.bind(t))
    *   .catch(t.rollback.bind(t));
    * })
    * ```
    *
    * A syntax for automatically committing or rolling back based on the promise chain resolution is also
    * supported:
    *
    * ```js
    * sequelize.transaction(function (t) { // Note that we use a callback rather than a promise.then()
    *   return User.find(..., { transaction: t}).then(function (user) {
    *     return user.updateAttributes(..., { transaction: t});
    *   });
    * }).then(function () {
    *   // Commited
    * }).catch(function (err) {
    *   // Rolled back
    *   console.error(err);
    * });
    * ```
    *
    * If you have [CLS](https://github.com/othiym23/node-continuation-local-storage) enabled, the transaction
    * will automatically be passed to any query that runs witin the callback. To enable CLS, add it do your
    * project, create a namespace and set it on the sequelize constructor:
    *
    * ```js
    * var cls = require('continuation-local-storage'),
    *     ns = cls.createNamespace('....');
    * var Sequelize = require('sequelize');
    * Sequelize.cls = ns;
    * ```
    * Note, that CLS is enabled for all sequelize instances, and all instances will share the same namespace
    *
    * @param options Transaction Options
    * @param autoCallback Callback for the transaction
    */
  def transaction[T](options: TransactionOptions, autoCallback: js.Function1[/* t */ Transaction, js.Thenable[T]]): bluebirdLib.bluebirdMod.namespaced[T] = js.native
  /**
    * Truncate all tables defined through the sequelize models. This is done
    * by calling Model.truncate() on each model.
    *
    * @param {object} [options] The options passed to Model.destroy in addition to truncate
    * @param {Boolean|function} [options.transaction]
    * @param {Boolean|function} [options.logging] A function that logs sql queries, or false for no logging
    */
  def truncate(): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def truncate(options: DestroyOptions): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def validate(): bluebirdLib.bluebirdMod.namespaced[ValidationError] = js.native
  def validate(options: QueryOptions): bluebirdLib.bluebirdMod.namespaced[ValidationError] = js.native
}

