package typings.storybookAddonKnobs.anon

import typings.storybookAddonKnobs.knobStoreMod.KnobStoreKnob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnFieldChange extends js.Object {
  
  var knobs: js.Array[KnobStoreKnob] = js.native
  
  def onFieldChange(): Unit = js.native
  
  def onFieldClick(): Unit = js.native
}
object OnFieldChange {
  
  @scala.inline
  def apply(knobs: js.Array[KnobStoreKnob], onFieldChange: () => Unit, onFieldClick: () => Unit): OnFieldChange = {
    val __obj = js.Dynamic.literal(knobs = knobs.asInstanceOf[js.Any], onFieldChange = js.Any.fromFunction0(onFieldChange), onFieldClick = js.Any.fromFunction0(onFieldClick))
    __obj.asInstanceOf[OnFieldChange]
  }
  
  @scala.inline
  implicit class OnFieldChangeOps[Self <: OnFieldChange] (val x: Self) extends AnyVal {
    
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
    def setKnobsVarargs(value: KnobStoreKnob*): Self = this.set("knobs", js.Array(value :_*))
    
    @scala.inline
    def setKnobs(value: js.Array[KnobStoreKnob]): Self = this.set("knobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFieldChange(value: () => Unit): Self = this.set("onFieldChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnFieldClick(value: () => Unit): Self = this.set("onFieldClick", js.Any.fromFunction0(value))
  }
}
