package typings.puppeteer.mod

import typings.puppeteer.puppeteerBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaitForSelectorOptionsHidden
  extends StObject
     with WaitForSelectorOptions {
  
  @JSName("hidden")
  var hidden_WaitForSelectorOptionsHidden: `true`
}
object WaitForSelectorOptionsHidden {
  
  inline def apply(): WaitForSelectorOptionsHidden = {
    val __obj = js.Dynamic.literal(hidden = true)
    __obj.asInstanceOf[WaitForSelectorOptionsHidden]
  }
  
  extension [Self <: WaitForSelectorOptionsHidden](x: Self) {
    
    inline def setHidden(value: `true`): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
  }
}
