package typings.rimraf

import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnMode extends js.Object {
  def apply(path: PathLike, mode: String): Unit = js.native
  def apply(path: PathLike, mode: Double): Unit = js.native
}

