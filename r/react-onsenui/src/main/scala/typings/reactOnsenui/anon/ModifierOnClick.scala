package typings.reactOnsenui.anon

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifierOnClick extends StObject {
  
  var modifier: js.UndefOr[String] = js.native
  
  var onClick: js.UndefOr[MouseEventHandler[_]] = js.native
}
object ModifierOnClick {
  
  @scala.inline
  def apply(): ModifierOnClick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifierOnClick]
  }
  
  @scala.inline
  implicit class ModifierOnClickMutableBuilder[Self <: ModifierOnClick] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModifier(value: String): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    @scala.inline
    def setOnClick(value: MouseEvent[_, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
