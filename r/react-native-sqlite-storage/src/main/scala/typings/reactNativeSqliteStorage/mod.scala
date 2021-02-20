package typings.reactNativeSqliteStorage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-sqlite-storage", "DEBUG")
  @js.native
  def DEBUG(isDebug: Boolean): Unit = js.native
  
  @js.native
  sealed trait SQLErrors extends StObject
  @JSImport("react-native-sqlite-storage", "SQLErrors")
  @js.native
  object SQLErrors extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SQLErrors with Double] = js.native
    
    @js.native
    sealed trait CONSTRAINT_ERR extends SQLErrors
    /* 6 */ val CONSTRAINT_ERR: typings.reactNativeSqliteStorage.mod.SQLErrors.CONSTRAINT_ERR with Double = js.native
    
    @js.native
    sealed trait DATABASE_ERR extends SQLErrors
    /* 1 */ val DATABASE_ERR: typings.reactNativeSqliteStorage.mod.SQLErrors.DATABASE_ERR with Double = js.native
    
    @js.native
    sealed trait QUOTA_ERR extends SQLErrors
    /* 4 */ val QUOTA_ERR: typings.reactNativeSqliteStorage.mod.SQLErrors.QUOTA_ERR with Double = js.native
    
    @js.native
    sealed trait SYNTAX_ERR extends SQLErrors
    /* 5 */ val SYNTAX_ERR: typings.reactNativeSqliteStorage.mod.SQLErrors.SYNTAX_ERR with Double = js.native
    
    @js.native
    sealed trait TIMEOUT_ERR extends SQLErrors
    /* 7 */ val TIMEOUT_ERR: typings.reactNativeSqliteStorage.mod.SQLErrors.TIMEOUT_ERR with Double = js.native
    
    @js.native
    sealed trait TOO_LARGE_ERR extends SQLErrors
    /* 3 */ val TOO_LARGE_ERR: typings.reactNativeSqliteStorage.mod.SQLErrors.TOO_LARGE_ERR with Double = js.native
    
    @js.native
    sealed trait UNKNOWN_ERR extends SQLErrors
    /* 0 */ val UNKNOWN_ERR: typings.reactNativeSqliteStorage.mod.SQLErrors.UNKNOWN_ERR with Double = js.native
    
    @js.native
    sealed trait VERSION_ERR extends SQLErrors
    /* 2 */ val VERSION_ERR: typings.reactNativeSqliteStorage.mod.SQLErrors.VERSION_ERR with Double = js.native
  }
  
  @JSImport("react-native-sqlite-storage", "deleteDatabase")
  @js.native
  def deleteDatabase(params: DatabaseParams): Unit = js.native
  @JSImport("react-native-sqlite-storage", "deleteDatabase")
  @js.native
  def deleteDatabase(
    params: DatabaseParams,
    success: js.UndefOr[scala.Nothing],
    error: js.Function1[/* err */ SQLError, Unit]
  ): Unit = js.native
  @JSImport("react-native-sqlite-storage", "deleteDatabase")
  @js.native
  def deleteDatabase(params: DatabaseParams, success: js.Function0[Unit]): Unit = js.native
  @JSImport("react-native-sqlite-storage", "deleteDatabase")
  @js.native
  def deleteDatabase(params: DatabaseParams, success: js.Function0[Unit], error: js.Function1[/* err */ SQLError, Unit]): Unit = js.native
  @JSImport("react-native-sqlite-storage", "deleteDatabase")
  @js.native
  def deleteDatabase_Promise(params: DatabaseParams): js.Promise[Unit] = js.native
  
  @JSImport("react-native-sqlite-storage", "enablePromise")
  @js.native
  def enablePromise(enablePromise: Boolean): Unit = js.native
  
  @JSImport("react-native-sqlite-storage", "openDatabase")
  @js.native
  def openDatabase(params: DatabaseParams): SQLiteDatabase = js.native
  @JSImport("react-native-sqlite-storage", "openDatabase")
  @js.native
  def openDatabase(
    params: DatabaseParams,
    success: js.UndefOr[scala.Nothing],
    error: js.Function1[/* e */ SQLError, Unit]
  ): SQLiteDatabase = js.native
  @JSImport("react-native-sqlite-storage", "openDatabase")
  @js.native
  def openDatabase(params: DatabaseParams, success: js.Function0[Unit]): SQLiteDatabase = js.native
  @JSImport("react-native-sqlite-storage", "openDatabase")
  @js.native
  def openDatabase(params: DatabaseParams, success: js.Function0[Unit], error: js.Function1[/* e */ SQLError, Unit]): SQLiteDatabase = js.native
  @JSImport("react-native-sqlite-storage", "openDatabase")
  @js.native
  def openDatabase_Promise(params: DatabaseParams): js.Promise[SQLiteDatabase] = js.native
  
  @js.native
  trait DatabaseOptionalParams extends StObject {
    
    var createFromLocation: js.UndefOr[Double | String] = js.native
    
    // Database encryption pass phrase
    var key: js.UndefOr[String] = js.native
    
    var readOnly: js.UndefOr[Boolean] = js.native
  }
  object DatabaseOptionalParams {
    
    @scala.inline
    def apply(): DatabaseOptionalParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatabaseOptionalParams]
    }
    
    @scala.inline
    implicit class DatabaseOptionalParamsMutableBuilder[Self <: DatabaseOptionalParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateFromLocation(value: Double | String): Self = StObject.set(x, "createFromLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateFromLocationUndefined: Self = StObject.set(x, "createFromLocation", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    }
  }
  
  @js.native
  trait DatabaseParams extends DatabaseOptionalParams {
    
    /**
      * Affects iOS database file location
      * 'default': Library/LocalDatabase subdirectory - NOT visible to iTunes and NOT backed up by iCloud
      * 'Library': Library subdirectory - backed up by iCloud, NOT visible to iTunes
      * 'Documents': Documents subdirectory - visible to iTunes and backed up by iCloud
      */
    var location: Location = js.native
    
    var name: String = js.native
  }
  object DatabaseParams {
    
    @scala.inline
    def apply(location: Location, name: String): DatabaseParams = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatabaseParams]
    }
    
    @scala.inline
    implicit class DatabaseParamsMutableBuilder[Self <: DatabaseParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def default: typings.reactNativeSqliteStorage.reactNativeSqliteStorageStrings.default = "default".asInstanceOf[typings.reactNativeSqliteStorage.reactNativeSqliteStorageStrings.default]
    
    @scala.inline
    def Documents: typings.reactNativeSqliteStorage.reactNativeSqliteStorageStrings.Documents = "Documents".asInstanceOf[typings.reactNativeSqliteStorage.reactNativeSqliteStorageStrings.Documents]
    
    @scala.inline
    def Library: typings.reactNativeSqliteStorage.reactNativeSqliteStorageStrings.Library = "Library".asInstanceOf[typings.reactNativeSqliteStorage.reactNativeSqliteStorageStrings.Library]
    
    @scala.inline
    def Shared: typings.reactNativeSqliteStorage.reactNativeSqliteStorageStrings.Shared = "Shared".asInstanceOf[typings.reactNativeSqliteStorage.reactNativeSqliteStorageStrings.Shared]
  }
  
  @js.native
  trait ResultSet extends StObject {
    
    var insertId: Double = js.native
    
    var rows: ResultSetRowList = js.native
    
    var rowsAffected: Double = js.native
  }
  object ResultSet {
    
    @scala.inline
    def apply(insertId: Double, rows: ResultSetRowList, rowsAffected: Double): ResultSet = {
      val __obj = js.Dynamic.literal(insertId = insertId.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], rowsAffected = rowsAffected.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultSet]
    }
    
    @scala.inline
    implicit class ResultSetMutableBuilder[Self <: ResultSet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInsertId(value: Double): Self = StObject.set(x, "insertId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRows(value: ResultSetRowList): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsAffected(value: Double): Self = StObject.set(x, "rowsAffected", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResultSetRowList extends StObject {
    
    def item(index: Double): js.Any = js.native
    
    var length: Double = js.native
    
    def raw(): js.Array[_] = js.native
  }
  object ResultSetRowList {
    
    @scala.inline
    def apply(item: Double => js.Any, length: Double, raw: () => js.Array[_]): ResultSetRowList = {
      val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any], raw = js.Any.fromFunction0(raw))
      __obj.asInstanceOf[ResultSetRowList]
    }
    
    @scala.inline
    implicit class ResultSetRowListMutableBuilder[Self <: ResultSetRowList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(value: Double => js.Any): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaw(value: () => js.Array[_]): Self = StObject.set(x, "raw", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait SQLError extends StObject {
    
    var code: Double = js.native
    
    var message: String = js.native
  }
  object SQLError {
    
    @scala.inline
    def apply(code: Double, message: String): SQLError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[SQLError]
    }
    
    @scala.inline
    implicit class SQLErrorMutableBuilder[Self <: SQLError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SQLiteDatabase extends StObject {
    
    def attach(nameToAttach: String, alias: String): Unit = js.native
    def attach(
      nameToAttach: String,
      alias: String,
      success: js.UndefOr[scala.Nothing],
      error: js.Function1[/* err */ SQLError, Unit]
    ): Unit = js.native
    def attach(nameToAttach: String, alias: String, success: js.Function0[Unit]): Unit = js.native
    def attach(
      nameToAttach: String,
      alias: String,
      success: js.Function0[Unit],
      error: js.Function1[/* err */ SQLError, Unit]
    ): Unit = js.native
    @JSName("attach")
    def attach_Promise(nameToAttach: String, alias: String): js.Promise[Unit] = js.native
    
    def close(): js.Promise[Unit] = js.native
    def close(success: js.Function0[Unit], error: js.Function1[/* err */ SQLError, Unit]): Unit = js.native
    
    def dettach(alias: String): Unit = js.native
    def dettach(alias: String, success: js.UndefOr[scala.Nothing], error: js.Function1[/* err */ SQLError, Unit]): Unit = js.native
    def dettach(alias: String, success: js.Function0[Unit]): Unit = js.native
    def dettach(alias: String, success: js.Function0[Unit], error: js.Function1[/* err */ SQLError, Unit]): Unit = js.native
    @JSName("dettach")
    def dettach_Promise(alias: String): js.Promise[Unit] = js.native
    
    def executeSql(statement: String): Unit = js.native
    def executeSql(
      statement: String,
      params: js.UndefOr[scala.Nothing],
      success: js.UndefOr[scala.Nothing],
      error: StatementErrorCallback
    ): Unit = js.native
    def executeSql(statement: String, params: js.UndefOr[scala.Nothing], success: StatementCallback): Unit = js.native
    def executeSql(
      statement: String,
      params: js.UndefOr[scala.Nothing],
      success: StatementCallback,
      error: StatementErrorCallback
    ): Unit = js.native
    def executeSql(statement: String, params: js.Array[_]): Unit = js.native
    def executeSql(
      statement: String,
      params: js.Array[_],
      success: js.UndefOr[scala.Nothing],
      error: StatementErrorCallback
    ): Unit = js.native
    def executeSql(statement: String, params: js.Array[_], success: StatementCallback): Unit = js.native
    def executeSql(statement: String, params: js.Array[_], success: StatementCallback, error: StatementErrorCallback): Unit = js.native
    @JSName("executeSql")
    def executeSql_Promise(statement: String): js.Promise[js.Array[ResultSet]] = js.native
    @JSName("executeSql")
    def executeSql_Promise(statement: String, params: js.Array[_]): js.Promise[js.Array[ResultSet]] = js.native
    
    def readTransaction(scope: js.Function1[/* tx */ Transaction, Unit]): Unit = js.native
    def readTransaction(
      scope: js.Function1[/* tx */ Transaction, Unit],
      error: js.UndefOr[scala.Nothing],
      success: TransactionCallback
    ): Unit = js.native
    def readTransaction(scope: js.Function1[/* tx */ Transaction, Unit], error: TransactionErrorCallback): Unit = js.native
    def readTransaction(
      scope: js.Function1[/* tx */ Transaction, Unit],
      error: TransactionErrorCallback,
      success: TransactionCallback
    ): Unit = js.native
    @JSName("readTransaction")
    def readTransaction_Promise(scope: js.Function1[/* tx */ Transaction, Unit]): js.Promise[TransactionCallback] = js.native
    
    def transaction(scope: js.Function1[/* tx */ Transaction, Unit]): Unit = js.native
    def transaction(
      scope: js.Function1[/* tx */ Transaction, Unit],
      error: js.UndefOr[scala.Nothing],
      success: TransactionCallback
    ): Unit = js.native
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
    def executeSql(
      sqlStatement: String,
      arguments: js.UndefOr[scala.Nothing],
      callback: js.UndefOr[scala.Nothing],
      errorCallback: StatementErrorCallback
    ): Unit = js.native
    def executeSql(sqlStatement: String, arguments: js.UndefOr[scala.Nothing], callback: StatementCallback): Unit = js.native
    def executeSql(
      sqlStatement: String,
      arguments: js.UndefOr[scala.Nothing],
      callback: StatementCallback,
      errorCallback: StatementErrorCallback
    ): Unit = js.native
    def executeSql(sqlStatement: String, arguments: js.Array[_]): Unit = js.native
    def executeSql(
      sqlStatement: String,
      arguments: js.Array[_],
      callback: js.UndefOr[scala.Nothing],
      errorCallback: StatementErrorCallback
    ): Unit = js.native
    def executeSql(sqlStatement: String, arguments: js.Array[_], callback: StatementCallback): Unit = js.native
    def executeSql(
      sqlStatement: String,
      arguments: js.Array[_],
      callback: StatementCallback,
      errorCallback: StatementErrorCallback
    ): Unit = js.native
    @JSName("executeSql")
    def executeSql_Promise(sqlStatement: String): js.Promise[js.Tuple2[Transaction, ResultSet]] = js.native
    @JSName("executeSql")
    def executeSql_Promise(sqlStatement: String, arguments: js.Array[_]): js.Promise[js.Tuple2[Transaction, ResultSet]] = js.native
  }
  
  type TransactionCallback = js.Function1[/* transaction */ Transaction, Unit]
  
  type TransactionErrorCallback = js.Function1[/* error */ SQLError, Unit]
}
