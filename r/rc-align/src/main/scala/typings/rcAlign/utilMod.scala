package typings.rcAlign

import typings.rcAlign.interfaceMod.TargetPoint
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("rc-align/es/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isSamePoint(prev: TargetPoint, next: TargetPoint): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSamePoint")(prev.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def monitorResize(element: HTMLElement, callback: js.Function): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("monitorResize")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def restoreFocus(activeElement: js.Any, container: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("restoreFocus")(activeElement.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
