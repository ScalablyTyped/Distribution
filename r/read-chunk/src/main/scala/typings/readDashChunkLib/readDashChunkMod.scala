package typings
package readDashChunkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("read-chunk", JSImport.Namespace)
@js.native
object readDashChunkMod extends js.Object {
  /**
       * Asynchronous: Reads a chunk from a file. Returns a Promise<Buffer>.
       * @param {string} filePath The path to the file.
       * @param {number} startingPosition Position to start reading.
       * @param {number} length Number of bytes to read.
       * @return {Promise<Buffer>} Returns a Promise<Buffer>.
       */
  def apply(filePath: java.lang.String, startingPosition: scala.Double, length: scala.Double): js.Promise[nodeLib.Buffer] = js.native
  /**
       * Synchronous: Reads a chunk from a file. Returns a Buffer.
       * @param {string} filePath The path to the file.
       * @param {number} startingPosition Position to start reading.
       * @param {number} length Number of bytes to read.
       * @return {Buffer} Returns a Buffer.
       */
  def sync(filePath: java.lang.String, startingPosition: scala.Double, length: scala.Double): nodeLib.Buffer = js.native
}

