package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rationale extends StObject {
  
  var buttonNegative: js.UndefOr[String] = js.undefined
  
  var buttonNeutral: js.UndefOr[String] = js.undefined
  
  var buttonPositive: String
  
  var message: String
  
  var title: String
}
object Rationale {
  
  @scala.inline
  def apply(buttonPositive: String, message: String, title: String): Rationale = {
    val __obj = js.Dynamic.literal(buttonPositive = buttonPositive.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rationale]
  }
  
  @scala.inline
  implicit class RationaleMutableBuilder[Self <: Rationale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtonNegative(value: String): Self = StObject.set(x, "buttonNegative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonNegativeUndefined: Self = StObject.set(x, "buttonNegative", js.undefined)
    
    @scala.inline
    def setButtonNeutral(value: String): Self = StObject.set(x, "buttonNeutral", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonNeutralUndefined: Self = StObject.set(x, "buttonNeutral", js.undefined)
    
    @scala.inline
    def setButtonPositive(value: String): Self = StObject.set(x, "buttonPositive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
