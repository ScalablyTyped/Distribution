package typings.procfsStats.mod

import typings.procfsStats.anon.Discardedpackets
import typings.procfsStats.anon.Missed
import typings.procfsStats.anon.Quality
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Wifi extends js.Object {
  var Interface: String
  var beacon: Missed
  var crypt: Discardedpackets
  var frag: Discardedpackets
  var level: Quality
  var link: Quality
  var misc: Discardedpackets
  var noise: Quality
  var nwid: Discardedpackets
  var retry: Discardedpackets
  var status: String
}

object Wifi {
  @scala.inline
  def apply(
    Interface: String,
    beacon: Missed,
    crypt: Discardedpackets,
    frag: Discardedpackets,
    level: Quality,
    link: Quality,
    misc: Discardedpackets,
    noise: Quality,
    nwid: Discardedpackets,
    retry: Discardedpackets,
    status: String
  ): Wifi = {
    val __obj = js.Dynamic.literal(Interface = Interface.asInstanceOf[js.Any], beacon = beacon.asInstanceOf[js.Any], crypt = crypt.asInstanceOf[js.Any], frag = frag.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], misc = misc.asInstanceOf[js.Any], noise = noise.asInstanceOf[js.Any], nwid = nwid.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wifi]
  }
}

