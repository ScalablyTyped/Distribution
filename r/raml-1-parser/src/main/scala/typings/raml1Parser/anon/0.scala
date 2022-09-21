package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  @JSName("/.+/")
  var SlashDotPlussignSlash: java.lang.String
}
object `0` {
  
  inline def apply(SlashDotPlussignSlash: java.lang.String): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("/.+/")(SlashDotPlussignSlash.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setSlashDotPlussignSlash(value: java.lang.String): Self = StObject.set(x, "/.+/", value.asInstanceOf[js.Any])
  }
}
