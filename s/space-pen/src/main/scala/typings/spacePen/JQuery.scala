package typings.spacePen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://atom.github.io/space-pen/
@js.native
trait JQuery extends StObject {
  
  def command(eventName: Any, handler: Any): Any = js.native
  def command(eventName: Any, selector: Any, handler: Any): Any = js.native
  def command(eventName: Any, selector: Any, options: Any, handler: Any): Any = js.native
  
  def containsElement(element: Any): Boolean = js.native
  
  def disable(): JQuery = js.native
  
  def document(eventName: Any, docString: String): Any = js.native
  
  def enable(): JQuery = js.native
  
  def events(): Any = js.native
  
  def flashError(): Double = js.native
  
  def handlers(eventName: Any): Any = js.native
  
  def hasFocus(): Boolean = js.native
  
  def hasParent(): Boolean = js.native
  
  def iconSize(size: Double): Unit = js.native
  
  def indexOf(child: Any): Any = js.native
  
  def insertAt(index: Double, element: Any): JQuery = js.native
  
  def intValue(): Double = js.native
  
  def isDisabled(): Boolean = js.native
  
  def isHidden(): Boolean = js.native
  
  def isOnDom(): Boolean = js.native
  
  def isVisible(): Boolean = js.native
  
  def pageDown(): JQuery = js.native
  
  def pageUp(): JQuery = js.native
  
  def preempt(eventName: Any, handler: js.Function): Any = js.native
  
  def removeAt(index: Double): JQuery = js.native
  
  def scrollBottom(): Double = js.native
  def scrollBottom(newValue: Double): JQuery = js.native
  
  def scrollDown(): JQuery = js.native
  
  def scrollRight(): Double = js.native
  def scrollRight(newValue: Double): JQuery = js.native
  
  def scrollToBottom(): JQuery = js.native
  
  def scrollToTop(): JQuery = js.native
  
  def scrollUp(): JQuery = js.native
  
  def trueHeight(): Any = js.native
  
  def trueWidth(): Any = js.native
  
  def view(): Any = js.native
  
  def views(): js.Array[Any] = js.native
}
