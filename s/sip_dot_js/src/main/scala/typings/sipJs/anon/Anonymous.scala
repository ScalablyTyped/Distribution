package typings.sipJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Anonymous extends StObject {
  
  var anonymous: js.UndefOr[Boolean] = js.undefined
  
  var outbound: js.UndefOr[Boolean] = js.undefined
}
object Anonymous {
  
  @scala.inline
  def apply(): Anonymous = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Anonymous]
  }
  
  @scala.inline
  implicit class AnonymousMutableBuilder[Self <: Anonymous] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnonymous(value: Boolean): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnonymousUndefined: Self = StObject.set(x, "anonymous", js.undefined)
    
    @scala.inline
    def setOutbound(value: Boolean): Self = StObject.set(x, "outbound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutboundUndefined: Self = StObject.set(x, "outbound", js.undefined)
  }
}
