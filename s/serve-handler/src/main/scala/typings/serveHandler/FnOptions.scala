package typings.serveHandler

import typings.node.AnonAutoClose
import typings.node.fsMod.PathLike
import typings.node.fsMod.ReadStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnOptions extends js.Object {
  def apply(path: PathLike): ReadStream = js.native
  def apply(path: PathLike, options: String): ReadStream = js.native
  def apply(path: PathLike, options: AnonAutoClose): ReadStream = js.native
}

