package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusOptions extends StObject {
  
  var preventScroll: js.UndefOr[scala.Boolean] = js.undefined
}
object FocusOptions {
  
  @scala.inline
  def apply(): FocusOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusOptions]
  }
  
  @scala.inline
  implicit class FocusOptionsMutableBuilder[Self <: FocusOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreventScroll(value: scala.Boolean): Self = StObject.set(x, "preventScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventScrollUndefined: Self = StObject.set(x, "preventScroll", js.undefined)
  }
}
