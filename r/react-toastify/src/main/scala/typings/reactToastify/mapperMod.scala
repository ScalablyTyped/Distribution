package typings.reactToastify

import typings.reactToastify.typesMod.Toast
import typings.reactToastify.typesMod.ToastItem
import typings.reactToastify.typesMod.ToastItemStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapperMod {
  
  @JSImport("react-toastify/dist/utils/mapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toToastItem(toast: Toast, status: ToastItemStatus): ToastItem[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("toToastItem")(toast.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[ToastItem[js.Object]]
}
