package typings
package sharepointLib.SPNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.UI.UIUtility")
@js.native
object UIUtilityNs extends js.Object {
  def calculateOffsetLeft(elem: stdLib.HTMLElement): scala.Double = js.native
  def calculateOffsetTop(elem: stdLib.HTMLElement): scala.Double = js.native
  def cancelEvent(evt: stdLib.Event): scala.Unit = js.native
  def clearChildNodes(elem: stdLib.HTMLElement): scala.Unit = js.native
  def createHtmlInputCheck(isChecked: scala.Boolean): stdLib.HTMLInputElement = js.native
  def createHtmlInputText(text: java.lang.String): stdLib.HTMLInputElement = js.native
  def focusValidOnThisNode(elem: stdLib.HTMLElement): scala.Boolean = js.native
  def generateRandomElementId(): java.lang.String = js.native
  def getInnerText(elem: stdLib.HTMLElement): java.lang.String = js.native
  def hideElement(elem: stdLib.HTMLElement): scala.Unit = js.native
  def insertAfter(elem: stdLib.HTMLElement, targetElement: stdLib.HTMLElement): scala.Unit = js.native
  def insertBefore(elem: stdLib.HTMLElement, targetElement: stdLib.HTMLElement): scala.Unit = js.native
  def isNodeOfType(elem: stdLib.HTMLElement, tagNames: js.Array[java.lang.String]): scala.Boolean = js.native
  def isSvgNode(elem: stdLib.HTMLElement): scala.Boolean = js.native
  def isTextNode(elem: stdLib.HTMLElement): scala.Boolean = js.native
  def removeNode(elem: stdLib.HTMLElement): scala.Unit = js.native
  def setInnerText(elem: stdLib.HTMLElement, value: java.lang.String): scala.Unit = js.native
  def showElement(elem: stdLib.HTMLElement): scala.Unit = js.native
}

