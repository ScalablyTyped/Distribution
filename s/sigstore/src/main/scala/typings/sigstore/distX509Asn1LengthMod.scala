package typings.sigstore

import typings.node.bufferMod.global.Buffer
import typings.sigstore.distUtilStreamMod.ByteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distX509Asn1LengthMod {
  
  @JSImport("sigstore/dist/x509/asn1/length", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeLength(stream: ByteStream): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeLength")(stream.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def encodeLength(len: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeLength")(len.asInstanceOf[js.Any]).asInstanceOf[Buffer]
}
