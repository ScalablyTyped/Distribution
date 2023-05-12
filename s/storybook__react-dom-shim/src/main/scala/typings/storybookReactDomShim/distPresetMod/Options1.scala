package typings.storybookReactDomShim.distPresetMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options1 extends StObject {
  
  var allowClass: Boolean
  
  var allowDate: Boolean
  
  var allowFunction: Boolean
  
  var allowRegExp: Boolean
  
  var allowSymbol: Boolean
  
  var allowUndefined: Boolean
  
  var lazyEval: Boolean
  
  var maxDepth: Double
  
  var space: js.UndefOr[Double] = js.undefined
}
object Options1 {
  
  inline def apply(
    allowClass: Boolean,
    allowDate: Boolean,
    allowFunction: Boolean,
    allowRegExp: Boolean,
    allowSymbol: Boolean,
    allowUndefined: Boolean,
    lazyEval: Boolean,
    maxDepth: Double
  ): Options1 = {
    val __obj = js.Dynamic.literal(allowClass = allowClass.asInstanceOf[js.Any], allowDate = allowDate.asInstanceOf[js.Any], allowFunction = allowFunction.asInstanceOf[js.Any], allowRegExp = allowRegExp.asInstanceOf[js.Any], allowSymbol = allowSymbol.asInstanceOf[js.Any], allowUndefined = allowUndefined.asInstanceOf[js.Any], lazyEval = lazyEval.asInstanceOf[js.Any], maxDepth = maxDepth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options1]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options1] (val x: Self) extends AnyVal {
    
    inline def setAllowClass(value: Boolean): Self = StObject.set(x, "allowClass", value.asInstanceOf[js.Any])
    
    inline def setAllowDate(value: Boolean): Self = StObject.set(x, "allowDate", value.asInstanceOf[js.Any])
    
    inline def setAllowFunction(value: Boolean): Self = StObject.set(x, "allowFunction", value.asInstanceOf[js.Any])
    
    inline def setAllowRegExp(value: Boolean): Self = StObject.set(x, "allowRegExp", value.asInstanceOf[js.Any])
    
    inline def setAllowSymbol(value: Boolean): Self = StObject.set(x, "allowSymbol", value.asInstanceOf[js.Any])
    
    inline def setAllowUndefined(value: Boolean): Self = StObject.set(x, "allowUndefined", value.asInstanceOf[js.Any])
    
    inline def setLazyEval(value: Boolean): Self = StObject.set(x, "lazyEval", value.asInstanceOf[js.Any])
    
    inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
    
    inline def setSpace(value: Double): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
  }
}
