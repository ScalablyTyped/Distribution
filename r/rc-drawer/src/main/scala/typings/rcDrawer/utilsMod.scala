package typings.rcDrawer

import typings.react.mod.TouchEvent
import typings.std.Document
import typings.std.Element
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("rc-drawer/es/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addEventListener(
    target: HTMLElement,
    eventType: String,
    callback: js.Function1[/* e */ TouchEvent[Element] | typings.std.TouchEvent | Event, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(target.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def addEventListener(
    target: HTMLElement,
    eventType: String,
    callback: js.Function1[/* e */ TouchEvent[Element] | typings.std.TouchEvent | Event, Unit],
    options: js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(target.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def dataToArray(vars: js.Any): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("dataToArray")(vars.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  inline def getTouchParentScroll(root: HTMLElement, currentTarget: Null, differX: Double, differY: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getTouchParentScroll")(root.asInstanceOf[js.Any], currentTarget.asInstanceOf[js.Any], differX.asInstanceOf[js.Any], differY.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def getTouchParentScroll(root: HTMLElement, currentTarget: Document, differX: Double, differY: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getTouchParentScroll")(root.asInstanceOf[js.Any], currentTarget.asInstanceOf[js.Any], differX.asInstanceOf[js.Any], differY.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def getTouchParentScroll(root: HTMLElement, currentTarget: HTMLElement, differX: Double, differY: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("getTouchParentScroll")(root.asInstanceOf[js.Any], currentTarget.asInstanceOf[js.Any], differX.asInstanceOf[js.Any], differY.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isNumeric(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")().asInstanceOf[Boolean]
  inline def isNumeric(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isNumeric(value: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumeric")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def removeEventListener(
    target: HTMLElement,
    eventType: String,
    callback: js.Function1[/* e */ TouchEvent[Element] | typings.std.TouchEvent | Event, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(target.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def removeEventListener(
    target: HTMLElement,
    eventType: String,
    callback: js.Function1[/* e */ TouchEvent[Element] | typings.std.TouchEvent | Event, Unit],
    options: js.Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(target.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def transformArguments(arg: js.Any, cb: js.Any): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("transformArguments")(arg.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  @JSImport("rc-drawer/es/utils", "transitionEnd")
  @js.native
  val transitionEnd: String = js.native
  
  @JSImport("rc-drawer/es/utils", "transitionStr")
  @js.native
  val transitionStr: String = js.native
  
  @JSImport("rc-drawer/es/utils", "windowIsUndefined")
  @js.native
  val windowIsUndefined: Boolean = js.native
}
