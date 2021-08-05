package typings.reactToastify

import typings.reactToastify.anon.Collection
import typings.reactToastify.anon.EventHandlers
import typings.reactToastify.typesMod.ToastContainerProps
import typings.reactToastify.typesMod.ToastProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksMod {
  
  @JSImport("react-toastify/dist/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useKeeper[T](arg: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useKeeper")(arg.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def useKeeper[T](arg: T, refresh: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("useKeeper")(arg.asInstanceOf[js.Any], refresh.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def useToast(props: ToastProps): EventHandlers = ^.asInstanceOf[js.Dynamic].applyDynamic("useToast")(props.asInstanceOf[js.Any]).asInstanceOf[EventHandlers]
  
  inline def useToastContainer(props: ToastContainerProps): Collection = ^.asInstanceOf[js.Dynamic].applyDynamic("useToastContainer")(props.asInstanceOf[js.Any]).asInstanceOf[Collection]
}
