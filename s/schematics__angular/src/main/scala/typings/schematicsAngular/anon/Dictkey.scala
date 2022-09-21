package typings.schematicsAngular.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictkey[TOptions]
  extends StObject
     with /* key */ StringDictionary[Partial[TOptions]] {
  
  var production: Partial[TOptions]
}
object Dictkey {
  
  inline def apply[TOptions](production: Partial[TOptions]): Dictkey[TOptions] = {
    val __obj = js.Dynamic.literal(production = production.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey[TOptions]]
  }
  
  extension [Self <: Dictkey[?], TOptions](x: Self & Dictkey[TOptions]) {
    
    inline def setProduction(value: Partial[TOptions]): Self = StObject.set(x, "production", value.asInstanceOf[js.Any])
  }
}
