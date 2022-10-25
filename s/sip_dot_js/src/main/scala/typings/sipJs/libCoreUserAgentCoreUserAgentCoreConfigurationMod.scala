package typings.sipJs

import typings.sipJs.anon.Anonymous
import typings.sipJs.libCoreLogLoggerFactoryMod.LoggerFactory
import typings.sipJs.libCoreMessagesDigestAuthenticationMod.DigestAuthentication
import typings.sipJs.libCoreTransportMod.Transport
import typings.sipJs.libGrammarUriMod.URI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreUserAgentCoreUserAgentCoreConfigurationMod {
  
  @js.native
  trait Contact extends StObject {
    
    var pubGruu: js.UndefOr[URI] = js.native
    
    var tempGruu: js.UndefOr[URI] = js.native
    
    def toString(options: Anonymous): String = js.native
    
    var uri: URI = js.native
  }
  
  trait UserAgentCoreConfiguration extends StObject {
    
    /**
      * Address-of-Record (AOR).
      * @remarks
      * https://tools.ietf.org/html/rfc3261#section-6
      */
    var aor: URI
    
    /**
      * DEPRECATED
      * Authentication factory function.
      */
    def authenticationFactory(): js.UndefOr[DigestAuthentication]
    
    /**
      * Contact.
      * @remarks
      * https://tools.ietf.org/html/rfc3261#section-8.1.1.8
      */
    var contact: Contact
    
    /**
      * From header display name.
      */
    var displayName: String
    
    /**
      * Force Via header field transport to TCP.
      */
    var hackViaTcp: Boolean
    
    /**
      * Logger factory.
      */
    var loggerFactory: LoggerFactory
    
    /**
      * Preloaded route set.
      */
    var routeSet: js.Array[String]
    
    /**
      * Unique instance id.
      */
    var sipjsId: String
    
    /**
      * Option tags of supported SIP extensions.
      */
    var supportedOptionTags: js.Array[String]
    
    /**
      * Option tags of supported SIP extensions.
      * Used in responses.
      * @remarks
      * FIXME: Make this go away.
      */
    var supportedOptionTagsResponse: js.Array[String]
    
    /**
      * DEPRECATED: This is a hack to get around `Transport`
      * requiring the `UA` to start for construction.
      */
    def transportAccessor(): js.UndefOr[Transport]
    
    /**
      * User-Agent header field value.
      * @remarks
      * https://tools.ietf.org/html/rfc3261#section-20.41
      */
    var userAgentHeaderFieldValue: js.UndefOr[String] = js.undefined
    
    /**
      * Force use of "rport" Via header field parameter.
      * @remarks
      * https://www.ietf.org/rfc/rfc3581.txt
      */
    var viaForceRport: Boolean
    
    /**
      * Via header field host name or network address.
      * @remarks
      * The Via header field indicates the path taken by the request so far
      * and indicates the path that should be followed in routing responses.
      */
    var viaHost: String
  }
  object UserAgentCoreConfiguration {
    
    inline def apply(
      aor: URI,
      authenticationFactory: () => js.UndefOr[DigestAuthentication],
      contact: Contact,
      displayName: String,
      hackViaTcp: Boolean,
      loggerFactory: LoggerFactory,
      routeSet: js.Array[String],
      sipjsId: String,
      supportedOptionTags: js.Array[String],
      supportedOptionTagsResponse: js.Array[String],
      transportAccessor: () => js.UndefOr[Transport],
      viaForceRport: Boolean,
      viaHost: String
    ): UserAgentCoreConfiguration = {
      val __obj = js.Dynamic.literal(aor = aor.asInstanceOf[js.Any], authenticationFactory = js.Any.fromFunction0(authenticationFactory), contact = contact.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], hackViaTcp = hackViaTcp.asInstanceOf[js.Any], loggerFactory = loggerFactory.asInstanceOf[js.Any], routeSet = routeSet.asInstanceOf[js.Any], sipjsId = sipjsId.asInstanceOf[js.Any], supportedOptionTags = supportedOptionTags.asInstanceOf[js.Any], supportedOptionTagsResponse = supportedOptionTagsResponse.asInstanceOf[js.Any], transportAccessor = js.Any.fromFunction0(transportAccessor), viaForceRport = viaForceRport.asInstanceOf[js.Any], viaHost = viaHost.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserAgentCoreConfiguration]
    }
    
    extension [Self <: UserAgentCoreConfiguration](x: Self) {
      
      inline def setAor(value: URI): Self = StObject.set(x, "aor", value.asInstanceOf[js.Any])
      
      inline def setAuthenticationFactory(value: () => js.UndefOr[DigestAuthentication]): Self = StObject.set(x, "authenticationFactory", js.Any.fromFunction0(value))
      
      inline def setContact(value: Contact): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setHackViaTcp(value: Boolean): Self = StObject.set(x, "hackViaTcp", value.asInstanceOf[js.Any])
      
      inline def setLoggerFactory(value: LoggerFactory): Self = StObject.set(x, "loggerFactory", value.asInstanceOf[js.Any])
      
      inline def setRouteSet(value: js.Array[String]): Self = StObject.set(x, "routeSet", value.asInstanceOf[js.Any])
      
      inline def setRouteSetVarargs(value: String*): Self = StObject.set(x, "routeSet", js.Array(value*))
      
      inline def setSipjsId(value: String): Self = StObject.set(x, "sipjsId", value.asInstanceOf[js.Any])
      
      inline def setSupportedOptionTags(value: js.Array[String]): Self = StObject.set(x, "supportedOptionTags", value.asInstanceOf[js.Any])
      
      inline def setSupportedOptionTagsResponse(value: js.Array[String]): Self = StObject.set(x, "supportedOptionTagsResponse", value.asInstanceOf[js.Any])
      
      inline def setSupportedOptionTagsResponseVarargs(value: String*): Self = StObject.set(x, "supportedOptionTagsResponse", js.Array(value*))
      
      inline def setSupportedOptionTagsVarargs(value: String*): Self = StObject.set(x, "supportedOptionTags", js.Array(value*))
      
      inline def setTransportAccessor(value: () => js.UndefOr[Transport]): Self = StObject.set(x, "transportAccessor", js.Any.fromFunction0(value))
      
      inline def setUserAgentHeaderFieldValue(value: String): Self = StObject.set(x, "userAgentHeaderFieldValue", value.asInstanceOf[js.Any])
      
      inline def setUserAgentHeaderFieldValueUndefined: Self = StObject.set(x, "userAgentHeaderFieldValue", js.undefined)
      
      inline def setViaForceRport(value: Boolean): Self = StObject.set(x, "viaForceRport", value.asInstanceOf[js.Any])
      
      inline def setViaHost(value: String): Self = StObject.set(x, "viaHost", value.asInstanceOf[js.Any])
    }
  }
}
