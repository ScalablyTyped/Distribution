package typings.reactToastify

import typings.reactToastify.distTypesMod.Toast
import typings.reactToastify.distTypesMod.ToastItem
import typings.reactToastify.distTypesMod.ToastItemStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMapperMod {
  
  @JSImport("react-toastify/dist/utils/mapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toToastItem(toast: Toast, status: ToastItemStatus): ToastItem[js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("toToastItem")(toast.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[ToastItem[js.Object]]
}
