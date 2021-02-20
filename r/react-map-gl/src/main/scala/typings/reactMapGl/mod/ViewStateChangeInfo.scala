package typings.reactMapGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewStateChangeInfo extends StObject {
  
  var viewState: ViewportProps = js.native
}
object ViewStateChangeInfo {
  
  @scala.inline
  def apply(viewState: ViewportProps): ViewStateChangeInfo = {
    val __obj = js.Dynamic.literal(viewState = viewState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewStateChangeInfo]
  }
  
  @scala.inline
  implicit class ViewStateChangeInfoMutableBuilder[Self <: ViewStateChangeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setViewState(value: ViewportProps): Self = StObject.set(x, "viewState", value.asInstanceOf[js.Any])
  }
}
