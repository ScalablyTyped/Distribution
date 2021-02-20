package typings.reactHotkeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HotKeysEnabledProps extends GlobalHotKeysProps {
  
  /**
    * Function to call when this component loses focus in the browser
    */
  @JSName("onBlur")
  var onBlur_HotKeysEnabledProps: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Function to call when this component gains focus in the browser
    */
  @JSName("onFocus")
  var onFocus_HotKeysEnabledProps: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Whether this is the root HotKeys node - this enables some special behaviour
    */
  var root: js.UndefOr[Boolean] = js.native
}
object HotKeysEnabledProps {
  
  @scala.inline
  def apply(): HotKeysEnabledProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HotKeysEnabledProps]
  }
  
  @scala.inline
  implicit class HotKeysEnabledPropsMutableBuilder[Self <: HotKeysEnabledProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnFocus(value: () => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setRoot(value: Boolean): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
