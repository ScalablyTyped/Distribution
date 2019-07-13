package typings
package reactDashMovableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-movable/lib/utils", JSImport.Namespace)
@js.native
object libUtilsMod extends js.Object {
  def arrayMove[T](array: js.Array[T], from: scala.Double, to: scala.Double): js.Array[T] = js.native
  def arrayRemove[T](array: js.Array[T], index: scala.Double): js.Array[T] = js.native
  def binarySearch(array: js.Array[scala.Double], targetValue: scala.Double): scala.Double = js.native
  def checkIfInteractive(target: stdLib.Element, rootElement: stdLib.Element): scala.Boolean = js.native
  def getTranslateOffset(element: stdLib.Element): scala.Double = js.native
  def isItemTransformed(element: stdLib.Element): scala.Boolean = js.native
  def isTouchEvent(event: stdLib.TouchEvent with stdLib.MouseEvent): scala.Double = js.native
  def schd(fn: js.Function): js.Function1[/* repeated */ js.Any, scala.Unit] = js.native
  def setItemTransition(element: stdLib.Element, duration: scala.Double): scala.Unit = js.native
  def transformItem(element: stdLib.Element): scala.Unit = js.native
  def transformItem(element: stdLib.Element, offsetY: scala.Double): scala.Unit = js.native
  def transformItem(element: stdLib.Element, offsetY: scala.Double, offsetX: scala.Double): scala.Unit = js.native
  def transformItem(element: stdLib.Element, offsetY: scala.Null, offsetX: scala.Double): scala.Unit = js.native
}

