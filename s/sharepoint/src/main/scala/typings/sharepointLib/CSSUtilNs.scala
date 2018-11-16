package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Available only in SharePoint Online*/
@JSGlobal("CSSUtil")
@js.native
object CSSUtilNs extends js.Object {
  def AddClass(elem: stdLib.HTMLElement, className: java.lang.String): scala.Unit = js.native
  def HasClass(elem: stdLib.HTMLElement, className: java.lang.String): scala.Boolean = js.native
  def RemoveClass(elem: stdLib.HTMLElement, className: java.lang.String): scala.Unit = js.native
  def getCurrentEltStyleByNames(elem: stdLib.HTMLElement, styleNames: js.Array[java.lang.String]): java.lang.String = js.native
  def getCurrentStyle(elem: stdLib.HTMLElement, cssStyle: java.lang.String): java.lang.String = js.native
  def getCurrentStyleCorrect(element: stdLib.HTMLElement, camelStyleName: java.lang.String, dashStyleName: java.lang.String): java.lang.String = js.native
  def getOpacity(element: stdLib.HTMLElement): scala.Double = js.native
  def numToPx(n: scala.Double): java.lang.String = js.native
  def pxToFloat(pxString: java.lang.String): scala.Double = js.native
  def pxToNum(px: java.lang.String): scala.Double = js.native
  def setOpacity(element: stdLib.HTMLElement, value: scala.Double): scala.Unit = js.native
}

