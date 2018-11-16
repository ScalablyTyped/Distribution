package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RTCRtpParameters extends js.Object {
  var codecs: js.Array[RTCRtpCodecParameters]
  var headerExtensions: js.Array[RTCRtpHeaderExtensionParameters]
  var rtcp: RTCRtcpParameters
}

