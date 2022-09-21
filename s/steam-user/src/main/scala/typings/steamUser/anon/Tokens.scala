package typings.steamUser.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tokens extends StObject {
  
  var tokens: Record[String, String]
}
object Tokens {
  
  inline def apply(tokens: Record[String, String]): Tokens = {
    val __obj = js.Dynamic.literal(tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tokens]
  }
  
  extension [Self <: Tokens](x: Self) {
    
    inline def setTokens(value: Record[String, String]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
  }
}
