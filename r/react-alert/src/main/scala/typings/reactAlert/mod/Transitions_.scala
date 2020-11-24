package typings.reactAlert.mod

import typings.reactAlert.reactAlertStrings.fade
import typings.reactAlert.reactAlertStrings.scale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transitions_ extends js.Object {
  
  var FADE: fade = js.native
  
  var SCALE: scale = js.native
}
object Transitions_ {
  
  @scala.inline
  def apply(FADE: fade, SCALE: scale): Transitions_ = {
    val __obj = js.Dynamic.literal(FADE = FADE.asInstanceOf[js.Any], SCALE = SCALE.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transitions_]
  }
  
  @scala.inline
  implicit class Transitions_Ops[Self <: Transitions_] (val x: Self) extends AnyVal {
    
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
    def setFADE(value: fade): Self = this.set("FADE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSCALE(value: scale): Self = this.set("SCALE", value.asInstanceOf[js.Any])
  }
}
