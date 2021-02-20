package typings.reactOnsenui.anon

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnChange extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var modifier: js.UndefOr[String] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.native
  
  var value: js.UndefOr[Double] = js.native
}
object OnChange {
  
  @scala.inline
  def apply(): OnChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnChange]
  }
  
  @scala.inline
  implicit class OnChangeMutableBuilder[Self <: OnChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setModifier(value: String): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* e */ Event => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
