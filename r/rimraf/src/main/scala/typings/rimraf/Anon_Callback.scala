package typings.rimraf

import typings.node.NodeJSNs.ErrnoException
import typings.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Callback extends js.Object {
  def apply(path: PathLike, mode: String, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  def apply(path: PathLike, mode: Double, callback: js.Function1[/* err */ ErrnoException | Null, Unit]): Unit = js.native
  /**
    * Asynchronous chmod(2) - Change permissions of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  def __promisify__(path: PathLike, mode: String): js.Promise[Unit] = js.native
  def __promisify__(path: PathLike, mode: Double): js.Promise[Unit] = js.native
}

