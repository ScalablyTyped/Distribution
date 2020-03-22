package typings.rimraf

import typings.node.fsMod.PathLike
import typings.node.fsMod.RmDirOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallPathOptions extends js.Object {
  def apply(path: PathLike): Unit = js.native
  def apply(path: PathLike, options: RmDirOptions): Unit = js.native
}

