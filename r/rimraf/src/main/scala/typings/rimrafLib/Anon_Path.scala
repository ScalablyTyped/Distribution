package typings
package rimrafLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Path extends js.Object {
  /**
    * Asynchronous rmdir(2) - delete a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def `__promisify__`(path: nodeLib.fsMod.PathLike): js.Promise[scala.Unit]
}

object Anon_Path {
  @scala.inline
  def apply(`__promisify__`: js.Function1[nodeLib.fsMod.PathLike, js.Promise[scala.Unit]]): Anon_Path = {
    val __obj = js.Dynamic.literal(`__promisify__` = `__promisify__`)
  
    __obj.asInstanceOf[Anon_Path]
  }
}

