package typings.procfsStats.mod

import typings.procfsStats.AnonDiscardedpackets
import typings.procfsStats.AnonMissed
import typings.procfsStats.AnonQuality
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Wifi extends js.Object {
  var Interface: String
  var beacon: AnonMissed
  var crypt: AnonDiscardedpackets
  var frag: AnonDiscardedpackets
  var level: AnonQuality
  var link: AnonQuality
  var misc: AnonDiscardedpackets
  var noise: AnonQuality
  var nwid: AnonDiscardedpackets
  var retry: AnonDiscardedpackets
  var status: String
}

object Wifi {
  @scala.inline
  def apply(
    Interface: String,
    beacon: AnonMissed,
    crypt: AnonDiscardedpackets,
    frag: AnonDiscardedpackets,
    level: AnonQuality,
    link: AnonQuality,
    misc: AnonDiscardedpackets,
    noise: AnonQuality,
    nwid: AnonDiscardedpackets,
    retry: AnonDiscardedpackets,
    status: String
  ): Wifi = {
    val __obj = js.Dynamic.literal(Interface = Interface.asInstanceOf[js.Any], beacon = beacon.asInstanceOf[js.Any], crypt = crypt.asInstanceOf[js.Any], frag = frag.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], misc = misc.asInstanceOf[js.Any], noise = noise.asInstanceOf[js.Any], nwid = nwid.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Wifi]
  }
}

