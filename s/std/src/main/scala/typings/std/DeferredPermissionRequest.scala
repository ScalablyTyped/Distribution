package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeferredPermissionRequest extends js.Object {
  val id: Double
  val `type`: MSWebViewPermissionType
  val uri: java.lang.String
  def allow(): Unit
  def deny(): Unit
}

@JSGlobal("DeferredPermissionRequest")
@js.native
class DeferredPermissionRequestCls () extends DeferredPermissionRequest {
  /* CompleteClass */
  override val id: Double = js.native
  /* CompleteClass */
  override val `type`: MSWebViewPermissionType = js.native
  /* CompleteClass */
  override val uri: java.lang.String = js.native
  /* CompleteClass */
  override def allow(): Unit = js.native
  /* CompleteClass */
  override def deny(): Unit = js.native
}

@JSGlobal("DeferredPermissionRequest")
@js.native
object DeferredPermissionRequest extends Instantiable0[DeferredPermissionRequest]

