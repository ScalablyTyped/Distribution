package typings.sqlJs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.emscripten.Emscripten.EnvironmentType
import typings.emscripten.Emscripten.WebAssemblyExports
import typings.emscripten.Emscripten.WebAssemblyImports
import typings.emscripten.WebAssembly.Module
import typings.node.bufferMod.global.Buffer
import typings.std.ArrayLike
import typings.std.Iterable
import typings.std.Iterator
import typings.std.MessageEvent
import typings.std.Record
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sql.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sql.js", JSImport.Default)
  @js.native
  def default: InitSqlJsStatic = js.native
  
  @JSImport("sql.js", "Database")
  @js.native
  /**
    * Represents an SQLite database
    * @see [https://sql.js.org/documentation/Database.html#Database](https://sql.js.org/documentation/Database.html#Database)
    *
    * @param data An array of bytes representing an SQLite database file
    */
  open class Database () extends StObject {
    def this(data: Buffer) = this()
    def this(data: ArrayLike[Double]) = this()
    
    /**
      * Close the database, and all associated prepared statements. The
      * memory associated to the database and all associated statements will
      * be freed.
      *
      * **Warning**: A statement belonging to a database that has been closed
      * cannot be used anymore.
      *
      * Databases must be closed when you're finished with them, or the
      * memory consumption will grow forever
      * @see [https://sql.js.org/documentation/Database.html#["close"]](https://sql.js.org/documentation/Database.html#%5B%22close%22%5D)
      */
    def close(): Unit = js.native
    
    /**
      * Register a custom function with SQLite
      * @see [https://sql.js.org/documentation/Database.html#["create_function"]](https://sql.js.org/documentation/Database.html#%5B%22create_function%22%5D)
      *
      * @param name the name of the function as referenced in SQL statements.
      * @param func the actual function to be executed.
      */
    def create_function(name: String, func: js.Function1[/* repeated */ Any, Any]): Database = js.native
    
    def each(sql: String, callback: ParamsCallback, done: js.Function0[Unit]): Database = js.native
    /**
      * Execute an sql statement, and call a callback for each row of result.
      *
      * Currently this method is synchronous, it will not return until the
      * callback has been called on every row of the result. But this might
      * change.
      * @see [https://sql.js.org/documentation/Database.html#["each"]](https://sql.js.org/documentation/Database.html#%5B%22each%22%5D)
      *
      * @param sql A string of SQL text. Can contain placeholders that will
      * be bound to the parameters given as the second argument
      * @param params Parameters to bind to the query
      * @param callback Function to call on each row of result
      * @param done A function that will be called when all rows have been
      * retrieved
      */
    def each(sql: String, params: BindParams, callback: ParamsCallback, done: js.Function0[Unit]): Database = js.native
    
    /**
      * Execute an SQL query, and returns the result.
      *
      * This is a wrapper against `Database.prepare`, `Statement.bind`, `Statement.step`, `Statement.get`, and `Statement.free`.
      *
      * The result is an array of result elements. There are as many result elements as the number of statements in your sql string (statements are separated by a semicolon)
      * @see [https://sql.js.org/documentation/Database.html#["exec"]](https://sql.js.org/documentation/Database.html#%5B%22exec%22%5D)
      *
      * @param sql a string containing some SQL text to execute
      * @param params When the SQL statement contains placeholders, you can
      * pass them in here. They will be bound to the statement before it is
      * executed. If you use the params argument as an array, you **cannot**
      * provide an sql string that contains several statements (separated by
      * `;`). This limitation does not apply to params as an object.
      */
    def exec(sql: String): js.Array[QueryExecResult] = js.native
    def exec(sql: String, params: BindParams): js.Array[QueryExecResult] = js.native
    
    /**
      * Exports the contents of the database to a binary array
      * @see [https://sql.js.org/documentation/Database.html#["export"]](https://sql.js.org/documentation/Database.html#%5B%22export%22%5D)
      */
    def `export`(): js.typedarray.Uint8Array = js.native
    
    /**
      * Returns the number of changed rows (modified, inserted or deleted) by
      * the latest completed `INSERT`, `UPDATE` or `DELETE` statement on the
      * database. Executing any other type of SQL statement does not modify
      * the value returned by this function.
      * @see [https://sql.js.org/documentation/Database.html#["getRowsModified"]](https://sql.js.org/documentation/Database.html#%5B%22getRowsModified%22%5D)
      */
    def getRowsModified(): Double = js.native
    
    /**
      * Analyze a result code, return null if no error occured, and throw an
      * error with a descriptive message otherwise
      * @see [https://sql.js.org/documentation/Database.html#["handleError"]](https://sql.js.org/documentation/Database.html#%5B%22handleError%22%5D)
      */
    def handleError(): Null | scala.Nothing = js.native
    
    /**
      * Iterate over multiple SQL statements in a SQL string. This function
      * returns an iterator over Statement objects. You can use a `for..of`
      * loop to execute the returned statements one by one.
      * @see [https://sql.js.org/documentation/Database.html#["iterateStatements"]](https://sql.js.org/documentation/Database.html#%5B%22iterateStatements%22%5D)
      *
      * @param sql a string of SQL that can contain multiple statements
      */
    def iterateStatements(sql: String): StatementIterator = js.native
    
    /**
      * Prepare an SQL statement
      * @see [https://sql.js.org/documentation/Database.html#["prepare"]](https://sql.js.org/documentation/Database.html#%5B%22prepare%22%5D)
      *
      * @param sql a string of SQL, that can contain placeholders (`?`, `:VVV`, `:AAA`, `@AAA`)
      * @param params values to bind to placeholders
      */
    def prepare(sql: String): Statement = js.native
    def prepare(sql: String, params: BindParams): Statement = js.native
    
    /**
      * Execute an SQL query, ignoring the rows it returns.
      * @see [https://sql.js.org/documentation/Database.html#["run"]](https://sql.js.org/documentation/Database.html#%5B%22run%22%5D)
      *
      * @param sql a string containing some SQL text to execute
      * @param params When the SQL statement contains placeholders, you can
      * pass them in here. They will be bound to the statement before it is
      * executed. If you use the params argument as an array, you **cannot**
      * provide an sql string that contains several statements (separated by
      * `;`). This limitation does not apply to params as an object.
      */
    def run(sql: String): Database = js.native
    def run(sql: String, params: BindParams): Database = js.native
  }
  
  @JSImport("sql.js", "Statement")
  @js.native
  open class Statement () extends StObject {
    
    /**
      * Bind values to the parameters, after having reseted the statement. If
      * values is null, do nothing and return true.
      *
      * SQL statements can have parameters, named '?', '?NNN', ':VVV',
      * '@VVV', '$VVV', where NNN is a number and VVV a string. This function
      * binds these parameters to the given values.
      *
      * Warning: ':', '@', and '$' are included in the parameters names
      *
      * ### Value types
      *
      * |Javascript type|SQLite type|
      * |-|-|
      * |number|REAL, INTEGER|
      * |boolean|INTEGER|
      * |string|TEXT|
      * |Array, Uint8Array|BLOB|
      * |null|NULL|
      * @see [https://sql.js.org/documentation/Statement.html#["bind"]](https://sql.js.org/documentation/Statement.html#%5B%22bind%22%5D)
      *
      * @param values The values to bind
      */
    def bind(): Boolean = js.native
    def bind(values: BindParams): Boolean = js.native
    
    /**
      * Free the memory used by the statement
      * @see [https://sql.js.org/documentation/Statement.html#["free"]](https://sql.js.org/documentation/Statement.html#%5B%22free%22%5D)
      */
    def free(): Boolean = js.native
    
    /**
      * Free the memory allocated during parameter binding
      * @see [https://sql.js.org/documentation/Statement.html#["freemem"]](https://sql.js.org/documentation/Statement.html#%5B%22freemem%22%5D)
      */
    def freemem(): Unit = js.native
    
    /**
      * Get one row of results of a statement. If the first parameter is not
      * provided, step must have been called before.
      * @see [https://sql.js.org/documentation/Statement.html#["get"]](https://sql.js.org/documentation/Statement.html#%5B%22get%22%5D)
      *
      * @param params If set, the values will be bound to the statement
      * before it is executed
      */
    def get(): js.Array[SqlValue] = js.native
    def get(params: BindParams): js.Array[SqlValue] = js.native
    
    /**
      * Get one row of result as a javascript object, associating column
      * names with their value in the current row
      * @see [https://sql.js.org/documentation/Statement.html#["getAsObject"]](https://sql.js.org/documentation/Statement.html#%5B%22getAsObject%22%5D)
      *
      * @param params If set, the values will be bound to the statement, and
      * it will be executed
      */
    def getAsObject(): ParamsObject = js.native
    def getAsObject(params: BindParams): ParamsObject = js.native
    
    /**
      * Get the list of column names of a row of result of a statement.
      * @see [https://sql.js.org/documentation/Statement.html#["getColumnNames"]](https://sql.js.org/documentation/Statement.html#%5B%22getColumnNames%22%5D)
      */
    def getColumnNames(): js.Array[String] = js.native
    
    /**
      * Get the SQLite's normalized version of the SQL string used in
      * preparing this statement. The meaning of "normalized" is not
      * well-defined: see
      * [the SQLite documentation](https://sqlite.org/c3ref/expanded_sql.html).
      * @see [https://sql.js.org/documentation/Statement.html#["getNormalizedSQL"]](https://sql.js.org/documentation/Statement.html#%5B%22getNormalizedSQL%22%5D)
      */
    def getNormalizedSQL(): String = js.native
    
    /**
      * Get the SQL string used in preparing this statement.
      * @see [https://sql.js.org/documentation/Statement.html#["getSQL"]](https://sql.js.org/documentation/Statement.html#%5B%22getSQL%22%5D)
      */
    def getSQL(): String = js.native
    
    /**
      * Reset a statement, so that it's parameters can be bound to new
      * values. It also clears all previous bindings, freeing the memory used
      * by bound parameters.
      * @see [https://sql.js.org/documentation/Statement.html#["reset"]](https://sql.js.org/documentation/Statement.html#%5B%22reset%22%5D)
      */
    def reset(): Unit = js.native
    
    /**
      * Shorthand for bind + step + reset Bind the values, execute the
      * statement, ignoring the rows it returns, and resets it
      * @param values Value to bind to the statement
      */
    def run(): Unit = js.native
    def run(values: BindParams): Unit = js.native
    
    /**
      * Execute the statement, fetching the the next line of result, that can
      * be retrieved with `Statement.get`.
      * @see [https://sql.js.org/documentation/Statement.html#["step"]](https://sql.js.org/documentation/Statement.html#%5B%22step%22%5D)
      */
    def step(): Boolean = js.native
  }
  
  @JSImport("sql.js", "StatementIterator")
  @js.native
  open class StatementIterator ()
    extends StObject
       with Iterator[Statement, Any, Unit]
       with Iterable[Statement] {
    
    /**
      * Get any un-executed portions remaining of the original SQL string
      * @see [https://sql.js.org/documentation/StatementIterator.html#["getRemainingSQL"]](https://sql.js.org/documentation/StatementIterator.html#%5B%22getRemainingSQL%22%5D)
      */
    def getRemainingSql(): String = js.native
    
    /**
      * Prepare the next available SQL statement
      * @see [https://sql.js.org/documentation/StatementIterator.html#["next"]](https://sql.js.org/documentation/StatementIterator.html#%5B%22next%22%5D)
      */
    def next(): StatementIteratorResult = js.native
  }
  
  inline def default_=(x: InitSqlJsStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  object global {
    
    @JSGlobal("SqlJs")
    @js.native
    def SqlJs: InitSqlJsStatic = js.native
    inline def SqlJs_=(x: InitSqlJsStatic): Unit = js.Dynamic.global.updateDynamic("SqlJs")(x.asInstanceOf[js.Any])
  }
  
  type BindParams = js.Array[SqlValue] | ParamsObject | Null
  
  @js.native
  trait InitSqlJsStatic
    extends js.Function {
    
    def apply(): js.Promise[SqlJsStatic] = js.native
    def apply(config: SqlJsConfig): js.Promise[SqlJsStatic] = js.native
    
    val default: this.type = js.native
  }
  
  type ParamsCallback = js.Function1[/* obj */ ParamsObject, Unit]
  
  type ParamsObject = Record[String, SqlValue]
  
  trait QueryExecResult extends StObject {
    
    var columns: js.Array[String]
    
    var values: js.Array[js.Array[SqlValue]]
  }
  object QueryExecResult {
    
    inline def apply(columns: js.Array[String], values: js.Array[js.Array[SqlValue]]): QueryExecResult = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryExecResult]
    }
    
    extension [Self <: QueryExecResult](x: Self) {
      
      inline def setColumns(value: js.Array[String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setValues(value: js.Array[js.Array[SqlValue]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: js.Array[SqlValue]*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  /* Inlined std.Partial<emscripten.EmscriptenModule> */
  trait SqlJsConfig extends StObject {
    
    var FAST_MEMORY: js.UndefOr[Double] = js.undefined
    
    var FHEAP: js.UndefOr[js.typedarray.Float64Array] = js.undefined
    
    var HEAP: js.UndefOr[js.typedarray.Int32Array] = js.undefined
    
    var HEAP16: js.UndefOr[js.typedarray.Int16Array] = js.undefined
    
    var HEAP32: js.UndefOr[js.typedarray.Int32Array] = js.undefined
    
    var HEAP8: js.UndefOr[js.typedarray.Int8Array] = js.undefined
    
    var HEAPF32: js.UndefOr[js.typedarray.Float32Array] = js.undefined
    
    var HEAPF64: js.UndefOr[js.typedarray.Float64Array] = js.undefined
    
    var HEAPU16: js.UndefOr[js.typedarray.Uint16Array] = js.undefined
    
    var HEAPU32: js.UndefOr[js.typedarray.Uint32Array] = js.undefined
    
    var HEAPU8: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var IHEAP: js.UndefOr[js.typedarray.Int32Array] = js.undefined
    
    var TOTAL_MEMORY: js.UndefOr[Double] = js.undefined
    
    var TOTAL_STACK: js.UndefOr[Double] = js.undefined
    
    var _free: js.UndefOr[js.Function1[/* ptr */ Double, Unit]] = js.undefined
    
    var _malloc: js.UndefOr[js.Function1[/* size */ Double, Double]] = js.undefined
    
    var addOnExit: js.UndefOr[js.Function1[/* cb */ js.Function0[Any], Unit]] = js.undefined
    
    var addOnInit: js.UndefOr[js.Function1[/* cb */ js.Function0[Any], Unit]] = js.undefined
    
    var addOnPostRun: js.UndefOr[js.Function1[/* cb */ js.Function0[Any], Unit]] = js.undefined
    
    var addOnPreMain: js.UndefOr[js.Function1[/* cb */ js.Function0[Any], Unit]] = js.undefined
    
    var addOnPreRun: js.UndefOr[js.Function1[/* cb */ js.Function0[Any], Unit]] = js.undefined
    
    var arguments: js.UndefOr[js.Array[String]] = js.undefined
    
    var destroy: js.UndefOr[js.Function1[/* object */ js.Object, Unit]] = js.undefined
    
    var environment: js.UndefOr[EnvironmentType] = js.undefined
    
    var filePackagePrefixURL: js.UndefOr[String] = js.undefined
    
    var getPreloadedPackage: js.UndefOr[
        js.Function2[
          /* remotePackageName */ String, 
          /* remotePackageSize */ Double, 
          js.typedarray.ArrayBuffer
        ]
      ] = js.undefined
    
    var instantiateWasm: js.UndefOr[
        js.Function2[
          /* imports */ WebAssemblyImports, 
          /* successCallback */ js.Function1[/* module */ Module, Unit], 
          WebAssemblyExports
        ]
      ] = js.undefined
    
    var locateFile: js.UndefOr[js.Function2[/* url */ String, /* scriptDirectory */ String, String]] = js.undefined
    
    var logReadFiles: js.UndefOr[Boolean] = js.undefined
    
    var noExitRuntime: js.UndefOr[Boolean] = js.undefined
    
    var noInitialRun: js.UndefOr[Boolean] = js.undefined
    
    var onAbort: js.UndefOr[js.Function1[/* what */ Any, Unit]] = js.undefined
    
    var onCustomMessage: js.UndefOr[js.Function1[/* event */ MessageEvent[Any], Unit]] = js.undefined
    
    var onRuntimeInitialized: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var postRun: js.UndefOr[js.Array[js.Function0[Unit]]] = js.undefined
    
    var preInit: js.UndefOr[js.Array[js.Function0[Unit]]] = js.undefined
    
    var preRun: js.UndefOr[js.Array[js.Function0[Unit]]] = js.undefined
    
    var preinitializedWebGLContext: js.UndefOr[WebGLRenderingContext] = js.undefined
    
    var preloadedAudios: js.UndefOr[Any] = js.undefined
    
    var preloadedImages: js.UndefOr[Any] = js.undefined
    
    var print: js.UndefOr[js.Function1[/* str */ String, Unit]] = js.undefined
    
    var printErr: js.UndefOr[js.Function1[/* str */ String, Unit]] = js.undefined
    
    var wasmBinary: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  }
  object SqlJsConfig {
    
    inline def apply(): SqlJsConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SqlJsConfig]
    }
    
    extension [Self <: SqlJsConfig](x: Self) {
      
      inline def setAddOnExit(value: /* cb */ js.Function0[Any] => Unit): Self = StObject.set(x, "addOnExit", js.Any.fromFunction1(value))
      
      inline def setAddOnExitUndefined: Self = StObject.set(x, "addOnExit", js.undefined)
      
      inline def setAddOnInit(value: /* cb */ js.Function0[Any] => Unit): Self = StObject.set(x, "addOnInit", js.Any.fromFunction1(value))
      
      inline def setAddOnInitUndefined: Self = StObject.set(x, "addOnInit", js.undefined)
      
      inline def setAddOnPostRun(value: /* cb */ js.Function0[Any] => Unit): Self = StObject.set(x, "addOnPostRun", js.Any.fromFunction1(value))
      
      inline def setAddOnPostRunUndefined: Self = StObject.set(x, "addOnPostRun", js.undefined)
      
      inline def setAddOnPreMain(value: /* cb */ js.Function0[Any] => Unit): Self = StObject.set(x, "addOnPreMain", js.Any.fromFunction1(value))
      
      inline def setAddOnPreMainUndefined: Self = StObject.set(x, "addOnPreMain", js.undefined)
      
      inline def setAddOnPreRun(value: /* cb */ js.Function0[Any] => Unit): Self = StObject.set(x, "addOnPreRun", js.Any.fromFunction1(value))
      
      inline def setAddOnPreRunUndefined: Self = StObject.set(x, "addOnPreRun", js.undefined)
      
      inline def setArguments(value: js.Array[String]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
      
      inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
      
      inline def setArgumentsVarargs(value: String*): Self = StObject.set(x, "arguments", js.Array(value*))
      
      inline def setDestroy(value: /* object */ js.Object => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setEnvironment(value: EnvironmentType): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
      
      inline def setFAST_MEMORY(value: Double): Self = StObject.set(x, "FAST_MEMORY", value.asInstanceOf[js.Any])
      
      inline def setFAST_MEMORYUndefined: Self = StObject.set(x, "FAST_MEMORY", js.undefined)
      
      inline def setFHEAP(value: js.typedarray.Float64Array): Self = StObject.set(x, "FHEAP", value.asInstanceOf[js.Any])
      
      inline def setFHEAPUndefined: Self = StObject.set(x, "FHEAP", js.undefined)
      
      inline def setFilePackagePrefixURL(value: String): Self = StObject.set(x, "filePackagePrefixURL", value.asInstanceOf[js.Any])
      
      inline def setFilePackagePrefixURLUndefined: Self = StObject.set(x, "filePackagePrefixURL", js.undefined)
      
      inline def setGetPreloadedPackage(
        value: (/* remotePackageName */ String, /* remotePackageSize */ Double) => js.typedarray.ArrayBuffer
      ): Self = StObject.set(x, "getPreloadedPackage", js.Any.fromFunction2(value))
      
      inline def setGetPreloadedPackageUndefined: Self = StObject.set(x, "getPreloadedPackage", js.undefined)
      
      inline def setHEAP(value: js.typedarray.Int32Array): Self = StObject.set(x, "HEAP", value.asInstanceOf[js.Any])
      
      inline def setHEAP16(value: js.typedarray.Int16Array): Self = StObject.set(x, "HEAP16", value.asInstanceOf[js.Any])
      
      inline def setHEAP16Undefined: Self = StObject.set(x, "HEAP16", js.undefined)
      
      inline def setHEAP32(value: js.typedarray.Int32Array): Self = StObject.set(x, "HEAP32", value.asInstanceOf[js.Any])
      
      inline def setHEAP32Undefined: Self = StObject.set(x, "HEAP32", js.undefined)
      
      inline def setHEAP8(value: js.typedarray.Int8Array): Self = StObject.set(x, "HEAP8", value.asInstanceOf[js.Any])
      
      inline def setHEAP8Undefined: Self = StObject.set(x, "HEAP8", js.undefined)
      
      inline def setHEAPF32(value: js.typedarray.Float32Array): Self = StObject.set(x, "HEAPF32", value.asInstanceOf[js.Any])
      
      inline def setHEAPF32Undefined: Self = StObject.set(x, "HEAPF32", js.undefined)
      
      inline def setHEAPF64(value: js.typedarray.Float64Array): Self = StObject.set(x, "HEAPF64", value.asInstanceOf[js.Any])
      
      inline def setHEAPF64Undefined: Self = StObject.set(x, "HEAPF64", js.undefined)
      
      inline def setHEAPU16(value: js.typedarray.Uint16Array): Self = StObject.set(x, "HEAPU16", value.asInstanceOf[js.Any])
      
      inline def setHEAPU16Undefined: Self = StObject.set(x, "HEAPU16", js.undefined)
      
      inline def setHEAPU32(value: js.typedarray.Uint32Array): Self = StObject.set(x, "HEAPU32", value.asInstanceOf[js.Any])
      
      inline def setHEAPU32Undefined: Self = StObject.set(x, "HEAPU32", js.undefined)
      
      inline def setHEAPU8(value: js.typedarray.Uint8Array): Self = StObject.set(x, "HEAPU8", value.asInstanceOf[js.Any])
      
      inline def setHEAPU8Undefined: Self = StObject.set(x, "HEAPU8", js.undefined)
      
      inline def setHEAPUndefined: Self = StObject.set(x, "HEAP", js.undefined)
      
      inline def setIHEAP(value: js.typedarray.Int32Array): Self = StObject.set(x, "IHEAP", value.asInstanceOf[js.Any])
      
      inline def setIHEAPUndefined: Self = StObject.set(x, "IHEAP", js.undefined)
      
      inline def setInstantiateWasm(
        value: (/* imports */ WebAssemblyImports, /* successCallback */ js.Function1[/* module */ Module, Unit]) => WebAssemblyExports
      ): Self = StObject.set(x, "instantiateWasm", js.Any.fromFunction2(value))
      
      inline def setInstantiateWasmUndefined: Self = StObject.set(x, "instantiateWasm", js.undefined)
      
      inline def setLocateFile(value: (/* url */ String, /* scriptDirectory */ String) => String): Self = StObject.set(x, "locateFile", js.Any.fromFunction2(value))
      
      inline def setLocateFileUndefined: Self = StObject.set(x, "locateFile", js.undefined)
      
      inline def setLogReadFiles(value: Boolean): Self = StObject.set(x, "logReadFiles", value.asInstanceOf[js.Any])
      
      inline def setLogReadFilesUndefined: Self = StObject.set(x, "logReadFiles", js.undefined)
      
      inline def setNoExitRuntime(value: Boolean): Self = StObject.set(x, "noExitRuntime", value.asInstanceOf[js.Any])
      
      inline def setNoExitRuntimeUndefined: Self = StObject.set(x, "noExitRuntime", js.undefined)
      
      inline def setNoInitialRun(value: Boolean): Self = StObject.set(x, "noInitialRun", value.asInstanceOf[js.Any])
      
      inline def setNoInitialRunUndefined: Self = StObject.set(x, "noInitialRun", js.undefined)
      
      inline def setOnAbort(value: /* what */ Any => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      inline def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      inline def setOnCustomMessage(value: /* event */ MessageEvent[Any] => Unit): Self = StObject.set(x, "onCustomMessage", js.Any.fromFunction1(value))
      
      inline def setOnCustomMessageUndefined: Self = StObject.set(x, "onCustomMessage", js.undefined)
      
      inline def setOnRuntimeInitialized(value: () => Unit): Self = StObject.set(x, "onRuntimeInitialized", js.Any.fromFunction0(value))
      
      inline def setOnRuntimeInitializedUndefined: Self = StObject.set(x, "onRuntimeInitialized", js.undefined)
      
      inline def setPostRun(value: js.Array[js.Function0[Unit]]): Self = StObject.set(x, "postRun", value.asInstanceOf[js.Any])
      
      inline def setPostRunUndefined: Self = StObject.set(x, "postRun", js.undefined)
      
      inline def setPostRunVarargs(value: js.Function0[Unit]*): Self = StObject.set(x, "postRun", js.Array(value*))
      
      inline def setPreInit(value: js.Array[js.Function0[Unit]]): Self = StObject.set(x, "preInit", value.asInstanceOf[js.Any])
      
      inline def setPreInitUndefined: Self = StObject.set(x, "preInit", js.undefined)
      
      inline def setPreInitVarargs(value: js.Function0[Unit]*): Self = StObject.set(x, "preInit", js.Array(value*))
      
      inline def setPreRun(value: js.Array[js.Function0[Unit]]): Self = StObject.set(x, "preRun", value.asInstanceOf[js.Any])
      
      inline def setPreRunUndefined: Self = StObject.set(x, "preRun", js.undefined)
      
      inline def setPreRunVarargs(value: js.Function0[Unit]*): Self = StObject.set(x, "preRun", js.Array(value*))
      
      inline def setPreinitializedWebGLContext(value: WebGLRenderingContext): Self = StObject.set(x, "preinitializedWebGLContext", value.asInstanceOf[js.Any])
      
      inline def setPreinitializedWebGLContextUndefined: Self = StObject.set(x, "preinitializedWebGLContext", js.undefined)
      
      inline def setPreloadedAudios(value: Any): Self = StObject.set(x, "preloadedAudios", value.asInstanceOf[js.Any])
      
      inline def setPreloadedAudiosUndefined: Self = StObject.set(x, "preloadedAudios", js.undefined)
      
      inline def setPreloadedImages(value: Any): Self = StObject.set(x, "preloadedImages", value.asInstanceOf[js.Any])
      
      inline def setPreloadedImagesUndefined: Self = StObject.set(x, "preloadedImages", js.undefined)
      
      inline def setPrint(value: /* str */ String => Unit): Self = StObject.set(x, "print", js.Any.fromFunction1(value))
      
      inline def setPrintErr(value: /* str */ String => Unit): Self = StObject.set(x, "printErr", js.Any.fromFunction1(value))
      
      inline def setPrintErrUndefined: Self = StObject.set(x, "printErr", js.undefined)
      
      inline def setPrintUndefined: Self = StObject.set(x, "print", js.undefined)
      
      inline def setTOTAL_MEMORY(value: Double): Self = StObject.set(x, "TOTAL_MEMORY", value.asInstanceOf[js.Any])
      
      inline def setTOTAL_MEMORYUndefined: Self = StObject.set(x, "TOTAL_MEMORY", js.undefined)
      
      inline def setTOTAL_STACK(value: Double): Self = StObject.set(x, "TOTAL_STACK", value.asInstanceOf[js.Any])
      
      inline def setTOTAL_STACKUndefined: Self = StObject.set(x, "TOTAL_STACK", js.undefined)
      
      inline def setWasmBinary(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "wasmBinary", value.asInstanceOf[js.Any])
      
      inline def setWasmBinaryUndefined: Self = StObject.set(x, "wasmBinary", js.undefined)
      
      inline def set_free(value: /* ptr */ Double => Unit): Self = StObject.set(x, "_free", js.Any.fromFunction1(value))
      
      inline def set_freeUndefined: Self = StObject.set(x, "_free", js.undefined)
      
      inline def set_malloc(value: /* size */ Double => Double): Self = StObject.set(x, "_malloc", js.Any.fromFunction1(value))
      
      inline def set_mallocUndefined: Self = StObject.set(x, "_malloc", js.undefined)
    }
  }
  
  trait SqlJsStatic extends StObject {
    
    var Database: Instantiable1[
        /* data */ js.UndefOr[ArrayLike[Double] | Buffer | Null], 
        typings.sqlJs.mod.Database
      ]
    
    var Statement: Instantiable0[typings.sqlJs.mod.Statement]
  }
  object SqlJsStatic {
    
    inline def apply(
      Database: Instantiable1[/* data */ js.UndefOr[ArrayLike[Double] | Buffer | Null], Database],
      Statement: Instantiable0[Statement]
    ): SqlJsStatic = {
      val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], Statement = Statement.asInstanceOf[js.Any])
      __obj.asInstanceOf[SqlJsStatic]
    }
    
    extension [Self <: SqlJsStatic](x: Self) {
      
      inline def setDatabase(value: Instantiable1[/* data */ js.UndefOr[ArrayLike[Double] | Buffer | Null], Database]): Self = StObject.set(x, "Database", value.asInstanceOf[js.Any])
      
      inline def setStatement(value: Instantiable0[Statement]): Self = StObject.set(x, "Statement", value.asInstanceOf[js.Any])
    }
  }
  
  type SqlValue = Double | String | js.typedarray.Uint8Array | Null
  
  trait StatementIteratorResult extends StObject {
    
    /** `true` if there are no more available statements */
    var done: Boolean
    
    /** the next available Statement (as returned by `Database.prepare`) */
    var value: Statement
  }
  object StatementIteratorResult {
    
    inline def apply(done: Boolean, value: Statement): StatementIteratorResult = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatementIteratorResult]
    }
    
    extension [Self <: StatementIteratorResult](x: Self) {
      
      inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Statement): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
