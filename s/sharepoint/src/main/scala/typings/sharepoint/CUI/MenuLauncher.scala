package typings.sharepoint.CUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuLauncher
  extends StObject
     with Control
     with IModalController
object MenuLauncher {
  
  inline def apply(
    createComponentForDisplayMode: String => Any,
    dispose: () => scala.Unit,
    get_enabled: () => Boolean,
    get_id: () => String,
    get_root: () => Root,
    set_enabled: Boolean => Boolean
  ): MenuLauncher = {
    val __obj = js.Dynamic.literal(createComponentForDisplayMode = js.Any.fromFunction1(createComponentForDisplayMode), dispose = js.Any.fromFunction0(dispose), get_enabled = js.Any.fromFunction0(get_enabled), get_id = js.Any.fromFunction0(get_id), get_root = js.Any.fromFunction0(get_root), set_enabled = js.Any.fromFunction1(set_enabled))
    __obj.asInstanceOf[MenuLauncher]
  }
}
