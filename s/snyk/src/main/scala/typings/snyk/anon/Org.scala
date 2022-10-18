package typings.snyk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Org extends StObject {
  
  @JSName("org")
  var org_ : js.UndefOr[String] = js.undefined
}
object Org {
  
  inline def apply(): Org = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Org]
  }
  
  extension [Self <: Org](x: Self) {
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setOrg_Undefined: Self = StObject.set(x, "org", js.undefined)
  }
}
