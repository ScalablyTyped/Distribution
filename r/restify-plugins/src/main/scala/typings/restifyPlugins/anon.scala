package typings.restifyPlugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Headers extends StObject {
    
    var headers: js.Array[String] = js.native
  }
  object Headers {
    
    @scala.inline
    def apply(headers: js.Array[String]): Headers = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Headers]
    }
    
    @scala.inline
    implicit class HeadersMutableBuilder[Self <: Headers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value :_*))
    }
  }
  
  @js.native
  trait MapParams extends StObject {
    
    var mapParams: js.UndefOr[Boolean] = js.native
    
    var overrideParams: js.UndefOr[Boolean] = js.native
    
    var reviver: js.UndefOr[js.Any] = js.native
  }
  object MapParams {
    
    @scala.inline
    def apply(): MapParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapParams]
    }
    
    @scala.inline
    implicit class MapParamsMutableBuilder[Self <: MapParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMapParams(value: Boolean): Self = StObject.set(x, "mapParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapParamsUndefined: Self = StObject.set(x, "mapParams", js.undefined)
      
      @scala.inline
      def setOverrideParams(value: Boolean): Self = StObject.set(x, "overrideParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrideParamsUndefined: Self = StObject.set(x, "overrideParams", js.undefined)
      
      @scala.inline
      def setReviver(value: js.Any): Self = StObject.set(x, "reviver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReviverUndefined: Self = StObject.set(x, "reviver", js.undefined)
    }
  }
  
  @js.native
  trait MaxBodySize extends StObject {
    
    var maxBodySize: js.UndefOr[Double] = js.native
  }
  object MaxBodySize {
    
    @scala.inline
    def apply(): MaxBodySize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxBodySize]
    }
    
    @scala.inline
    implicit class MaxBodySizeMutableBuilder[Self <: MaxBodySize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxBodySize(value: Double): Self = StObject.set(x, "maxBodySize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBodySizeUndefined: Self = StObject.set(x, "maxBodySize", js.undefined)
    }
  }
  
  @js.native
  trait Message extends StObject {
    
    var message: String = js.native
  }
  object Message {
    
    @scala.inline
    def apply(message: String): Message = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Server extends StObject {
    
    var server: typings.restify.mod.Server = js.native
  }
  object Server {
    
    @scala.inline
    def apply(server: typings.restify.mod.Server): Server = {
      val __obj = js.Dynamic.literal(server = server.asInstanceOf[js.Any])
      __obj.asInstanceOf[Server]
    }
    
    @scala.inline
    implicit class ServerMutableBuilder[Self <: Server] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setServer(value: typings.restify.mod.Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserAgentRegExp extends StObject {
    
    var userAgentRegExp: js.Any = js.native
  }
  object UserAgentRegExp {
    
    @scala.inline
    def apply(userAgentRegExp: js.Any): UserAgentRegExp = {
      val __obj = js.Dynamic.literal(userAgentRegExp = userAgentRegExp.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserAgentRegExp]
    }
    
    @scala.inline
    implicit class UserAgentRegExpMutableBuilder[Self <: UserAgentRegExp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUserAgentRegExp(value: js.Any): Self = StObject.set(x, "userAgentRegExp", value.asInstanceOf[js.Any])
    }
  }
}
