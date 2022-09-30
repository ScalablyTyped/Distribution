package typings.storybookPreviewWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForceRemount extends StObject {
  
  var forceRemount: js.UndefOr[Boolean] = js.undefined
  
  var initial: js.UndefOr[Boolean] = js.undefined
}
object ForceRemount {
  
  inline def apply(): ForceRemount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForceRemount]
  }
  
  extension [Self <: ForceRemount](x: Self) {
    
    inline def setForceRemount(value: Boolean): Self = StObject.set(x, "forceRemount", value.asInstanceOf[js.Any])
    
    inline def setForceRemountUndefined: Self = StObject.set(x, "forceRemount", js.undefined)
    
    inline def setInitial(value: Boolean): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    inline def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
  }
}
