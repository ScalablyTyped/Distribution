package typings.sqlite

import typings.sqlite.buildInterfacesMod.ISqlite.RunResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildStatementMod {
  
  @JSImport("sqlite/build/Statement", "Statement")
  @js.native
  open class Statement[S /* <: typings.sqlite.sqlite3Mod.Statement */] protected () extends StObject {
    def this(stmt: S) = this()
    
    /**
      * Binds parameters, executes the statement and calls the callback with all result rows.
      * The parameters are the same as the Statement#run function, with the following differences:
      *
      * If the result set is empty, it will resolve to an empty array, otherwise it contains an
      * object for each result row which in turn contains the values of that row.
      * Like with Statement#run, the statement will not be finalized after executing this function.
      *
      * @param {any} [params, ...] When the SQL statement contains placeholders, you
      * can pass them in here. They will be bound to the statement before it is
      * executed. There are three ways of passing bind parameters: directly in
      * the function's arguments, as an array, and as an object for named
      * parameters. This automatically sanitizes inputs.
      *
      * @see https://github.com/mapbox/node-sqlite3/wiki/API#databaseallsql-param--callback
      */
    def all[T](params: Any*): js.Promise[T] = js.native
    
    /**
      * Binds parameters to the prepared statement.
      *
      * Binding parameters with this function completely resets the statement object and row cursor
      * and removes all previously bound parameters, if any.
      */
    def bind(params: Any*): js.Promise[Unit] = js.native
    
    /**
      * Binds parameters, executes the statement and calls the callback for each result row.
      *
      * If the result set succeeds but is empty, the callback is never called.
      * In all other cases, the callback is called once for every retrieved row.
      * The order of calls correspond exactly to the order of rows in the result set.
      *
      * Like with Statement#run, the statement will not be finalized after executing this function.
      *
      * There is currently no way to abort execution!
      *
      * The last parameter to each() *must* be a callback function, where the first parameter will
      * be the returned row.
      *
      * @example await stmt.each('someParamValue', (err, row) => {
      *   // row contains the row data
      *   // each() resolves when there are no more rows to fetch
      * })
      *
      * @see https://github.com/mapbox/node-sqlite3/wiki/API#statementeachparam--callback-complete
      * @returns Promise<number> Number of rows returned
      */
    def each[T](callback: js.Function2[/* err */ Any, /* row */ T, Unit]): js.Promise[Double] = js.native
    def each[T](param1: Any, callback: js.Function2[/* err */ Any, /* row */ T, Unit]): js.Promise[Double] = js.native
    def each[T](param1: Any, param2: Any, callback: js.Function2[/* err */ Any, /* row */ T, Unit]): js.Promise[Double] = js.native
    def each[T](param1: Any, param2: Any, param3: Any, callback: js.Function2[/* err */ Any, /* row */ T, Unit]): js.Promise[Double] = js.native
    def each[T](params: Any*): js.Promise[Double] = js.native
    
    /**
      * Binds parameters, executes the statement and retrieves the first result row.
      * The parameters are the same as the Statement#run function, with the following differences:
      *
      * Using this method can leave the database locked, as the database awaits further
      * calls to Statement#get to retrieve subsequent rows. To inform the database that you
      * are finished retrieving rows, you should either finalize (with Statement#finalize)
      * or reset (with Statement#reset) the statement.
      *
      * @param {any} [params, ...] When the SQL statement contains placeholders, you
      * can pass them in here. They will be bound to the statement before it is
      * executed. There are three ways of passing bind parameters: directly in
      * the function's arguments, as an array, and as an object for named
      * parameters. This automatically sanitizes inputs.
      */
    def get[T](params: Any*): js.Promise[js.UndefOr[T]] = js.native
    
    /**
      * Returns the underlying sqlite3 Statement instance
      */
    def getStatementInstance(): S = js.native
    
    /**
      * Resets the row cursor of the statement and preserves the parameter bindings.
      * Use this function to re-execute the same query with the same bindings.
      */
    def reset(): js.Promise[Unit] = js.native
    
    /**
      * Binds parameters and executes the statement.
      *
      * If you specify bind parameters, they will be bound to the statement before it is executed.
      * Note that the bindings and the row cursor are reset when you specify even a single bind parameter.
      *
      * The execution behavior is identical to the Database#run method with the difference that the
      * statement will not be finalized after it is run. This means you can run it multiple times.
      *
      * @param {any} [params, ...] When the SQL statement contains placeholders, you
      * can pass them in here. They will be bound to the statement before it is
      * executed. There are three ways of passing bind parameters: directly in
      * the function's arguments, as an array, and as an object for named
      * parameters. This automatically sanitizes inputs.
      */
    def run(params: Any*): js.Promise[RunResult[typings.sqlite.sqlite3Mod.Statement]] = js.native
    
    var stmt: S = js.native
  }
}
