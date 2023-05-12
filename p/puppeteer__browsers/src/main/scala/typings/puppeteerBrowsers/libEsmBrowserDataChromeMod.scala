package typings.puppeteerBrowsers

import typings.puppeteerBrowsers.anon.Revision
import typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.BrowserPlatform
import typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.ChromeReleaseChannel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmBrowserDataChromeMod {
  
  @JSImport("@puppeteer/browsers/lib/esm/browser-data/chrome", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLastKnownGoodReleaseForChannel(channel: ChromeReleaseChannel): js.Promise[Revision] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastKnownGoodReleaseForChannel")(channel.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Revision]]
  
  inline def relativeExecutablePath(platform: BrowserPlatform, _buildId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relativeExecutablePath")(platform.asInstanceOf[js.Any], _buildId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def resolveBuildId(_platform: BrowserPlatform, channel: ChromeReleaseChannel): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveBuildId")(_platform.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def resolveDownloadPath(platform: BrowserPlatform, buildId: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDownloadPath")(platform.asInstanceOf[js.Any], buildId.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def resolveDownloadUrl(platform: BrowserPlatform, buildId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDownloadUrl")(platform.asInstanceOf[js.Any], buildId.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def resolveDownloadUrl(platform: BrowserPlatform, buildId: String, baseUrl: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDownloadUrl")(platform.asInstanceOf[js.Any], buildId.asInstanceOf[js.Any], baseUrl.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def resolveSystemExecutablePath(platform: BrowserPlatform, channel: ChromeReleaseChannel): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveSystemExecutablePath")(platform.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[String]
}
