package typings.steamUser.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nicknames extends StObject {
  
  var nicknames: Record[String, String]
}
object Nicknames {
  
  inline def apply(nicknames: Record[String, String]): Nicknames = {
    val __obj = js.Dynamic.literal(nicknames = nicknames.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nicknames]
  }
  
  extension [Self <: Nicknames](x: Self) {
    
    inline def setNicknames(value: Record[String, String]): Self = StObject.set(x, "nicknames", value.asInstanceOf[js.Any])
  }
}
