package typings.semanticUiForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-form.SemanticUI.FormSettings._Impl, 'inline'> */
trait PickImplinline extends StObject {
  
  var `inline`: Boolean
}
object PickImplinline {
  
  @scala.inline
  def apply(`inline`: Boolean): PickImplinline = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplinline]
  }
  
  @scala.inline
  implicit class PickImplinlineMutableBuilder[Self <: PickImplinline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
  }
}
