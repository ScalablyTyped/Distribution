package typings.procfsStats.mod

import typings.procfsStats.anon.Discardedpackets
import typings.procfsStats.anon.Missed
import typings.procfsStats.anon.Quality
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Wifi extends js.Object {
  var Interface: String = js.native
  var beacon: Missed = js.native
  var crypt: Discardedpackets = js.native
  var frag: Discardedpackets = js.native
  var level: Quality = js.native
  var link: Quality = js.native
  var misc: Discardedpackets = js.native
  var noise: Quality = js.native
  var nwid: Discardedpackets = js.native
  var retry: Discardedpackets = js.native
  var status: String = js.native
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
  @scala.inline
  implicit class WifiOps[Self <: Wifi] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInterface(value: String): Self = this.set("Interface", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeacon(value: Missed): Self = this.set("beacon", value.asInstanceOf[js.Any])
    @scala.inline
    def setCrypt(value: Discardedpackets): Self = this.set("crypt", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrag(value: Discardedpackets): Self = this.set("frag", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevel(value: Quality): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def setLink(value: Quality): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def setMisc(value: Discardedpackets): Self = this.set("misc", value.asInstanceOf[js.Any])
    @scala.inline
    def setNoise(value: Quality): Self = this.set("noise", value.asInstanceOf[js.Any])
    @scala.inline
    def setNwid(value: Discardedpackets): Self = this.set("nwid", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetry(value: Discardedpackets): Self = this.set("retry", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

