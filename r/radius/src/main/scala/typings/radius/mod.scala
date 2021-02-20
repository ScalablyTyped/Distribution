package typings.radius

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("radius", "add_dictionary")
  @js.native
  def addDictionary(path: String): Unit = js.native
  
  @JSImport("radius", "decode")
  @js.native
  def decode(args: DecodeArgsWithSecret): RadiusPacket = js.native
  
  @JSImport("radius", "decode_without_secret")
  @js.native
  def decodeWithoutSecret(args: DecodeArgs): RadiusPacket = js.native
  
  @JSImport("radius", "encode")
  @js.native
  def encode(args: EncodeArgs): Buffer = js.native
  
  @JSImport("radius", "encode_response")
  @js.native
  def encodeResponse(args: EncodeResponseArgs): Buffer = js.native
  
  @JSImport("radius", "unload_dictionaries")
  @js.native
  def unloadDictionaries(): Unit = js.native
  
  @JSImport("radius", "verify_response")
  @js.native
  def verifyResponse(args: VerifyResponseArgs): Boolean = js.native
  
  /**
    * {@link https://github.com/retailnext/node-radius#radiusdecode_without_secretargs} for more info.
    **/
  @js.native
  trait DecodeArgs extends StObject {
    
    var packet: Buffer = js.native
  }
  object DecodeArgs {
    
    @scala.inline
    def apply(packet: Buffer): DecodeArgs = {
      val __obj = js.Dynamic.literal(packet = packet.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecodeArgs]
    }
    
    @scala.inline
    implicit class DecodeArgsMutableBuilder[Self <: DecodeArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPacket(value: Buffer): Self = StObject.set(x, "packet", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * {@link https://github.com/retailnext/node-radius#radiusdecodeargs} for more info.
    **/
  @js.native
  trait DecodeArgsWithSecret extends DecodeArgs {
    
    var secret: String = js.native
  }
  object DecodeArgsWithSecret {
    
    @scala.inline
    def apply(packet: Buffer, secret: String): DecodeArgsWithSecret = {
      val __obj = js.Dynamic.literal(packet = packet.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecodeArgsWithSecret]
    }
    
    @scala.inline
    implicit class DecodeArgsWithSecretMutableBuilder[Self <: DecodeArgsWithSecret] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * {@link https://github.com/retailnext/node-radius#radiusencodeargs} for more info.
    **/
  @js.native
  trait EncodeArgs extends StObject {
    
    var add_message_authenticator: js.UndefOr[Boolean] = js.native
    
    /**
      * This can be an object: { attribute_name: attribute_value, ... }, 
      * an array within an array: [ [ attribute_name, attribute_value ], ... ],
      * or if you haven't loaded a dictionary for the attributes: [ [ attribute_id, Buffer ], ... ].
      * 
      * Tag field-attributes can be specified like so: [ [ attribute_name, tag_number, attribute_value ] ... ]
      **/
    var attributes: js.UndefOr[js.Any] = js.native
    
    var code: String = js.native
    
    var identifier: js.UndefOr[Double] = js.native
    
    var secret: String = js.native
  }
  object EncodeArgs {
    
    @scala.inline
    def apply(code: String, secret: String): EncodeArgs = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncodeArgs]
    }
    
    @scala.inline
    implicit class EncodeArgsMutableBuilder[Self <: EncodeArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd_message_authenticator(value: Boolean): Self = StObject.set(x, "add_message_authenticator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdd_message_authenticatorUndefined: Self = StObject.set(x, "add_message_authenticator", js.undefined)
      
      @scala.inline
      def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifier(value: Double): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
      
      @scala.inline
      def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * {@link https://github.com/retailnext/node-radius#radiusencode_responseargs} for more info.
    **/
  @js.native
  trait EncodeResponseArgs extends StObject {
    
    var attributes: js.UndefOr[js.Any] = js.native
    
    var code: String = js.native
    
    var packet: RadiusPacket = js.native
    
    var secret: String = js.native
  }
  object EncodeResponseArgs {
    
    @scala.inline
    def apply(code: String, packet: RadiusPacket, secret: String): EncodeResponseArgs = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], packet = packet.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncodeResponseArgs]
    }
    
    @scala.inline
    implicit class EncodeResponseArgsMutableBuilder[Self <: EncodeResponseArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPacket(value: RadiusPacket): Self = StObject.set(x, "packet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RadiusPacket extends StObject {
    
    var attributes: js.Any = js.native
    
    var code: String = js.native
    
    var identifier: Double = js.native
    
    var length: Double = js.native
    
    var raw_attributes: js.Array[js.Array[_]] = js.native
  }
  object RadiusPacket {
    
    @scala.inline
    def apply(
      attributes: js.Any,
      code: String,
      identifier: Double,
      length: Double,
      raw_attributes: js.Array[js.Array[_]]
    ): RadiusPacket = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], raw_attributes = raw_attributes.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadiusPacket]
    }
    
    @scala.inline
    implicit class RadiusPacketMutableBuilder[Self <: RadiusPacket] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentifier(value: Double): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaw_attributes(value: js.Array[js.Array[_]]): Self = StObject.set(x, "raw_attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaw_attributesVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "raw_attributes", js.Array(value :_*))
    }
  }
  
  /**
    * {@link https://github.com/retailnext/node-radius#radiusverify_responseargs} for more info.
    **/
  @js.native
  trait VerifyResponseArgs extends StObject {
    
    var request: Buffer = js.native
    
    var response: Buffer = js.native
    
    var secret: String = js.native
  }
  object VerifyResponseArgs {
    
    @scala.inline
    def apply(request: Buffer, response: Buffer, secret: String): VerifyResponseArgs = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerifyResponseArgs]
    }
    
    @scala.inline
    implicit class VerifyResponseArgsMutableBuilder[Self <: VerifyResponseArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequest(value: Buffer): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: Buffer): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    }
  }
}
