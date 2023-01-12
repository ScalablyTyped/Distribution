package typings.rsocketCore

import typings.node.bufferMod.global.Buffer
import typings.rsocketCore.wellKnownAuthTypeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authMetadataMod {
  
  @JSImport("rsocket-core/AuthMetadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeAuthMetadata(metadata: Buffer): AuthMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeAuthMetadata")(metadata.asInstanceOf[js.Any]).asInstanceOf[AuthMetadata]
  
  inline def decodeSimpleAuthPayload(authPayload: Buffer): UsernameAndPassword = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeSimpleAuthPayload")(authPayload.asInstanceOf[js.Any]).asInstanceOf[UsernameAndPassword]
  
  inline def encodeBearerAuthMetadata(token: String): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeBearerAuthMetadata")(token.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  inline def encodeBearerAuthMetadata(token: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeBearerAuthMetadata")(token.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def encodeCustomAuthMetadata(customAuthType: String, authPayloadBuffer: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeCustomAuthMetadata")(customAuthType.asInstanceOf[js.Any], authPayloadBuffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def encodeSimpleAuthMetadata(username: String, password: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeSimpleAuthMetadata")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def encodeSimpleAuthMetadata(username: String, password: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeSimpleAuthMetadata")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def encodeSimpleAuthMetadata(username: Buffer, password: String): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeSimpleAuthMetadata")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  inline def encodeSimpleAuthMetadata(username: Buffer, password: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeSimpleAuthMetadata")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def encodeWellKnownAuthMetadata(authType: default, authPayloadBuffer: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeWellKnownAuthMetadata")(authType.asInstanceOf[js.Any], authPayloadBuffer.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  trait AuthMetadata extends StObject {
    
    var payload: Buffer
    
    var `type`: Type
  }
  object AuthMetadata {
    
    inline def apply(payload: Buffer, `type`: Type): AuthMetadata = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthMetadata] (val x: Self) extends AnyVal {
      
      inline def setPayload(value: Buffer): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var identifier: Double
    
    var string: String
  }
  object Type {
    
    inline def apply(identifier: Double, string: String): Type = {
      val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      inline def setIdentifier(value: Double): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    }
  }
  
  trait UsernameAndPassword extends StObject {
    
    var password: Buffer
    
    var username: Buffer
  }
  object UsernameAndPassword {
    
    inline def apply(password: Buffer, username: Buffer): UsernameAndPassword = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsernameAndPassword]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UsernameAndPassword] (val x: Self) extends AnyVal {
      
      inline def setPassword(value: Buffer): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: Buffer): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
