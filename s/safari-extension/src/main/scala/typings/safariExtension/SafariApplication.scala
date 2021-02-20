package typings.safariExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SafariApplication extends SafariEventTarget {
  
  var activeBrowserWindow: SafariBrowserWindow = js.native
  
  var browserWindows: js.Array[SafariBrowserWindow] = js.native
  
  def openBrowserWindow(): SafariBrowserWindow = js.native
  
  var privateBrowsing: SafariPrivateBrowsing = js.native
}
