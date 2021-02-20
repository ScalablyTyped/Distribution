package typings.puppeteer.mod

import typings.puppeteer.puppeteerBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WaitForSelectorOptionsHidden extends WaitForSelectorOptions {
  
  @JSName("hidden")
  var hidden_WaitForSelectorOptionsHidden: `true` = js.native
}
object WaitForSelectorOptionsHidden {
  
  @scala.inline
  def apply(hidden: `true`): WaitForSelectorOptionsHidden = {
    val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaitForSelectorOptionsHidden]
  }
  
  @scala.inline
  implicit class WaitForSelectorOptionsHiddenMutableBuilder[Self <: WaitForSelectorOptionsHidden] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHidden(value: `true`): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
  }
}
