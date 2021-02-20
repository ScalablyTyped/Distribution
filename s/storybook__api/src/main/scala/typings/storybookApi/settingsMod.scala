package typings.storybookApi

import typings.storybookApi.mod.ModuleFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settingsMod {
  
  @JSImport("@storybook/api/dist/modules/settings", "init")
  @js.native
  val init: ModuleFn = js.native
  
  @js.native
  trait Settings extends StObject {
    
    var lastTrackedStoryId: String = js.native
  }
  object Settings {
    
    @scala.inline
    def apply(lastTrackedStoryId: String): Settings = {
      val __obj = js.Dynamic.literal(lastTrackedStoryId = lastTrackedStoryId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLastTrackedStoryId(value: String): Self = StObject.set(x, "lastTrackedStoryId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SubAPI extends StObject {
    
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
    implicit class SubAPIMutableBuilder[Self <: SubAPI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChangeSettingsTab(value: String => Unit): Self = StObject.set(x, "changeSettingsTab", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCloseSettings(value: () => Unit): Self = StObject.set(x, "closeSettings", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsSettingsScreenActive(value: () => Boolean): Self = StObject.set(x, "isSettingsScreenActive", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNavigateToSettingsPage(value: String => js.Promise[Unit]): Self = StObject.set(x, "navigateToSettingsPage", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait SubState extends StObject {
    
    var settings: Settings = js.native
  }
  object SubState {
    
    @scala.inline
    def apply(settings: Settings): SubState = {
      val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubState]
    }
    
    @scala.inline
    implicit class SubStateMutableBuilder[Self <: SubState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSettings(value: Settings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    }
  }
}
