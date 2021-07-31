package typings.safariExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SafariExtensionContextMenuItem
  extends StObject
     with SafariEventTarget {
  
  /**
    * The command identifier that the context menu item sends when activated.
    * Setting an empty string, null, or undefined has no effect.
    */
  var command: String = js.native
  
  /**
    * A Boolean value that indicates whether a context menu item is disabled.
    * Disabled menu items are not displayed in the context menu.
    */
  var disabled: Boolean = js.native
  
  /**
    * The unique identifier of the context menu item.
    */
  var identifier: String = js.native
  
  /**
    * The title displayed in the context menu.
    */
  var title: String = js.native
}
