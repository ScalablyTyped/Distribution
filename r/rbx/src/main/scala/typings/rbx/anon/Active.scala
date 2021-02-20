package typings.rbx.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Active extends StObject {
  
  var active: Requireable[Boolean] = js.native
  
  var clipped: Requireable[Boolean] = js.native
  
  var closeOnBlur: Requireable[Boolean] = js.native
  
  var closeOnEsc: Requireable[Boolean] = js.native
  
  var containerClassName: Requireable[String] = js.native
  
  var document: Requireable[js.Object] = js.native
  
  var onClose: Requireable[js.Function1[/* repeated */ _, _]] = js.native
}
object Active {
  
  @scala.inline
  def apply(
    active: Requireable[Boolean],
    clipped: Requireable[Boolean],
    closeOnBlur: Requireable[Boolean],
    closeOnEsc: Requireable[Boolean],
    containerClassName: Requireable[String],
    document: Requireable[js.Object],
    onClose: Requireable[js.Function1[/* repeated */ _, _]]
  ): Active = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], clipped = clipped.asInstanceOf[js.Any], closeOnBlur = closeOnBlur.asInstanceOf[js.Any], closeOnEsc = closeOnEsc.asInstanceOf[js.Any], containerClassName = containerClassName.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], onClose = onClose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Active]
  }
  
  @scala.inline
  implicit class ActiveMutableBuilder[Self <: Active] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Requireable[Boolean]): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipped(value: Requireable[Boolean]): Self = StObject.set(x, "clipped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnBlur(value: Requireable[Boolean]): Self = StObject.set(x, "closeOnBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseOnEsc(value: Requireable[Boolean]): Self = StObject.set(x, "closeOnEsc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerClassName(value: Requireable[String]): Self = StObject.set(x, "containerClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocument(value: Requireable[js.Object]): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClose(value: Requireable[js.Function1[/* repeated */ _, _]]): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
  }
}
