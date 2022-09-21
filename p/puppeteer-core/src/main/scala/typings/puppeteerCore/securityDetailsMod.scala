package typings.puppeteerCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object securityDetailsMod {
  
  @JSImport("puppeteer-core/lib/cjs/puppeteer/common/SecurityDetails", "SecurityDetails")
  @js.native
  open class SecurityDetails protected () extends StObject {
    /**
      * @internal
      */
    def this(securityPayload: typings.devtoolsProtocol.mod.Protocol.Network.SecurityDetails) = this()
    
    /**
      * @returns The name of the issuer of the certificate.
      */
    def issuer(): String = js.native
    
    /* private */ var `private`: Any = js.native
    
    /**
      * @returns The security protocol being used, e.g. "TLS 1.2".
      */
    def protocol(): String = js.native
    
    /**
      * @returns The list of {@link https://en.wikipedia.org/wiki/Subject_Alternative_Name | subject alternative names (SANs)} of the certificate.
      */
    def subjectAlternativeNames(): js.Array[String] = js.native
    
    /**
      * @returns The name of the subject to which the certificate was issued.
      */
    def subjectName(): String = js.native
    
    /**
      * @returns {@link https://en.wikipedia.org/wiki/Unix_time | Unix timestamp}
      * marking the start of the certificate's validity.
      */
    def validFrom(): Double = js.native
    
    /**
      * @returns {@link https://en.wikipedia.org/wiki/Unix_time | Unix timestamp}
      * marking the end of the certificate's validity.
      */
    def validTo(): Double = js.native
  }
}
