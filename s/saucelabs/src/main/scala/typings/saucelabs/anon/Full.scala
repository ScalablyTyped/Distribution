package typings.saucelabs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Full extends StObject {
  
  var full: js.UndefOr[Boolean] = js.undefined
}
object Full {
  
  inline def apply(): Full = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Full]
  }
  
  extension [Self <: Full](x: Self) {
    
    inline def setFull(value: Boolean): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    inline def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
  }
}
