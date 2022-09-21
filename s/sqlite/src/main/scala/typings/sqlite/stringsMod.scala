package typings.sqlite

import typings.sqlite.interfacesMod.ISqlite.SqlObj
import typings.sqlite.interfacesMod.ISqlite.SqlType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringsMod {
  
  @JSImport("sqlite/build/utils/strings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toSqlParams(sql: SqlType): SqlObj = ^.asInstanceOf[js.Dynamic].applyDynamic("toSqlParams")(sql.asInstanceOf[js.Any]).asInstanceOf[SqlObj]
  inline def toSqlParams(sql: SqlType, params: js.Array[Any]): SqlObj = (^.asInstanceOf[js.Dynamic].applyDynamic("toSqlParams")(sql.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[SqlObj]
}
