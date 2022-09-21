package typings.sizeSensor

import typings.std.Element
import typings.std.ElementCSSInlineStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("size-sensor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bind[T /* <: StyledElement */](element: T, cb: js.Function1[/* element */ T | Null, Unit]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(element.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  inline def bind[T /* <: StyledElement */](element: Null, cb: js.Function1[/* element */ T | Null, Unit]): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(element.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
  inline def clear(element: StyledElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @js.native
  trait StyledElement
    extends StObject
       with Element
       with ElementCSSInlineStyle
}
