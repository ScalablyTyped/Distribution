package typings.speechRuleEngine

import org.scalablytyped.runtime.StringDictionary
import typings.speechRuleEngine.jsHighlighterColorPickerMod.ColorPicker
import typings.speechRuleEngine.jsHighlighterColorPickerMod.StringColor
import typings.speechRuleEngine.jsHighlighterHighlighterMod.Highlighter
import typings.std.Element
import typings.std.EventListener
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsHighlighterAbstractHighlighterMod {
  
  /* note: abstract class */ @JSImport("speech-rule-engine/js/highlighter/abstract_highlighter", "AbstractHighlighter")
  @js.native
  open class AbstractHighlighter ()
    extends StObject
       with Highlighter {
    
    /* protected */ var ATTR: String = js.native
    
    /* CompleteClass */
    override def addEvents(node: HTMLElement, events: StringDictionary[EventListener]): Unit = js.native
    
    /* protected */ var color: ColorPicker = js.native
    
    /* CompleteClass */
    override def colorString(): StringColor = js.native
    
    def colorize(node: HTMLElement): Unit = js.native
    
    def colorizeAll(node: HTMLElement): Unit = js.native
    
    var counter: Double = js.native
    
    /* private */ var currentHighlights: Any = js.native
    
    def getMactionNodes(node: HTMLElement): js.Array[HTMLElement] = js.native
    
    /* CompleteClass */
    override def highlight(nodes: js.Array[HTMLElement]): Unit = js.native
    
    /* CompleteClass */
    override def highlightAll(node: HTMLElement): Unit = js.native
    
    /* protected */ def highlightNode(node: HTMLElement): Highlight = js.native
    
    def isHighlighted(node: HTMLElement): Boolean = js.native
    
    /* CompleteClass */
    override def isMactionNode(node: Element): Boolean = js.native
    
    /* protected */ var mactionName: String = js.native
    
    /* CompleteClass */
    override def setColor(color: ColorPicker): Unit = js.native
    
    def setHighlighted(node: HTMLElement): Unit = js.native
    
    def uncolorize(node: HTMLElement): Unit = js.native
    
    def uncolorizeAll(node: HTMLElement): Unit = js.native
    
    /* CompleteClass */
    override def unhighlight(): Unit = js.native
    
    /* CompleteClass */
    override def unhighlightAll(): Unit = js.native
    
    /* protected */ def unhighlightNode(highlight: Highlight): Unit = js.native
    
    def unsetHighlighted(node: HTMLElement): Unit = js.native
  }
  
  trait Highlight extends StObject {
    
    var background: js.UndefOr[String] = js.undefined
    
    var box: js.UndefOr[HTMLElement] = js.undefined
    
    var foreground: js.UndefOr[String] = js.undefined
    
    var node: HTMLElement
    
    var opacity: js.UndefOr[String] = js.undefined
    
    var position: js.UndefOr[String] = js.undefined
  }
  object Highlight {
    
    inline def apply(node: HTMLElement): Highlight = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[Highlight]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Highlight] (val x: Self) extends AnyVal {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBox(value: HTMLElement): Self = StObject.set(x, "box", value.asInstanceOf[js.Any])
      
      inline def setBoxUndefined: Self = StObject.set(x, "box", js.undefined)
      
      inline def setForeground(value: String): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
      
      inline def setForegroundUndefined: Self = StObject.set(x, "foreground", js.undefined)
      
      inline def setNode(value: HTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setOpacity(value: String): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
}
