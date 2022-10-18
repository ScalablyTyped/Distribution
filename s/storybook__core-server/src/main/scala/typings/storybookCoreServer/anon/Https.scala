package typings.storybookCoreServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Https extends StObject {
  
  var https: js.UndefOr[Boolean] = js.undefined
}
object Https {
  
  inline def apply(): Https = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Https]
  }
  
  extension [Self <: Https](x: Self) {
    
    inline def setHttps(value: Boolean): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
    
    inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
  }
}
