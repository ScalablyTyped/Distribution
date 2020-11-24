package typings.storybookApi.settingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubAPI extends js.Object {
  
  def changeSettingsTab(tab: String): Unit = js.native
  
  def closeSettings(): Unit = js.native
  
  def isSettingsScreenActive(): Boolean = js.native
  
  def navigateToSettingsPage(path: String): js.Promise[Unit] = js.native
}
object SubAPI {
  
  @scala.inline
  def apply(
    changeSettingsTab: String => Unit,
    closeSettings: () => Unit,
    isSettingsScreenActive: () => Boolean,
    navigateToSettingsPage: String => js.Promise[Unit]
  ): SubAPI = {
    val __obj = js.Dynamic.literal(changeSettingsTab = js.Any.fromFunction1(changeSettingsTab), closeSettings = js.Any.fromFunction0(closeSettings), isSettingsScreenActive = js.Any.fromFunction0(isSettingsScreenActive), navigateToSettingsPage = js.Any.fromFunction1(navigateToSettingsPage))
    __obj.asInstanceOf[SubAPI]
  }
  
  @scala.inline
  implicit class SubAPIOps[Self <: SubAPI] (val x: Self) extends AnyVal {
    
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
    def setChangeSettingsTab(value: String => Unit): Self = this.set("changeSettingsTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCloseSettings(value: () => Unit): Self = this.set("closeSettings", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsSettingsScreenActive(value: () => Boolean): Self = this.set("isSettingsScreenActive", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNavigateToSettingsPage(value: String => js.Promise[Unit]): Self = this.set("navigateToSettingsPage", js.Any.fromFunction1(value))
  }
}
