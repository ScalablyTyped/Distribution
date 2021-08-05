package typings.rcTrigger

import typings.rcTrigger.interfaceMod.StretchType
import typings.react.mod.CSSProperties
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useStretchStyleMod {
  
  @JSImport("rc-trigger/es/Popup/useStretchStyle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Tuple2[CSSProperties, js.Function1[/* element */ HTMLElement, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Tuple2[CSSProperties, js.Function1[/* element */ HTMLElement, Unit]]]
  inline def default(stretch: StretchType): js.Tuple2[CSSProperties, js.Function1[/* element */ HTMLElement, Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(stretch.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[CSSProperties, js.Function1[/* element */ HTMLElement, Unit]]]
}
