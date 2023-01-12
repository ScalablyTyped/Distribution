package typings.storybookApi

import typings.storybookApi.mod.ModuleFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ModulesSettingsMod {
  
  @JSImport("@storybook/api/dist/ts3.9/modules/settings", "init")
  @js.native
  val init: ModuleFn = js.native
  
  trait Settings extends StObject {
    
    var lastTrackedStoryId: String
  }
  object Settings {
    
    inline def apply(lastTrackedStoryId: String): Settings = {
      val __obj = js.Dynamic.literal(lastTrackedStoryId = lastTrackedStoryId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      inline def setLastTrackedStoryId(value: String): Self = StObject.set(x, "lastTrackedStoryId", value.asInstanceOf[js.Any])
    }
  }
  
  trait SubAPI extends StObject {
    
    def changeSettingsTab(tab: String): Unit
    
    def closeSettings(): Unit
    
    def isSettingsScreenActive(): Boolean
    
    def navigateToSettingsPage(path: String): js.Promise[Unit]
  }
  object SubAPI {
    
    inline def apply(
      changeSettingsTab: String => Unit,
      closeSettings: () => Unit,
      isSettingsScreenActive: () => Boolean,
      navigateToSettingsPage: String => js.Promise[Unit]
    ): SubAPI = {
      val __obj = js.Dynamic.literal(changeSettingsTab = js.Any.fromFunction1(changeSettingsTab), closeSettings = js.Any.fromFunction0(closeSettings), isSettingsScreenActive = js.Any.fromFunction0(isSettingsScreenActive), navigateToSettingsPage = js.Any.fromFunction1(navigateToSettingsPage))
      __obj.asInstanceOf[SubAPI]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SubAPI] (val x: Self) extends AnyVal {
      
      inline def setChangeSettingsTab(value: String => Unit): Self = StObject.set(x, "changeSettingsTab", js.Any.fromFunction1(value))
      
      inline def setCloseSettings(value: () => Unit): Self = StObject.set(x, "closeSettings", js.Any.fromFunction0(value))
      
      inline def setIsSettingsScreenActive(value: () => Boolean): Self = StObject.set(x, "isSettingsScreenActive", js.Any.fromFunction0(value))
      
      inline def setNavigateToSettingsPage(value: String => js.Promise[Unit]): Self = StObject.set(x, "navigateToSettingsPage", js.Any.fromFunction1(value))
    }
  }
  
  trait SubState extends StObject {
    
    var settings: Settings
  }
  object SubState {
    
    inline def apply(settings: Settings): SubState = {
      val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SubState] (val x: Self) extends AnyVal {
      
      inline def setSettings(value: Settings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    }
  }
}
