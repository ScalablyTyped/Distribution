package typings.sharepoint.global

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in SharePoint Online*/
object CSSUtil {
  
  @JSGlobal("CSSUtil.AddClass")
  @js.native
  def AddClass(elem: HTMLElement, className: String): Unit = js.native
  
  @JSGlobal("CSSUtil.HasClass")
  @js.native
  def HasClass(elem: HTMLElement, className: String): Boolean = js.native
  
  @JSGlobal("CSSUtil.RemoveClass")
  @js.native
  def RemoveClass(elem: HTMLElement, className: String): Unit = js.native
  
  @JSGlobal("CSSUtil.getCurrentEltStyleByNames")
  @js.native
  def getCurrentEltStyleByNames(elem: HTMLElement, styleNames: js.Array[String]): String = js.native
  
  @JSGlobal("CSSUtil.getCurrentStyle")
  @js.native
  def getCurrentStyle(elem: HTMLElement, cssStyle: String): String = js.native
  
  @JSGlobal("CSSUtil.getCurrentStyleCorrect")
  @js.native
  def getCurrentStyleCorrect(element: HTMLElement, camelStyleName: String, dashStyleName: String): String = js.native
  
  @JSGlobal("CSSUtil.getOpacity")
  @js.native
  def getOpacity(element: HTMLElement): Double = js.native
  
  @JSGlobal("CSSUtil.numToPx")
  @js.native
  def numToPx(n: Double): String = js.native
  
  @JSGlobal("CSSUtil.pxToFloat")
  @js.native
  def pxToFloat(pxString: String): Double = js.native
  
  @JSGlobal("CSSUtil.pxToNum")
  @js.native
  def pxToNum(px: String): Double = js.native
  
  @JSGlobal("CSSUtil.setOpacity")
  @js.native
  def setOpacity(element: HTMLElement, value: Double): Unit = js.native
}
