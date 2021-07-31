package typings.ssri.anon

import typings.ssri.ssriBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var options: js.UndefOr[js.Array[String]] = js.undefined
  
  var single: js.UndefOr[`false`] = js.undefined
  
  var strict: js.UndefOr[Boolean] = js.undefined
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setSingle(value: `false`): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSingleUndefined: Self = StObject.set(x, "single", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}
