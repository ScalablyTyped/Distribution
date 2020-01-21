package typings.raven.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("raven", "install")
@js.native
object install extends js.Object {
  def apply(): Client = js.native
  def apply(cb: FatalErrorCallback): Client = js.native
}

