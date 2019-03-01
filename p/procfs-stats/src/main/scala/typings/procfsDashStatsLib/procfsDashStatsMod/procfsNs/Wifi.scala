package typings
package procfsDashStatsLib.procfsDashStatsMod.procfsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Wifi extends js.Object {
  var Interface: java.lang.String
  var beacon: procfsDashStatsLib.Anon_Missed
  var crypt: procfsDashStatsLib.Anon_Discardedpackets
  var frag: procfsDashStatsLib.Anon_Discardedpackets
  var level: procfsDashStatsLib.Anon_Quality
  var link: procfsDashStatsLib.Anon_Quality
  var misc: procfsDashStatsLib.Anon_Discardedpackets
  var noise: procfsDashStatsLib.Anon_Quality
  var nwid: procfsDashStatsLib.Anon_Discardedpackets
  var retry: procfsDashStatsLib.Anon_Discardedpackets
  var status: java.lang.String
}

object Wifi {
  @scala.inline
  def apply(
    Interface: java.lang.String,
    beacon: procfsDashStatsLib.Anon_Missed,
    crypt: procfsDashStatsLib.Anon_Discardedpackets,
    frag: procfsDashStatsLib.Anon_Discardedpackets,
    level: procfsDashStatsLib.Anon_Quality,
    link: procfsDashStatsLib.Anon_Quality,
    misc: procfsDashStatsLib.Anon_Discardedpackets,
    noise: procfsDashStatsLib.Anon_Quality,
    nwid: procfsDashStatsLib.Anon_Discardedpackets,
    retry: procfsDashStatsLib.Anon_Discardedpackets,
    status: java.lang.String
  ): Wifi = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Interface")(Interface)
    __obj.updateDynamic("beacon")(beacon)
    __obj.updateDynamic("crypt")(crypt)
    __obj.updateDynamic("frag")(frag)
    __obj.updateDynamic("level")(level)
    __obj.updateDynamic("link")(link)
    __obj.updateDynamic("misc")(misc)
    __obj.updateDynamic("noise")(noise)
    __obj.updateDynamic("nwid")(nwid)
    __obj.updateDynamic("retry")(retry)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[Wifi]
  }
}

