package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionRequest extends DeferredPermissionRequest {
  val state: MSWebViewPermissionState
  def defer(): scala.Unit
}

@JSGlobal("PermissionRequest")
@js.native
class PermissionRequestCls () extends PermissionRequest {
  /* CompleteClass */
  override val id: scala.Double = js.native
  /* CompleteClass */
  override val state: MSWebViewPermissionState = js.native
  /* CompleteClass */
  override val `type`: MSWebViewPermissionType = js.native
  /* CompleteClass */
  override val uri: java.lang.String = js.native
  /* CompleteClass */
  override def allow(): scala.Unit = js.native
  /* CompleteClass */
  override def defer(): scala.Unit = js.native
  /* CompleteClass */
  override def deny(): scala.Unit = js.native
}

@JSGlobal("PermissionRequest")
@js.native
object PermissionRequest
  extends org.scalablytyped.runtime.Instantiable0[PermissionRequest]

