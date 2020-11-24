package typings.restartHooks.useFocusManagerMod

import typings.react.mod.FocusEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FocusManagerOptions extends js.Object {
  
  /**
    * A callback fired after focus is handled but before onChange is called
    */
  var didHandle: js.UndefOr[js.Function2[/* focused */ Boolean, /* event */ FocusEvent[Element], Unit]] = js.native
  
  /**
    * When true, the event handlers will not report focus changes
    */
  def isDisabled(): Boolean = js.native
  
  /**
    * A callback fired after focus has changed
    */
  var onChange: js.UndefOr[js.Function2[/* focused */ Boolean, /* event */ FocusEvent[Element], Unit]] = js.native
  
  /**
    * A callback fired when focus shifts. returning `false` will prevent
    * handling the focus event
    */
  var willHandle: js.UndefOr[
    js.Function2[/* focused */ Boolean, /* event */ FocusEvent[Element], Boolean | Unit]
  ] = js.native
}
object FocusManagerOptions {
  
  @scala.inline
  def apply(isDisabled: () => Boolean): FocusManagerOptions = {
    val __obj = js.Dynamic.literal(isDisabled = js.Any.fromFunction0(isDisabled))
    __obj.asInstanceOf[FocusManagerOptions]
  }
  
  @scala.inline
  implicit class FocusManagerOptionsOps[Self <: FocusManagerOptions] (val x: Self) extends AnyVal {
    
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
    def setIsDisabled(value: () => Boolean): Self = this.set("isDisabled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDidHandle(value: (/* focused */ Boolean, /* event */ FocusEvent[Element]) => Unit): Self = this.set("didHandle", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteDidHandle: Self = this.set("didHandle", js.undefined)
    
    @scala.inline
    def setOnChange(value: (/* focused */ Boolean, /* event */ FocusEvent[Element]) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setWillHandle(value: (/* focused */ Boolean, /* event */ FocusEvent[Element]) => Boolean | Unit): Self = this.set("willHandle", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteWillHandle: Self = this.set("willHandle", js.undefined)
  }
}
