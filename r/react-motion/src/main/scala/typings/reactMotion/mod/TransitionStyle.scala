package typings.reactMotion.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// === TransitionMotion ===
@js.native
trait TransitionStyle extends js.Object {
  
  /**
    * Anything you'd like to carry along. Will be preserved on re-renders until key off
    */
  var data: js.UndefOr[js.Any] = js.native
  
  /**
    * The ID that TransitionMotion uses to track which configuration is which across renders, even when things are reordered.
    * Typically reused as the component key when you map over the interpolated styles.
    */
  var key: String = js.native
  
  /**
    * Actual starting style configuration
    */
  var style: Style = js.native
}
object TransitionStyle {
  
  @scala.inline
  def apply(key: String, style: Style): TransitionStyle = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionStyle]
  }
  
  @scala.inline
  implicit class TransitionStyleOps[Self <: TransitionStyle] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: Style): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
}
