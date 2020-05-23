package typings.sqlFormatter

import typings.sqlFormatter.anon.Indent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sql-formatter", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  object default extends js.Object {
    def format(query: String): String = js.native
    def format(query: String, cfg: Indent): String = js.native
  }
  
}

