package typings
package reactDashNativeDashFsLib.reactDashNativeDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-fs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val CachesDirectoryPath: java.lang.String = js.native
  val DocumentDirectoryPath: java.lang.String = js.native
  val ExternalDirectoryPath: java.lang.String = js.native
  val ExternalStorageDirectoryPath: java.lang.String = js.native
  val LibraryDirectoryPath: java.lang.String = js.native
  val MainBundlePath: java.lang.String = js.native
  val PicturesDirectoryPath: java.lang.String = js.native
  val TemporaryDirectoryPath: java.lang.String = js.native
  def appendFile(filepath: java.lang.String, contents: java.lang.String): js.Promise[scala.Unit] = js.native
  def appendFile(
    filepath: java.lang.String,
    contents: java.lang.String,
    encodingOrOptions: reactDashNativeDashFsLib.reactDashNativeDashFsMod.EncodingOrOptions
  ): js.Promise[scala.Unit] = js.native
  def copyAssetsFileIOS(imageUri: java.lang.String, destPath: java.lang.String, width: scala.Double, height: scala.Double): js.Promise[java.lang.String] = js.native
  def copyAssetsFileIOS(
    imageUri: java.lang.String,
    destPath: java.lang.String,
    width: scala.Double,
    height: scala.Double,
    scale: scala.Double
  ): js.Promise[java.lang.String] = js.native
  def copyAssetsFileIOS(
    imageUri: java.lang.String,
    destPath: java.lang.String,
    width: scala.Double,
    height: scala.Double,
    scale: scala.Double,
    compression: scala.Double
  ): js.Promise[java.lang.String] = js.native
  def copyAssetsFileIOS(
    imageUri: java.lang.String,
    destPath: java.lang.String,
    width: scala.Double,
    height: scala.Double,
    scale: scala.Double,
    compression: scala.Double,
    resizeMode: java.lang.String
  ): js.Promise[java.lang.String] = js.native
  def copyAssetsVideoIOS(imageUri: java.lang.String, destPath: java.lang.String): js.Promise[java.lang.String] = js.native
  def copyFile(filepath: java.lang.String, destPath: java.lang.String): js.Promise[scala.Unit] = js.native
  def copyFileAssets(filepath: java.lang.String, destPath: java.lang.String): js.Promise[scala.Unit] = js.native
  def downloadFile(options: reactDashNativeDashFsLib.reactDashNativeDashFsMod.DownloadFileOptions): reactDashNativeDashFsLib.reactDashNativeDashFsMod.JobReturnValue[reactDashNativeDashFsLib.reactDashNativeDashFsMod.DownloadResult] = js.native
  def exists(filepath: java.lang.String): js.Promise[scala.Boolean] = js.native
  def existsAssets(filepath: java.lang.String): js.Promise[scala.Boolean] = js.native
  def getFSInfo(): js.Promise[reactDashNativeDashFsLib.reactDashNativeDashFsMod.FSInfoResult] = js.native
  def hash(
    filepath: java.lang.String,
    algorithm: reactDashNativeDashFsLib.reactDashNativeDashFsMod.HashAlgorithm
  ): js.Promise[java.lang.String] = js.native
  def mkdir(filepath: java.lang.String): js.Promise[scala.Unit] = js.native
  def mkdir(
    filepath: java.lang.String,
    options: reactDashNativeDashFsLib.reactDashNativeDashFsMod.MkdirOptions
  ): js.Promise[scala.Unit] = js.native
  def moveFile(filepath: java.lang.String, destPath: java.lang.String): js.Promise[scala.Unit] = js.native
  def pathForBundle(bundleNamed: java.lang.String): js.Promise[java.lang.String] = js.native
  def pathForGroup(groupName: java.lang.String): js.Promise[java.lang.String] = js.native
  def read(filepath: java.lang.String): js.Promise[java.lang.String] = js.native
  def read(filepath: java.lang.String, length: scala.Double): js.Promise[java.lang.String] = js.native
  def read(filepath: java.lang.String, length: scala.Double, position: scala.Double): js.Promise[java.lang.String] = js.native
  def read(
    filepath: java.lang.String,
    length: scala.Double,
    position: scala.Double,
    encodingOrOptions: reactDashNativeDashFsLib.reactDashNativeDashFsMod.EncodingOrOptions
  ): js.Promise[java.lang.String] = js.native
  def readDir(path: java.lang.String): js.Promise[js.Array[reactDashNativeDashFsLib.reactDashNativeDashFsMod.ReadDirItem]] = js.native
  def readDirAssets(dirpath: java.lang.String): js.Promise[js.Array[reactDashNativeDashFsLib.reactDashNativeDashFsMod.ReadDirItem]] = js.native
  def readFile(filepath: java.lang.String): js.Promise[java.lang.String] = js.native
  def readFile(
    filepath: java.lang.String,
    encodingOrOptions: reactDashNativeDashFsLib.reactDashNativeDashFsMod.EncodingOrOptions
  ): js.Promise[java.lang.String] = js.native
  def readFileAssets(filepath: java.lang.String): js.Promise[java.lang.String] = js.native
  def readFileAssets(
    filepath: java.lang.String,
    encodingOrOptions: reactDashNativeDashFsLib.reactDashNativeDashFsMod.EncodingOrOptions
  ): js.Promise[java.lang.String] = js.native
  def readdir(path: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def setReadable(filepath: java.lang.String, readable: scala.Boolean, ownerOnly: scala.Boolean): js.Promise[scala.Boolean] = js.native
  def stat(filepath: java.lang.String): js.Promise[reactDashNativeDashFsLib.reactDashNativeDashFsMod.StatResult] = js.native
  def stopDownload(jobId: scala.Double): scala.Unit = js.native
  def stopUpload(jobId: scala.Double): scala.Unit = js.native
  def touch(filepath: java.lang.String): js.Promise[scala.Unit] = js.native
  def touch(filepath: java.lang.String, mtime: stdLib.Date): js.Promise[scala.Unit] = js.native
  def touch(filepath: java.lang.String, mtime: stdLib.Date, ctime: stdLib.Date): js.Promise[scala.Unit] = js.native
  def unlink(filepath: java.lang.String): js.Promise[scala.Unit] = js.native
  def uploadFiles(options: reactDashNativeDashFsLib.reactDashNativeDashFsMod.UploadFileOptions): reactDashNativeDashFsLib.reactDashNativeDashFsMod.JobReturnValue[reactDashNativeDashFsLib.reactDashNativeDashFsMod.UploadResult] = js.native
  def write(filepath: java.lang.String, contents: java.lang.String): js.Promise[scala.Unit] = js.native
  def write(filepath: java.lang.String, contents: java.lang.String, position: scala.Double): js.Promise[scala.Unit] = js.native
  def write(
    filepath: java.lang.String,
    contents: java.lang.String,
    position: scala.Double,
    encodingOrOptions: reactDashNativeDashFsLib.reactDashNativeDashFsMod.EncodingOrOptions
  ): js.Promise[scala.Unit] = js.native
  def writeFile(filepath: java.lang.String, contents: java.lang.String): js.Promise[scala.Unit] = js.native
  def writeFile(
    filepath: java.lang.String,
    contents: java.lang.String,
    encodingOrOptions: reactDashNativeDashFsLib.reactDashNativeDashFsMod.EncodingOrOptions
  ): js.Promise[scala.Unit] = js.native
}

