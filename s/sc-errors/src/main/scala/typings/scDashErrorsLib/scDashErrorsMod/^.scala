package typings
package scDashErrorsLib.scDashErrorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sc-errors", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val socketProtocolErrorStatuses: SocketProtocolErrorStatuses = js.native
  val socketProtocolIgnoreStatuses: SocketProtocolIgnoreStatuses = js.native
  def decycle(`object`: js.Any): js.Any = js.native
  def dehydrateError(error: js.Any): DehydratedError = js.native
  def dehydrateError(error: js.Any, includeStackTrace: scala.Boolean): DehydratedError = js.native
  def hydrateError(error: DehydratedError): js.Any = js.native
}

