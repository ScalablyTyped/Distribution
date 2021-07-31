package typings.radius

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("radius", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addDictionary(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("add_dictionary")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def decode(args: DecodeArgsWithSecret): RadiusPacket = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(args.asInstanceOf[js.Any]).asInstanceOf[RadiusPacket]
  
  @scala.inline
  def decodeWithoutSecret(args: DecodeArgs): RadiusPacket = ^.asInstanceOf[js.Dynamic].applyDynamic("decode_without_secret")(args.asInstanceOf[js.Any]).asInstanceOf[RadiusPacket]
  
  @scala.inline
  def encode(args: EncodeArgs): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(args.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @scala.inline
  def encodeResponse(args: EncodeResponseArgs): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode_response")(args.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @scala.inline
  def unloadDictionaries(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unload_dictionaries")().asInstanceOf[Unit]
  
  @scala.inline
  def verifyResponse(args: VerifyResponseArgs): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("verify_response")(args.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * {@link https://github.com/retailnext/node-radius#radiusdecode_without_secretargs} for more info.
    **/
  trait DecodeArgs extends StObject {
    
    var packet: Buffer
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
  trait DecodeArgsWithSecret
    extends StObject
       with DecodeArgs {
    
    var secret: String
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
  trait EncodeArgs extends StObject {
    
    var add_message_authenticator: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This can be an object: { attribute_name: attribute_value, ... }, 
      * an array within an array: [ [ attribute_name, attribute_value ], ... ],
      * or if you haven't loaded a dictionary for the attributes: [ [ attribute_id, Buffer ], ... ].
      * 
      * Tag field-attributes can be specified like so: [ [ attribute_name, tag_number, attribute_value ] ... ]
      **/
    var attributes: js.UndefOr[js.Any] = js.undefined
    
    var code: String
    
    var identifier: js.UndefOr[Double] = js.undefined
    
    var secret: String
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
  trait EncodeResponseArgs extends StObject {
    
    var attributes: js.UndefOr[js.Any] = js.undefined
    
    var code: String
    
    var packet: RadiusPacket
    
    var secret: String
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
  
  trait RadiusPacket extends StObject {
    
    var attributes: js.Any
    
    var code: String
    
    var identifier: Double
    
    var length: Double
    
    var raw_attributes: js.Array[js.Array[js.Any]]
  }
  object RadiusPacket {
    
    @scala.inline
    def apply(
      attributes: js.Any,
      code: String,
      identifier: Double,
      length: Double,
      raw_attributes: js.Array[js.Array[js.Any]]
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
      def setRaw_attributes(value: js.Array[js.Array[js.Any]]): Self = StObject.set(x, "raw_attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaw_attributesVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "raw_attributes", js.Array(value :_*))
    }
  }
  
  /**
    * {@link https://github.com/retailnext/node-radius#radiusverify_responseargs} for more info.
    **/
  trait VerifyResponseArgs extends StObject {
    
    var request: Buffer
    
    var response: Buffer
    
    var secret: String
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
