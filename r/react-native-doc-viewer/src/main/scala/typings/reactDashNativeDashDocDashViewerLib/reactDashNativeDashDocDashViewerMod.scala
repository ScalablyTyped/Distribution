package typings
package reactDashNativeDashDocDashViewerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-doc-viewer", JSImport.Namespace)
@js.native
object reactDashNativeDashDocDashViewerMod extends js.Object {
  def openDoc(
    files: js.Array[reactDashNativeDashDocDashViewerLib.Anon_Url],
    callback: js.Function2[/* error */ java.lang.String, /* url */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def openDocBinaryinUrl(
    files: js.Array[reactDashNativeDashDocDashViewerLib.Anon_UrlFileType],
    callback: js.Function2[/* error */ java.lang.String, /* url */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def openDocb64(
    files: js.Array[reactDashNativeDashDocDashViewerLib.Anon_FileType],
    callback: js.Function2[/* error */ java.lang.String, /* url */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def playMovie(
    path: java.lang.String,
    callback: js.Function2[/* error */ java.lang.String, /* url */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
}

