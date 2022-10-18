package typings.rcUtil

import typings.std.HTMLElement
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomFocusMod {
  
  @JSImport("rc-util/lib/Dom/focus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def backLastFocusNode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("backLastFocusNode")().asInstanceOf[Unit]
  
  inline def clearLastFocusNode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearLastFocusNode")().asInstanceOf[Unit]
  
  inline def getFocusNodeList(node: HTMLElement): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusNodeList")(node.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
  inline def getFocusNodeList(node: HTMLElement, includePositive: Boolean): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFocusNodeList")(node.asInstanceOf[js.Any], includePositive.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
  
  inline def limitTabRange(node: HTMLElement, e: KeyboardEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("limitTabRange")(node.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def saveLastFocusNode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("saveLastFocusNode")().asInstanceOf[Unit]
}
