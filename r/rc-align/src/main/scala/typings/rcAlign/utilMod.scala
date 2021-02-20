package typings.rcAlign

import typings.rcAlign.interfaceMod.TargetPoint
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("rc-align/es/util", "isSamePoint")
  @js.native
  def isSamePoint(prev: TargetPoint, next: TargetPoint): Boolean = js.native
  
  @JSImport("rc-align/es/util", "monitorResize")
  @js.native
  def monitorResize(element: HTMLElement, callback: js.Function): js.Function0[Unit] = js.native
  
  @JSImport("rc-align/es/util", "restoreFocus")
  @js.native
  def restoreFocus(activeElement: js.Any, container: js.Any): Unit = js.native
}
