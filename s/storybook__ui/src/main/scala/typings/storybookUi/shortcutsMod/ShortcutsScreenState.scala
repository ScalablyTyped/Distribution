package typings.storybookUi.shortcutsMod

import typings.storybookUi.anon.RecordFeatureany
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShortcutsScreenState extends js.Object {
  
  var activeFeature: Feature = js.native
  
  var shortcutKeys: RecordFeatureany = js.native
  
  var successField: Feature = js.native
}
object ShortcutsScreenState {
  
  @scala.inline
  def apply(activeFeature: Feature, shortcutKeys: RecordFeatureany, successField: Feature): ShortcutsScreenState = {
    val __obj = js.Dynamic.literal(activeFeature = activeFeature.asInstanceOf[js.Any], shortcutKeys = shortcutKeys.asInstanceOf[js.Any], successField = successField.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortcutsScreenState]
  }
  
  @scala.inline
  implicit class ShortcutsScreenStateOps[Self <: ShortcutsScreenState] (val x: Self) extends AnyVal {
    
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
    def setActiveFeature(value: Feature): Self = this.set("activeFeature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortcutKeys(value: RecordFeatureany): Self = this.set("shortcutKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessField(value: Feature): Self = this.set("successField", value.asInstanceOf[js.Any])
  }
}
