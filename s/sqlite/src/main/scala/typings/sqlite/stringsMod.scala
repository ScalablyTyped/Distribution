package typings.sqlite

import typings.sqlite.interfacesMod.ISqlite.SqlObj
import typings.sqlite.interfacesMod.ISqlite.SqlType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sqlite/build/utils/strings", JSImport.Namespace)
@js.native
object stringsMod extends js.Object {
  def toSqlParams(sql: SqlType): SqlObj = js.native
  def toSqlParams(sql: SqlType, params: js.Array[_]): SqlObj = js.native
}

