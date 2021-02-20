package typings.reactMovable

import typings.std.Element
import typings.std.MouseEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("react-movable/lib/utils", "arrayMove")
  @js.native
  def arrayMove[T](array: js.Array[T], from: Double, to: Double): js.Array[T] = js.native
  
  @JSImport("react-movable/lib/utils", "arrayRemove")
  @js.native
  def arrayRemove[T](array: js.Array[T], index: Double): js.Array[T] = js.native
  
  @JSImport("react-movable/lib/utils", "binarySearch")
  @js.native
  def binarySearch(array: js.Array[Double], targetValue: Double): Double = js.native
  
  @JSImport("react-movable/lib/utils", "checkIfInteractive")
  @js.native
  def checkIfInteractive(target: Element, rootElement: Element): Boolean = js.native
  
  @JSImport("react-movable/lib/utils", "getTranslateOffset")
  @js.native
  def getTranslateOffset(element: Element): Double = js.native
  
  @JSImport("react-movable/lib/utils", "isItemTransformed")
  @js.native
  def isItemTransformed(element: Element): Boolean = js.native
  
  @JSImport("react-movable/lib/utils", "isTouchEvent")
  @js.native
  def isTouchEvent(event: TouchEvent with MouseEvent): Double = js.native
  
  @JSImport("react-movable/lib/utils", "schd")
  @js.native
  def schd(fn: js.Function): js.Function1[/* repeated */ js.Any, Unit] = js.native
  
  @JSImport("react-movable/lib/utils", "setItemTransition")
  @js.native
  def setItemTransition(element: Element, duration: Double): Unit = js.native
  @JSImport("react-movable/lib/utils", "setItemTransition")
  @js.native
  def setItemTransition(element: Element, duration: Double, timing: String): Unit = js.native
  
  @JSImport("react-movable/lib/utils", "transformItem")
  @js.native
  def transformItem(element: Element): Unit = js.native
  @JSImport("react-movable/lib/utils", "transformItem")
  @js.native
  def transformItem(element: Element, offsetY: js.UndefOr[scala.Nothing], offsetX: Double): Unit = js.native
  @JSImport("react-movable/lib/utils", "transformItem")
  @js.native
  def transformItem(element: Element, offsetY: Double): Unit = js.native
  @JSImport("react-movable/lib/utils", "transformItem")
  @js.native
  def transformItem(element: Element, offsetY: Double, offsetX: Double): Unit = js.native
  @JSImport("react-movable/lib/utils", "transformItem")
  @js.native
  def transformItem(element: Element, offsetY: Null, offsetX: Double): Unit = js.native
}
