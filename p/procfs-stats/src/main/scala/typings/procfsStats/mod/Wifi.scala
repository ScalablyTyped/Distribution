package typings.procfsStats.mod

import typings.procfsStats.anon.Discardedpackets
import typings.procfsStats.anon.Missed
import typings.procfsStats.anon.Quality
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Wifi extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: Wifi](x: Self) {
    
    inline def setBeacon(value: Missed): Self = StObject.set(x, "beacon", value.asInstanceOf[js.Any])
    
    inline def setCrypt(value: Discardedpackets): Self = StObject.set(x, "crypt", value.asInstanceOf[js.Any])
    
    inline def setFrag(value: Discardedpackets): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    inline def setInterface(value: String): Self = StObject.set(x, "Interface", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Quality): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLink(value: Quality): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setMisc(value: Discardedpackets): Self = StObject.set(x, "misc", value.asInstanceOf[js.Any])
    
    inline def setNoise(value: Quality): Self = StObject.set(x, "noise", value.asInstanceOf[js.Any])
    
    inline def setNwid(value: Discardedpackets): Self = StObject.set(x, "nwid", value.asInstanceOf[js.Any])
    
    inline def setRetry(value: Discardedpackets): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
