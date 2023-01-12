package typings.ssri.anon

import typings.ssri.ssriBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsSingle extends StObject {
  
  var options: js.UndefOr[js.Array[String]] = js.undefined
  
  var single: `true`
  
  var strict: js.UndefOr[Boolean] = js.undefined
}
object OptionsSingle {
  
  inline def apply(): OptionsSingle = {
    val __obj = js.Dynamic.literal(single = true)
    __obj.asInstanceOf[OptionsSingle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionsSingle] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setSingle(value: `true`): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
