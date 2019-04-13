package typings
package steamDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_False extends js.Object {
  /**
    * A value from EMsg
    */
  var msg: steamDashClientLib.steamDashClientMod.EMsg
  /**
    * A CMsgProtoBufHeader object if this message is protobuf-backed, otherwise header.proto is falsy.
    */
  var proto: js.UndefOr[
    steamDashClientLib.steamDashClientMod.CMsgProtoBufHeader | steamDashClientLib.steamDashClientLibNumbers.`false`
  ] = js.undefined
}

object Anon_False {
  @scala.inline
  def apply(
    msg: steamDashClientLib.steamDashClientMod.EMsg,
    proto: steamDashClientLib.steamDashClientMod.CMsgProtoBufHeader | steamDashClientLib.steamDashClientLibNumbers.`false` = null
  ): Anon_False = {
    val __obj = js.Dynamic.literal(msg = msg)
    if (proto != null) __obj.updateDynamic("proto")(proto.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_False]
  }
}

