package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaitForSelectorOptions
  extends StObject
     with Timeoutable {
  
  /**
    * Wait for element to not be found in the DOM or to be hidden,
    * i.e. have display: none or visibility: hidden CSS properties.
    * @default false
    */
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Wait for element to be present in DOM and to be visible,
    * i.e. to not have display: none or visibility: hidden CSS properties.
    * @default false
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object WaitForSelectorOptions {
  
  @scala.inline
  def apply(): WaitForSelectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaitForSelectorOptions]
  }
  
  @scala.inline
  implicit class WaitForSelectorOptionsMutableBuilder[Self <: WaitForSelectorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
