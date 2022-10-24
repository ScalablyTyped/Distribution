package typings.puppeteerCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MacArmChromiumEnabled extends StObject {
  
  var macArmChromiumEnabled: js.UndefOr[Boolean] = js.undefined
}
object MacArmChromiumEnabled {
  
  inline def apply(): MacArmChromiumEnabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MacArmChromiumEnabled]
  }
  
  extension [Self <: MacArmChromiumEnabled](x: Self) {
    
    inline def setMacArmChromiumEnabled(value: Boolean): Self = StObject.set(x, "macArmChromiumEnabled", value.asInstanceOf[js.Any])
    
    inline def setMacArmChromiumEnabledUndefined: Self = StObject.set(x, "macArmChromiumEnabled", js.undefined)
  }
}
