package typings
package stompitLib.libChannelPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ChannelPool extends js.Object {
  def channel(
    callback: js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* channel */ stompitLib.libChannelMod.namespaced, 
      scala.Unit
    ]
  ): scala.Unit
  def close(): scala.Unit
}

