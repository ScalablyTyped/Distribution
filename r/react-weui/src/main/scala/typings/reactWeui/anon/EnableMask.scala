package typings.reactWeui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableMask extends StObject {
  
  var enableMask: Boolean
  
  var show: Boolean
}
object EnableMask {
  
  @scala.inline
  def apply(enableMask: Boolean, show: Boolean): EnableMask = {
    val __obj = js.Dynamic.literal(enableMask = enableMask.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableMask]
  }
  
  @scala.inline
  implicit class EnableMaskMutableBuilder[Self <: EnableMask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnableMask(value: Boolean): Self = StObject.set(x, "enableMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
  }
}
