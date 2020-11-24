package typings.samlp.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdPOptions extends js.Object {
  
  var RelayState: js.UndefOr[String] = js.native
  
  var audience: js.UndefOr[String] = js.native
  
  var authnContextClassRef: js.UndefOr[String] = js.native
  
  var cert: String | Buffer = js.native
  
  var destination: js.UndefOr[String] = js.native
  
  var digestAlgorithm: js.UndefOr[DigestAlgorithmType] = js.native
  
  var encryptionAlgorithm: js.UndefOr[String] = js.native
  
  var encryptionCert: js.UndefOr[String | Buffer] = js.native
  
  var encryptionPublicKey: js.UndefOr[String | Buffer] = js.native
  
  def getPostURL(
    audience: String,
    authnRequestDom: js.Any,
    req: Request_[ParamsDictionary, _, _, Query],
    callback: js.Function2[/* err */ js.Any, /* url */ String, Unit]
  ): Unit = js.native
  
  var getUserFromRequest: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], _]] = js.native
  
  var inResponseTo: js.UndefOr[String] = js.native
  
  var issuer: String = js.native
  
  var key: String | Buffer = js.native
  
  var keyEncryptionAlgorighm: js.UndefOr[String] = js.native
  
  var lifetimeInSeconds: js.UndefOr[Double] = js.native
  
  var profileMapper: js.UndefOr[ProfileMapperConstructor] = js.native
  
  var recipient: js.UndefOr[String] = js.native
  
  var signResponse: js.UndefOr[Boolean] = js.native
  
  var signatureAlgorithm: js.UndefOr[SignatureAlgorithmType] = js.native
}
object IdPOptions {
  
  @scala.inline
  def apply(
    cert: String | Buffer,
    getPostURL: (String, js.Any, Request_[ParamsDictionary, _, _, Query], js.Function2[/* err */ js.Any, /* url */ String, Unit]) => Unit,
    issuer: String,
    key: String | Buffer
  ): IdPOptions = {
    val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], getPostURL = js.Any.fromFunction4(getPostURL), issuer = issuer.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdPOptions]
  }
  
  @scala.inline
  implicit class IdPOptionsOps[Self <: IdPOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCert(value: String | Buffer): Self = this.set("cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetPostURL(
      value: (String, js.Any, Request_[ParamsDictionary, _, _, Query], js.Function2[/* err */ js.Any, /* url */ String, Unit]) => Unit
    ): Self = this.set("getPostURL", js.Any.fromFunction4(value))
    
    @scala.inline
    def setIssuer(value: String): Self = this.set("issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String | Buffer): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelayState(value: String): Self = this.set("RelayState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelayState: Self = this.set("RelayState", js.undefined)
    
    @scala.inline
    def setAudience(value: String): Self = this.set("audience", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudience: Self = this.set("audience", js.undefined)
    
    @scala.inline
    def setAuthnContextClassRef(value: String): Self = this.set("authnContextClassRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthnContextClassRef: Self = this.set("authnContextClassRef", js.undefined)
    
    @scala.inline
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    
    @scala.inline
    def setDigestAlgorithm(value: DigestAlgorithmType): Self = this.set("digestAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDigestAlgorithm: Self = this.set("digestAlgorithm", js.undefined)
    
    @scala.inline
    def setEncryptionAlgorithm(value: String): Self = this.set("encryptionAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionAlgorithm: Self = this.set("encryptionAlgorithm", js.undefined)
    
    @scala.inline
    def setEncryptionCert(value: String | Buffer): Self = this.set("encryptionCert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionCert: Self = this.set("encryptionCert", js.undefined)
    
    @scala.inline
    def setEncryptionPublicKey(value: String | Buffer): Self = this.set("encryptionPublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionPublicKey: Self = this.set("encryptionPublicKey", js.undefined)
    
    @scala.inline
    def setGetUserFromRequest(value: /* req */ Request_[ParamsDictionary, _, _, Query] => _): Self = this.set("getUserFromRequest", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetUserFromRequest: Self = this.set("getUserFromRequest", js.undefined)
    
    @scala.inline
    def setInResponseTo(value: String): Self = this.set("inResponseTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInResponseTo: Self = this.set("inResponseTo", js.undefined)
    
    @scala.inline
    def setKeyEncryptionAlgorighm(value: String): Self = this.set("keyEncryptionAlgorighm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyEncryptionAlgorighm: Self = this.set("keyEncryptionAlgorighm", js.undefined)
    
    @scala.inline
    def setLifetimeInSeconds(value: Double): Self = this.set("lifetimeInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLifetimeInSeconds: Self = this.set("lifetimeInSeconds", js.undefined)
    
    @scala.inline
    def setProfileMapper(value: ProfileMapperConstructor): Self = this.set("profileMapper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfileMapper: Self = this.set("profileMapper", js.undefined)
    
    @scala.inline
    def setRecipient(value: String): Self = this.set("recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipient: Self = this.set("recipient", js.undefined)
    
    @scala.inline
    def setSignResponse(value: Boolean): Self = this.set("signResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignResponse: Self = this.set("signResponse", js.undefined)
    
    @scala.inline
    def setSignatureAlgorithm(value: SignatureAlgorithmType): Self = this.set("signatureAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureAlgorithm: Self = this.set("signatureAlgorithm", js.undefined)
  }
}
