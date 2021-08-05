package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionRequest
  extends StObject
     with DeferredPermissionRequest {
  
  def defer(): Unit
  
  val state: MSWebViewPermissionState
}
object PermissionRequest {
  
  inline def apply(
    allow: () => Unit,
    defer: () => Unit,
    deny: () => Unit,
    id: Double,
    state: MSWebViewPermissionState,
    `type`: MSWebViewPermissionType,
    uri: java.lang.String
  ): PermissionRequest = {
    val __obj = js.Dynamic.literal(allow = js.Any.fromFunction0(allow), defer = js.Any.fromFunction0(defer), deny = js.Any.fromFunction0(deny), id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionRequest]
  }
  
  extension [Self <: PermissionRequest](x: Self) {
    
    inline def setDefer(value: () => Unit): Self = StObject.set(x, "defer", js.Any.fromFunction0(value))
    
    inline def setState(value: MSWebViewPermissionState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
