package typings.qbittorrentApiV2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildInfo extends StObject {
  
  var bitness: String
  
  var boost: String
  
  var libtorrent: String
  
  var openssl: String
  
  var qt: String
}
object BuildInfo {
  
  inline def apply(bitness: String, boost: String, libtorrent: String, openssl: String, qt: String): BuildInfo = {
    val __obj = js.Dynamic.literal(bitness = bitness.asInstanceOf[js.Any], boost = boost.asInstanceOf[js.Any], libtorrent = libtorrent.asInstanceOf[js.Any], openssl = openssl.asInstanceOf[js.Any], qt = qt.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildInfo]
  }
  
  extension [Self <: BuildInfo](x: Self) {
    
    inline def setBitness(value: String): Self = StObject.set(x, "bitness", value.asInstanceOf[js.Any])
    
    inline def setBoost(value: String): Self = StObject.set(x, "boost", value.asInstanceOf[js.Any])
    
    inline def setLibtorrent(value: String): Self = StObject.set(x, "libtorrent", value.asInstanceOf[js.Any])
    
    inline def setOpenssl(value: String): Self = StObject.set(x, "openssl", value.asInstanceOf[js.Any])
    
    inline def setQt(value: String): Self = StObject.set(x, "qt", value.asInstanceOf[js.Any])
  }
}
