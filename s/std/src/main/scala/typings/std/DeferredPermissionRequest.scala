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
object DeferredPermissionRequest extends Instantiable0[DeferredPermissionRequest]

