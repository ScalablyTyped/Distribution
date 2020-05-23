package typings.steamClient.anon

import typings.steamClient.mod.CMsgProtoBufHeader
import typings.steamClient.mod.EMsg
import typings.steamClient.steamClientBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Msg extends js.Object {
  /**
    * A value from EMsg
    */
  var msg: EMsg
  /**
    * A CMsgProtoBufHeader object if this message is protobuf-backed, otherwise header.proto is falsy.
    */
  var proto: js.UndefOr[CMsgProtoBufHeader | `false`] = js.undefined
}

object Msg {
  @scala.inline
  def apply(msg: EMsg, proto: CMsgProtoBufHeader | `false` = null): Msg = {
    val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any])
    if (proto != null) __obj.updateDynamic("proto")(proto.asInstanceOf[js.Any])
    __obj.asInstanceOf[Msg]
  }
}

