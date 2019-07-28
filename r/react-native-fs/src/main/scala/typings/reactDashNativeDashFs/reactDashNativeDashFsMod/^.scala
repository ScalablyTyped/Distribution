package typings.reactDashNativeDashFs.reactDashNativeDashFsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-fs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val CachesDirectoryPath: String = js.native
  val DocumentDirectoryPath: String = js.native
  val ExternalDirectoryPath: String = js.native
  val ExternalStorageDirectoryPath: String = js.native
  val LibraryDirectoryPath: String = js.native
  val MainBundlePath: String = js.native
  val PicturesDirectoryPath: String = js.native
  val TemporaryDirectoryPath: String = js.native
  def appendFile(filepath: String, contents: String): js.Promise[Unit] = js.native
  def appendFile(filepath: String, contents: String, encodingOrOptions: EncodingOrOptions): js.Promise[Unit] = js.native
  def copyAssetsFileIOS(imageUri: String, destPath: String, width: Double, height: Double): js.Promise[String] = js.native
  def copyAssetsFileIOS(imageUri: String, destPath: String, width: Double, height: Double, scale: Double): js.Promise[String] = js.native
  def copyAssetsFileIOS(
    imageUri: String,
    destPath: String,
    width: Double,
    height: Double,
    scale: Double,
    compression: Double
  ): js.Promise[String] = js.native
  def copyAssetsFileIOS(
    imageUri: String,
    destPath: String,
    width: Double,
    height: Double,
    scale: Double,
    compression: Double,
    resizeMode: String
  ): js.Promise[String] = js.native
  def copyAssetsVideoIOS(imageUri: String, destPath: String): js.Promise[String] = js.native
  def copyFile(filepath: String, destPath: String): js.Promise[Unit] = js.native
  def copyFileAssets(filepath: String, destPath: String): js.Promise[Unit] = js.native
  def downloadFile(options: DownloadFileOptions): JobReturnValue[DownloadResult] = js.native
  def exists(filepath: String): js.Promise[Boolean] = js.native
  def existsAssets(filepath: String): js.Promise[Boolean] = js.native
  def getFSInfo(): js.Promise[FSInfoResult] = js.native
  def hash(filepath: String, algorithm: HashAlgorithm): js.Promise[String] = js.native
  def mkdir(filepath: String): js.Promise[Unit] = js.native
  def mkdir(filepath: String, options: MkdirOptions): js.Promise[Unit] = js.native
  def moveFile(filepath: String, destPath: String): js.Promise[Unit] = js.native
  def pathForBundle(bundleNamed: String): js.Promise[String] = js.native
  def pathForGroup(groupName: String): js.Promise[String] = js.native
  def read(filepath: String): js.Promise[String] = js.native
  def read(filepath: String, length: Double): js.Promise[String] = js.native
  def read(filepath: String, length: Double, position: Double): js.Promise[String] = js.native
  def read(filepath: String, length: Double, position: Double, encodingOrOptions: EncodingOrOptions): js.Promise[String] = js.native
  def readDir(path: String): js.Promise[js.Array[ReadDirItem]] = js.native
  def readDirAssets(dirpath: String): js.Promise[js.Array[ReadDirItem]] = js.native
  def readFile(filepath: String): js.Promise[String] = js.native
  def readFile(filepath: String, encodingOrOptions: EncodingOrOptions): js.Promise[String] = js.native
  def readFileAssets(filepath: String): js.Promise[String] = js.native
  def readFileAssets(filepath: String, encodingOrOptions: EncodingOrOptions): js.Promise[String] = js.native
  def readdir(path: String): js.Promise[js.Array[String]] = js.native
  def setReadable(filepath: String, readable: Boolean, ownerOnly: Boolean): js.Promise[Boolean] = js.native
  def stat(filepath: String): js.Promise[StatResult] = js.native
  def stopDownload(jobId: Double): Unit = js.native
  def stopUpload(jobId: Double): Unit = js.native
  def touch(filepath: String): js.Promise[Unit] = js.native
  def touch(filepath: String, mtime: Date): js.Promise[Unit] = js.native
  def touch(filepath: String, mtime: Date, ctime: Date): js.Promise[Unit] = js.native
  def unlink(filepath: String): js.Promise[Unit] = js.native
  def uploadFiles(options: UploadFileOptions): JobReturnValue[UploadResult] = js.native
  def write(filepath: String, contents: String): js.Promise[Unit] = js.native
  def write(filepath: String, contents: String, position: Double): js.Promise[Unit] = js.native
  def write(filepath: String, contents: String, position: Double, encodingOrOptions: EncodingOrOptions): js.Promise[Unit] = js.native
  def writeFile(filepath: String, contents: String): js.Promise[Unit] = js.native
  def writeFile(filepath: String, contents: String, encodingOrOptions: EncodingOrOptions): js.Promise[Unit] = js.native
}

