package typings
package rimrafLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Promisify extends js.Object {
  /**
           * Asynchronous unlink(2) - delete a name and possibly the file it refers to.
           * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
           */
  def `__promisify__`(path: nodeLib.fsMod.PathLike): stdLib.Promise[scala.Unit]
}

