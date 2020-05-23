package typings.reactNativeDocViewer

import typings.reactNativeDocViewer.anon.Base64
import typings.reactNativeDocViewer.anon.Cache
import typings.reactNativeDocViewer.anon.FileName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-doc-viewer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def openDoc(files: js.Array[Cache], callback: js.Function2[/* error */ String, /* url */ String, Unit]): Unit = js.native
  def openDocBinaryinUrl(files: js.Array[FileName], callback: js.Function2[/* error */ String, /* url */ String, Unit]): Unit = js.native
  def openDocb64(files: js.Array[Base64], callback: js.Function2[/* error */ String, /* url */ String, Unit]): Unit = js.native
  def playMovie(path: String, callback: js.Function2[/* error */ String, /* url */ String, Unit]): Unit = js.native
}

