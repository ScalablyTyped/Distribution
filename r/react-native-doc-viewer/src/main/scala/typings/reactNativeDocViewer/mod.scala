package typings.reactNativeDocViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-doc-viewer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def openDoc(files: js.Array[AnonCache], callback: js.Function2[/* error */ String, /* url */ String, Unit]): Unit = js.native
  def openDocBinaryinUrl(files: js.Array[AnonFileName], callback: js.Function2[/* error */ String, /* url */ String, Unit]): Unit = js.native
  def openDocb64(files: js.Array[AnonBase64], callback: js.Function2[/* error */ String, /* url */ String, Unit]): Unit = js.native
  def playMovie(path: String, callback: js.Function2[/* error */ String, /* url */ String, Unit]): Unit = js.native
}

