package typings.reactOnsenui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Indeterminate extends StObject {
  
  var indeterminate: js.UndefOr[Boolean] = js.undefined
  
  var modifier: js.UndefOr[String] = js.undefined
  
  var secondaryValue: js.UndefOr[Double] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object Indeterminate {
  
  @scala.inline
  def apply(): Indeterminate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Indeterminate]
  }
  
  @scala.inline
  implicit class IndeterminateMutableBuilder[Self <: Indeterminate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndeterminateUndefined: Self = StObject.set(x, "indeterminate", js.undefined)
    
    @scala.inline
    def setModifier(value: String): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifierUndefined: Self = StObject.set(x, "modifier", js.undefined)
    
    @scala.inline
    def setSecondaryValue(value: Double): Self = StObject.set(x, "secondaryValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryValueUndefined: Self = StObject.set(x, "secondaryValue", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
