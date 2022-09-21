package typings.socks.constantsMod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocksUDPFrameDetails extends StObject {
  
  var data: Buffer
  
  var frameNumber: js.UndefOr[Double] = js.undefined
  
  var remoteHost: SocksRemoteHost
}
object SocksUDPFrameDetails {
  
  inline def apply(data: Buffer, remoteHost: SocksRemoteHost): SocksUDPFrameDetails = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], remoteHost = remoteHost.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocksUDPFrameDetails]
  }
  
  extension [Self <: SocksUDPFrameDetails](x: Self) {
    
    inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setFrameNumber(value: Double): Self = StObject.set(x, "frameNumber", value.asInstanceOf[js.Any])
    
    inline def setFrameNumberUndefined: Self = StObject.set(x, "frameNumber", js.undefined)
    
    inline def setRemoteHost(value: SocksRemoteHost): Self = StObject.set(x, "remoteHost", value.asInstanceOf[js.Any])
  }
}
