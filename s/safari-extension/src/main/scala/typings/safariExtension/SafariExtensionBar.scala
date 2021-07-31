package typings.safariExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SafariExtensionBar
  extends StObject
     with SafariEventTarget {
  
  var browserWindow: SafariBrowserWindow = js.native
  
  var contentWindow: Window = js.native
  
  def hide(): Unit = js.native
  def hide(doNotRemember: Boolean): Unit = js.native
  
  var identifier: String = js.native
  
  var label: String = js.native
  
  def show(): Unit = js.native
  def show(doNotRemember: Boolean): Unit = js.native
  
  var visible: Boolean = js.native
}
