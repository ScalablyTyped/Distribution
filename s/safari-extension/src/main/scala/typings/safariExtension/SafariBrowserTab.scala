package typings.safariExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SafariBrowserTab
  extends StObject
     with SafariEventTarget {
  
  def activate(): Unit = js.native
  
  var browserWindow: SafariBrowserWindow = js.native
  
  def close(): Unit = js.native
  
  var page: SafariWebPageProxy = js.native
  
  var reader: SafariReader = js.native
  
  /**
    * The tab’s current title.
    * The tab’s title is the same as the title of the webpage in most cases. For example, the title of the webpage may be truncated for display, but the value of this property is not truncated.
    * Available in Safari 5.0 and later.
    */
  var title: String = js.native
  
  /**
    * The URL loaded in this tab.
    * Setting this attribute to a new value loads the page at the new URL in the tab.
    * Available in Safari 5.0 and later.
    */
  var url: String = js.native
  
  def visibleContentsAsDataURL(): String = js.native
}
