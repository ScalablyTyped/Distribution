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
  var ext: js.UndefOr[js.Array[sdpDashTransformLib.Anon_Config]] = js.undefined
  var fingerprint: js.UndefOr[sdpDashTransformLib.Anon_Hash] = js.undefined
  var icePwd: js.UndefOr[java.lang.String] = js.undefined
  var iceUfrag: js.UndefOr[java.lang.String] = js.undefined
  var invalid: js.UndefOr[js.Array[sdpDashTransformLib.Anon_Value]] = js.undefined
  // a=setup
  var setup: js.UndefOr[java.lang.String] = js.undefined
  // a=source-filter: incl IN IP4 239.5.2.31 10.1.15.5
  var sourceFilter: js.UndefOr[sdpDashTransformLib.Anon_AddressTypes] = js.undefined
}

object SharedAttributes {
  @scala.inline
  def apply(
    control: java.lang.String = null,
    direction: sdpDashTransformLib.sdpDashTransformLibStrings.sendrecv | sdpDashTransformLib.sdpDashTransformLibStrings.recvonly | sdpDashTransformLib.sdpDashTransformLibStrings.sendonly | sdpDashTransformLib.sdpDashTransformLibStrings.inactive = null,
    ext: js.Array[sdpDashTransformLib.Anon_Config] = null,
    fingerprint: sdpDashTransformLib.Anon_Hash = null,
    icePwd: java.lang.String = null,
    iceUfrag: java.lang.String = null,
    invalid: js.Array[sdpDashTransformLib.Anon_Value] = null,
    setup: java.lang.String = null,
    sourceFilter: sdpDashTransformLib.Anon_AddressTypes = null
  ): SharedAttributes = {
    val __obj = js.Dynamic.literal()
    if (control != null) __obj.updateDynamic("control")(control)
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext)
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint)
    if (icePwd != null) __obj.updateDynamic("icePwd")(icePwd)
    if (iceUfrag != null) __obj.updateDynamic("iceUfrag")(iceUfrag)
    if (invalid != null) __obj.updateDynamic("invalid")(invalid)
    if (setup != null) __obj.updateDynamic("setup")(setup)
    if (sourceFilter != null) __obj.updateDynamic("sourceFilter")(sourceFilter)
    __obj.asInstanceOf[SharedAttributes]
  }
}

