package typings
package sqlstringLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sqlstring", JSImport.Namespace)
@js.native
object sqlstringMod extends js.Object {
  def escape(value: js.Any): java.lang.String = js.native
  def escapeId(value: js.Any): java.lang.String = js.native
  def escapeId(value: js.Any, dotQualifier: scala.Boolean): java.lang.String = js.native
  def format(sql: java.lang.String, args: js.Array[_]): java.lang.String = js.native
  def format(sql: java.lang.String, args: js.Object): java.lang.String = js.native
}

