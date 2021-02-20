package typings.semanticUiModal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-modal.SemanticUI.ModalSettings._Impl, 'queue'> */
@js.native
trait PickImplqueue extends StObject {
  
  var queue: Boolean = js.native
}
object PickImplqueue {
  
  @scala.inline
  def apply(queue: Boolean): PickImplqueue = {
    val __obj = js.Dynamic.literal(queue = queue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplqueue]
  }
  
  @scala.inline
  implicit class PickImplqueueMutableBuilder[Self <: PickImplqueue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQueue(value: Boolean): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
  }
}
