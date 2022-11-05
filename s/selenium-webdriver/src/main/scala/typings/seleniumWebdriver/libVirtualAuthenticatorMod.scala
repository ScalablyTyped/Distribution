package typings.seleniumWebdriver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVirtualAuthenticatorMod {
  
  @JSImport("selenium-webdriver/lib/virtual_authenticator", "Credential")
  @js.native
  open class Credential protected () extends StObject {
    def this(
      credentialId: js.typedarray.Uint8Array,
      isResidentCredential: Boolean,
      rpId: String,
      userHandle: js.typedarray.Uint8Array,
      privateKey: String,
      signCount: Double
    ) = this()
    def this(
      credentialId: js.typedarray.Uint8Array,
      isResidentCredential: Boolean,
      rpId: String,
      userHandle: Null,
      privateKey: String,
      signCount: Double
    ) = this()
    
    def fromDict(data: js.Object): Credential = js.native
    
    def id(): js.typedarray.Uint8Array = js.native
    
    def isResidentCredential(): Boolean = js.native
    
    def privateKey(): String = js.native
    
    def rpId(): String = js.native
    
    def signCount(): Double = js.native
    
    def toDict(): js.Object = js.native
    
    def userHandle(): js.typedarray.Uint8Array | Null = js.native
  }
  /* static members */
  object Credential {
    
    @JSImport("selenium-webdriver/lib/virtual_authenticator", "Credential")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a non-resident (i.e. stateless) credential.
      * @param id Unique base64 encoded string.
      * @param rpId Relying party identifier.
      * @param privateKey Base64 encoded PKCS
      * @param signCount initial value for a signature counter.
      * @returns A non-resident credential
      */
    inline def createNonResidentCredential(id: js.typedarray.Uint8Array, rpId: String, privateKey: String, signCount: Double): Credential = (^.asInstanceOf[js.Dynamic].applyDynamic("createNonResidentCredential")(id.asInstanceOf[js.Any], rpId.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], signCount.asInstanceOf[js.Any])).asInstanceOf[Credential]
    
    /**
      * Creates a resident (i.e. stateless) credential.
      * @param id Unique base64 encoded string.
      * @param rpId Relying party identifier.
      * @param userHandle userHandle associated to the credential. Must be Base64 encoded string.
      * @param privateKey Base64 encoded PKCS
      * @param signCount initial value for a signature counter.
      * @returns A resident credential
      */
    inline def createResidentCredential(
      id: js.typedarray.Uint8Array,
      rpId: String,
      userHandle: js.typedarray.Uint8Array,
      privateKey: String,
      signCount: Double
    ): Credential = (^.asInstanceOf[js.Dynamic].applyDynamic("createResidentCredential")(id.asInstanceOf[js.Any], rpId.asInstanceOf[js.Any], userHandle.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], signCount.asInstanceOf[js.Any])).asInstanceOf[Credential]
  }
  
  @js.native
  sealed trait Protocol extends StObject
  @JSImport("selenium-webdriver/lib/virtual_authenticator", "Protocol")
  @js.native
  object Protocol extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Protocol & String] = js.native
    
    @js.native
    sealed trait CTAP2
      extends StObject
         with Protocol
    /* "ctap2" */ val CTAP2: typings.seleniumWebdriver.libVirtualAuthenticatorMod.Protocol.CTAP2 & String = js.native
    
    @js.native
    sealed trait U2F
      extends StObject
         with Protocol
    /* "ctap1/u2f" */ val U2F: typings.seleniumWebdriver.libVirtualAuthenticatorMod.Protocol.U2F & String = js.native
  }
  
  @js.native
  sealed trait Transport extends StObject
  @JSImport("selenium-webdriver/lib/virtual_authenticator", "Transport")
  @js.native
  object Transport extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Transport & String] = js.native
    
    @js.native
    sealed trait BLE
      extends StObject
         with Transport
    /* "ble" */ val BLE: typings.seleniumWebdriver.libVirtualAuthenticatorMod.Transport.BLE & String = js.native
    
    @js.native
    sealed trait INTERNAL
      extends StObject
         with Transport
    /* "internal" */ val INTERNAL: typings.seleniumWebdriver.libVirtualAuthenticatorMod.Transport.INTERNAL & String = js.native
    
    @js.native
    sealed trait NFC
      extends StObject
         with Transport
    /* "nfc" */ val NFC: typings.seleniumWebdriver.libVirtualAuthenticatorMod.Transport.NFC & String = js.native
    
    @js.native
    sealed trait USB
      extends StObject
         with Transport
    /* "usb" */ val USB: typings.seleniumWebdriver.libVirtualAuthenticatorMod.Transport.USB & String = js.native
  }
  
  @JSImport("selenium-webdriver/lib/virtual_authenticator", "VirtualAuthenticatorOptions")
  @js.native
  open class VirtualAuthenticatorOptions () extends StObject {
    
    def getHasResidentKey(): Boolean = js.native
    
    def getHasUserVerification(): Boolean = js.native
    
    def getIsUserConsenting(): Boolean = js.native
    
    def getIsUserVerified(): Boolean = js.native
    
    def getProtocol(): Protocol = js.native
    
    def getTransport(): Transport = js.native
    
    def setHasResidentKey(value: Boolean): Unit = js.native
    
    def setHasUserVerification(value: Boolean): Unit = js.native
    
    def setIsUserConsenting(value: Boolean): Unit = js.native
    
    def setIsUserVerified(value: Boolean): Unit = js.native
    
    def setProtocol(protocol: Protocol): Unit = js.native
    
    def setTransport(transport: Transport): Unit = js.native
    
    def toDict(): js.Object = js.native
  }
}
