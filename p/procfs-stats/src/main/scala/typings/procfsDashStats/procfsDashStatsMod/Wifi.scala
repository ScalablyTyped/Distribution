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
    val __obj = js.Dynamic.literal(Interface = Interface, beacon = beacon, crypt = crypt, frag = frag, level = level, link = link, misc = misc, noise = noise, nwid = nwid, retry = retry, status = status)
  
    __obj.asInstanceOf[Wifi]
  }
}

