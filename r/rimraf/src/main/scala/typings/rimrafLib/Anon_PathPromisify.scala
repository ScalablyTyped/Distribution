package typings
package rimrafLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PathPromisify extends js.Object {
  /**
    * Asynchronous lstat(2) - Get file status. Does not dereference symbolic links.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def `__promisify__`(path: nodeLib.fsMod.PathLike): js.Promise[nodeLib.fsMod.Stats]
}

object Anon_PathPromisify {
  @scala.inline
  def apply(`__promisify__`: js.Function1[nodeLib.fsMod.PathLike, js.Promise[nodeLib.fsMod.Stats]]): Anon_PathPromisify = {
    val __obj = js.Dynamic.literal(`__promisify__` = `__promisify__`)
  
    __obj.asInstanceOf[Anon_PathPromisify]
  }
}

