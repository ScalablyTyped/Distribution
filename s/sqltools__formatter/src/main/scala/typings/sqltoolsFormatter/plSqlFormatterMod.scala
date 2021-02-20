package typings.sqltoolsFormatter

import typings.sqltoolsFormatter.typesMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object plSqlFormatterMod {
  
  @JSImport("@sqltools/formatter/lib/languages/PlSqlFormatter", JSImport.Default)
  @js.native
  class default () extends PlSqlFormatter
  
  @js.native
  trait PlSqlFormatter
    extends typings.sqltoolsFormatter.abstractMod.default {
    
    @JSName("tokenOverride")
    def tokenOverride_MPlSqlFormatter(token: Token, previousReservedToken: Token): Token = js.native
  }
}
