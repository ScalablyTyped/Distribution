package typings.sqlstring

import typings.sqlstring.anon.ToSqlString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sqlstring", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def escape(value: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escape")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def escapeId(value: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeId")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def escapeId(value: js.Any, dotQualifier: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("escapeId")(value.asInstanceOf[js.Any], dotQualifier.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def format(sql: String, args: js.Array[js.Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def format(sql: String, args: js.Object): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(sql.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def raw(sql: String): ToSqlString = ^.asInstanceOf[js.Dynamic].applyDynamic("raw")(sql.asInstanceOf[js.Any]).asInstanceOf[ToSqlString]
}
