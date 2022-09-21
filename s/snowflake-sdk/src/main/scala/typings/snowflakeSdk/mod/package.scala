package typings.snowflakeSdk.mod

import typings.genericPool.mod.Options
import typings.genericPool.mod.Pool
import typings.snowflakeSdk.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def BOOLEAN: /* "BOOLEAN" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("BOOLEAN").asInstanceOf[/* "BOOLEAN" */ String]

inline def DATE: /* "DATE" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("DATE").asInstanceOf[/* "DATE" */ String]

inline def JSON: /* "JSON" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("JSON").asInstanceOf[/* "JSON" */ String]

inline def NUMBER: /* "NUMBER" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("NUMBER").asInstanceOf[/* "NUMBER" */ String]

inline def STRING: /* "STRING" */ String = ^.asInstanceOf[js.Dynamic].selectDynamic("STRING").asInstanceOf[/* "STRING" */ String]

inline def configure(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")().asInstanceOf[Unit]
inline def configure(options: ConfigureOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def createConnection(options: ConnectionOptions): Connection = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnection")(options.asInstanceOf[js.Any]).asInstanceOf[Connection]

inline def createPool(options: ConnectionOptions): Pool[Connection] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPool")(options.asInstanceOf[js.Any]).asInstanceOf[Pool[Connection]]
inline def createPool(options: ConnectionOptions, poolOptions: Options): Pool[Connection] = (^.asInstanceOf[js.Dynamic].applyDynamic("createPool")(options.asInstanceOf[js.Any], poolOptions.asInstanceOf[js.Any])).asInstanceOf[Pool[Connection]]

inline def deserializeConnection(options: ConnectionOptions, serializedConnection: String): Connection = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeConnection")(options.asInstanceOf[js.Any], serializedConnection.asInstanceOf[js.Any])).asInstanceOf[Connection]

inline def serializeConnection(connection: Connection): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeConnection")(connection.asInstanceOf[js.Any]).asInstanceOf[String]

type Bind = String | Double

type Binds = js.Array[Bind] | InsertBinds

type InsertBinds = js.Array[js.Array[Bind]]
