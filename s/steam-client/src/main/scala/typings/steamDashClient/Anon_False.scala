package typings.steamDashClient

import typings.steamDashClient.steamDashClientMod.CMsgProtoBufHeader
import typings.steamDashClient.steamDashClientMod.EMsg
import typings.steamDashClient.steamDashClientNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_False extends js.Object {
  /**
    * A value from EMsg
    */
  var msg: EMsg
  /**
    * A CMsgProtoBufHeader object if this message is protobuf-backed, otherwise header.proto is falsy.
    */
  var proto: js.UndefOr[CMsgProtoBufHeader | `false`] = js.undefined
}

object Anon_False {
  @scala.inline
  def apply(msg: EMsg, proto: CMsgProtoBufHeader | `false` = null): Anon_False = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any])
    if (proto != null) __obj.updateDynamic("proto")(proto.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_False]
  }
}

