package typings.sqlite

import typings.sqlite.buildInterfacesMod.ISqlite.SqlObj
import typings.sqlite.buildInterfacesMod.ISqlite.SqlType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildUtilsStringsMod {
  
  @JSImport("sqlite/build/utils/strings", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toSqlParams(sql: SqlType): SqlObj = ^.asInstanceOf[js.Dynamic].applyDynamic("toSqlParams")(sql.asInstanceOf[js.Any]).asInstanceOf[SqlObj]
  inline def toSqlParams(sql: SqlType, params: js.Array[Any]): SqlObj = (^.asInstanceOf[js.Dynamic].applyDynamic("toSqlParams")(sql.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[SqlObj]
}
