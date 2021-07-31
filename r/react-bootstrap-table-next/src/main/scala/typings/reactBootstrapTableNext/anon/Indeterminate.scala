package typings.reactBootstrapTableNext.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Indeterminate extends StObject {
  
  var checked: Boolean
  
  var indeterminate: Boolean
  
  var mode: String
}
object Indeterminate {
  
  @scala.inline
  def apply(checked: Boolean, indeterminate: Boolean, mode: String): Indeterminate = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], indeterminate = indeterminate.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indeterminate]
  }
  
  @scala.inline
  implicit class IndeterminateMutableBuilder[Self <: Indeterminate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
