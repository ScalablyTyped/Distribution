package typings.serveDashHandler

import typings.node.Anon_AutoClose
import typings.node.fsMod.PathLike
import typings.node.fsMod.ReadStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Options extends js.Object {
  def apply(path: PathLike): ReadStream = js.native
  def apply(path: PathLike, options: String): ReadStream = js.native
  def apply(path: PathLike, options: Anon_AutoClose): ReadStream = js.native
}

