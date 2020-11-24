package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for the constructor of Sequelize main class
  */
@js.native
trait Options extends js.Object {
  
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
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setBenchmark(value: Boolean): Self = this.set("benchmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBenchmark: Self = this.set("benchmark", js.undefined)
    
    @scala.inline
    def setDatabase(value: String): Self = this.set("database", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabase: Self = this.set("database", js.undefined)
    
    @scala.inline
    def setDatabaseVersion(value: Double): Self = this.set("databaseVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabaseVersion: Self = this.set("databaseVersion", js.undefined)
    
    @scala.inline
    def setDefine(value: DefineOptions[_]): Self = this.set("define", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefine: Self = this.set("define", js.undefined)
    
    @scala.inline
    def setDialect(value: String): Self = this.set("dialect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialect: Self = this.set("dialect", js.undefined)
    
    @scala.inline
    def setDialectModulePath(value: String): Self = this.set("dialectModulePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialectModulePath: Self = this.set("dialectModulePath", js.undefined)
    
    @scala.inline
    def setDialectOptions(value: js.Object): Self = this.set("dialectOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialectOptions: Self = this.set("dialectOptions", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setIsolationLevel(value: TransactionIsolationLevel): Self = this.set("isolationLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsolationLevel: Self = this.set("isolationLevel", js.undefined)
    
    @scala.inline
    def setLogging(value: Boolean | js.Function): Self = this.set("logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    
    @scala.inline
    def setNative(value: Boolean): Self = this.set("native", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNative: Self = this.set("native", js.undefined)
    
    @scala.inline
    def setOmitNull(value: Boolean): Self = this.set("omitNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOmitNull: Self = this.set("omitNull", js.undefined)
    
    @scala.inline
    def setOperatorsAliases(value: Boolean | OperatorsAliases): Self = this.set("operatorsAliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperatorsAliases: Self = this.set("operatorsAliases", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setPool(value: PoolOptions): Self = this.set("pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePool: Self = this.set("pool", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setQuery(value: QueryOptions): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setQuoteIdentifiers(value: Boolean): Self = this.set("quoteIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuoteIdentifiers: Self = this.set("quoteIdentifiers", js.undefined)
    
    @scala.inline
    def setReplication(value: ReplicationOptions): Self = this.set("replication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplication: Self = this.set("replication", js.undefined)
    
    @scala.inline
    def setRetry(value: RetryOptions): Self = this.set("retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetry: Self = this.set("retry", js.undefined)
    
    @scala.inline
    def setSet(value: SetOptions): Self = this.set("set", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSet: Self = this.set("set", js.undefined)
    
    @scala.inline
    def setSsl(value: Boolean): Self = this.set("ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsl: Self = this.set("ssl", js.undefined)
    
    @scala.inline
    def setStorage(value: String): Self = this.set("storage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorage: Self = this.set("storage", js.undefined)
    
    @scala.inline
    def setSync(value: SyncOptions): Self = this.set("sync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSync: Self = this.set("sync", js.undefined)
    
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezone: Self = this.set("timezone", js.undefined)
    
    @scala.inline
    def setTransactionType(value: TransactionType): Self = this.set("transactionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactionType: Self = this.set("transactionType", js.undefined)
    
    @scala.inline
    def setTypeValidation(value: Boolean): Self = this.set("typeValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeValidation: Self = this.set("typeValidation", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
