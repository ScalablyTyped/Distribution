package typings.sshpk

import typings.sshpk.mod.CurveType
import typings.sshpk.mod.Format.OpenSshSignature
import typings.sshpk.mod.Format.SshPrivateCipher
import typings.sshpk.mod.Format.x509Signature
import typings.sshpk.mod.Format.x509SignatureExt
import typings.sshpk.mod.IdentityComponent
import typings.sshpk.mod.IdentityType
import typings.sshpk.mod.KeyPart
import typings.sshpk.mod.Signature
import typings.sshpk.mod.SignaturePart
import typings.sshpk.sshpkStrings.sha1
import typings.sshpk.sshpkStrings.sha256
import typings.sshpk.sshpkStrings.sha512
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Buffer extends StObject {
    
    var buffer: js.UndefOr[typings.node.bufferMod.global.Buffer] = js.undefined
  }
  object Buffer {
    
    inline def apply(): Buffer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Buffer]
    }
    
    extension [Self <: Buffer](x: Self) {
      
      inline def setBuffer(value: typings.node.bufferMod.global.Buffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    }
  }
  
  trait Comment extends StObject {
    
    var comment: js.UndefOr[String] = js.undefined
  }
  object Comment {
    
    inline def apply(): Comment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Comment]
    }
    
    extension [Self <: Comment](x: Self) {
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    }
  }
  
  trait Components extends StObject {
    
    var components: js.Array[IdentityComponent]
    
    var email: js.UndefOr[String] = js.undefined
    
    var hostname: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[IdentityType] = js.undefined
    
    var uid: js.UndefOr[String] = js.undefined
  }
  object Components {
    
    inline def apply(components: js.Array[IdentityComponent]): Components = {
      val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any])
      __obj.asInstanceOf[Components]
    }
    
    extension [Self <: Components](x: Self) {
      
      inline def setComponents(value: js.Array[IdentityComponent]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsVarargs(value: IdentityComponent*): Self = StObject.set(x, "components", js.Array(value*))
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      inline def setType(value: IdentityType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    }
  }
  
  trait Curve extends StObject {
    
    var curve: js.UndefOr[CurveType] = js.undefined
  }
  object Curve {
    
    inline def apply(): Curve = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Curve]
    }
    
    extension [Self <: Curve](x: Self) {
      
      inline def setCurve(value: CurveType): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
      
      inline def setCurveUndefined: Self = StObject.set(x, "curve", js.undefined)
    }
  }
  
  trait Exts extends StObject {
    
    var exts: js.Array[x509SignatureExt]
    
    var issuerUniqueID: typings.node.bufferMod.global.Buffer
    
    var subjectUniqueID: typings.node.bufferMod.global.Buffer
  }
  object Exts {
    
    inline def apply(
      exts: js.Array[x509SignatureExt],
      issuerUniqueID: typings.node.bufferMod.global.Buffer,
      subjectUniqueID: typings.node.bufferMod.global.Buffer
    ): Exts = {
      val __obj = js.Dynamic.literal(exts = exts.asInstanceOf[js.Any], issuerUniqueID = issuerUniqueID.asInstanceOf[js.Any], subjectUniqueID = subjectUniqueID.asInstanceOf[js.Any])
      __obj.asInstanceOf[Exts]
    }
    
    extension [Self <: Exts](x: Self) {
      
      inline def setExts(value: js.Array[x509SignatureExt]): Self = StObject.set(x, "exts", value.asInstanceOf[js.Any])
      
      inline def setExtsVarargs(value: x509SignatureExt*): Self = StObject.set(x, "exts", js.Array(value*))
      
      inline def setIssuerUniqueID(value: typings.node.bufferMod.global.Buffer): Self = StObject.set(x, "issuerUniqueID", value.asInstanceOf[js.Any])
      
      inline def setSubjectUniqueID(value: typings.node.bufferMod.global.Buffer): Self = StObject.set(x, "subjectUniqueID", value.asInstanceOf[js.Any])
    }
  }
  
  trait HashAlgo extends StObject {
    
    var hashAlgo: js.UndefOr[sha1 | sha256 | sha512] = js.undefined
  }
  object HashAlgo {
    
    inline def apply(): HashAlgo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HashAlgo]
    }
    
    extension [Self <: HashAlgo](x: Self) {
      
      inline def setHashAlgo(value: sha1 | sha256 | sha512): Self = StObject.set(x, "hashAlgo", value.asInstanceOf[js.Any])
      
      inline def setHashAlgoUndefined: Self = StObject.set(x, "hashAlgo", js.undefined)
    }
  }
  
  trait Openssh extends StObject {
    
    var openssh: js.UndefOr[OpenSshSignature] = js.undefined
    
    var x509: js.UndefOr[x509Signature] = js.undefined
  }
  object Openssh {
    
    inline def apply(): Openssh = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Openssh]
    }
    
    extension [Self <: Openssh](x: Self) {
      
      inline def setOpenssh(value: OpenSshSignature): Self = StObject.set(x, "openssh", value.asInstanceOf[js.Any])
      
      inline def setOpensshUndefined: Self = StObject.set(x, "openssh", js.undefined)
      
      inline def setX509(value: x509Signature): Self = StObject.set(x, "x509", value.asInstanceOf[js.Any])
      
      inline def setX509Undefined: Self = StObject.set(x, "x509", js.undefined)
    }
  }
  
  trait Passphrase extends StObject {
    
    var passphrase: String | typings.node.bufferMod.global.Buffer
  }
  object Passphrase {
    
    inline def apply(passphrase: String | typings.node.bufferMod.global.Buffer): Passphrase = {
      val __obj = js.Dynamic.literal(passphrase = passphrase.asInstanceOf[js.Any])
      __obj.asInstanceOf[Passphrase]
    }
    
    extension [Self <: Passphrase](x: Self) {
      
      inline def setPassphrase(value: String | typings.node.bufferMod.global.Buffer): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined sshpk.sshpk.Format.ReadOptions & {  filename :string | undefined} */
  trait ReadOptionsfilenamestring extends StObject {
    
    var cipher: js.UndefOr[SshPrivateCipher] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    var passphrase: js.UndefOr[String | typings.node.bufferMod.global.Buffer] = js.undefined
  }
  object ReadOptionsfilenamestring {
    
    inline def apply(): ReadOptionsfilenamestring = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadOptionsfilenamestring]
    }
    
    extension [Self <: ReadOptionsfilenamestring](x: Self) {
      
      inline def setCipher(value: SshPrivateCipher): Self = StObject.set(x, "cipher", value.asInstanceOf[js.Any])
      
      inline def setCipherUndefined: Self = StObject.set(x, "cipher", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setPassphrase(value: String | typings.node.bufferMod.global.Buffer): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
    }
  }
  
  trait X509 extends StObject {
    
    var openssh: Signature
    
    var x509: Signature
  }
  object X509 {
    
    inline def apply(openssh: Signature, x509: Signature): X509 = {
      val __obj = js.Dynamic.literal(openssh = openssh.asInstanceOf[js.Any], x509 = x509.asInstanceOf[js.Any])
      __obj.asInstanceOf[X509]
    }
    
    extension [Self <: X509](x: Self) {
      
      inline def setOpenssh(value: Signature): Self = StObject.set(x, "openssh", value.asInstanceOf[js.Any])
      
      inline def setX509(value: Signature): Self = StObject.set(x, "x509", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ key in sshpk.sshpk.AlgorithmType ]: sshpk.sshpk.KeyPart} */
  trait keyinAlgorithmTypeKeyPart extends StObject {
    
    var dsa: KeyPart
    
    var ecdsa: KeyPart
    
    var ed25519: KeyPart
    
    var rsa: KeyPart
  }
  object keyinAlgorithmTypeKeyPart {
    
    inline def apply(dsa: KeyPart, ecdsa: KeyPart, ed25519: KeyPart, rsa: KeyPart): keyinAlgorithmTypeKeyPart = {
      val __obj = js.Dynamic.literal(dsa = dsa.asInstanceOf[js.Any], ecdsa = ecdsa.asInstanceOf[js.Any], ed25519 = ed25519.asInstanceOf[js.Any], rsa = rsa.asInstanceOf[js.Any])
      __obj.asInstanceOf[keyinAlgorithmTypeKeyPart]
    }
    
    extension [Self <: keyinAlgorithmTypeKeyPart](x: Self) {
      
      inline def setDsa(value: KeyPart): Self = StObject.set(x, "dsa", value.asInstanceOf[js.Any])
      
      inline def setEcdsa(value: KeyPart): Self = StObject.set(x, "ecdsa", value.asInstanceOf[js.Any])
      
      inline def setEd25519(value: KeyPart): Self = StObject.set(x, "ed25519", value.asInstanceOf[js.Any])
      
      inline def setRsa(value: KeyPart): Self = StObject.set(x, "rsa", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ key in sshpk.sshpk.IndentityOidName ]: std.Array<sshpk.sshpk.IdentityComponent>} */
  trait keyinIndentityOidNameArra extends StObject {
    
    var c: js.Array[IdentityComponent]
    
    var cn: js.Array[IdentityComponent]
    
    var dc: js.Array[IdentityComponent]
    
    var description: js.Array[IdentityComponent]
    
    var emailAddress: js.Array[IdentityComponent]
    
    var gn: js.Array[IdentityComponent]
    
    var initials: js.Array[IdentityComponent]
    
    var l: js.Array[IdentityComponent]
    
    var mail: js.Array[IdentityComponent]
    
    var o: js.Array[IdentityComponent]
    
    var ou: js.Array[IdentityComponent]
    
    var postalCode: js.Array[IdentityComponent]
    
    var pseudonym: js.Array[IdentityComponent]
    
    var role: js.Array[IdentityComponent]
    
    var s: js.Array[IdentityComponent]
    
    var serialNumber: js.Array[IdentityComponent]
    
    var sn: js.Array[IdentityComponent]
    
    var street: js.Array[IdentityComponent]
    
    var telephoneNumber: js.Array[IdentityComponent]
    
    var title: js.Array[IdentityComponent]
    
    var uid: js.Array[IdentityComponent]
    
    var x500UniqueIdentifier: js.Array[IdentityComponent]
  }
  object keyinIndentityOidNameArra {
    
    inline def apply(
      c: js.Array[IdentityComponent],
      cn: js.Array[IdentityComponent],
      dc: js.Array[IdentityComponent],
      description: js.Array[IdentityComponent],
      emailAddress: js.Array[IdentityComponent],
      gn: js.Array[IdentityComponent],
      initials: js.Array[IdentityComponent],
      l: js.Array[IdentityComponent],
      mail: js.Array[IdentityComponent],
      o: js.Array[IdentityComponent],
      ou: js.Array[IdentityComponent],
      postalCode: js.Array[IdentityComponent],
      pseudonym: js.Array[IdentityComponent],
      role: js.Array[IdentityComponent],
      s: js.Array[IdentityComponent],
      serialNumber: js.Array[IdentityComponent],
      sn: js.Array[IdentityComponent],
      street: js.Array[IdentityComponent],
      telephoneNumber: js.Array[IdentityComponent],
      title: js.Array[IdentityComponent],
      uid: js.Array[IdentityComponent],
      x500UniqueIdentifier: js.Array[IdentityComponent]
    ): keyinIndentityOidNameArra = {
      val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], cn = cn.asInstanceOf[js.Any], dc = dc.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], emailAddress = emailAddress.asInstanceOf[js.Any], gn = gn.asInstanceOf[js.Any], initials = initials.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], mail = mail.asInstanceOf[js.Any], o = o.asInstanceOf[js.Any], ou = ou.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], pseudonym = pseudonym.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], sn = sn.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any], telephoneNumber = telephoneNumber.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], x500UniqueIdentifier = x500UniqueIdentifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[keyinIndentityOidNameArra]
    }
    
    extension [Self <: keyinIndentityOidNameArra](x: Self) {
      
      inline def setC(value: js.Array[IdentityComponent]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
      
      inline def setCVarargs(value: IdentityComponent*): Self = StObject.set(x, "c", js.Array(value*))
      
      inline def setCn(value: js.Array[IdentityComponent]): Self = StObject.set(x, "cn", value.asInstanceOf[js.Any])
      
      inline def setCnVarargs(value: IdentityComponent*): Self = StObject.set(x, "cn", js.Array(value*))
      
      inline def setDc(value: js.Array[IdentityComponent]): Self = StObject.set(x, "dc", value.asInstanceOf[js.Any])
      
      inline def setDcVarargs(value: IdentityComponent*): Self = StObject.set(x, "dc", js.Array(value*))
      
      inline def setDescription(value: js.Array[IdentityComponent]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionVarargs(value: IdentityComponent*): Self = StObject.set(x, "description", js.Array(value*))
      
      inline def setEmailAddress(value: js.Array[IdentityComponent]): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
      
      inline def setEmailAddressVarargs(value: IdentityComponent*): Self = StObject.set(x, "emailAddress", js.Array(value*))
      
      inline def setGn(value: js.Array[IdentityComponent]): Self = StObject.set(x, "gn", value.asInstanceOf[js.Any])
      
      inline def setGnVarargs(value: IdentityComponent*): Self = StObject.set(x, "gn", js.Array(value*))
      
      inline def setInitials(value: js.Array[IdentityComponent]): Self = StObject.set(x, "initials", value.asInstanceOf[js.Any])
      
      inline def setInitialsVarargs(value: IdentityComponent*): Self = StObject.set(x, "initials", js.Array(value*))
      
      inline def setL(value: js.Array[IdentityComponent]): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      inline def setLVarargs(value: IdentityComponent*): Self = StObject.set(x, "l", js.Array(value*))
      
      inline def setMail(value: js.Array[IdentityComponent]): Self = StObject.set(x, "mail", value.asInstanceOf[js.Any])
      
      inline def setMailVarargs(value: IdentityComponent*): Self = StObject.set(x, "mail", js.Array(value*))
      
      inline def setO(value: js.Array[IdentityComponent]): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
      
      inline def setOVarargs(value: IdentityComponent*): Self = StObject.set(x, "o", js.Array(value*))
      
      inline def setOu(value: js.Array[IdentityComponent]): Self = StObject.set(x, "ou", value.asInstanceOf[js.Any])
      
      inline def setOuVarargs(value: IdentityComponent*): Self = StObject.set(x, "ou", js.Array(value*))
      
      inline def setPostalCode(value: js.Array[IdentityComponent]): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
      
      inline def setPostalCodeVarargs(value: IdentityComponent*): Self = StObject.set(x, "postalCode", js.Array(value*))
      
      inline def setPseudonym(value: js.Array[IdentityComponent]): Self = StObject.set(x, "pseudonym", value.asInstanceOf[js.Any])
      
      inline def setPseudonymVarargs(value: IdentityComponent*): Self = StObject.set(x, "pseudonym", js.Array(value*))
      
      inline def setRole(value: js.Array[IdentityComponent]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleVarargs(value: IdentityComponent*): Self = StObject.set(x, "role", js.Array(value*))
      
      inline def setS(value: js.Array[IdentityComponent]): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setSVarargs(value: IdentityComponent*): Self = StObject.set(x, "s", js.Array(value*))
      
      inline def setSerialNumber(value: js.Array[IdentityComponent]): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
      
      inline def setSerialNumberVarargs(value: IdentityComponent*): Self = StObject.set(x, "serialNumber", js.Array(value*))
      
      inline def setSn(value: js.Array[IdentityComponent]): Self = StObject.set(x, "sn", value.asInstanceOf[js.Any])
      
      inline def setSnVarargs(value: IdentityComponent*): Self = StObject.set(x, "sn", js.Array(value*))
      
      inline def setStreet(value: js.Array[IdentityComponent]): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
      
      inline def setStreetVarargs(value: IdentityComponent*): Self = StObject.set(x, "street", js.Array(value*))
      
      inline def setTelephoneNumber(value: js.Array[IdentityComponent]): Self = StObject.set(x, "telephoneNumber", value.asInstanceOf[js.Any])
      
      inline def setTelephoneNumberVarargs(value: IdentityComponent*): Self = StObject.set(x, "telephoneNumber", js.Array(value*))
      
      inline def setTitle(value: js.Array[IdentityComponent]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleVarargs(value: IdentityComponent*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setUid(value: js.Array[IdentityComponent]): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUidVarargs(value: IdentityComponent*): Self = StObject.set(x, "uid", js.Array(value*))
      
      inline def setX500UniqueIdentifier(value: js.Array[IdentityComponent]): Self = StObject.set(x, "x500UniqueIdentifier", value.asInstanceOf[js.Any])
      
      inline def setX500UniqueIdentifierVarargs(value: IdentityComponent*): Self = StObject.set(x, "x500UniqueIdentifier", js.Array(value*))
    }
  }
  
  /* Inlined {[ key in sshpk.sshpk.SignaturePartType ]: sshpk.sshpk.SignaturePart} */
  trait keyinSignaturePartTypeSig extends StObject {
    
    var r: SignaturePart
    
    var s: SignaturePart
    
    var sig: SignaturePart
  }
  object keyinSignaturePartTypeSig {
    
    inline def apply(r: SignaturePart, s: SignaturePart, sig: SignaturePart): keyinSignaturePartTypeSig = {
      val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], sig = sig.asInstanceOf[js.Any])
      __obj.asInstanceOf[keyinSignaturePartTypeSig]
    }
    
    extension [Self <: keyinSignaturePartTypeSig](x: Self) {
      
      inline def setR(value: SignaturePart): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setS(value: SignaturePart): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
      
      inline def setSig(value: SignaturePart): Self = StObject.set(x, "sig", value.asInstanceOf[js.Any])
    }
  }
}
