package typings.promiseDashFs.promiseDashFsMod

import typings.node.Anon_EncodingFlagString
import typings.node.Buffer
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-fs", "readFileSync")
@js.native
object readFileSync extends js.Object {
  def apply(path: Double): Buffer = js.native
  def apply(path: Double, options: String): String | Buffer = js.native
  def apply(path: Double, options: typings.node.Anon_EncodingFlag): Buffer = js.native
  def apply(path: Double, options: typings.node.Anon_EncodingFlagNull): String | Buffer = js.native
  def apply(path: Double, options: Anon_EncodingFlagString): String = js.native
  /**
    * Synchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param options An object that may contain an optional flag. If a flag is not provided, it defaults to `'r'`.
    */
  def apply(path: PathLike): Buffer = js.native
  def apply(path: PathLike, options: String): String | Buffer = js.native
  def apply(path: PathLike, options: typings.node.Anon_EncodingFlag): Buffer = js.native
  def apply(path: PathLike, options: typings.node.Anon_EncodingFlagNull): String | Buffer = js.native
  /**
    * Synchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a file descriptor is provided, the underlying file will _not_ be closed automatically.
    * @param options Either the encoding for the result, or an object that contains the encoding and an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  def apply(path: PathLike, options: Anon_EncodingFlagString): String = js.native
}

