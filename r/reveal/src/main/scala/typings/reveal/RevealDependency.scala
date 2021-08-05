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
  
  inline def apply(src: String): RevealDependency = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevealDependency]
  }
  
  extension [Self <: RevealDependency](x: Self) {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setCondition(value: () => Boolean): Self = StObject.set(x, "condition", js.Any.fromFunction0(value))
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
  }
}
