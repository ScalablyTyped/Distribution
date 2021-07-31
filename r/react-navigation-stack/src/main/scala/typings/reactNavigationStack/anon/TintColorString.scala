package typings.reactNavigationStack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TintColorString extends StObject {
  
  var tintColor: String
}
object TintColorString {
  
  @scala.inline
  def apply(tintColor: String): TintColorString = {
    val __obj = js.Dynamic.literal(tintColor = tintColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TintColorString]
  }
  
  @scala.inline
  implicit class TintColorStringMutableBuilder[Self <: TintColorString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
  }
}
