package typings.sqlite

import typings.sqlite.interfacesMod.IMigrate.MigrationParams
import typings.sqlite.interfacesMod.ISqlite.Config
import typings.sqlite.interfacesMod.ISqlite.ConfigureOption
import typings.sqlite.interfacesMod.ISqlite.RunResult
import typings.sqlite.interfacesMod.ISqlite.SqlType
import typings.sqlite.sqlite3Mod.Statement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object databaseMod {
  
  @JSImport("sqlite/build/Database", "Database")
  @js.native
  open class Database[Driver /* <: typings.sqlite.sqlite3Mod.Database */, Stmt /* <: Statement */] protected () extends StObject {
    def this(config: Config) = this()
    
    /**
      * Runs the SQL query with the specified parameters. The parameters are the same as the
      * Database#run function, with the following differences:
      *
      * If the result set is empty, it will be an empty array, otherwise it will
      * have an object for each result row which
      * in turn contains the values of that row, like the Database#get function.
      *
      * Note that it first retrieves all result rows and stores them in memory.
      * For queries that have potentially large result sets, use the Database#each
      * function to retrieve all rows or Database#prepare followed by multiple
      * Statement#get calls to retrieve a previously unknown amount of rows.
      *
      * @param {string} sql The SQL query to run.
      *
      * @param {any} [params, ...] When the SQL statement contains placeholders, you
      * can pass them in here. They will be bound to the statement before it is
      * executed. There are three ways of passing bind parameters: directly in
      * the function's arguments, as an array, and as an object for named
      * parameters. This automatically sanitizes inputs.
      *
      * @see https://github.com/mapbox/node-sqlite3/wiki/API#databaseallsql-param--callback
      */
    def all[T](sql: SqlType, params: Any*): js.Promise[T] = js.native
    
    /**
      * Closes the database.
      */
    def close(): js.Promise[Unit] = js.native
    
    var config: Config = js.native
    
    /**
      * @see https://github.com/mapbox/node-sqlite3/wiki/API#databaseconfigureoption-value
      */
    def configure(option: ConfigureOption, value: Any): Any = js.native
    
    var db: Driver = js.native
    
    /**
      * Runs the SQL query with the specified parameters and calls the callback once for each result
      * row. The parameters are the same as the Database#run function, with the following differences:
      *
      * If the result set succeeds but is empty, the callback is never called.
      * In all other cases, the callback is called once for every retrieved row.
      * The order of calls correspond exactly to the order of rows in the result set.
      *
      * There is currently no way to abort execution!
      *
      * The last parameter to each() *must* be a callback function.
      *
      * @example await db.each('SELECT * FROM x WHERE y = ?', 'z', (err, row) => {
      *   // row contains the row data
      *   // each() resolves when there are no more rows to fetch
      * })
      *
      * @see https://github.com/mapbox/node-sqlite3/wiki/API#databaseeachsql-param--callback-complete
      * @returns Promise<number> Number of rows returned
      */
    def each[T](sql: SqlType, callback: js.Function2[/* err */ Any, /* row */ T, Unit]): js.Promise[Double] = js.native
    def each[T](sql: SqlType, param1: Any, callback: js.Function2[/* err */ Any, /* row */ T, Unit]): js.Promise[Double] = js.native
    def each[T](sql: SqlType, param1: Any, param2: Any, callback: js.Function2[/* err */ Any, /* row */ T, Unit]): js.Promise[Double] = js.native
    def each[T](
      sql: SqlType,
      param1: Any,
      param2: Any,
      param3: Any,
      callback: js.Function2[/* err */ Any, /* row */ T, Unit]
    ): js.Promise[Double] = js.native
    def each[T](sql: SqlType, params: Any*): js.Promise[Double] = js.native
    
    /**
      * Runs all SQL queries in the supplied string. No result rows are retrieved. If a query fails,
      * no subsequent statements will be executed (wrap it in a transaction if you want all
      * or none to be executed).
      *
      * Note: This function will only execute statements up to the first NULL byte.
      * Comments are not allowed and will lead to runtime errors.
      *
      * @param {string} sql The SQL query to run.
      * @param {any} [params, ...] Same as the `params` parameter of `all`
      * @see https://github.com/mapbox/node-sqlite3/wiki/API#databaseexecsql-callback
      */
    def exec(sql: SqlType, params: Any*): js.Promise[Unit] = js.native
    
    /**
      * Runs the SQL query with the specified parameters and resolves with
      * with the first result row afterwards. If the result set is empty, returns undefined.
      *
      * The property names correspond to the column names of the result set.
      * It is impossible to access them by column index; the only supported way is by column name.
      *
      * @param {string} sql The SQL query to run.
      *
      * @param {any} [params, ...] When the SQL statement contains placeholders, you
      * can pass them in here. They will be bound to the statement before it is
      * executed. There are three ways of passing bind parameters: directly in
      * the function's arguments, as an array, and as an object for named
      * parameters. This automatically sanitizes inputs.
      *
      * @see https://github.com/mapbox/node-sqlite3/wiki/API#databasegetsql-param--callback
      */
    def get[T](sql: SqlType, params: Any*): js.Promise[js.UndefOr[T]] = js.native
    
    /**
      * Returns the underlying sqlite3 Database instance
      */
    def getDatabaseInstance(): Driver = js.native
    
    /**
      * Loads a compiled SQLite extension into the database connection object.
      *
      * @param {string} path Filename of the extension to load
      */
    def loadExtension(path: String): js.Promise[Unit] = js.native
    
    /**
      * Performs a database migration.
      */
    def migrate(): js.Promise[Unit] = js.native
    def migrate(config: MigrationParams): js.Promise[Unit] = js.native
    
    /**
      * Event handler when verbose mode is enabled.
      * @see https://github.com/mapbox/node-sqlite3/wiki/Debugging
      */
    def on(event: String, listener: Any): Unit = js.native
    
    /**
      * Opens the database
      */
    def open(): js.Promise[Unit] = js.native
    
    def parallelize(): Unit = js.native
    
    /**
      * Prepares the SQL statement and optionally binds the specified parameters.
      * When bind parameters are supplied, they are bound to the prepared statement.
      *
      * @param {string} sql The SQL query to run.
      * @param {any} [params, ...] When the SQL statement contains placeholders, you
      * can pass them in here. They will be bound to the statement before it is
      * executed. There are three ways of passing bind parameters: directly in
      * the function's arguments, as an array, and as an object for named
      * parameters. This automatically sanitizes inputs.
      * @returns Promise<Statement> Statement object
      */
    def prepare(sql: SqlType, params: Any*): js.Promise[typings.sqlite.statementMod.Statement[Stmt]] = js.native
    
    /**
      * Runs the SQL query with the specified parameters. It does not retrieve any result data.
      * The function returns the Database object for which it was called to allow for function chaining.
      *
      * @param {string} sql The SQL query to run.
      *
      * @param {any} [params, ...] When the SQL statement contains placeholders, you
      * can pass them in here. They will be bound to the statement before it is
      * executed. There are three ways of passing bind parameters: directly in
      * the function's arguments, as an array, and as an object for named
      * parameters. This automatically sanitizes inputs.
      *
      * @see https://github.com/mapbox/node-sqlite3/wiki/API#databaserunsql-param--callback
      */
    def run(sql: SqlType, params: Any*): js.Promise[RunResult[Stmt]] = js.native
    
    /**
      * The methods underneath requires creative work to implement. PRs / proposals accepted!
      */
    def serialize(): Unit = js.native
  }
}
