package typings.sqlstring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sqlstring", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def escape(value: js.Any): String = js.native
  def escapeId(value: js.Any): String = js.native
  def escapeId(value: js.Any, dotQualifier: Boolean): String = js.native
  def format(sql: String, args: js.Array[_]): String = js.native
  def format(sql: String, args: js.Object): String = js.native
  def raw(sql: String): AnonToSqlString = js.native
}

