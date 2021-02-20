package typings.reactNativeNavigation.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Modals extends StObject {
  
  var modals: js.Array[_] = js.native
  
  var overlays: js.Array[_] = js.native
  
  var root: js.Any = js.native
}
object Modals {
  
  @scala.inline
  def apply(modals: js.Array[_], overlays: js.Array[_], root: js.Any): Modals = {
    val __obj = js.Dynamic.literal(modals = modals.asInstanceOf[js.Any], overlays = overlays.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modals]
  }
  
  @scala.inline
  implicit class ModalsMutableBuilder[Self <: Modals] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModals(value: js.Array[_]): Self = StObject.set(x, "modals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModalsVarargs(value: js.Any*): Self = StObject.set(x, "modals", js.Array(value :_*))
    
    @scala.inline
    def setOverlays(value: js.Array[_]): Self = StObject.set(x, "overlays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlaysVarargs(value: js.Any*): Self = StObject.set(x, "overlays", js.Array(value :_*))
    
    @scala.inline
    def setRoot(value: js.Any): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
