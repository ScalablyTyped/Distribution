package typings.reveal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/hakimel/reveal.js/#dependencies
trait RevealDependency extends StObject {
  
  var async: js.UndefOr[Boolean] = js.undefined
  
  var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var condition: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  var src: String
}
object RevealDependency {
  
  @scala.inline
  def apply(src: String): RevealDependency = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevealDependency]
  }
  
  @scala.inline
  implicit class RevealDependencyMutableBuilder[Self <: RevealDependency] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    @scala.inline
    def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setCondition(value: () => Boolean): Self = StObject.set(x, "condition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
  }
}
