package typings
package safariDashExtensionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafariExtensionContextMenuItem extends SafariEventTarget {
  /**
  		* The command identifier that the context menu item sends when activated.
  		* Setting an empty string, null, or undefined has no effect.
  		*/
  var command: java.lang.String = js.native
  /**
  		* A Boolean value that indicates whether a context menu item is disabled.
  		* Disabled menu items are not displayed in the context menu.
  		*/
  var disabled: scala.Boolean = js.native
  /**
  		* The unique identifier of the context menu item.
  		*/
  var identifier: java.lang.String = js.native
  /**
  		* The title displayed in the context menu.
  		*/
  var title: java.lang.String = js.native
}

