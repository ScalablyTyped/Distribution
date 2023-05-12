package typings.sigstore

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distX509Asn1ParseMod {
  
  @JSImport("sigstore/dist/x509/asn1/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseBitString(buf: Buffer): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseBitString")(buf.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def parseBoolean(buf: Buffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("parseBoolean")(buf.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def parseInteger(buf: Buffer): js.BigInt = ^.asInstanceOf[js.Dynamic].applyDynamic("parseInteger")(buf.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
  
  inline def parseOID(buf: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseOID")(buf.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parseStringASCII(buf: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("parseStringASCII")(buf.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parseTime(buf: Buffer, shortYear: Boolean): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("parseTime")(buf.asInstanceOf[js.Any], shortYear.asInstanceOf[js.Any])).asInstanceOf[js.Date]
}
