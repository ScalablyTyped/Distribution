package typings.sqltoolsFormatter

import typings.sqltoolsFormatter.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inlineBlockMod {
  
  @JSImport("@sqltools/formatter/lib/core/InlineBlock", JSImport.Default)
  @js.native
  class default () extends InlineBlock
  
  @js.native
  trait InlineBlock extends StObject {
    
    def beginIfPossible(tokens: js.Any, index: js.Any): Unit = js.native
    
    def end(): Unit = js.native
    
    def isActive(): Boolean = js.native
    
    def isForbiddenToken(hasTypeValue: Type): Boolean = js.native
    
    def isInlineBlock(tokens: js.Any, index: js.Any): Boolean = js.native
    
    var level: js.Any = js.native
  }
  object InlineBlock {
    
    @scala.inline
    def apply(
      beginIfPossible: (js.Any, js.Any) => Unit,
      end: () => Unit,
      isActive: () => Boolean,
      isForbiddenToken: Type => Boolean,
      isInlineBlock: (js.Any, js.Any) => Boolean,
      level: js.Any
    ): InlineBlock = {
      val __obj = js.Dynamic.literal(beginIfPossible = js.Any.fromFunction2(beginIfPossible), end = js.Any.fromFunction0(end), isActive = js.Any.fromFunction0(isActive), isForbiddenToken = js.Any.fromFunction1(isForbiddenToken), isInlineBlock = js.Any.fromFunction2(isInlineBlock), level = level.asInstanceOf[js.Any])
      __obj.asInstanceOf[InlineBlock]
    }
    
    @scala.inline
    implicit class InlineBlockMutableBuilder[Self <: InlineBlock] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBeginIfPossible(value: (js.Any, js.Any) => Unit): Self = StObject.set(x, "beginIfPossible", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsActive(value: () => Boolean): Self = StObject.set(x, "isActive", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsForbiddenToken(value: Type => Boolean): Self = StObject.set(x, "isForbiddenToken", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsInlineBlock(value: (js.Any, js.Any) => Boolean): Self = StObject.set(x, "isInlineBlock", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLevel(value: js.Any): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    }
  }
}
