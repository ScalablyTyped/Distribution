package typings.reactHotkeys.mod

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
  implicit class HotKeysEnabledPropsOps[Self <: HotKeysEnabledProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnBlur(value: () => Unit): Self = this.set("onBlur", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnBlur: Self = this.set("onBlur", js.undefined)
    
    @scala.inline
    def setOnFocus(value: () => Unit): Self = this.set("onFocus", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnFocus: Self = this.set("onFocus", js.undefined)
    
    @scala.inline
    def setRoot(value: Boolean): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
}
