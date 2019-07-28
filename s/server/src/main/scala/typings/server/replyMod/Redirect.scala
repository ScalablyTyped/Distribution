package typings.server.replyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Redirect extends js.Object {
  def apply(path: String): Reply = js.native
  def apply(status: Double, path: String): Reply = js.native
}

