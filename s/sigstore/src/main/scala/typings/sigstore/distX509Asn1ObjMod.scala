package typings.sigstore

import typings.node.bufferMod.global.Buffer
import typings.sigstore.distX509Asn1TagMod.ASN1Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distX509Asn1ObjMod {
  
  @JSImport("sigstore/dist/x509/asn1/obj", "ASN1Obj")
  @js.native
  open class ASN1Obj protected () extends StObject {
    def this(tag: ASN1Tag, value: Buffer, subs: js.Array[ASN1Obj]) = this()
    
    val subs: js.Array[ASN1Obj] = js.native
    
    val tag: ASN1Tag = js.native
    
    def toBitString(): js.Array[Double] = js.native
    
    def toBoolean(): Boolean = js.native
    
    def toDER(): Buffer = js.native
    
    def toDate(): js.Date = js.native
    
    def toInteger(): js.BigInt = js.native
    
    def toOID(): String = js.native
    
    val value: Buffer = js.native
  }
  /* static members */
  object ASN1Obj {
    
    @JSImport("sigstore/dist/x509/asn1/obj", "ASN1Obj")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parseBuffer(buf: Buffer): ASN1Obj = ^.asInstanceOf[js.Dynamic].applyDynamic("parseBuffer")(buf.asInstanceOf[js.Any]).asInstanceOf[ASN1Obj]
  }
}
