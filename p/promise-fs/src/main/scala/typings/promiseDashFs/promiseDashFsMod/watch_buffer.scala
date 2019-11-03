package typings.promiseDashFs.promiseDashFsMod

import typings.node.Buffer
import typings.node.fsMod.FSWatcher
import typings.node.fsMod.PathLike
import typings.promiseDashFs.promiseDashFsStrings.buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-fs", "watch")
@js.native
object watch_buffer extends js.Object {
  def apply(filename: PathLike, options: buffer): FSWatcher = js.native
  def apply(
    filename: PathLike,
    options: buffer,
    listener: js.Function2[/* event */ String, /* filename */ Buffer, Unit]
  ): FSWatcher = js.native
}

