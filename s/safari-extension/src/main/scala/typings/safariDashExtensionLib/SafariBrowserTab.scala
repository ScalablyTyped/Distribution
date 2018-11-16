package typings
package safariDashExtensionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafariBrowserTab extends SafariEventTarget {
  var browserWindow: SafariBrowserWindow = js.native
  var page: SafariWebPageProxy = js.native
  var reader: SafariReader = js.native
  /**
  		* The tab’s current title.
  		* The tab’s title is the same as the title of the webpage in most cases. For example, the title of the webpage may be truncated for display, but the value of this property is not truncated.
  		* Available in Safari 5.0 and later.
  		*/
  var title: java.lang.String = js.native
  /**
  		* The URL loaded in this tab.
  		* Setting this attribute to a new value loads the page at the new URL in the tab.
  		* Available in Safari 5.0 and later.
  		*/
  var url: java.lang.String = js.native
  def activate(): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def visibleContentsAsDataURL(): java.lang.String = js.native
}

