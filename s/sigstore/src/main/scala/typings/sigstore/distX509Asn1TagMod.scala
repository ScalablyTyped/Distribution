package typings.sigstore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distX509Asn1TagMod {
  
  @JSImport("sigstore/dist/x509/asn1/tag", "ASN1Tag")
  @js.native
  open class ASN1Tag protected () extends StObject {
    def this(enc: Double) = this()
    
    val `class`: Double = js.native
    
    val constructed: Boolean = js.native
    
    def isBitString(): Boolean = js.native
    
    def isBoolean(): Boolean = js.native
    
    def isContextSpecific(): Boolean = js.native
    def isContextSpecific(num: Double): Boolean = js.native
    
    def isGeneralizedTime(): Boolean = js.native
    
    def isInteger(): Boolean = js.native
    
    def isOID(): Boolean = js.native
    
    def isOctetString(): Boolean = js.native
    
    def isUTCTime(): Boolean = js.native
    
    def isUniversal(): Boolean = js.native
    
    val number: Double = js.native
    
    def toDER(): Double = js.native
  }
  
  object UNIVERSAL_TAG {
    
    @JSImport("sigstore/dist/x509/asn1/tag", "UNIVERSAL_TAG")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sigstore/dist/x509/asn1/tag", "UNIVERSAL_TAG.BIT_STRING")
    @js.native
    def BIT_STRING: Double = js.native
    inline def BIT_STRING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BIT_STRING")(x.asInstanceOf[js.Any])
    
    @JSImport("sigstore/dist/x509/asn1/tag", "UNIVERSAL_TAG.BOOLEAN")
    @js.native
    def BOOLEAN: Double = js.native
    inline def BOOLEAN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOOLEAN")(x.asInstanceOf[js.Any])
    
    @JSImport("sigstore/dist/x509/asn1/tag", "UNIVERSAL_TAG.GENERALIZED_TIME")
    @js.native
    def GENERALIZED_TIME: Double = js.native
    inline def GENERALIZED_TIME_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GENERALIZED_TIME")(x.asInstanceOf[js.Any])
    
    @JSImport("sigstore/dist/x509/asn1/tag", "UNIVERSAL_TAG.INTEGER")
    @js.native
    def INTEGER: Double = js.native
    inline def INTEGER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTEGER")(x.asInstanceOf[js.Any])
    
    @JSImport("sigstore/dist/x509/asn1/tag", "UNIVERSAL_TAG.OBJECT_IDENTIFIER")
    @js.native
    def OBJECT_IDENTIFIER: Double = js.native
    inline def OBJECT_IDENTIFIER_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OBJECT_IDENTIFIER")(x.asInstanceOf[js.Any])
    
    @JSImport("sigstore/dist/x509/asn1/tag", "UNIVERSAL_TAG.OCTET_STRING")
    @js.native
    def OCTET_STRING: Double = js.native
    inline def OCTET_STRING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OCTET_STRING")(x.asInstanceOf[js.Any])
    
    @JSImport("sigstore/dist/x509/asn1/tag", "UNIVERSAL_TAG.PRINTABLE_STRING")
    @js.native
    def PRINTABLE_STRING: Double = js.native
    inline def PRINTABLE_STRING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRINTABLE_STRING")(x.asInstanceOf[js.Any])
    
    @JSImport("sigstore/dist/x509/asn1/tag", "UNIVERSAL_TAG.SEQUENCE")
    @js.native
    def SEQUENCE: Double = js.native
    inline def SEQUENCE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SEQUENCE")(x.asInstanceOf[js.Any])
    
    @JSImport("sigstore/dist/x509/asn1/tag", "UNIVERSAL_TAG.SET")
    @js.native
    def SET: Double = js.native
    inline def SET_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SET")(x.asInstanceOf[js.Any])
    
    @JSImport("sigstore/dist/x509/asn1/tag", "UNIVERSAL_TAG.UTC_TIME")
    @js.native
    def UTC_TIME: Double = js.native
    inline def UTC_TIME_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UTC_TIME")(x.asInstanceOf[js.Any])
  }
}
