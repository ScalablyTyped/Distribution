package typings.reactDashNativeDashDocDashViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-doc-viewer", JSImport.Namespace)
@js.native
object reactDashNativeDashDocDashViewerMod extends js.Object {
  def openDoc(files: js.Array[Anon_Cache], callback: js.Function2[/* error */ String, /* url */ String, Unit]): Unit = js.native
  def openDocBinaryinUrl(files: js.Array[Anon_FileName], callback: js.Function2[/* error */ String, /* url */ String, Unit]): Unit = js.native
  def openDocb64(files: js.Array[Anon_Base64], callback: js.Function2[/* error */ String, /* url */ String, Unit]): Unit = js.native
  def playMovie(path: String, callback: js.Function2[/* error */ String, /* url */ String, Unit]): Unit = js.native
}

