package typings.sigstoreProtobufSpecs

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `dist@GeneratedEnvelopeMod` {
  
  trait Envelope extends StObject {
    
    /**
      * Message to be signed. (In JSON, this is encoded as base64.)
      * REQUIRED.
      */
    var payload: Buffer
    
    /**
      * String unambiguously identifying how to interpret payload.
      * REQUIRED.
      */
    var payloadType: String
    
    /**
      * Signature over:
      *     PAE(type, body)
      * Where PAE is defined as:
      * PAE(type, body) = "DSSEv1" + SP + LEN(type) + SP + type + SP + LEN(body) + SP + body
      * +               = concatenation
      * SP              = ASCII space [0x20]
      * "DSSEv1"        = ASCII [0x44, 0x53, 0x53, 0x45, 0x76, 0x31]
      * LEN(s)          = ASCII decimal encoding of the byte length of s, with no leading zeros
      * REQUIRED (length >= 1).
      */
    var signatures: js.Array[Signature]
  }
  object Envelope {
    
    inline def apply(payload: Buffer, payloadType: String, signatures: js.Array[Signature]): Envelope = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], payloadType = payloadType.asInstanceOf[js.Any], signatures = signatures.asInstanceOf[js.Any])
      __obj.asInstanceOf[Envelope]
    }
    
    @JSImport("@sigstore/protobuf-specs/dist/@/generated/envelope", "Envelope")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(`object`: Any): Envelope = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[Envelope]
    
    inline def toJSON(message: Envelope): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Envelope] (val x: Self) extends AnyVal {
      
      inline def setPayload(value: Buffer): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadType(value: String): Self = StObject.set(x, "payloadType", value.asInstanceOf[js.Any])
      
      inline def setSignatures(value: js.Array[Signature]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
      
      inline def setSignaturesVarargs(value: Signature*): Self = StObject.set(x, "signatures", js.Array(value*))
    }
  }
  
  trait Signature extends StObject {
    
    /**
      * Unauthenticated* hint identifying which public key was used.
      * OPTIONAL.
      */
    var keyid: String
    
    /**
      * Signature itself. (In JSON, this is encoded as base64.)
      * REQUIRED.
      */
    var sig: Buffer
  }
  object Signature {
    
    inline def apply(keyid: String, sig: Buffer): Signature = {
      val __obj = js.Dynamic.literal(keyid = keyid.asInstanceOf[js.Any], sig = sig.asInstanceOf[js.Any])
      __obj.asInstanceOf[Signature]
    }
    
    @JSImport("@sigstore/protobuf-specs/dist/@/generated/envelope", "Signature")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromJSON(`object`: Any): Signature = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(`object`.asInstanceOf[js.Any]).asInstanceOf[Signature]
    
    inline def toJSON(message: Signature): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSON")(message.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Signature] (val x: Self) extends AnyVal {
      
      inline def setKeyid(value: String): Self = StObject.set(x, "keyid", value.asInstanceOf[js.Any])
      
      inline def setSig(value: Buffer): Self = StObject.set(x, "sig", value.asInstanceOf[js.Any])
    }
  }
}
