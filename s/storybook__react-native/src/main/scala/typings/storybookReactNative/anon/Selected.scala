package typings.storybookReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Selected extends StObject {
  
  var selected: Boolean
}
object Selected {
  
  @scala.inline
  def apply(selected: Boolean): Selected = {
    val __obj = js.Dynamic.literal(selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selected]
  }
  
  @scala.inline
  implicit class SelectedMutableBuilder[Self <: Selected] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
  }
}
