package typings.speechRuleEngine

import typings.speechRuleEngine.jsCommonEventUtilMod.KeyCode
import typings.speechRuleEngine.jsSemanticTreeSemanticNodeMod.SemanticNode
import typings.speechRuleEngine.jsSpeechGeneratorSpeechGeneratorMod.SpeechGenerator
import typings.speechRuleEngine.jsWalkerLevelsMod.Levels
import typings.speechRuleEngine.jsWalkerWalkerMod.Walker
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Background extends StObject {
    
    var background: String
    
    var foreground: String
    
    var node: HTMLElement
  }
  object Background {
    
    inline def apply(background: String, foreground: String, node: HTMLElement): Background = {
      val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], foreground = foreground.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[Background]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Background] (val x: Self) extends AnyVal {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setForeground(value: String): Self = StObject.set(x, "foreground", value.asInstanceOf[js.Any])
      
      inline def setNode(value: HTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait Browser extends StObject {
    
    var browser: js.UndefOr[String] = js.undefined
    
    var renderer: String
  }
  object Browser {
    
    inline def apply(renderer: String): Browser = {
      val __obj = js.Dynamic.literal(renderer = renderer.asInstanceOf[js.Any])
      __obj.asInstanceOf[Browser]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Browser] (val x: Self) extends AnyVal {
      
      inline def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
      
      inline def setRenderer(value: String): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    }
  }
  
  trait Cayleyshort extends StObject {
    
    var cayleyshort: Boolean
    
    var linebreaks: Boolean
  }
  object Cayleyshort {
    
    inline def apply(cayleyshort: Boolean, linebreaks: Boolean): Cayleyshort = {
      val __obj = js.Dynamic.literal(cayleyshort = cayleyshort.asInstanceOf[js.Any], linebreaks = linebreaks.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cayleyshort]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cayleyshort] (val x: Self) extends AnyVal {
      
      inline def setCayleyshort(value: Boolean): Self = StObject.set(x, "cayleyshort", value.asInstanceOf[js.Any])
      
      inline def setLinebreaks(value: Boolean): Self = StObject.set(x, "linebreaks", value.asInstanceOf[js.Any])
    }
  }
  
  trait Combiner extends StObject {
    
    def combiner(p1: String, p2: String, p3: String): String
    @JSName("combiner")
    var combiner_Original: typings.speechRuleEngine.jsL10nTransformersMod.Combiner
    
    var font: String
  }
  object Combiner {
    
    inline def apply(combiner: (/* p1 */ String, /* p2 */ String, /* p3 */ String) => String, font: String): Combiner = {
      val __obj = js.Dynamic.literal(combiner = js.Any.fromFunction3(combiner), font = font.asInstanceOf[js.Any])
      __obj.asInstanceOf[Combiner]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Combiner] (val x: Self) extends AnyVal {
      
      inline def setCombiner(value: (/* p1 */ String, /* p2 */ String, /* p3 */ String) => String): Self = StObject.set(x, "combiner", js.Any.fromFunction3(value))
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    }
  }
  
  trait Conclusion extends StObject {
    
    var conclusion: SemanticNode
    
    var premises: SemanticNode
  }
  object Conclusion {
    
    inline def apply(conclusion: SemanticNode, premises: SemanticNode): Conclusion = {
      val __obj = js.Dynamic.literal(conclusion = conclusion.asInstanceOf[js.Any], premises = premises.asInstanceOf[js.Any])
      __obj.asInstanceOf[Conclusion]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Conclusion] (val x: Self) extends AnyVal {
      
      inline def setConclusion(value: SemanticNode): Self = StObject.set(x, "conclusion", value.asInstanceOf[js.Any])
      
      inline def setPremises(value: SemanticNode): Self = StObject.set(x, "premises", value.asInstanceOf[js.Any])
    }
  }
  
  trait DECIMALMARK extends StObject {
    
    var DECIMAL_MARK: String
    
    var DIGIT_GROUP: String
    
    var NUMBER: String
  }
  object DECIMALMARK {
    
    inline def apply(DECIMAL_MARK: String, DIGIT_GROUP: String, NUMBER: String): DECIMALMARK = {
      val __obj = js.Dynamic.literal(DECIMAL_MARK = DECIMAL_MARK.asInstanceOf[js.Any], DIGIT_GROUP = DIGIT_GROUP.asInstanceOf[js.Any], NUMBER = NUMBER.asInstanceOf[js.Any])
      __obj.asInstanceOf[DECIMALMARK]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DECIMALMARK] (val x: Self) extends AnyVal {
      
      inline def setDECIMAL_MARK(value: String): Self = StObject.set(x, "DECIMAL_MARK", value.asInstanceOf[js.Any])
      
      inline def setDIGIT_GROUP(value: String): Self = StObject.set(x, "DIGIT_GROUP", value.asInstanceOf[js.Any])
      
      inline def setNUMBER(value: String): Self = StObject.set(x, "NUMBER", value.asInstanceOf[js.Any])
    }
  }
  
  trait Focus[T] extends StObject {
    
    var focus: typings.speechRuleEngine.jsWalkerFocusMod.Focus
    
    var levels: Levels[T]
    
    var undo: Boolean
  }
  object Focus {
    
    inline def apply[T](focus: typings.speechRuleEngine.jsWalkerFocusMod.Focus, levels: Levels[T], undo: Boolean): Focus[T] = {
      val __obj = js.Dynamic.literal(focus = focus.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any], undo = undo.asInstanceOf[js.Any])
      __obj.asInstanceOf[Focus[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Focus[?], T] (val x: Self & Focus[T]) extends AnyVal {
      
      inline def setFocus(value: typings.speechRuleEngine.jsWalkerFocusMod.Focus): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
      
      inline def setLevels(value: Levels[T]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
      
      inline def setUndo(value: Boolean): Self = StObject.set(x, "undo", value.asInstanceOf[js.Any])
    }
  }
  
  trait Highlighter extends StObject {
    
    var highlighter: typings.speechRuleEngine.jsHighlighterHighlighterMod.Highlighter
    
    var speechGenerator: SpeechGenerator
    
    var walker: Walker
  }
  object Highlighter {
    
    inline def apply(
      highlighter: typings.speechRuleEngine.jsHighlighterHighlighterMod.Highlighter,
      speechGenerator: SpeechGenerator,
      walker: Walker
    ): Highlighter = {
      val __obj = js.Dynamic.literal(highlighter = highlighter.asInstanceOf[js.Any], speechGenerator = speechGenerator.asInstanceOf[js.Any], walker = walker.asInstanceOf[js.Any])
      __obj.asInstanceOf[Highlighter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Highlighter] (val x: Self) extends AnyVal {
      
      inline def setHighlighter(value: typings.speechRuleEngine.jsHighlighterHighlighterMod.Highlighter): Self = StObject.set(x, "highlighter", value.asInstanceOf[js.Any])
      
      inline def setSpeechGenerator(value: SpeechGenerator): Self = StObject.set(x, "speechGenerator", value.asInstanceOf[js.Any])
      
      inline def setWalker(value: Walker): Self = StObject.set(x, "walker", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key[T] extends StObject {
    
    var key: js.UndefOr[js.Function1[/* p1 */ KeyCode | String, KeyCode]] = js.undefined
    
    var pprint: js.UndefOr[js.Function1[/* p1 */ T, String]] = js.undefined
    
    var print: js.UndefOr[js.Function1[/* p1 */ T, String]] = js.undefined
    
    def processor(p1: String): T
  }
  object Key {
    
    inline def apply[T](processor: String => T): Key[T] = {
      val __obj = js.Dynamic.literal(processor = js.Any.fromFunction1(processor))
      __obj.asInstanceOf[Key[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Key[?], T] (val x: Self & Key[T]) extends AnyVal {
      
      inline def setKey(value: /* p1 */ KeyCode | String => KeyCode): Self = StObject.set(x, "key", js.Any.fromFunction1(value))
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setPprint(value: /* p1 */ T => String): Self = StObject.set(x, "pprint", js.Any.fromFunction1(value))
      
      inline def setPprintUndefined: Self = StObject.set(x, "pprint", js.undefined)
      
      inline def setPrint(value: /* p1 */ T => String): Self = StObject.set(x, "print", js.Any.fromFunction1(value))
      
      inline def setPrintUndefined: Self = StObject.set(x, "print", js.undefined)
      
      inline def setProcessor(value: String => T): Self = StObject.set(x, "processor", js.Any.fromFunction1(value))
    }
  }
  
  trait Length extends StObject {
    
    var length: Double
    
    var number: String
  }
  object Length {
    
    inline def apply(length: Double, number: String): Length = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.asInstanceOf[Length]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Length] (val x: Self) extends AnyVal {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    }
  }
  
  trait Node extends StObject {
    
    var node: HTMLElement
  }
  object Node {
    
    inline def apply(node: HTMLElement): Node = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
      
      inline def setNode(value: HTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait Postprocessor[T] extends StObject {
    
    var postprocessor: js.UndefOr[js.Function2[/* p1 */ T, /* p2 */ String, T]] = js.undefined
    
    var pprint: js.UndefOr[js.Function1[/* p1 */ T, String]] = js.undefined
    
    var print: js.UndefOr[js.Function1[/* p1 */ T, String]] = js.undefined
    
    def processor(p1: String): T
  }
  object Postprocessor {
    
    inline def apply[T](processor: String => T): Postprocessor[T] = {
      val __obj = js.Dynamic.literal(processor = js.Any.fromFunction1(processor))
      __obj.asInstanceOf[Postprocessor[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Postprocessor[?], T] (val x: Self & Postprocessor[T]) extends AnyVal {
      
      inline def setPostprocessor(value: (/* p1 */ T, /* p2 */ String) => T): Self = StObject.set(x, "postprocessor", js.Any.fromFunction2(value))
      
      inline def setPostprocessorUndefined: Self = StObject.set(x, "postprocessor", js.undefined)
      
      inline def setPprint(value: /* p1 */ T => String): Self = StObject.set(x, "pprint", js.Any.fromFunction1(value))
      
      inline def setPprintUndefined: Self = StObject.set(x, "pprint", js.undefined)
      
      inline def setPrint(value: /* p1 */ T => String): Self = StObject.set(x, "print", js.Any.fromFunction1(value))
      
      inline def setPrintUndefined: Self = StObject.set(x, "print", js.undefined)
      
      inline def setProcessor(value: String => T): Self = StObject.set(x, "processor", js.Any.fromFunction1(value))
    }
  }
  
  trait Sub extends StObject {
    
    var sub: String
    
    var sup: String
  }
  object Sub {
    
    inline def apply(sub: String, sup: String): Sub = {
      val __obj = js.Dynamic.literal(sub = sub.asInstanceOf[js.Any], sup = sup.asInstanceOf[js.Any])
      __obj.asInstanceOf[Sub]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Sub] (val x: Self) extends AnyVal {
      
      inline def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
      
      inline def setSup(value: String): Self = StObject.set(x, "sup", value.asInstanceOf[js.Any])
    }
  }
}
