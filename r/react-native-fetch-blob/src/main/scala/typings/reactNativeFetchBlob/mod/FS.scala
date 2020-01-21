package typings.reactNativeFetchBlob.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeFetchBlob.AnonFree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FS extends js.Object {
  var RNFetchBlobSession: typings.reactNativeFetchBlob.mod.RNFetchBlobSession = js.native
  var dirs: Dirs = js.native
  def appendFile(path: String, data: String): js.Promise[Unit] = js.native
  def appendFile(path: String, data: String, encoding: Encoding): js.Promise[Unit] = js.native
  def appendFile(path: String, data: js.Array[Double]): js.Promise[Unit] = js.native
  def appendFile(path: String, data: js.Array[Double], encoding: Encoding): js.Promise[Unit] = js.native
  def asset(path: String): String = js.native
  def cp(path: String, dest: String): js.Promise[Boolean] = js.native
  def createFile(path: String, data: String, encoding: Encoding): js.Promise[Unit] = js.native
  def df(): js.Promise[AnonFree] = js.native
  /**
    * Check if file exists and if it is a folder.
    * @param  path Path to check
    */
  def exists(path: String): js.Promise[Boolean] = js.native
  def isDir(path: String): js.Promise[Boolean] = js.native
  def ls(path: String): js.Promise[js.Array[String]] = js.native
  def lstat(path: String): js.Promise[js.Array[RNFetchBlobStat]] = js.native
  /**
    * Create a directory.
    * @param  path Path of directory to be created
    */
  def mkdir(path: String): js.Promise[Unit] = js.native
  def mv(path: String, dest: String): js.Promise[Boolean] = js.native
  /**
    * Wrapper method of readStream.
    * @param  path Path of the file.
    * @param  encoding Encoding of read stream.
    */
  def readFile(path: String, encoding: Encoding): js.Promise[_] = js.native
  def readFile(path: String, encoding: Encoding, bufferSize: Double): js.Promise[_] = js.native
  /**
    * Create file stream from file at `path`.
    * @param  path   The file path.
    * @param  encoding Data encoding, should be one of `base64`, `utf8`, `ascii`
    * @param  bufferSize Size of stream buffer.
    * @return RNFetchBlobStream stream instance.
    */
  def readStream(path: String, encoding: Encoding): js.Promise[RNFetchBlobReadStream] = js.native
  def readStream(path: String, encoding: Encoding, bufferSize: Double): js.Promise[RNFetchBlobReadStream] = js.native
  def readStream(path: String, encoding: Encoding, bufferSize: Double, tick: Double): js.Promise[RNFetchBlobReadStream] = js.native
  /**
    * Android only method, request media scanner to scan the file.
    * @param  pairs Array contains Key value pairs with key `path` and `mime`.
    */
  def scanFile(pairs: js.Array[StringDictionary[String]]): js.Promise[Unit] = js.native
  /**
    * Get a file cache session
    * @param  name Stream ID
    */
  def session(name: String): RNFetchBlobSession = js.native
  def slice(src: String, dest: String, start: Double, end: Double): js.Promise[Unit] = js.native
  /**
    * Show statistic data of a path.
    * @param  path Target path
    */
  def stat(path: String): js.Promise[RNFetchBlobStat] = js.native
  /**
    * Remove file at path.
    * @param    path:string Path of target file.
    */
  def unlink(path: String): js.Promise[Unit] = js.native
  /**
    * Write data to file.
    * @param  path  Path of the file.
    * @param  data Data to write to the file.
    * @param  encoding Encoding of data (Optional).
    */
  def writeFile(path: String, data: String): js.Promise[Unit] = js.native
  def writeFile(path: String, data: String, encoding: Encoding): js.Promise[Unit] = js.native
  def writeFile(path: String, data: js.Array[Double]): js.Promise[Unit] = js.native
  def writeFile(path: String, data: js.Array[Double], encoding: Encoding): js.Promise[Unit] = js.native
  /**
    * Create write stream to a file.
    * @param  path Target path of file stream.
    * @param  encoding Encoding of input data.
    * @param  append  A flag represent if data append to existing ones.
    * @return A promise resolves a `WriteStream` object.
    */
  def writeStream(path: String, encoding: Encoding): js.Promise[RNFetchBlobWriteStream] = js.native
  def writeStream(path: String, encoding: Encoding, append: Boolean): js.Promise[RNFetchBlobWriteStream] = js.native
}

