package typings.reactOnsenui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisabledModifier extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var modifier: js.UndefOr[String] = js.undefined
  
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object DisabledModifier {
  
  @scala.inline
  def apply(): DisabledModifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisabledModifier]
  }
  
  @scala.inline
  implicit class DisabledModifierMutableBuilder[Self <: DisabledModifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setModifier(value: String): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    @scala.inline
    def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
  }
}
