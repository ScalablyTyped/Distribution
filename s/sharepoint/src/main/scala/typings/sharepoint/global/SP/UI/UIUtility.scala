package typings.sharepoint.global.SP.UI

import typings.std.Event
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UIUtility {
  
  @JSGlobal("SP.UI.UIUtility")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def calculateOffsetLeft(elem: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateOffsetLeft")(elem.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def calculateOffsetTop(elem: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateOffsetTop")(elem.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def cancelEvent(evt: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelEvent")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def clearChildNodes(elem: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearChildNodes")(elem.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def createHtmlInputCheck(isChecked: Boolean): HTMLInputElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createHtmlInputCheck")(isChecked.asInstanceOf[js.Any]).asInstanceOf[HTMLInputElement]
  
  @scala.inline
  def createHtmlInputText(text: String): HTMLInputElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createHtmlInputText")(text.asInstanceOf[js.Any]).asInstanceOf[HTMLInputElement]
  
  @scala.inline
  def focusValidOnThisNode(elem: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("focusValidOnThisNode")(elem.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def generateRandomElementId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateRandomElementId")().asInstanceOf[String]
  
  @scala.inline
  def getInnerText(elem: HTMLElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getInnerText")(elem.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def hideElement(elem: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideElement")(elem.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def insertAfter(elem: HTMLElement, targetElement: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertAfter")(elem.asInstanceOf[js.Any], targetElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def insertBefore(elem: HTMLElement, targetElement: HTMLElement): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("insertBefore")(elem.asInstanceOf[js.Any], targetElement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def isNodeOfType(elem: HTMLElement, tagNames: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNodeOfType")(elem.asInstanceOf[js.Any], tagNames.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isSvgNode(elem: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSvgNode")(elem.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isTextNode(elem: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTextNode")(elem.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def removeNode(elem: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeNode")(elem.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setInnerText(elem: HTMLElement, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setInnerText")(elem.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def showElement(elem: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showElement")(elem.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
