package typings.puppeteerCore

import org.scalablytyped.runtime.StringDictionary
import typings.puppeteerCore.libEsmPuppeteerApiBrowserMod.Browser
import typings.puppeteerCore.libEsmPuppeteerNodeProductLauncherMod.ProductLauncher
import typings.puppeteerCore.libEsmPuppeteerNodePuppeteerNodeMod.PuppeteerNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmPuppeteerNodeFirefoxLauncherMod {
  
  @JSImport("puppeteer-core/lib/esm/puppeteer/node/FirefoxLauncher", "FirefoxLauncher")
  @js.native
  open class FirefoxLauncher protected () extends ProductLauncher {
    def this(puppeteer: PuppeteerNode) = this()
    
    def _createProfile(extraPrefs: StringDictionary[Any]): js.Promise[String] = js.native
    
    def defaultArgs(): js.Array[String] = js.native
    
    def defaultPreferences(extraPrefs: StringDictionary[Any]): StringDictionary[Any] = js.native
    
    def launch(): js.Promise[Browser] = js.native
    
    /**
      * Populates the user.js file with custom preferences as needed to allow
      * Firefox's CDP support to properly function. These preferences will be
      * automatically copied over to prefs.js during startup of Firefox. To be
      * able to restore the original values of preferences a backup of prefs.js
      * will be created.
      *
      * @param prefs - List of preferences to add.
      * @param profilePath - Firefox profile to write the preferences to.
      */
    def writePreferences(prefs: StringDictionary[Any], profilePath: String): js.Promise[Unit] = js.native
  }
}
