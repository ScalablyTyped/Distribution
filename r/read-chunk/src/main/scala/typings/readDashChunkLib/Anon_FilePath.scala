package typings
package readDashChunkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_FilePath extends js.Object {
  def apply(filePath: java.lang.String, startPosition: scala.Double, length: scala.Double): js.Promise[nodeLib.Buffer] = js.native
  /**
  	 * Read a chunk from a file synchronously.
  	 *
  	 * @param filePath - The path to the file.
  	 * @param startPosition - Position to start reading.
  	 * @param length - Number of bytes to read.
  	 * @returns The read chunk.
  	 */
  def sync(filePath: java.lang.String, startPosition: scala.Double, length: scala.Double): nodeLib.Buffer = js.native
}

