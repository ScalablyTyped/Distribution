package typings.sqltoolsFormatter

import typings.sqltoolsFormatter.libCoreTypesMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLanguagesPlSqlFormatterMod {
  
  @JSImport("@sqltools/formatter/lib/languages/PlSqlFormatter", JSImport.Default)
  @js.native
  open class default () extends PlSqlFormatter
  
  @js.native
  trait PlSqlFormatter
    extends typings.sqltoolsFormatter.libLanguagesUtilsAbstractMod.default {
    
    @JSName("tokenOverride")
    def tokenOverride_MPlSqlFormatter(token: Token, previousReservedToken: Token): Token = js.native
  }
}
