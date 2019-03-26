package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeferredPermissionRequest extends js.Object {
  val id: scala.Double
  val `type`: MSWebViewPermissionType
  val uri: java.lang.String
  def allow(): scala.Unit
  def deny(): scala.Unit
}

@JSGlobal("DeferredPermissionRequest")
@js.native
class DeferredPermissionRequestCls () extends DeferredPermissionRequest {
  /* CompleteClass */
  override val id: scala.Double = js.native
  /* CompleteClass */
  override val `type`: MSWebViewPermissionType = js.native
  /* CompleteClass */
  override val uri: java.lang.String = js.native
  /* CompleteClass */
  override def allow(): scala.Unit = js.native
  /* CompleteClass */
  override def deny(): scala.Unit = js.native
}

@JSGlobal("DeferredPermissionRequest")
@js.native
object DeferredPermissionRequest
  extends org.scalablytyped.runtime.Instantiable0[DeferredPermissionRequest]

