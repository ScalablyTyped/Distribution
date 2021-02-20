package typings.sqlstring

import typings.sqlstring.anon.ToSqlString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sqlstring", "escape")
  @js.native
  def escape(value: js.Any): String = js.native
  
  @JSImport("sqlstring", "escapeId")
  @js.native
  def escapeId(value: js.Any): String = js.native
  @JSImport("sqlstring", "escapeId")
  @js.native
  def escapeId(value: js.Any, dotQualifier: Boolean): String = js.native
  
  @JSImport("sqlstring", "format")
  @js.native
  def format(sql: String, args: js.Array[_]): String = js.native
  @JSImport("sqlstring", "format")
  @js.native
  def format(sql: String, args: js.Object): String = js.native
  
  @JSImport("sqlstring", "raw")
  @js.native
  def raw(sql: String): ToSqlString = js.native
}
