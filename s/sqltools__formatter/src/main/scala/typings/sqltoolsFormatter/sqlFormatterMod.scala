package typings.sqltoolsFormatter

import typings.sqltoolsFormatter.typesMod.Config
import typings.sqltoolsFormatter.typesMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sqltools/formatter/lib/sqlFormatter", JSImport.Namespace)
@js.native
object sqlFormatterMod extends js.Object {
  
  def format(query: String): String = js.native
  def format(query: String, cfg: Config): String = js.native
  
  def tokenize(query: String): js.Array[Token] = js.native
  def tokenize(query: String, cfg: Config): js.Array[Token] = js.native
  
  @js.native
  object default extends js.Object {
    
    def format(query: String): String = js.native
    def format(query: String, cfg: Config): String = js.native
    
    def tokenize(query: String): js.Array[Token] = js.native
    def tokenize(query: String, cfg: Config): js.Array[Token] = js.native
  }
}
