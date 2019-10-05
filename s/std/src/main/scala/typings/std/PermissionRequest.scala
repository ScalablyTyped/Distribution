package typings.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionRequest extends DeferredPermissionRequest {
  val state: MSWebViewPermissionState
  def defer(): Unit
}

@JSGlobal("PermissionRequest")
@js.native
object PermissionRequest extends Instantiable0[PermissionRequest]

