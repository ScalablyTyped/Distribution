package typings.spdy.mod.server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerResponse
  extends typings.node.httpMod.ServerResponse {
  def push(filename: String, options: PushOptions): js.Any = js.native
}

