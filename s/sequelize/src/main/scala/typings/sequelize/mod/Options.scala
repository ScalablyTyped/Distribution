package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for the constructor of Sequelize main class
  */
@js.native
trait Options extends StObject {
  
  /**
    * Print query execution time in milliseconds when logging SQL.
    *
    * Defaults to false
    */
  var benchmark: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the database
    */
  var database: js.UndefOr[String] = js.native
  
  /**
    * The version of the database. Most times, this is automatically detected and is not needed.
    *
    * Defaults to 0
    */
  var databaseVersion: js.UndefOr[Double] = js.native
  
  /**
    * Default options for model definitions. See sequelize.define for options
    */
  var define: js.UndefOr[DefineOptions[_]] = js.native
  
  /**
    * The dialect of the database you are connecting to. One of mysql, postgres, sqlite, mariadb and mssql.
    *
    * Defaults to 'mysql'
    */
  var dialect: js.UndefOr[String] = js.native
  
  /**
    * If specified, load the dialect library from this path. For example, if you want to use pg.js instead of
    * pg when connecting to a pg database, you should specify 'pg.js' here
    */
  var dialectModulePath: js.UndefOr[String] = js.native
  
  /**
    * An object of additional options, which are passed directly to the connection library
    */
  var dialectOptions: js.UndefOr[js.Object] = js.native
  
  /**
    * The host of the relational database.
    *
    * Defaults to 'localhost'
    */
  var host: js.UndefOr[String] = js.native
  
  /**
    * Set the default transaction isolation level. See `Sequelize.Transaction.ISOLATION_LEVELS` for possible
    * options.
    *
    * Defaults to 'REPEATABLE_READ'
    */
  var isolationLevel: js.UndefOr[TransactionIsolationLevel] = js.native
  
  /**
    * A function that gets executed everytime Sequelize would log something.
    *
    * Defaults to console.log
    */
  var logging: js.UndefOr[Boolean | js.Function] = js.native
  
  /**
    * A flag that defines if native library shall be used or not. Currently only has an effect for postgres
    *
    * Defaults to false
    */
  var native: js.UndefOr[Boolean] = js.native
  
  /**
    * A flag that defines if null values should be passed to SQL queries or not.
    *
    * Defaults to false
    */
  var omitNull: js.UndefOr[Boolean] = js.native
  
  /**
    * String based operator alias, default value is true which will enable all operators alias.
    * Pass object to limit set of aliased operators or false to disable completely.
    */
  var operatorsAliases: js.UndefOr[Boolean | OperatorsAliases] = js.native
  
  /**
    * The password which is used to authenticate against the database.
    */
  var password: js.UndefOr[String] = js.native
  
  /**
    * Connection pool options
    */
  var pool: js.UndefOr[PoolOptions] = js.native
  
  /**
    * The port of the relational database.
    */
  var port: js.UndefOr[Double] = js.native
  
  /**
    * The protocol of the relational database.
    *
    * Defaults to 'tcp'
    */
  var protocol: js.UndefOr[String] = js.native
  
  /**
    * Default options for sequelize.query
    */
  var query: js.UndefOr[QueryOptions] = js.native
  
  /**
    * Set to `false` to make table names and attributes case-insensitive on Postgres and skip double quoting of
    * them.
    *
    * Defaults to true
    */
  var quoteIdentifiers: js.UndefOr[Boolean] = js.native
  
  /**
    * Use read / write replication. To enable replication, pass an object, with two properties, read and write.
    * Write should be an object (a single server for handling writes), and read an array of object (several
    * servers to handle reads). Each read/write server can have the following properties: `host`, `port`,
    * `username`, `password`, `database`
    *
    * Defaults to false
    */
  var replication: js.UndefOr[ReplicationOptions] = js.native
  
  /**
    * Set of flags that control when a query is automatically retried.
    */
  var retry: js.UndefOr[RetryOptions] = js.native
  
  /**
    * Default options for sequelize.set
    */
  var set: js.UndefOr[SetOptions] = js.native
  
  /**
    * Set to `true` to enable connecting over SSL.
    *
    * Defaults to undefined
    */
  var ssl: js.UndefOr[Boolean] = js.native
  
  /**
    * Only used by sqlite.
    *
    * Defaults to ':memory:'
    */
  var storage: js.UndefOr[String] = js.native
  
  /**
    * Default options for sequelize.sync
    */
  var sync: js.UndefOr[SyncOptions] = js.native
  
  /**
    * The timezone used when converting a date from the database into a JavaScript date. The timezone is also
    * used to SET TIMEZONE when connecting to the server, to ensure that the result of NOW, CURRENT_TIMESTAMP
    * and other time related functions have in the right timezone. For best cross platform performance use the
    * format
    * +/-HH:MM. Will also accept string versions of timezones used by moment.js (e.g. 'America/Los_Angeles');
    * this is useful to capture daylight savings time changes.
    *
    * Defaults to '+00:00'
    */
  var timezone: js.UndefOr[String] = js.native
  
  /**
    * Set the default transaction type. See `Sequelize.Transaction.TYPES` for possible
    * options.
    *
    * Defaults to 'DEFERRED'
    */
  var transactionType: js.UndefOr[TransactionType] = js.native
  
  /**
    * Run built in type validators on insert and update,
    * e.g. validate that arguments passed to integer fields are integer-like.
    *
    * Defaults to false
    */
  var typeValidation: js.UndefOr[Boolean] = js.native
  
  /**
    * The username which is used to authenticate against the database.
    */
  var username: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBenchmark(value: Boolean): Self = StObject.set(x, "benchmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBenchmarkUndefined: Self = StObject.set(x, "benchmark", js.undefined)
    
    @scala.inline
    def setDatabase(value: String): Self = StObject.set(x, "database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseUndefined: Self = StObject.set(x, "database", js.undefined)
    
    @scala.inline
    def setDatabaseVersion(value: Double): Self = StObject.set(x, "databaseVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseVersionUndefined: Self = StObject.set(x, "databaseVersion", js.undefined)
    
    @scala.inline
    def setDefine(value: DefineOptions[_]): Self = StObject.set(x, "define", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefineUndefined: Self = StObject.set(x, "define", js.undefined)
    
    @scala.inline
    def setDialect(value: String): Self = StObject.set(x, "dialect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialectModulePath(value: String): Self = StObject.set(x, "dialectModulePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialectModulePathUndefined: Self = StObject.set(x, "dialectModulePath", js.undefined)
    
    @scala.inline
    def setDialectOptions(value: js.Object): Self = StObject.set(x, "dialectOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialectOptionsUndefined: Self = StObject.set(x, "dialectOptions", js.undefined)
    
    @scala.inline
    def setDialectUndefined: Self = StObject.set(x, "dialect", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setIsolationLevel(value: TransactionIsolationLevel): Self = StObject.set(x, "isolationLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsolationLevelUndefined: Self = StObject.set(x, "isolationLevel", js.undefined)
    
    @scala.inline
    def setLogging(value: Boolean | js.Function): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    @scala.inline
    def setNative(value: Boolean): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeUndefined: Self = StObject.set(x, "native", js.undefined)
    
    @scala.inline
    def setOmitNull(value: Boolean): Self = StObject.set(x, "omitNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOmitNullUndefined: Self = StObject.set(x, "omitNull", js.undefined)
    
    @scala.inline
    def setOperatorsAliases(value: Boolean | OperatorsAliases): Self = StObject.set(x, "operatorsAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorsAliasesUndefined: Self = StObject.set(x, "operatorsAliases", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setPool(value: PoolOptions): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoolUndefined: Self = StObject.set(x, "pool", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setQuery(value: QueryOptions): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setQuoteIdentifiers(value: Boolean): Self = StObject.set(x, "quoteIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuoteIdentifiersUndefined: Self = StObject.set(x, "quoteIdentifiers", js.undefined)
    
    @scala.inline
    def setReplication(value: ReplicationOptions): Self = StObject.set(x, "replication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationUndefined: Self = StObject.set(x, "replication", js.undefined)
    
    @scala.inline
    def setRetry(value: RetryOptions): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    
    @scala.inline
    def setSet(value: SetOptions): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    
    @scala.inline
    def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
    
    @scala.inline
    def setStorage(value: String): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
    
    @scala.inline
    def setSync(value: SyncOptions): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    
    @scala.inline
    def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    
    @scala.inline
    def setTransactionType(value: TransactionType): Self = StObject.set(x, "transactionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionTypeUndefined: Self = StObject.set(x, "transactionType", js.undefined)
    
    @scala.inline
    def setTypeValidation(value: Boolean): Self = StObject.set(x, "typeValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeValidationUndefined: Self = StObject.set(x, "typeValidation", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
