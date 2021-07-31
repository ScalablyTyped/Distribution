package typings.reactIntl.anon

import typings.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForwardedRef extends StObject {
  
  var forwardedRef: js.UndefOr[Ref[js.Any]] = js.undefined
}
object ForwardedRef {
  
  @scala.inline
  def apply(): ForwardedRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForwardedRef]
  }
  
  @scala.inline
  implicit class ForwardedRefMutableBuilder[Self <: ForwardedRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForwardedRef(value: Ref[js.Any]): Self = StObject.set(x, "forwardedRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardedRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "forwardedRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setForwardedRefNull: Self = StObject.set(x, "forwardedRef", null)
    
    @scala.inline
    def setForwardedRefUndefined: Self = StObject.set(x, "forwardedRef", js.undefined)
  }
}
