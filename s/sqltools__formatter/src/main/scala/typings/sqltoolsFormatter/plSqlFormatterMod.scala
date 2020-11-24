package typings.sqltoolsFormatter

import typings.sqltoolsFormatter.typesMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@sqltools/formatter/lib/languages/PlSqlFormatter", JSImport.Namespace)
@js.native
object plSqlFormatterMod extends js.Object {
  
  @js.native
  trait PlSqlFormatter
    extends typings.sqltoolsFormatter.abstractMod.default {
    
    @JSName("tokenOverride")
    def tokenOverride_MPlSqlFormatter(token: Token, previousReservedToken: Token): Token = js.native
  }
  
  @js.native
  class default () extends PlSqlFormatter
}
