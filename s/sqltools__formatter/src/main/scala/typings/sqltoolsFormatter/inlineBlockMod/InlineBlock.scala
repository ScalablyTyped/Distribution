package typings.sqltoolsFormatter.inlineBlockMod

import typings.sqltoolsFormatter.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineBlock extends js.Object {
  
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
  implicit class InlineBlockOps[Self <: InlineBlock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBeginIfPossible(value: (js.Any, js.Any) => Unit): Self = this.set("beginIfPossible", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEnd(value: () => Unit): Self = this.set("end", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsActive(value: () => Boolean): Self = this.set("isActive", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsForbiddenToken(value: Type => Boolean): Self = this.set("isForbiddenToken", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsInlineBlock(value: (js.Any, js.Any) => Boolean): Self = this.set("isInlineBlock", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLevel(value: js.Any): Self = this.set("level", value.asInstanceOf[js.Any])
  }
}
