package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopStateEventInit extends EventInit {
  
  var state: js.UndefOr[js.Any] = js.native
}
object PopStateEventInit {
  
  @scala.inline
  def apply(): PopStateEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopStateEventInit]
  }
  
  @scala.inline
  implicit class PopStateEventInitMutableBuilder[Self <: PopStateEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
