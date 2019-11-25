package typings.procfsDashStats.procfsDashStatsMod

import typings.procfsDashStats.Anon_Discardedpackets
import typings.procfsDashStats.Anon_Missed
import typings.procfsDashStats.Anon_Quality
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Wifi extends js.Object {
  var Interface: String
  var beacon: Anon_Missed
  var crypt: Anon_Discardedpackets
  var frag: Anon_Discardedpackets
  var level: Anon_Quality
  var link: Anon_Quality
  var misc: Anon_Discardedpackets
  var noise: Anon_Quality
  var nwid: Anon_Discardedpackets
  var retry: Anon_Discardedpackets
  var status: String
}

object Wifi {
  @scala.inline
  def apply(
    Interface: String,
    beacon: Anon_Missed,
    crypt: Anon_Discardedpackets,
    frag: Anon_Discardedpackets,
    level: Anon_Quality,
    link: Anon_Quality,
    misc: Anon_Discardedpackets,
    noise: Anon_Quality,
    nwid: Anon_Discardedpackets,
    retry: Anon_Discardedpackets,
    status: String
  ): Wifi = {
    val __obj = js.Dynamic.literal(Interface = Interface.asInstanceOf[js.Any], beacon = beacon.asInstanceOf[js.Any], crypt = crypt.asInstanceOf[js.Any], frag = frag.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], misc = misc.asInstanceOf[js.Any], noise = noise.asInstanceOf[js.Any], nwid = nwid.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Wifi]
  }
}

