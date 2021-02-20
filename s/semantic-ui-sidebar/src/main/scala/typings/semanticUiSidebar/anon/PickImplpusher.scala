package typings.semanticUiSidebar.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sidebar.SemanticUI.Sidebar.ErrorSettings._Impl, 'pusher'> */
@js.native
trait PickImplpusher extends StObject {
  
  var pusher: String = js.native
}
object PickImplpusher {
  
  @scala.inline
  def apply(pusher: String): PickImplpusher = {
    val __obj = js.Dynamic.literal(pusher = pusher.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplpusher]
  }
  
  @scala.inline
  implicit class PickImplpusherMutableBuilder[Self <: PickImplpusher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPusher(value: String): Self = StObject.set(x, "pusher", value.asInstanceOf[js.Any])
  }
}
