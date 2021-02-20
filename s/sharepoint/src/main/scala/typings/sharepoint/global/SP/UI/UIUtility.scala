package typings.sharepoint.global.SP.UI

import typings.std.Event
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UIUtility {
  
  @JSGlobal("SP.UI.UIUtility.calculateOffsetLeft")
  @js.native
  def calculateOffsetLeft(elem: HTMLElement): Double = js.native
  
  @JSGlobal("SP.UI.UIUtility.calculateOffsetTop")
  @js.native
  def calculateOffsetTop(elem: HTMLElement): Double = js.native
  
  @JSGlobal("SP.UI.UIUtility.cancelEvent")
  @js.native
  def cancelEvent(evt: Event): Unit = js.native
  
  @JSGlobal("SP.UI.UIUtility.clearChildNodes")
  @js.native
  def clearChildNodes(elem: HTMLElement): Unit = js.native
  
  @JSGlobal("SP.UI.UIUtility.createHtmlInputCheck")
  @js.native
  def createHtmlInputCheck(isChecked: Boolean): HTMLInputElement = js.native
  
  @JSGlobal("SP.UI.UIUtility.createHtmlInputText")
  @js.native
  def createHtmlInputText(text: String): HTMLInputElement = js.native
  
  @JSGlobal("SP.UI.UIUtility.focusValidOnThisNode")
  @js.native
  def focusValidOnThisNode(elem: HTMLElement): Boolean = js.native
  
  @JSGlobal("SP.UI.UIUtility.generateRandomElementId")
  @js.native
  def generateRandomElementId(): String = js.native
  
  @JSGlobal("SP.UI.UIUtility.getInnerText")
  @js.native
  def getInnerText(elem: HTMLElement): String = js.native
  
  @JSGlobal("SP.UI.UIUtility.hideElement")
  @js.native
  def hideElement(elem: HTMLElement): Unit = js.native
  
  @JSGlobal("SP.UI.UIUtility.insertAfter")
  @js.native
  def insertAfter(elem: HTMLElement, targetElement: HTMLElement): Unit = js.native
  
  @JSGlobal("SP.UI.UIUtility.insertBefore")
  @js.native
  def insertBefore(elem: HTMLElement, targetElement: HTMLElement): Unit = js.native
  
  @JSGlobal("SP.UI.UIUtility.isNodeOfType")
  @js.native
  def isNodeOfType(elem: HTMLElement, tagNames: js.Array[String]): Boolean = js.native
  
  @JSGlobal("SP.UI.UIUtility.isSvgNode")
  @js.native
  def isSvgNode(elem: HTMLElement): Boolean = js.native
  
  @JSGlobal("SP.UI.UIUtility.isTextNode")
  @js.native
  def isTextNode(elem: HTMLElement): Boolean = js.native
  
  @JSGlobal("SP.UI.UIUtility.removeNode")
  @js.native
  def removeNode(elem: HTMLElement): Unit = js.native
  
  @JSGlobal("SP.UI.UIUtility.setInnerText")
  @js.native
  def setInnerText(elem: HTMLElement, value: String): Unit = js.native
  
  @JSGlobal("SP.UI.UIUtility.showElement")
  @js.native
  def showElement(elem: HTMLElement): Unit = js.native
}
