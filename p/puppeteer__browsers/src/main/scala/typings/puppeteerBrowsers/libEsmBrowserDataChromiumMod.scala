package typings.puppeteerBrowsers

import typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.BrowserPlatform
import typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.ChromeReleaseChannel
import typings.puppeteerBrowsers.puppeteerBrowsersStrings.latest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmBrowserDataChromiumMod {
  
  @JSImport("@puppeteer/browsers/lib/esm/browser-data/chromium", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def relativeExecutablePath(platform: BrowserPlatform, _buildId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relativeExecutablePath")(platform.asInstanceOf[js.Any], _buildId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def resolveBuildId(platform: BrowserPlatform): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveBuildId")(platform.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def resolveBuildId(platform: BrowserPlatform, channel: ChromeReleaseChannel): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveBuildId")(platform.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def resolveBuildId_latest(platform: BrowserPlatform, channel: latest): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveBuildId")(platform.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def resolveDownloadPath(platform: BrowserPlatform, buildId: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDownloadPath")(platform.asInstanceOf[js.Any], buildId.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def resolveDownloadUrl(platform: BrowserPlatform, buildId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDownloadUrl")(platform.asInstanceOf[js.Any], buildId.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def resolveDownloadUrl(platform: BrowserPlatform, buildId: String, baseUrl: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDownloadUrl")(platform.asInstanceOf[js.Any], buildId.asInstanceOf[js.Any], baseUrl.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def resolveSystemExecutablePath(platform: BrowserPlatform, channel: ChromeReleaseChannel): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveSystemExecutablePath")(platform.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[String]
}
