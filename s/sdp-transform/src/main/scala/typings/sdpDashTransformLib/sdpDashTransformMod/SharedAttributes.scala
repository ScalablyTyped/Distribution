package typings
package sdpDashTransformLib.sdpDashTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedAttributes extends js.Object {
  // a=control
  var control: js.UndefOr[java.lang.String] = js.undefined
  // a=sendrecv
  // a=recvonly
  // a=sendonly
  // a=inactive
  var direction: js.UndefOr[
    sdpDashTransformLib.sdpDashTransformLibStrings.sendrecv | sdpDashTransformLib.sdpDashTransformLibStrings.recvonly | sdpDashTransformLib.sdpDashTransformLibStrings.sendonly | sdpDashTransformLib.sdpDashTransformLibStrings.inactive
  ] = js.undefined
  // a=extmap
  var ext: js.UndefOr[sdpDashTransformLib.Anon_Config] = js.undefined
  var fingerprint: js.UndefOr[sdpDashTransformLib.Anon_Hash] = js.undefined
  var icePwd: js.UndefOr[java.lang.String] = js.undefined
  var iceUfrag: js.UndefOr[java.lang.String] = js.undefined
  var invalid: js.UndefOr[js.Array[sdpDashTransformLib.Anon_Value]] = js.undefined
  // a=setup
  var setup: js.UndefOr[java.lang.String] = js.undefined
  // a=source-filter: incl IN IP4 239.5.2.31 10.1.15.5
  var sourceFilter: js.UndefOr[sdpDashTransformLib.Anon_AddressTypes] = js.undefined
}

