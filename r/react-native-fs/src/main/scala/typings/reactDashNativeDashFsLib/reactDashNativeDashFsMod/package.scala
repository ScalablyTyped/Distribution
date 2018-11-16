package typings
package reactDashNativeDashFsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashFsMod {
  type DownloadCallbackBegin = js.Function1[/* res */ DownloadBeginCallbackResult, scala.Unit]
  type DownloadCallbackProgress = js.Function1[/* res */ DownloadProgressCallbackResult, scala.Unit]
  type Encoding = reactDashNativeDashFsLib.reactDashNativeDashFsLibStrings.utf8 | reactDashNativeDashFsLib.reactDashNativeDashFsLibStrings.ascii | reactDashNativeDashFsLib.reactDashNativeDashFsLibStrings.base64
  type EncodingOrOptions = Encoding | reactDashNativeDashFsLib.Anon_Encoding
  type Fields = Headers
  type HashAlgorithm = reactDashNativeDashFsLib.reactDashNativeDashFsLibStrings.md5 | reactDashNativeDashFsLib.reactDashNativeDashFsLibStrings.sha1 | reactDashNativeDashFsLib.reactDashNativeDashFsLibStrings.sha224 | reactDashNativeDashFsLib.reactDashNativeDashFsLibStrings.sha256 | reactDashNativeDashFsLib.reactDashNativeDashFsLibStrings.sha384 | reactDashNativeDashFsLib.reactDashNativeDashFsLibStrings.sha512
  type UploadCallbackBegin = js.Function1[/* res */ UploadBeginCallbackResult, scala.Unit]
  type UploadCallbackProgress = js.Function1[/* res */ UploadProgressCallbackResult, scala.Unit]
}
