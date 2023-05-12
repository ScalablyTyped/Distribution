package typings.sapHanaClient

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sap/hana-client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sap/hana-client", "Connection")
  @js.native
  open class Connection () extends StObject {
    
    def abort(): Unit = js.native
    def abort(fn: HanaErrorCallback): Unit = js.native
    
    def clearPool(): Double = js.native
    def clearPool(fn: HanaResultCallback[Double]): Unit = js.native
    
    def close(): Unit = js.native
    def close(fn: HanaErrorCallback): Unit = js.native
    
    def commit(): Unit = js.native
    def commit(fn: HanaErrorCallback): Unit = js.native
    
    def connect(): Any = js.native
    def connect(fn: HanaErrorCallback): Unit = js.native
    def connect(options: String): Any = js.native
    def connect(options: String, fn: HanaErrorCallback): Unit = js.native
    def connect(options: ConnectionOptions): Any = js.native
    def connect(options: ConnectionOptions, fn: HanaErrorCallback): Unit = js.native
    
    def disconnect(): Unit = js.native
    def disconnect(fn: HanaErrorCallback): Unit = js.native
    
    def end(): Unit = js.native
    def end(fn: HanaErrorCallback): Unit = js.native
    
    def exec[T](sql: String): T = js.native
    def exec[T](sql: String, fn: HanaResultCallback[T]): Unit = js.native
    def exec[T](sql: String, params: js.Array[HanaParameterType]): T = js.native
    def exec[T](sql: String, params: js.Array[HanaParameterType], fn: HanaResultCallback[T]): Unit = js.native
    def exec[T](sql: String, params: js.Array[HanaParameterType], options: StringDictionary[Boolean]): T = js.native
    def exec[T](
      sql: String,
      params: js.Array[HanaParameterType],
      options: StringDictionary[Boolean],
      fn: HanaResultCallback[T]
    ): Unit = js.native
    def exec[T](sql: String, params: StringDictionary[Boolean | HanaParameterType]): T = js.native
    def exec[T](sql: String, params: StringDictionary[Boolean | HanaParameterType], fn: HanaResultCallback[T]): Unit = js.native
    def exec[T](sql: String, params: StringDictionary[HanaParameterType], options: StringDictionary[Boolean]): T = js.native
    def exec[T](
      sql: String,
      params: StringDictionary[HanaParameterType],
      options: StringDictionary[Boolean],
      fn: HanaResultCallback[T]
    ): Unit = js.native
    
    def execute[T](sql: String): T = js.native
    def execute[T](sql: String, fn: HanaResultCallback[T]): Unit = js.native
    def execute[T](sql: String, params: js.Array[HanaParameterType]): T = js.native
    def execute[T](sql: String, params: js.Array[HanaParameterType], fn: HanaResultCallback[T]): Unit = js.native
    def execute[T](sql: String, params: js.Array[HanaParameterType], options: StringDictionary[Boolean]): T = js.native
    def execute[T](
      sql: String,
      params: js.Array[HanaParameterType],
      options: StringDictionary[Boolean],
      fn: HanaResultCallback[T]
    ): Unit = js.native
    def execute[T](sql: String, params: StringDictionary[Boolean | HanaParameterType]): T = js.native
    def execute[T](sql: String, params: StringDictionary[Boolean | HanaParameterType], fn: HanaResultCallback[T]): Unit = js.native
    def execute[T](sql: String, params: StringDictionary[HanaParameterType], options: StringDictionary[Boolean]): T = js.native
    def execute[T](
      sql: String,
      params: StringDictionary[HanaParameterType],
      options: StringDictionary[Boolean],
      fn: HanaResultCallback[T]
    ): Unit = js.native
    
    def getClientInfo(key: String): String = js.native
    
    def getOpenConnectionCount(): Double = js.native
    
    def getWarnings(): js.Array[HanaWarning] = js.native
    
    def onTrace(options: String, fn: HanaTraceCallback): Unit = js.native
    
    def prepare(sql: String): Statement = js.native
    def prepare(sql: String, fn: HanaStatementCallback): Unit = js.native
    
    def rollback(): Unit = js.native
    def rollback(fn: HanaErrorCallback): Unit = js.native
    
    def setAutoCommit(flag: Boolean): Unit = js.native
    
    def setClientInfo(key: String, value: String): Unit = js.native
    
    def setRowSetSize(rowSetSize: Double): Unit = js.native
    
    def state(): String = js.native
  }
  
  @JSImport("@sap/hana-client", "ConnectionPool")
  @js.native
  open class ConnectionPool () extends StObject {
    
    def clear(): Unit = js.native
    def clear(fn: HanaErrorCallback): Unit = js.native
    
    def getConnection(): Connection = js.native
    def getConnection(fn: HanaResultCallback[Connection]): Unit = js.native
    
    def getInUseCount(): Double = js.native
    
    def getPooledCount(): Double = js.native
    
    def getProperties(): String = js.native
    
    def setProperties(poolParameters: String): Unit = js.native
    def setProperties(poolParameters: PoolOptions): Unit = js.native
  }
  
  @JSImport("@sap/hana-client", "ResultSet")
  @js.native
  open class ResultSet () extends StObject {
    
    def close(): Unit = js.native
    def close(fn: HanaErrorCallback): Unit = js.native
    
    def getColumnCount(): Double = js.native
    
    def getColumnInfo(): js.Array[HanaColumnInfo] = js.native
    
    def getColumnName(colIndex: Double): String = js.native
    
    def getData(colIndex: Double, dataOffset: Double, buffer: Buffer, bufferOffset: Double, length: Double): Double = js.native
    def getData(
      colIndex: Double,
      dataOffset: Double,
      buffer: Buffer,
      bufferOffset: Double,
      length: Double,
      fn: HanaResultCallback[Double]
    ): Unit = js.native
    
    def getRowCount(): Double = js.native
    
    def getServerCPUTime(): Double = js.native
    
    def getServerMemoryUsage(): Double = js.native
    
    def getServerProcessingTime(): Double = js.native
    
    def getValue[T](colIndex: Double): T = js.native
    def getValue[T](colIndex: Double, fn: HanaResultCallback[T]): Unit = js.native
    
    def getValueLength(colIndex: Double): Double = js.native
    
    def getValues[T](): T = js.native
    def getValues[T](fn: HanaResultCallback[T]): Unit = js.native
    def getValues[T](options: StringDictionary[Boolean]): T = js.native
    def getValues[T](options: StringDictionary[Boolean], fn: HanaResultCallback[T]): Unit = js.native
    
    def isClosed(): Boolean = js.native
    
    def isNull(colIndex: Double): Boolean = js.native
    
    def next(): Boolean = js.native
    def next(fn: HanaResultCallback[Boolean]): Unit = js.native
    
    def nextResult(): Boolean = js.native
    def nextResult(fn: HanaResultCallback[Boolean]): Unit = js.native
  }
  
  @JSImport("@sap/hana-client", "Statement")
  @js.native
  open class Statement () extends StObject {
    
    def drop(): Unit = js.native
    def drop(fn: HanaErrorCallback): Unit = js.native
    
    def exec[T](): T = js.native
    def exec[T](fn: HanaResultCallback[T]): Unit = js.native
    def exec[T](params: js.Array[HanaParameterType]): T = js.native
    def exec[T](params: js.Array[HanaParameterType], fn: HanaResultCallback[T]): Unit = js.native
    def exec[T](params: js.Array[HanaParameterType], options: StringDictionary[Boolean]): T = js.native
    def exec[T](params: js.Array[HanaParameterType], options: StringDictionary[Boolean], fn: HanaResultCallback[T]): Unit = js.native
    def exec[T](params: StringDictionary[Boolean | HanaParameterType]): T = js.native
    def exec[T](params: StringDictionary[Boolean | HanaParameterType], fn: HanaResultCallback[T]): Unit = js.native
    def exec[T](params: StringDictionary[HanaParameterType], options: StringDictionary[Boolean]): T = js.native
    def exec[T](
      params: StringDictionary[HanaParameterType],
      options: StringDictionary[Boolean],
      fn: HanaResultCallback[T]
    ): Unit = js.native
    
    def execBatch[T](params: js.Array[js.Array[HanaParameterType]]): T = js.native
    def execBatch[T](params: js.Array[js.Array[HanaParameterType]], fn: HanaResultCallback[T]): Unit = js.native
    
    def execQuery(): ResultSet = js.native
    def execQuery(fn: HanaResultSetCallback): Unit = js.native
    def execQuery(params: js.Array[HanaParameterType]): ResultSet = js.native
    def execQuery(params: js.Array[HanaParameterType], fn: HanaResultSetCallback): Unit = js.native
    
    def execute[T](): T = js.native
    def execute[T](fn: HanaResultCallback[T]): Unit = js.native
    def execute[T](params: js.Array[HanaParameterType]): T = js.native
    def execute[T](params: js.Array[HanaParameterType], fn: HanaResultCallback[T]): Unit = js.native
    def execute[T](params: js.Array[HanaParameterType], options: StringDictionary[Boolean]): T = js.native
    def execute[T](params: js.Array[HanaParameterType], options: StringDictionary[Boolean], fn: HanaResultCallback[T]): Unit = js.native
    def execute[T](params: StringDictionary[Boolean | HanaParameterType]): T = js.native
    def execute[T](params: StringDictionary[Boolean | HanaParameterType], fn: HanaResultCallback[T]): Unit = js.native
    def execute[T](params: StringDictionary[HanaParameterType], options: StringDictionary[Boolean]): T = js.native
    def execute[T](
      params: StringDictionary[HanaParameterType],
      options: StringDictionary[Boolean],
      fn: HanaResultCallback[T]
    ): Unit = js.native
    
    def executeBatch[T](params: js.Array[js.Array[HanaParameterType]]): T = js.native
    def executeBatch[T](params: js.Array[js.Array[HanaParameterType]], fn: HanaResultCallback[T]): Unit = js.native
    
    def executeQuery(): ResultSet = js.native
    def executeQuery(fn: HanaResultSetCallback): Unit = js.native
    def executeQuery(params: js.Array[HanaParameterType]): ResultSet = js.native
    def executeQuery(params: js.Array[HanaParameterType], fn: HanaResultSetCallback): Unit = js.native
    
    def functionCode(): Double = js.native
    
    def getColumnInfo(): js.Array[HanaColumnInfo] = js.native
    
    def getData(paramIndex: Double, dataOffset: Double, buffer: Buffer, bufferOffset: Double, length: Double): Double = js.native
    def getData(
      paramIndex: Double,
      dataOffset: Double,
      buffer: Buffer,
      bufferOffset: Double,
      length: Double,
      fn: HanaResultCallback[Double]
    ): Unit = js.native
    
    def getParameterInfo(): js.Array[HanaParameterInfo] = js.native
    
    def getParameterValue[T](paramIndex: Double): T = js.native
    def getParameterValue[T](paramIndex: Double, fn: HanaResultCallback[T]): Unit = js.native
    
    def getPrintLines(): js.Array[String] = js.native
    
    def getRowStatus(): js.UndefOr[js.Array[Double]] = js.native
    
    def getServerCPUTime(): Double = js.native
    
    def getServerMemoryUsage(): Double = js.native
    
    def getServerProcessingTime(): Double = js.native
    
    def isValid(): Boolean = js.native
    
    def sendParameterData(paramIndex: Double, buffer: Buffer): Boolean = js.native
    def sendParameterData(paramIndex: Double, buffer: Buffer, fn: HanaResultCallback[Boolean]): Unit = js.native
    
    def setTimeout(timeout: Double): Unit = js.native
  }
  
  inline def createConnection(): Connection = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")().asInstanceOf[Connection]
  inline def createConnection(options: ConnectionOptions): Connection = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(options.asInstanceOf[js.Any]).asInstanceOf[Connection]
  
  inline def createPool(options: String): ConnectionPool = ^.asInstanceOf[js.Dynamic].applyDynamic("createPool")(options.asInstanceOf[js.Any]).asInstanceOf[ConnectionPool]
  inline def createPool(options: String, poolParameters: String): ConnectionPool = (^.asInstanceOf[js.Dynamic].applyDynamic("createPool")(options.asInstanceOf[js.Any], poolParameters.asInstanceOf[js.Any])).asInstanceOf[ConnectionPool]
  inline def createPool(options: String, poolParameters: PoolOptions): ConnectionPool = (^.asInstanceOf[js.Dynamic].applyDynamic("createPool")(options.asInstanceOf[js.Any], poolParameters.asInstanceOf[js.Any])).asInstanceOf[ConnectionPool]
  inline def createPool(options: ConnectionOptions): ConnectionPool = ^.asInstanceOf[js.Dynamic].applyDynamic("createPool")(options.asInstanceOf[js.Any]).asInstanceOf[ConnectionPool]
  inline def createPool(options: ConnectionOptions, poolParameters: String): ConnectionPool = (^.asInstanceOf[js.Dynamic].applyDynamic("createPool")(options.asInstanceOf[js.Any], poolParameters.asInstanceOf[js.Any])).asInstanceOf[ConnectionPool]
  inline def createPool(options: ConnectionOptions, poolParameters: PoolOptions): ConnectionPool = (^.asInstanceOf[js.Dynamic].applyDynamic("createPool")(options.asInstanceOf[js.Any], poolParameters.asInstanceOf[js.Any])).asInstanceOf[ConnectionPool]
  
  inline def getDriverVersion(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDriverVersion")().asInstanceOf[String]
  
  inline def setConnectionPoolLimit(limit: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setConnectionPoolLimit")(limit.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type ConnectionOptions = StringDictionary[Any]
  
  trait HanaColumnInfo extends StObject {
    
    var columnName: String
    
    var nativeType: Double
    
    var nativeTypeName: String
    
    var nullable: Double
    
    var originalColumnName: String
    
    var ownerName: String
    
    var precision: Double
    
    var scale: Double
    
    var tableName: String
    
    var `type`: Double
    
    var typeName: String
  }
  object HanaColumnInfo {
    
    inline def apply(
      columnName: String,
      nativeType: Double,
      nativeTypeName: String,
      nullable: Double,
      originalColumnName: String,
      ownerName: String,
      precision: Double,
      scale: Double,
      tableName: String,
      `type`: Double,
      typeName: String
    ): HanaColumnInfo = {
      val __obj = js.Dynamic.literal(columnName = columnName.asInstanceOf[js.Any], nativeType = nativeType.asInstanceOf[js.Any], nativeTypeName = nativeTypeName.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], originalColumnName = originalColumnName.asInstanceOf[js.Any], ownerName = ownerName.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[HanaColumnInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HanaColumnInfo] (val x: Self) extends AnyVal {
      
      inline def setColumnName(value: String): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
      
      inline def setNativeType(value: Double): Self = StObject.set(x, "nativeType", value.asInstanceOf[js.Any])
      
      inline def setNativeTypeName(value: String): Self = StObject.set(x, "nativeTypeName", value.asInstanceOf[js.Any])
      
      inline def setNullable(value: Double): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
      
      inline def setOriginalColumnName(value: String): Self = StObject.set(x, "originalColumnName", value.asInstanceOf[js.Any])
      
      inline def setOwnerName(value: String): Self = StObject.set(x, "ownerName", value.asInstanceOf[js.Any])
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeName(value: String): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    }
  }
  
  type HanaErrorCallback = js.Function1[/* error */ js.Error, Unit]
  
  trait HanaParameterInfo extends StObject {
    
    var direction: Double
    
    var maxSize: Double
    
    var name: String
    
    var nativeType: Double
    
    var nativeTypeName: String
    
    var precision: Double
    
    var scale: Double
    
    var `type`: Double
    
    var typeName: String
  }
  object HanaParameterInfo {
    
    inline def apply(
      direction: Double,
      maxSize: Double,
      name: String,
      nativeType: Double,
      nativeTypeName: String,
      precision: Double,
      scale: Double,
      `type`: Double,
      typeName: String
    ): HanaParameterInfo = {
      val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nativeType = nativeType.asInstanceOf[js.Any], nativeTypeName = nativeTypeName.asInstanceOf[js.Any], precision = precision.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], typeName = typeName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[HanaParameterInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HanaParameterInfo] (val x: Self) extends AnyVal {
      
      inline def setDirection(value: Double): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNativeType(value: Double): Self = StObject.set(x, "nativeType", value.asInstanceOf[js.Any])
      
      inline def setNativeTypeName(value: String): Self = StObject.set(x, "nativeTypeName", value.asInstanceOf[js.Any])
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeName(value: String): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    }
  }
  
  type HanaParameterType = js.UndefOr[Null | Double | Boolean | String | StringDictionary[Boolean] | Buffer]
  
  type HanaResultCallback[T] = js.Function2[/* error */ js.Error, /* results */ js.UndefOr[T], Unit]
  
  type HanaResultSetCallback = js.Function2[/* error */ js.Error, /* rs */ js.UndefOr[ResultSet], Unit]
  
  type HanaStatementCallback = js.Function2[/* error */ js.Error, /* stmt */ js.UndefOr[Statement], Unit]
  
  type HanaTraceCallback = js.Function1[/* buf */ String, Unit]
  
  trait HanaWarning extends StObject {
    
    var code: String
    
    var message: String
    
    var sqlState: String
  }
  object HanaWarning {
    
    inline def apply(code: String, message: String, sqlState: String): HanaWarning = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sqlState = sqlState.asInstanceOf[js.Any])
      __obj.asInstanceOf[HanaWarning]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HanaWarning] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setSqlState(value: String): Self = StObject.set(x, "sqlState", value.asInstanceOf[js.Any])
    }
  }
  
  type PoolOptions = StringDictionary[Any]
}
