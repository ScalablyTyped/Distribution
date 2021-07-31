package typings.std.global

import typings.std.MSWebViewPermissionState
import typings.std.MSWebViewPermissionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("PermissionRequest")
@js.native
class PermissionRequest ()
  extends StObject
     with typings.std.PermissionRequest {
  
  /* CompleteClass */
  override def allow(): Unit = js.native
  
  /* CompleteClass */
  override def defer(): Unit = js.native
  
  /* CompleteClass */
  override def deny(): Unit = js.native
  
  /* CompleteClass */
  override val id: Double = js.native
  
  /* CompleteClass */
  override val state: MSWebViewPermissionState = js.native
  
  /* CompleteClass */
  override val `type`: MSWebViewPermissionType = js.native
  
  /* CompleteClass */
  override val uri: java.lang.String = js.native
}
