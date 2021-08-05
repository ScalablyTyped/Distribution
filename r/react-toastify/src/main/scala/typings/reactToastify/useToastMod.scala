package typings.reactToastify

import typings.reactToastify.anon.EventHandlers
import typings.reactToastify.typesMod.ToastProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useToastMod {
  
  @JSImport("react-toastify/dist/hooks/useToast", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useToast(props: ToastProps): EventHandlers = ^.asInstanceOf[js.Dynamic].applyDynamic("useToast")(props.asInstanceOf[js.Any]).asInstanceOf[EventHandlers]
}
