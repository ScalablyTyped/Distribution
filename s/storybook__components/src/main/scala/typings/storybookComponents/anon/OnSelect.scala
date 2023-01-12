package typings.storybookComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnSelect extends StObject {
  
  def onSelect(id: String): Unit
}
object OnSelect {
  
  inline def apply(onSelect: String => Unit): OnSelect = {
    val __obj = js.Dynamic.literal(onSelect = js.Any.fromFunction1(onSelect))
    __obj.asInstanceOf[OnSelect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnSelect] (val x: Self) extends AnyVal {
    
    inline def setOnSelect(value: String => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
  }
}
