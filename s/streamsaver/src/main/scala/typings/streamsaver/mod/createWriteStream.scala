package typings.streamsaver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("streamsaver", "createWriteStream")
@js.native
object createWriteStream extends js.Object {
  def apply(filename: String): typings.std.WritableStream[_] = js.native
  def apply(filename: String, options: CreateWriteStreamOptions[_, _]): typings.std.WritableStream[_] = js.native
}

