package typings.sqltoolsFormatter

import typings.sqltoolsFormatter.typesMod.Config
import typings.sqltoolsFormatter.typesMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqlFormatterMod {
  
  object default {
    
    @JSImport("@sqltools/formatter/lib/sqlFormatter", "default.format")
    @js.native
    def format(query: String): String = js.native
    @JSImport("@sqltools/formatter/lib/sqlFormatter", "default.format")
    @js.native
    def format(query: String, cfg: Config): String = js.native
    
    @JSImport("@sqltools/formatter/lib/sqlFormatter", "default.tokenize")
    @js.native
    def tokenize(query: String): js.Array[Token] = js.native
    @JSImport("@sqltools/formatter/lib/sqlFormatter", "default.tokenize")
    @js.native
    def tokenize(query: String, cfg: Config): js.Array[Token] = js.native
  }
  
  @JSImport("@sqltools/formatter/lib/sqlFormatter", "format")
  @js.native
  def format(query: String): String = js.native
  @JSImport("@sqltools/formatter/lib/sqlFormatter", "format")
  @js.native
  def format(query: String, cfg: Config): String = js.native
  
  @JSImport("@sqltools/formatter/lib/sqlFormatter", "tokenize")
  @js.native
  def tokenize(query: String): js.Array[Token] = js.native
  @JSImport("@sqltools/formatter/lib/sqlFormatter", "tokenize")
  @js.native
  def tokenize(query: String, cfg: Config): js.Array[Token] = js.native
}
