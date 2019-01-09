package typings
package reactDashNativeDashFetchDashBlobLib.reactDashNativeDashFetchDashBlobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FS extends js.Object {
  var RNFetchBlobSession: RNFetchBlobSession = js.native
  var dirs: Dirs = js.native
  def appendFile(path: java.lang.String, data: java.lang.String): js.Promise[scala.Unit] = js.native
  def appendFile(
    path: java.lang.String,
    data: java.lang.String,
    encoding: reactDashNativeDashFetchDashBlobLib.Encoding
  ): js.Promise[scala.Unit] = js.native
  def appendFile(path: java.lang.String, data: js.Array[scala.Double]): js.Promise[scala.Unit] = js.native
  def appendFile(
    path: java.lang.String,
    data: js.Array[scala.Double],
    encoding: reactDashNativeDashFetchDashBlobLib.Encoding
  ): js.Promise[scala.Unit] = js.native
  def asset(path: java.lang.String): java.lang.String = js.native
  def cp(path: java.lang.String, dest: java.lang.String): js.Promise[scala.Boolean] = js.native
  def createFile(
    path: java.lang.String,
    data: java.lang.String,
    encoding: reactDashNativeDashFetchDashBlobLib.Encoding
  ): js.Promise[scala.Unit] = js.native
  def df(): js.Promise[reactDashNativeDashFetchDashBlobLib.Anon_Free] = js.native
  /**
    * Check if file exists and if it is a folder.
    * @param  path Path to check
    */
  def exists(path: java.lang.String): js.Promise[scala.Boolean] = js.native
  def isDir(path: java.lang.String): js.Promise[scala.Boolean] = js.native
  def ls(path: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def lstat(path: java.lang.String): js.Promise[js.Array[RNFetchBlobStat]] = js.native
  /**
    * Create a directory.
    * @param  path Path of directory to be created
    */
  def mkdir(path: java.lang.String): js.Promise[scala.Unit] = js.native
  def mv(path: java.lang.String, dest: java.lang.String): js.Promise[scala.Boolean] = js.native
  /**
    * Wrapper method of readStream.
    * @param  path Path of the file.
    * @param  encoding Encoding of read stream.
    */
  def readFile(path: java.lang.String, encoding: reactDashNativeDashFetchDashBlobLib.Encoding): js.Promise[_] = js.native
  def readFile(
    path: java.lang.String,
    encoding: reactDashNativeDashFetchDashBlobLib.Encoding,
    bufferSize: scala.Double
  ): js.Promise[_] = js.native
  /**
    * Create file stream from file at `path`.
    * @param  path   The file path.
    * @param  encoding Data encoding, should be one of `base64`, `utf8`, `ascii`
    * @param  bufferSize Size of stream buffer.
    * @return RNFetchBlobStream stream instance.
    */
  def readStream(path: java.lang.String, encoding: reactDashNativeDashFetchDashBlobLib.Encoding): js.Promise[RNFetchBlobReadStream] = js.native
  def readStream(
    path: java.lang.String,
    encoding: reactDashNativeDashFetchDashBlobLib.Encoding,
    bufferSize: scala.Double
  ): js.Promise[RNFetchBlobReadStream] = js.native
  def readStream(
    path: java.lang.String,
    encoding: reactDashNativeDashFetchDashBlobLib.Encoding,
    bufferSize: scala.Double,
    tick: scala.Double
  ): js.Promise[RNFetchBlobReadStream] = js.native
  /**
    * Android only method, request media scanner to scan the file.
    * @param  pairs Array contains Key value pairs with key `path` and `mime`.
    */
  def scanFile(pairs: js.Array[org.scalablytyped.runtime.StringDictionary[java.lang.String]]): js.Promise[scala.Unit] = js.native
  /**
    * Get a file cache session
    * @param  name Stream ID
    */
  def session(name: java.lang.String): RNFetchBlobSession = js.native
  def slice(src: java.lang.String, dest: java.lang.String, start: scala.Double, end: scala.Double): js.Promise[scala.Unit] = js.native
  /**
    * Show statistic data of a path.
    * @param  path Target path
    */
  def stat(path: java.lang.String): js.Promise[RNFetchBlobStat] = js.native
  /**
    * Remove file at path.
    * @param    path:string Path of target file.
    */
  def unlink(path: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Write data to file.
    * @param  path  Path of the file.
    * @param  data Data to write to the file.
    * @param  encoding Encoding of data (Optional).
    */
  def writeFile(path: java.lang.String, data: java.lang.String): js.Promise[scala.Unit] = js.native
  def writeFile(
    path: java.lang.String,
    data: java.lang.String,
    encoding: reactDashNativeDashFetchDashBlobLib.Encoding
  ): js.Promise[scala.Unit] = js.native
  def writeFile(path: java.lang.String, data: js.Array[scala.Double]): js.Promise[scala.Unit] = js.native
  def writeFile(
    path: java.lang.String,
    data: js.Array[scala.Double],
    encoding: reactDashNativeDashFetchDashBlobLib.Encoding
  ): js.Promise[scala.Unit] = js.native
  /**
    * Create write stream to a file.
    * @param  path Target path of file stream.
    * @param  encoding Encoding of input data.
    * @param  append  A flag represent if data append to existing ones.
    * @return A promise resolves a `WriteStream` object.
    */
  def writeStream(path: java.lang.String, encoding: reactDashNativeDashFetchDashBlobLib.Encoding): js.Promise[RNFetchBlobWriteStream] = js.native
  def writeStream(
    path: java.lang.String,
    encoding: reactDashNativeDashFetchDashBlobLib.Encoding,
    append: scala.Boolean
  ): js.Promise[RNFetchBlobWriteStream] = js.native
}

