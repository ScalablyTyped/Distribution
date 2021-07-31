package typings.semanticUiDimmer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.ClassNameSettings._Impl, 'show'> */
trait PickImplshowShow extends StObject {
  
  var show: String
}
object PickImplshowShow {
  
  @scala.inline
  def apply(show: String): PickImplshowShow = {
    val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplshowShow]
  }
  
  @scala.inline
  implicit class PickImplshowShowMutableBuilder[Self <: PickImplshowShow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShow(value: String): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
  }
}
