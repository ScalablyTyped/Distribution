package typings.socketIoParser

import typings.socketIoParser.anon.Buffers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object binaryMod {
  
  @JSImport("socket.io-parser/build/esm/binary", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deconstructPacket(packet: Any): Buffers = ^.asInstanceOf[js.Dynamic].applyDynamic("deconstructPacket")(packet.asInstanceOf[js.Any]).asInstanceOf[Buffers]
  
  inline def reconstructPacket(packet: Any, buffers: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("reconstructPacket")(packet.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any])).asInstanceOf[Any]
}
