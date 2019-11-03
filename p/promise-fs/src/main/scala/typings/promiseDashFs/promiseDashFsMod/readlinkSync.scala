package typings.promiseDashFs.promiseDashFsMod

import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-fs", "readlinkSync")
@js.native
object readlinkSync extends js.Object {
  /**
    * Synchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(path: PathLike): String | Buffer = js.native
  def apply(path: PathLike, options: String): String | Buffer = js.native
  /**
    * Synchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(path: PathLike, options: typings.node.Anon_BufferEncoding): Buffer = js.native
  def apply(path: PathLike, options: typings.node.Anon_EncodingBufferEncoding): String = js.native
  def apply(path: PathLike, options: typings.node.Anon_EncodingNull): String | Buffer = js.native
  def apply(path: PathLike, options: BufferEncoding): String = js.native
}

