package typings.sharepoint.global

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in SharePoint Online*/
@JSGlobal("CSSUtil")
@js.native
object CSSUtil extends js.Object {
  
  def AddClass(elem: HTMLElement, className: String): Unit = js.native
  
  def HasClass(elem: HTMLElement, className: String): Boolean = js.native
  
  def RemoveClass(elem: HTMLElement, className: String): Unit = js.native
  
  def getCurrentEltStyleByNames(elem: HTMLElement, styleNames: js.Array[String]): String = js.native
  
  def getCurrentStyle(elem: HTMLElement, cssStyle: String): String = js.native
  
  def getCurrentStyleCorrect(element: HTMLElement, camelStyleName: String, dashStyleName: String): String = js.native
  
  def getOpacity(element: HTMLElement): Double = js.native
  
  def numToPx(n: Double): String = js.native
  
  def pxToFloat(pxString: String): Double = js.native
  
  def pxToNum(px: String): Double = js.native
  
  def setOpacity(element: HTMLElement, value: Double): Unit = js.native
}
