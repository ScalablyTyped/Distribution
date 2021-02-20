package typings.semanticUiDimmer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.DurationSettings._Impl, 'show'> */
@js.native
trait PickImplshow extends StObject {
  
  var show: Double = js.native
}
object PickImplshow {
  
  @scala.inline
  def apply(show: Double): PickImplshow = {
    val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplshow]
  }
  
  @scala.inline
  implicit class PickImplshowMutableBuilder[Self <: PickImplshow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShow(value: Double): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
  }
}
