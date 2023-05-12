package typings.reactNativeSqliteStorage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-sqlite-storage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DEBUG(isDebug: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("DEBUG")(isDebug.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  sealed trait SQLErrors extends StObject
  @JSImport("react-native-sqlite-storage", "SQLErrors")
  @js.native
  object SQLErrors extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SQLErrors & Double] = js.native
    
    @js.native
    sealed trait CONSTRAINT_ERR
      extends StObject
         with SQLErrors
    /* 6 */ val CONSTRAINT_ERR: typings.reactNativeSqliteStorage.mod.SQLErrors.CONSTRAINT_ERR & Double = js.native
    
    @js.native
    sealed trait DATABASE_ERR
      extends StObject
         with SQLErrors
    /* 1 */ val DATABASE_ERR: typings.reactNativeSqliteStorage.mod.SQLErrors.DATABASE_ERR & Double = js.native
    
    @js.native
    sealed trait QUOTA_ERR
      extends StObject
         with SQLErrors
    /* 4 */ val QUOTA_ERR: typings.reactNativeSqliteStorage.mod.SQLErrors.QUOTA_ERR & Double = js.native
    
    @js.native
    sealed trait SYNTAX_ERR
      extends StObject
         with SQLErrors
    /* 5 */ val SYNTAX_ERR: typings.reactNativeSqliteStorage.mod.SQLErrors.SYNTAX_ERR & Double = js.native
    
    @js.native
    sealed trait TIMEOUT_ERR
      extends StObject
         with SQLErrors
    /* 7 */ val TIMEOUT_ERR: typings.reactNativeSqliteStorage.mod.SQLErrors.TIMEOUT_ERR & Double = js.native
    
    @js.native
    sealed trait TOO_LARGE_ERR
      extends StObject
         with SQLErrors
    /* 3 */ val TOO_LARGE_ERR: typings.reactNativeSqliteStorage.mod.SQLErrors.TOO_LARGE_ERR & Double = js.native
    
    @js.native
    sealed trait UNKNOWN_ERR
      extends StObject
         with SQLErrors
    /* 0 */ val UNKNOWN_ERR: typings.reactNativeSqliteStorage.mod.SQLErrors.UNKNOWN_ERR & Double = js.native
    
    @js.native
    sealed trait VERSION_ERR
      extends StObject
         with SQLErrors
    /* 2 */ val VERSION_ERR: typings.reactNativeSqliteStorage.mod.SQLErrors.VERSION_ERR & Double = js.native
  }
  
  inline def deleteDatabase(params: DatabaseParams): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteDatabase")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def deleteDatabase(params: DatabaseParams, success: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteDatabase")(params.asInstanceOf[js.Any], success.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deleteDatabase(params: DatabaseParams, success: js.Function0[Unit], error: js.Function1[/* err */ SQLError, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteDatabase")(params.asInstanceOf[js.Any], success.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deleteDatabase(params: DatabaseParams, success: Unit, error: js.Function1[/* err */ SQLError, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteDatabase")(params.asInstanceOf[js.Any], success.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def deleteDatabase_Promise(params: DatabaseParams): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteDatabase")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def enablePromise(enablePromise: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enablePromise")(enablePromise.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def openDatabase(params: DatabaseParams): SQLiteDatabase = ^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")(params.asInstanceOf[js.Any]).asInstanceOf[SQLiteDatabase]
  inline def openDatabase(params: DatabaseParams, success: js.Function0[Unit]): SQLiteDatabase = (^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")(params.asInstanceOf[js.Any], success.asInstanceOf[js.Any])).asInstanceOf[SQLiteDatabase]
  inline def openDatabase(params: DatabaseParams, success: js.Function0[Unit], error: js.Function1[/* e */ SQLError, Unit]): SQLiteDatabase = (^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")(params.asInstanceOf[js.Any], success.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[SQLiteDatabase]
  inline def openDatabase(params: DatabaseParams, success: Unit, error: js.Function1[/* e */ SQLError, Unit]): SQLiteDatabase = (^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")(params.asInstanceOf[js.Any], success.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[SQLiteDatabase]
  
  inline def openDatabase_Promise(params: DatabaseParams): js.Promise[SQLiteDatabase] = ^.asInstanceOf[js.Dynamic].applyDynamic("openDatabase")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SQLiteDatabase]]
  
  trait DatabaseOptionalParams extends StObject {
    
    var createFromLocation: js.UndefOr[Double | String] = js.undefined
    
    // Database encryption pass phrase
    var key: js.UndefOr[String] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
  }
  object DatabaseOptionalParams {
    
    inline def apply(): DatabaseOptionalParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatabaseOptionalParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DatabaseOptionalParams] (val x: Self) extends AnyVal {
      
      inline def setCreateFromLocation(value: Double | String): Self = StObject.set(x, "createFromLocation", value.asInstanceOf[js.Any])
      
      inline def setCreateFromLocationUndefined: Self = StObject.set(x, "createFromLocation", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeSqliteStorage.mod.DatabaseParamsIOS
    - typings.reactNativeSqliteStorage.mod.DatabaseParamsAndroid
  */
  trait DatabaseParams extends StObject
  object DatabaseParams {
    
    inline def DatabaseParamsAndroid(name: String): typings.reactNativeSqliteStorage.mod.DatabaseParamsAndroid = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactNativeSqliteStorage.mod.DatabaseParamsAndroid]
    }
    
    inline def DatabaseParamsIOS(location: Location, name: String): typings.reactNativeSqliteStorage.mod.DatabaseParamsIOS = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.reactNativeSqliteStorage.mod.DatabaseParamsIOS]
    }
  }
  
  trait DatabaseParamsAndroid
    extends StObject
       with DatabaseOptionalParams
       with DatabaseParams {
    
    var name: String
  }
  object DatabaseParamsAndroid {
    
    inline def apply(name: String): DatabaseParamsAndroid = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatabaseParamsAndroid]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DatabaseParamsAndroid] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait DatabaseParamsIOS
    extends StObject
       with DatabaseOptionalParams
       with DatabaseParams {
    
    /**
      * Affects iOS database file location
      * 'default': Library/LocalDatabase subdirectory - NOT visible to iTunes and NOT backed up by iCloud
      * 'Library': Library subdirectory - backed up by iCloud, NOT visible to iTunes
      * 'Documents': Documents subdirectory - visible to iTunes and backed up by iCloud
      */
    var location: Location
    
    var name: String
  }
  object DatabaseParamsIOS {
    
    inline def apply(location: Location, name: String): DatabaseParamsIOS = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatabaseParamsIOS]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DatabaseParamsIOS] (val x: Self) extends AnyVal {
      
      inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeSqliteStorage.reactNativeSqliteStorageStrings.default
    - typings.reactNativeSqliteStorage.reactNativeSqliteStorageStrings.Library
    - typings.reactNativeSqliteStorage.reactNativeSqliteStorageStrings.Documents
    - typings.reactNativeSqliteStorage.reactNativeSqliteStorageStrings.Shared
  */
  trait Location extends StObject
  object Location {
    
    inline def default: typings.reactNativeSqliteStorage.reactNativeSqliteStorageStrings.default = "default".asInstanceOf[typings.reactNativeSqliteStorage.reactNativeSqliteStorageStrings.default]
    
    inline def Documents: typings.reactNativeSqliteStorage.reactNativeSqliteStorageStrings.Documents = "Documents".asInstanceOf[typings.reactNativeSqliteStorage.reactNativeSqliteStorageStrings.Documents]
    
    inline def Library: typings.reactNativeSqliteStorage.reactNativeSqliteStorageStrings.Library = "Library".asInstanceOf[typings.reactNativeSqliteStorage.reactNativeSqliteStorageStrings.Library]
    
    inline def Shared: typings.reactNativeSqliteStorage.reactNativeSqliteStorageStrings.Shared = "Shared".asInstanceOf[typings.reactNativeSqliteStorage.reactNativeSqliteStorageStrings.Shared]
  }
  
  trait ResultSet extends StObject {
    
    var insertId: Double
    
    var rows: ResultSetRowList
    
    var rowsAffected: Double
  }
  object ResultSet {
    
    inline def apply(insertId: Double, rows: ResultSetRowList, rowsAffected: Double): ResultSet = {
      val __obj = js.Dynamic.literal(insertId = insertId.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], rowsAffected = rowsAffected.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultSet]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResultSet] (val x: Self) extends AnyVal {
      
      inline def setInsertId(value: Double): Self = StObject.set(x, "insertId", value.asInstanceOf[js.Any])
      
      inline def setRows(value: ResultSetRowList): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsAffected(value: Double): Self = StObject.set(x, "rowsAffected", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResultSetRowList extends StObject {
    
    def item(index: Double): Any
    
    var length: Double
    
    def raw(): js.Array[Any]
  }
  object ResultSetRowList {
    
    inline def apply(item: Double => Any, length: Double, raw: () => js.Array[Any]): ResultSetRowList = {
      val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any], raw = js.Any.fromFunction0(raw))
      __obj.asInstanceOf[ResultSetRowList]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResultSetRowList] (val x: Self) extends AnyVal {
      
      inline def setItem(value: Double => Any): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: () => js.Array[Any]): Self = StObject.set(x, "raw", js.Any.fromFunction0(value))
    }
  }
  
  trait SQLError extends StObject {
    
    var code: Double
    
    var message: String
  }
  object SQLError {
    
    inline def apply(code: Double, message: String): SQLError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[SQLError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SQLError] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SQLiteDatabase extends StObject {
    
    def attach(nameToAttach: String, alias: String): Unit = js.native
    def attach(nameToAttach: String, alias: String, success: js.Function0[Unit]): Unit = js.native
    def attach(
      nameToAttach: String,
      alias: String,
      success: js.Function0[Unit],
      error: js.Function1[/* err */ SQLError, Unit]
    ): Unit = js.native
    def attach(nameToAttach: String, alias: String, success: Unit, error: js.Function1[/* err */ SQLError, Unit]): Unit = js.native
    @JSName("attach")
    def attach_Promise(nameToAttach: String, alias: String): js.Promise[Unit] = js.native
    
    def close(): js.Promise[Unit] = js.native
    def close(success: js.Function0[Unit], error: js.Function1[/* err */ SQLError, Unit]): Unit = js.native
    
    var dbName: String = js.native
    
    def detach(alias: String): Unit = js.native
    def detach(alias: String, success: js.Function0[Unit]): Unit = js.native
    def detach(alias: String, success: js.Function0[Unit], error: js.Function1[/* err */ SQLError, Unit]): Unit = js.native
    def detach(alias: String, success: Unit, error: js.Function1[/* err */ SQLError, Unit]): Unit = js.native
    @JSName("detach")
    def detach_Promise(alias: String): js.Promise[Unit] = js.native
    
    def executeSql(statement: String): Unit = js.native
    def executeSql(statement: String, params: js.Array[Any]): Unit = js.native
    def executeSql(statement: String, params: js.Array[Any], success: Unit, error: StatementErrorCallback): Unit = js.native
    def executeSql(statement: String, params: js.Array[Any], success: StatementCallback): Unit = js.native
    def executeSql(
      statement: String,
      params: js.Array[Any],
      success: StatementCallback,
      error: StatementErrorCallback
    ): Unit = js.native
    def executeSql(statement: String, params: Unit, success: Unit, error: StatementErrorCallback): Unit = js.native
    def executeSql(statement: String, params: Unit, success: StatementCallback): Unit = js.native
    def executeSql(statement: String, params: Unit, success: StatementCallback, error: StatementErrorCallback): Unit = js.native
    @JSName("executeSql")
    def executeSql_Promise(statement: String): js.Promise[js.Array[ResultSet]] = js.native
    @JSName("executeSql")
    def executeSql_Promise(statement: String, params: js.Array[Any]): js.Promise[js.Array[ResultSet]] = js.native
    
    def readTransaction(scope: js.Function1[/* tx */ Transaction, Unit]): Unit = js.native
    def readTransaction(scope: js.Function1[/* tx */ Transaction, Unit], error: Unit, success: TransactionCallback): Unit = js.native
    def readTransaction(scope: js.Function1[/* tx */ Transaction, Unit], error: TransactionErrorCallback): Unit = js.native
    def readTransaction(
      scope: js.Function1[/* tx */ Transaction, Unit],
      error: TransactionErrorCallback,
      success: TransactionCallback
    ): Unit = js.native
    @JSName("readTransaction")
    def readTransaction_Promise(scope: js.Function1[/* tx */ Transaction, Unit]): js.Promise[Transaction] = js.native
    
    def transaction(scope: js.Function1[/* tx */ Transaction, Unit]): Unit = js.native
    def transaction(scope: js.Function1[/* tx */ Transaction, Unit], error: Unit, success: TransactionCallback): Unit = js.native
    def transaction(scope: js.Function1[/* tx */ Transaction, Unit], error: TransactionErrorCallback): Unit = js.native
    def transaction(
      scope: js.Function1[/* tx */ Transaction, Unit],
      error: TransactionErrorCallback,
      success: TransactionCallback
    ): Unit = js.native
    @JSName("transaction")
    def transaction_Promise(scope: js.Function1[/* tx */ Transaction, Unit]): js.Promise[Transaction] = js.native
  }
  
  type StatementCallback = js.Function2[/* transaction */ Transaction, /* resultSet */ ResultSet, Unit]
  
  type StatementErrorCallback = js.Function2[/* transaction */ Transaction, /* error */ SQLError, Unit]
  
  @js.native
  trait Transaction extends StObject {
    
    def executeSql(sqlStatement: String): Unit = js.native
    def executeSql(sqlStatement: String, arguments: js.Array[Any]): Unit = js.native
    def executeSql(
      sqlStatement: String,
      arguments: js.Array[Any],
      callback: Unit,
      errorCallback: StatementErrorCallback
    ): Unit = js.native
    def executeSql(sqlStatement: String, arguments: js.Array[Any], callback: StatementCallback): Unit = js.native
    def executeSql(
      sqlStatement: String,
      arguments: js.Array[Any],
      callback: StatementCallback,
      errorCallback: StatementErrorCallback
    ): Unit = js.native
    def executeSql(sqlStatement: String, arguments: Unit, callback: Unit, errorCallback: StatementErrorCallback): Unit = js.native
    def executeSql(sqlStatement: String, arguments: Unit, callback: StatementCallback): Unit = js.native
    def executeSql(
      sqlStatement: String,
      arguments: Unit,
      callback: StatementCallback,
      errorCallback: StatementErrorCallback
    ): Unit = js.native
    @JSName("executeSql")
    def executeSql_Promise(sqlStatement: String): js.Promise[js.Tuple2[Transaction, ResultSet]] = js.native
    @JSName("executeSql")
    def executeSql_Promise(sqlStatement: String, arguments: js.Array[Any]): js.Promise[js.Tuple2[Transaction, ResultSet]] = js.native
  }
  
  type TransactionCallback = js.Function1[/* transaction */ Transaction, Unit]
  
  type TransactionErrorCallback = js.Function1[/* error */ SQLError, Unit]
}
