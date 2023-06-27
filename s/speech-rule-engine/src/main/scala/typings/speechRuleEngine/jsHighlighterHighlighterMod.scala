package typings.speechRuleEngine

import org.scalablytyped.runtime.StringDictionary
import typings.speechRuleEngine.jsHighlighterColorPickerMod.ColorPicker
import typings.speechRuleEngine.jsHighlighterColorPickerMod.StringColor
import typings.std.Element
import typings.std.EventListener
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsHighlighterHighlighterMod {
  
  trait Highlighter extends StObject {
    
    def addEvents(node: HTMLElement, events: StringDictionary[EventListener]): Unit
    
    def colorString(): StringColor
    
    def highlight(nodes: js.Array[HTMLElement]): Unit
    
    def highlightAll(node: HTMLElement): Unit
    
    def isMactionNode(node: Element): Boolean
    
    def setColor(color: ColorPicker): Unit
    
    def unhighlight(): Unit
    
    def unhighlightAll(): Unit
  }
  object Highlighter {
    
    inline def apply(
      addEvents: (HTMLElement, StringDictionary[EventListener]) => Unit,
      colorString: () => StringColor,
      highlight: js.Array[HTMLElement] => Unit,
      highlightAll: HTMLElement => Unit,
      isMactionNode: Element => Boolean,
      setColor: ColorPicker => Unit,
      unhighlight: () => Unit,
      unhighlightAll: () => Unit
    ): Highlighter = {
      val __obj = js.Dynamic.literal(addEvents = js.Any.fromFunction2(addEvents), colorString = js.Any.fromFunction0(colorString), highlight = js.Any.fromFunction1(highlight), highlightAll = js.Any.fromFunction1(highlightAll), isMactionNode = js.Any.fromFunction1(isMactionNode), setColor = js.Any.fromFunction1(setColor), unhighlight = js.Any.fromFunction0(unhighlight), unhighlightAll = js.Any.fromFunction0(unhighlightAll))
      __obj.asInstanceOf[Highlighter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Highlighter] (val x: Self) extends AnyVal {
      
      inline def setAddEvents(value: (HTMLElement, StringDictionary[EventListener]) => Unit): Self = StObject.set(x, "addEvents", js.Any.fromFunction2(value))
      
      inline def setColorString(value: () => StringColor): Self = StObject.set(x, "colorString", js.Any.fromFunction0(value))
      
      inline def setHighlight(value: js.Array[HTMLElement] => Unit): Self = StObject.set(x, "highlight", js.Any.fromFunction1(value))
      
      inline def setHighlightAll(value: HTMLElement => Unit): Self = StObject.set(x, "highlightAll", js.Any.fromFunction1(value))
      
      inline def setIsMactionNode(value: Element => Boolean): Self = StObject.set(x, "isMactionNode", js.Any.fromFunction1(value))
      
      inline def setSetColor(value: ColorPicker => Unit): Self = StObject.set(x, "setColor", js.Any.fromFunction1(value))
      
      inline def setUnhighlight(value: () => Unit): Self = StObject.set(x, "unhighlight", js.Any.fromFunction0(value))
      
      inline def setUnhighlightAll(value: () => Unit): Self = StObject.set(x, "unhighlightAll", js.Any.fromFunction0(value))
    }
  }
}
