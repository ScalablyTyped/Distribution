package typings.sqltoolsFormatter

import typings.sqltoolsFormatter.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreInlineBlockMod {
  
  @JSImport("@sqltools/formatter/lib/core/InlineBlock", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with InlineBlock {
    
    /* CompleteClass */
    override def beginIfPossible(tokens: Any, index: Any): Unit = js.native
    
    /* CompleteClass */
    override def end(): Unit = js.native
    
    /* CompleteClass */
    override def isActive(): Boolean = js.native
    
    /* CompleteClass */
    override def isForbiddenToken(param0: Type): Boolean = js.native
    
    /* CompleteClass */
    override def isInlineBlock(tokens: Any, index: Any): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var level: Any = js.native
  }
  
  trait InlineBlock extends StObject {
    
    def beginIfPossible(tokens: Any, index: Any): Unit
    
    def end(): Unit
    
    def isActive(): Boolean
    
    def isForbiddenToken(param0: Type): Boolean
    
    def isInlineBlock(tokens: Any, index: Any): Boolean
    
    /* private */ var level: Any
  }
  object InlineBlock {
    
    inline def apply(
      beginIfPossible: (Any, Any) => Unit,
      end: () => Unit,
      isActive: () => Boolean,
      isForbiddenToken: Type => Boolean,
      isInlineBlock: (Any, Any) => Boolean,
      level: Any
    ): InlineBlock = {
      val __obj = js.Dynamic.literal(beginIfPossible = js.Any.fromFunction2(beginIfPossible), end = js.Any.fromFunction0(end), isActive = js.Any.fromFunction0(isActive), isForbiddenToken = js.Any.fromFunction1(isForbiddenToken), isInlineBlock = js.Any.fromFunction2(isInlineBlock), level = level.asInstanceOf[js.Any])
      __obj.asInstanceOf[InlineBlock]
    }
    
    extension [Self <: InlineBlock](x: Self) {
      
      inline def setBeginIfPossible(value: (Any, Any) => Unit): Self = StObject.set(x, "beginIfPossible", js.Any.fromFunction2(value))
      
      inline def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
      
      inline def setIsActive(value: () => Boolean): Self = StObject.set(x, "isActive", js.Any.fromFunction0(value))
      
      inline def setIsForbiddenToken(value: Type => Boolean): Self = StObject.set(x, "isForbiddenToken", js.Any.fromFunction1(value))
      
      inline def setIsInlineBlock(value: (Any, Any) => Boolean): Self = StObject.set(x, "isInlineBlock", js.Any.fromFunction2(value))
      
      inline def setLevel(value: Any): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    }
  }
}
