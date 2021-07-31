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
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class PermissionRequestMutableBuilder[Self <: PermissionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefer(value: () => Unit): Self = StObject.set(x, "defer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setState(value: MSWebViewPermissionState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
