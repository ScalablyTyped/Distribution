package typings.reactNativeFs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeFs.anon.JobId
import typings.reactNativeFs.anon.Promise
import typings.reactNativeFs.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def CachesDirectoryPath: String = ^.asInstanceOf[js.Dynamic].selectDynamic("CachesDirectoryPath").asInstanceOf[String]

inline def DocumentDirectoryPath: String = ^.asInstanceOf[js.Dynamic].selectDynamic("DocumentDirectoryPath").asInstanceOf[String]

inline def DownloadDirectoryPath: String = ^.asInstanceOf[js.Dynamic].selectDynamic("DownloadDirectoryPath").asInstanceOf[String]

inline def ExternalCachesDirectoryPath: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ExternalCachesDirectoryPath").asInstanceOf[String]

inline def ExternalDirectoryPath: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ExternalDirectoryPath").asInstanceOf[String]

inline def ExternalStorageDirectoryPath: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ExternalStorageDirectoryPath").asInstanceOf[String]

inline def FileProtectionKeys: String = ^.asInstanceOf[js.Dynamic].selectDynamic("FileProtectionKeys").asInstanceOf[String]

inline def LibraryDirectoryPath: String = ^.asInstanceOf[js.Dynamic].selectDynamic("LibraryDirectoryPath").asInstanceOf[String]

inline def MainBundlePath: String = ^.asInstanceOf[js.Dynamic].selectDynamic("MainBundlePath").asInstanceOf[String]

inline def PicturesDirectoryPath: String = ^.asInstanceOf[js.Dynamic].selectDynamic("PicturesDirectoryPath").asInstanceOf[String]

inline def TemporaryDirectoryPath: String = ^.asInstanceOf[js.Dynamic].selectDynamic("TemporaryDirectoryPath").asInstanceOf[String]

inline def appendFile(filepath: String, contents: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(filepath.asInstanceOf[js.Any], contents.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def appendFile(filepath: String, contents: String, encodingOrOptions: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(filepath.asInstanceOf[js.Any], contents.asInstanceOf[js.Any], encodingOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def completeHandlerIOS(jobId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("completeHandlerIOS")(jobId.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def copyAssetsFileIOS(imageUri: String, destPath: String, width: Double, height: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyAssetsFileIOS")(imageUri.asInstanceOf[js.Any], destPath.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
inline def copyAssetsFileIOS(imageUri: String, destPath: String, width: Double, height: Double, scale: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyAssetsFileIOS")(imageUri.asInstanceOf[js.Any], destPath.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
inline def copyAssetsFileIOS(
  imageUri: String,
  destPath: String,
  width: Double,
  height: Double,
  scale: Double,
  compression: Double
): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyAssetsFileIOS")(imageUri.asInstanceOf[js.Any], destPath.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], compression.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
inline def copyAssetsFileIOS(
  imageUri: String,
  destPath: String,
  width: Double,
  height: Double,
  scale: Double,
  compression: Double,
  resizeMode: String
): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyAssetsFileIOS")(imageUri.asInstanceOf[js.Any], destPath.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], compression.asInstanceOf[js.Any], resizeMode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
inline def copyAssetsFileIOS(
  imageUri: String,
  destPath: String,
  width: Double,
  height: Double,
  scale: Double,
  compression: Unit,
  resizeMode: String
): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyAssetsFileIOS")(imageUri.asInstanceOf[js.Any], destPath.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], compression.asInstanceOf[js.Any], resizeMode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
inline def copyAssetsFileIOS(
  imageUri: String,
  destPath: String,
  width: Double,
  height: Double,
  scale: Unit,
  compression: Double
): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyAssetsFileIOS")(imageUri.asInstanceOf[js.Any], destPath.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], compression.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
inline def copyAssetsFileIOS(
  imageUri: String,
  destPath: String,
  width: Double,
  height: Double,
  scale: Unit,
  compression: Double,
  resizeMode: String
): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyAssetsFileIOS")(imageUri.asInstanceOf[js.Any], destPath.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], compression.asInstanceOf[js.Any], resizeMode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
inline def copyAssetsFileIOS(
  imageUri: String,
  destPath: String,
  width: Double,
  height: Double,
  scale: Unit,
  compression: Unit,
  resizeMode: String
): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyAssetsFileIOS")(imageUri.asInstanceOf[js.Any], destPath.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], compression.asInstanceOf[js.Any], resizeMode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]

inline def copyAssetsVideoIOS(imageUri: String, destPath: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyAssetsVideoIOS")(imageUri.asInstanceOf[js.Any], destPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]

inline def copyFile(filepath: String, destPath: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(filepath.asInstanceOf[js.Any], destPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def copyFile(filepath: String, destPath: String, options: FileOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(filepath.asInstanceOf[js.Any], destPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def copyFileAssets(filepath: String, destPath: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFileAssets")(filepath.asInstanceOf[js.Any], destPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def copyFileRes(filepath: String, destPath: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFileRes")(filepath.asInstanceOf[js.Any], destPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def downloadFile(options: DownloadFileOptions): JobId = ^.asInstanceOf[js.Dynamic].applyDynamic("downloadFile")(options.asInstanceOf[js.Any]).asInstanceOf[JobId]

inline def exists(filepath: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("exists")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]

inline def existsAssets(filepath: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("existsAssets")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]

inline def existsRes(filepath: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("existsRes")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]

inline def getAllExternalFilesDirs(): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllExternalFilesDirs")().asInstanceOf[js.Promise[js.Array[String]]]

inline def getFSInfo(): js.Promise[FSInfoResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFSInfo")().asInstanceOf[js.Promise[FSInfoResult]]

inline def hash(filepath: String, algorithm: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("hash")(filepath.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]

inline def isResumable(jobId: Double): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isResumable")(jobId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]

inline def mkdir(filepath: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def mkdir(filepath: String, options: MkdirOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(filepath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def moveFile(filepath: String, destPath: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("moveFile")(filepath.asInstanceOf[js.Any], destPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def moveFile(filepath: String, destPath: String, options: FileOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("moveFile")(filepath.asInstanceOf[js.Any], destPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def pathForBundle(bundleNamed: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("pathForBundle")(bundleNamed.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]

inline def pathForGroup(groupName: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("pathForGroup")(groupName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]

inline def read(filepath: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
inline def read(filepath: String, length: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(filepath.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
inline def read(filepath: String, length: Double, position: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(filepath.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
inline def read(filepath: String, length: Double, position: Double, encodingOrOptions: Any): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(filepath.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encodingOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
inline def read(filepath: String, length: Double, position: Unit, encodingOrOptions: Any): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(filepath.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encodingOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
inline def read(filepath: String, length: Unit, position: Double): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(filepath.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
inline def read(filepath: String, length: Unit, position: Double, encodingOrOptions: Any): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(filepath.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encodingOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
inline def read(filepath: String, length: Unit, position: Unit, encodingOrOptions: Any): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(filepath.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encodingOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]

inline def readDirAssets(dirpath: String): js.Promise[js.Array[ReadDirItem]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readDirAssets")(dirpath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ReadDirItem]]]

inline def readDir_(dirpath: String): js.Promise[js.Array[ReadDirItem]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readDir")(dirpath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[ReadDirItem]]]

inline def readFile(filepath: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
inline def readFile(filepath: String, encodingOrOptions: Any): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(filepath.asInstanceOf[js.Any], encodingOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]

inline def readFileAssets(filepath: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileAssets")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
inline def readFileAssets(filepath: String, encodingOrOptions: Any): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileAssets")(filepath.asInstanceOf[js.Any], encodingOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]

inline def readFileRes(filepath: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileRes")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
inline def readFileRes(filepath: String, encodingOrOptions: Any): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileRes")(filepath.asInstanceOf[js.Any], encodingOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]

inline def readdir(dirpath: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(dirpath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]

inline def resumeDownload(jobId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resumeDownload")(jobId.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def scanFile(path: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("scanFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]

inline def setReadable(filepath: String, readable: Boolean, ownerOnly: Boolean): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("setReadable")(filepath.asInstanceOf[js.Any], readable.asInstanceOf[js.Any], ownerOnly.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]

inline def stat(filepath: String): js.Promise[StatResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("stat")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[StatResult]]

inline def stopDownload(jobId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopDownload")(jobId.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def stopUpload(jobId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopUpload")(jobId.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def touch(filepath: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("touch")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def touch(filepath: String, mtime: js.Date): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("touch")(filepath.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def touch(filepath: String, mtime: js.Date, ctime: js.Date): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("touch")(filepath.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], ctime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def touch(filepath: String, mtime: Unit, ctime: js.Date): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("touch")(filepath.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], ctime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def unlink(filepath: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(filepath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]

inline def uploadFiles(options: UploadFileOptions): Promise = ^.asInstanceOf[js.Dynamic].applyDynamic("uploadFiles")(options.asInstanceOf[js.Any]).asInstanceOf[Promise]

inline def write(filepath: String, contents: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(filepath.asInstanceOf[js.Any], contents.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def write(filepath: String, contents: String, position: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(filepath.asInstanceOf[js.Any], contents.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def write(filepath: String, contents: String, position: Double, encodingOrOptions: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(filepath.asInstanceOf[js.Any], contents.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encodingOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def write(filepath: String, contents: String, position: Unit, encodingOrOptions: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(filepath.asInstanceOf[js.Any], contents.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encodingOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def writeFile(filepath: String, contents: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(filepath.asInstanceOf[js.Any], contents.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
inline def writeFile(filepath: String, contents: String, encodingOrOptions: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(filepath.asInstanceOf[js.Any], contents.asInstanceOf[js.Any], encodingOrOptions.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

type Fields = StringDictionary[String]

type Headers = StringDictionary[String]
