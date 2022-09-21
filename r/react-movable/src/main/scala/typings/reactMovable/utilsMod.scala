package typings.reactMovable

import typings.reactMovable.anon.CallArgs
import typings.std.Element
import typings.std.MouseEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("react-movable/lib/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arrayMove[T](array: js.Array[T], from: Double, to: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayMove")(array.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def arrayRemove[T](array: js.Array[T], index: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayRemove")(array.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def binarySearch(array: js.Array[Double], targetValue: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("binarySearch")(array.asInstanceOf[js.Any], targetValue.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def checkIfInteractive(target: Element, rootElement: Element): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkIfInteractive")(target.asInstanceOf[js.Any], rootElement.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getTranslateOffset(element: Element): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTranslateOffset")(element.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isItemTransformed(element: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isItemTransformed")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTouchEvent(event: TouchEvent & MouseEvent): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("isTouchEvent")(event.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def schd(fn: js.Function): CallArgs = ^.asInstanceOf[js.Dynamic].applyDynamic("schd")(fn.asInstanceOf[js.Any]).asInstanceOf[CallArgs]
  
  inline def setItemTransition(element: Element, duration: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setItemTransition")(element.asInstanceOf[js.Any], duration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setItemTransition(element: Element, duration: Double, timing: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setItemTransition")(element.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], timing.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def transformItem(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("transformItem")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def transformItem(element: Element, offsetY: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transformItem")(element.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def transformItem(element: Element, offsetY: Double, offsetX: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transformItem")(element.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def transformItem(element: Element, offsetY: Null, offsetX: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transformItem")(element.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def transformItem(element: Element, offsetY: Unit, offsetX: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("transformItem")(element.asInstanceOf[js.Any], offsetY.asInstanceOf[js.Any], offsetX.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
