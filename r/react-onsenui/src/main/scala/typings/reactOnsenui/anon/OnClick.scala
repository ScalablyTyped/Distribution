package typings.reactOnsenui.anon

import typings.reactOnsenui.mod.Navigator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnClick extends StObject {
  
  var modifier: js.UndefOr[String] = js.undefined
  
  var onClick: js.UndefOr[js.Function1[/* navigator */ Navigator, Unit]] = js.undefined
}
object OnClick {
  
  @scala.inline
  def apply(): OnClick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnClick]
  }
  
  @scala.inline
  implicit class OnClickMutableBuilder[Self <: OnClick] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModifier(value: String): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* navigator */ Navigator => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
