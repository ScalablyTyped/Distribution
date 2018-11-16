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
  var ext: js.UndefOr[sdpDashTransformLib.Anon_ConfigUri] = js.undefined
  var fingerprint: js.UndefOr[sdpDashTransformLib.Anon_TypeHash] = js.undefined
  var icePwd: js.UndefOr[java.lang.String] = js.undefined
  var iceUfrag: js.UndefOr[java.lang.String] = js.undefined
  var invalid: js.UndefOr[js.Array[sdpDashTransformLib.Anon_ValueString]] = js.undefined
  // a=setup
  var setup: js.UndefOr[java.lang.String] = js.undefined
  // a=source-filter: incl IN IP4 239.5.2.31 10.1.15.5
  var sourceFilter: js.UndefOr[sdpDashTransformLib.Anon_FilterMode] = js.undefined
}

