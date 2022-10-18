package typings.reactTextareaAutosize

import typings.react.mod.MutableRefObject
import typings.std.HTMLElement
import typings.std.UIEvent
import typings.useComposedRef.mod.UserRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcHooksMod {
  
  @JSImport("react-textarea-autosize/dist/declarations/src/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useComposedRef[T /* <: HTMLElement */](libRef: MutableRefObject[T | Null], userRef: UserRef[T]): js.Function1[/* instance */ T | Null, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("useComposedRef")(libRef.asInstanceOf[js.Any], userRef.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* instance */ T | Null, Unit]]
  
  inline def useWindowResizeListener(listener: js.Function1[/* event */ UIEvent, Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useWindowResizeListener")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
