package typings.sigstore

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilPemMod {
  
  @JSImport("sigstore/dist/util/pem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromDER(certificate: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDER")(certificate.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def fromDER(certificate: Buffer, `type`: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDER")(certificate.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toDER(certificate: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toDER")(certificate.asInstanceOf[js.Any]).asInstanceOf[Buffer]
}
