package typings.storybookApi

import org.scalablytyped.runtime.StringDictionary
import typings.storybookApi.anon.Plain
import typings.storybookApi.mod.ModuleFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ModulesVersionsMod {
  
  @JSImport("@storybook/api/dist/ts3.9/modules/versions", "init")
  @js.native
  val init: ModuleFn = js.native
  
  trait SubAPI extends StObject {
    
    def getCurrentVersion(): Version
    
    def getLatestVersion(): Version
    
    def versionUpdateAvailable(): Boolean
  }
  object SubAPI {
    
    inline def apply(
      getCurrentVersion: () => Version,
      getLatestVersion: () => Version,
      versionUpdateAvailable: () => Boolean
    ): SubAPI = {
      val __obj = js.Dynamic.literal(getCurrentVersion = js.Any.fromFunction0(getCurrentVersion), getLatestVersion = js.Any.fromFunction0(getLatestVersion), versionUpdateAvailable = js.Any.fromFunction0(versionUpdateAvailable))
      __obj.asInstanceOf[SubAPI]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SubAPI] (val x: Self) extends AnyVal {
      
      inline def setGetCurrentVersion(value: () => Version): Self = StObject.set(x, "getCurrentVersion", js.Any.fromFunction0(value))
      
      inline def setGetLatestVersion(value: () => Version): Self = StObject.set(x, "getLatestVersion", js.Any.fromFunction0(value))
      
      inline def setVersionUpdateAvailable(value: () => Boolean): Self = StObject.set(x, "versionUpdateAvailable", js.Any.fromFunction0(value))
    }
  }
  
  trait SubState extends StObject {
    
    var dismissedVersionNotification: js.UndefOr[String] = js.undefined
    
    var lastVersionCheck: Double
    
    var versions: Versions & UnknownEntries
  }
  object SubState {
    
    inline def apply(lastVersionCheck: Double, versions: Versions & UnknownEntries): SubState = {
      val __obj = js.Dynamic.literal(lastVersionCheck = lastVersionCheck.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SubState] (val x: Self) extends AnyVal {
      
      inline def setDismissedVersionNotification(value: String): Self = StObject.set(x, "dismissedVersionNotification", value.asInstanceOf[js.Any])
      
      inline def setDismissedVersionNotificationUndefined: Self = StObject.set(x, "dismissedVersionNotification", js.undefined)
      
      inline def setLastVersionCheck(value: Double): Self = StObject.set(x, "lastVersionCheck", value.asInstanceOf[js.Any])
      
      inline def setVersions(value: Versions & UnknownEntries): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    }
  }
  
  type UnknownEntries = StringDictionary[StringDictionary[Any]]
  
  trait Version
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var info: js.UndefOr[Plain] = js.undefined
    
    var version: String
  }
  object Version {
    
    inline def apply(version: String): Version = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Version]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Version] (val x: Self) extends AnyVal {
      
      inline def setInfo(value: Plain): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait Versions extends StObject {
    
    var current: js.UndefOr[Version] = js.undefined
    
    var latest: js.UndefOr[Version] = js.undefined
    
    var next: js.UndefOr[Version] = js.undefined
  }
  object Versions {
    
    inline def apply(): Versions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Versions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Versions] (val x: Self) extends AnyVal {
      
      inline def setCurrent(value: Version): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      inline def setLatest(value: Version): Self = StObject.set(x, "latest", value.asInstanceOf[js.Any])
      
      inline def setLatestUndefined: Self = StObject.set(x, "latest", js.undefined)
      
      inline def setNext(value: Version): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
    }
  }
}
