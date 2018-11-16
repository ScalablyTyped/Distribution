package typings
package spaceDashPenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://atom.github.io/space-pen/
@js.native
trait JQuery extends js.Object {
  def command(eventName: js.Any, handler: js.Any): js.Any = js.native
  def command(eventName: js.Any, selector: js.Any, handler: js.Any): js.Any = js.native
  def command(eventName: js.Any, selector: js.Any, options: js.Any, handler: js.Any): js.Any = js.native
  def containsElement(element: js.Any): scala.Boolean = js.native
  def disable(): JQuery = js.native
  def document(eventName: js.Any, docString: java.lang.String): js.Any = js.native
  def enable(): JQuery = js.native
  def events(): js.Any = js.native
  def flashError(): scala.Double = js.native
  def handlers(eventName: js.Any): js.Any = js.native
  def hasFocus(): scala.Boolean = js.native
  def hasParent(): scala.Boolean = js.native
  def iconSize(size: scala.Double): scala.Unit = js.native
  def indexOf(child: js.Any): js.Any = js.native
  def insertAt(index: scala.Double, element: js.Any): JQuery = js.native
  def intValue(): scala.Double = js.native
  def isDisabled(): scala.Boolean = js.native
  def isHidden(): scala.Boolean = js.native
  def isOnDom(): scala.Boolean = js.native
  def isVisible(): scala.Boolean = js.native
  def pageDown(): JQuery = js.native
  def pageUp(): JQuery = js.native
  def preempt(eventName: js.Any, handler: js.Function): js.Any = js.native
  def removeAt(index: scala.Double): JQuery = js.native
  def scrollBottom(): scala.Double = js.native
  def scrollBottom(newValue: scala.Double): JQuery = js.native
  def scrollDown(): JQuery = js.native
  def scrollRight(): scala.Double = js.native
  def scrollRight(newValue: scala.Double): JQuery = js.native
  def scrollToBottom(): JQuery = js.native
  def scrollToTop(): JQuery = js.native
  def scrollUp(): JQuery = js.native
  def trueHeight(): js.Any = js.native
  def trueWidth(): js.Any = js.native
  def view(): js.Any = js.native
  def views(): js.Array[_] = js.native
}

