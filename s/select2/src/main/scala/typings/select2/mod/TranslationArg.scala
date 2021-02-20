package typings.select2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TranslationArg extends StObject {
  
  var input: String = js.native
  
  var maximum: Double = js.native
  
  var minimum: Double = js.native
}
object TranslationArg {
  
  @scala.inline
  def apply(input: String, maximum: Double, minimum: Double): TranslationArg = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], maximum = maximum.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslationArg]
  }
  
  @scala.inline
  implicit class TranslationArgMutableBuilder[Self <: TranslationArg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimum(value: Double): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
  }
}
