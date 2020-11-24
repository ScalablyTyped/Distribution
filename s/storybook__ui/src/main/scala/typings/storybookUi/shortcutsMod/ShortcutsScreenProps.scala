package typings.storybookUi.shortcutsMod

import typings.storybookUi.anon.RecordFeatureany
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShortcutsScreenProps extends js.Object {
  
  var restoreAllDefaultShortcuts: js.Function = js.native
  
  var restoreDefaultShortcut: js.Function = js.native
  
  var setShortcut: js.Function = js.native
  
  var shortcutKeys: RecordFeatureany = js.native
}
object ShortcutsScreenProps {
  
  @scala.inline
  def apply(
    restoreAllDefaultShortcuts: js.Function,
    restoreDefaultShortcut: js.Function,
    setShortcut: js.Function,
    shortcutKeys: RecordFeatureany
  ): ShortcutsScreenProps = {
    val __obj = js.Dynamic.literal(restoreAllDefaultShortcuts = restoreAllDefaultShortcuts.asInstanceOf[js.Any], restoreDefaultShortcut = restoreDefaultShortcut.asInstanceOf[js.Any], setShortcut = setShortcut.asInstanceOf[js.Any], shortcutKeys = shortcutKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortcutsScreenProps]
  }
  
  @scala.inline
  implicit class ShortcutsScreenPropsOps[Self <: ShortcutsScreenProps] (val x: Self) extends AnyVal {
    
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
    def setRestoreAllDefaultShortcuts(value: js.Function): Self = this.set("restoreAllDefaultShortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoreDefaultShortcut(value: js.Function): Self = this.set("restoreDefaultShortcut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetShortcut(value: js.Function): Self = this.set("setShortcut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortcutKeys(value: RecordFeatureany): Self = this.set("shortcutKeys", value.asInstanceOf[js.Any])
  }
}
