package typings.sshpk.mod

import typings.asn1.mod.BerReader
import typings.asn1.mod.BerWriter
import typings.node.bufferMod.global.Buffer
import typings.sshpk.anon.Comment
import typings.sshpk.anon.Exts
import typings.sshpk.anon.HashAlgo
import typings.sshpk.anon.Passphrase
import typings.sshpk.mod.Format.ReadOptions
import typings.sshpk.mod.Format.WriteOptions
import typings.sshpk.sshpkBooleans.`false`
import typings.sshpk.sshpkStrings.DSA
import typings.sshpk.sshpkStrings.EC
import typings.sshpk.sshpkStrings.ECDSA
import typings.sshpk.sshpkStrings.EDDSA
import typings.sshpk.sshpkStrings.EdDSA_
import typings.sshpk.sshpkStrings.RSA
import typings.sshpk.sshpkStrings.`private`
import typings.sshpk.sshpkStrings.pkcs1
import typings.sshpk.sshpkStrings.pkcs8
import typings.sshpk.sshpkStrings.public
import typings.sshpk.sshpkStrings.sha1
import typings.sshpk.sshpkStrings.sha256
import typings.sshpk.sshpkStrings.sha512
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// == formats/*.js == //
@js.native
trait Format extends StObject {
  
  def read(buf: String): Key | Certificate = js.native
  def read(buf: String, options: ReadOptions): Key | Certificate = js.native
  def read(buf: Buffer): Key | Certificate = js.native
  def read(buf: Buffer, options: ReadOptions): Key | Certificate = js.native
  
  def write(keyOrCert: Certificate): Buffer = js.native
  def write(keyOrCert: Certificate, options: WriteOptions): Buffer = js.native
  def write(keyOrCert: Key): Buffer = js.native
  def write(keyOrCert: Key, options: WriteOptions): Buffer = js.native
  def write(keyOrCert: PrivateKey): Buffer = js.native
  def write(keyOrCert: PrivateKey, options: WriteOptions): Buffer = js.native
}
object Format {
  
  @js.native
  trait Auto
    extends StObject
       with Format
  
  @js.native
  trait DnsSec
    extends StObject
       with Format {
    
    def write(key: PrivateKey, options: HashAlgo): Buffer = js.native
  }
  
  @js.native
  trait OpenSshCert
    extends StObject
       with Format {
    
    def sign(cert: Certificate, key: PrivateKey): Boolean = js.native
    
    def signAsync(
      cert: Certificate,
      signer: js.Function2[
          /* blob */ Buffer, 
          /* done */ js.Function2[/* err */ js.UndefOr[js.Error], /* signature */ Signature, Unit], 
          Unit
        ],
      done: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    
    def verify(): `false` = js.native
    
    def write(cert: Certificate, options: Comment): Buffer = js.native
  }
  
  trait OpenSshSignature extends StObject {
    
    var exts: js.Array[OpenSshSignatureExt]
    
    var keyId: String
    
    var nonce: Buffer
    
    var signature: Signature
  }
  object OpenSshSignature {
    
    inline def apply(exts: js.Array[OpenSshSignatureExt], keyId: String, nonce: Buffer, signature: Signature): OpenSshSignature = {
      val __obj = js.Dynamic.literal(exts = exts.asInstanceOf[js.Any], keyId = keyId.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenSshSignature]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OpenSshSignature] (val x: Self) extends AnyVal {
      
      inline def setExts(value: js.Array[OpenSshSignatureExt]): Self = StObject.set(x, "exts", value.asInstanceOf[js.Any])
      
      inline def setExtsVarargs(value: OpenSshSignatureExt*): Self = StObject.set(x, "exts", js.Array(value*))
      
      inline def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: Buffer): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setSignature(value: Signature): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
  
  trait OpenSshSignatureExt extends StObject {
    
    var critical: Boolean
    
    var data: Buffer
    
    var name: String
  }
  object OpenSshSignatureExt {
    
    inline def apply(critical: Boolean, data: Buffer, name: String): OpenSshSignatureExt = {
      val __obj = js.Dynamic.literal(critical = critical.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenSshSignatureExt]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OpenSshSignatureExt] (val x: Self) extends AnyVal {
      
      inline def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
      
      inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Pem
    extends StObject
       with Format {
    
    def read(buf: String, options: Unit, forceType: pkcs1 | pkcs8): Key = js.native
    def read(buf: String, options: ReadOptions, forceType: pkcs1 | pkcs8): Key = js.native
    def read(buf: Buffer, options: Unit, forceType: pkcs1 | pkcs8): Key = js.native
    def read(buf: Buffer, options: ReadOptions, forceType: pkcs1 | pkcs8): Key = js.native
    
    def write(key: Key, options: Any): Buffer = js.native
    def write(key: Key, options: Any, `type`: pkcs1 | pkcs8): Buffer = js.native
    def write(key: Key, options: Unit, `type`: pkcs1 | pkcs8): Buffer = js.native
  }
  
  @js.native
  trait Pkcs1
    extends StObject
       with Format {
    
    def readPkcs1(alg: RSA | DSA | EC | ECDSA | EDDSA | EdDSA_, `type`: `private`, der: BerReader): PrivateKey = js.native
    def readPkcs1(alg: RSA | DSA | EC | ECDSA, `type`: public, der: BerReader): Key = js.native
    
    def writePkcs1(der: BerWriter, key: Key): Unit = js.native
  }
  
  @js.native
  trait Pkcs8
    extends StObject
       with Format {
    
    def pkcs8ToBuffer(key: Key): Buffer = js.native
    
    def readECDSACurve(der: BerReader): CurveType = js.native
    
    def readPkcs8(alg: Any, `type`: KeyType, der: BerReader): Key = js.native
    
    def writeECDSACurve(key: Key, der: BerWriter): Unit = js.native
    
    def writePkcs8(der: BerWriter, key: Key): Unit = js.native
  }
  
  @js.native
  trait Putty
    extends StObject
       with Format
  
  trait ReadOptions extends StObject {
    
    var cipher: js.UndefOr[SshPrivateCipher] = js.undefined
    
    var passphrase: js.UndefOr[String | Buffer] = js.undefined
  }
  object ReadOptions {
    
    inline def apply(): ReadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadOptions] (val x: Self) extends AnyVal {
      
      inline def setCipher(value: SshPrivateCipher): Self = StObject.set(x, "cipher", value.asInstanceOf[js.Any])
      
      inline def setCipherUndefined: Self = StObject.set(x, "cipher", js.undefined)
      
      inline def setPassphrase(value: String | Buffer): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
    }
  }
  
  @js.native
  trait Rfc4253
    extends StObject
       with Format {
    
    def algToKeyType(alg: Rfc4253Algorithm): AlgorithmTypeWithCurve = js.native
    
    def keyTypeToAlg(key: Key): Rfc4253Algorithm = js.native
    
    def readInternal(partial: Boolean, `type`: Unit, buf: String): Key = js.native
    def readInternal(partial: Boolean, `type`: Unit, buf: Buffer): Key = js.native
    /* shared with ssh format */
    def readInternal(partial: Boolean, `type`: KeyType, buf: String): Key = js.native
    def readInternal(partial: Boolean, `type`: KeyType, buf: Buffer): Key = js.native
    
    def readPartial(`type`: Unit, buf: String): Key = js.native
    def readPartial(`type`: Unit, buf: Buffer): Key = js.native
    /* semi-private api, used by sshpk-agent */
    def readPartial(`type`: KeyType, buf: String): Key = js.native
    def readPartial(`type`: KeyType, buf: Buffer): Key = js.native
    
    def readType(`type`: Unit, buf: String): Key = js.native
    def readType(`type`: Unit, buf: Buffer): Key = js.native
    def readType(`type`: KeyType, buf: String): Key = js.native
    def readType(`type`: KeyType, buf: Buffer): Key = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sshpk.sshpkStrings.`ssh-dss`
    - typings.sshpk.sshpkStrings.`ssh-rsa`
    - typings.sshpk.sshpkStrings.`ssh-ed25519`
    - typings.sshpk.sshpkStrings.`ssh-curve25519`
    - typings.sshpk.sshpkStrings.`ecdsa-sha2-nistp256`
    - typings.sshpk.sshpkStrings.`ecdsa-sha2-nistp384`
    - typings.sshpk.sshpkStrings.`ecdsa-sha2-nistp521`
  */
  trait Rfc4253Algorithm extends StObject
  object Rfc4253Algorithm {
    
    inline def `ecdsa-sha2-nistp256`: typings.sshpk.sshpkStrings.`ecdsa-sha2-nistp256` = "ecdsa-sha2-nistp256".asInstanceOf[typings.sshpk.sshpkStrings.`ecdsa-sha2-nistp256`]
    
    inline def `ecdsa-sha2-nistp384`: typings.sshpk.sshpkStrings.`ecdsa-sha2-nistp384` = "ecdsa-sha2-nistp384".asInstanceOf[typings.sshpk.sshpkStrings.`ecdsa-sha2-nistp384`]
    
    inline def `ecdsa-sha2-nistp521`: typings.sshpk.sshpkStrings.`ecdsa-sha2-nistp521` = "ecdsa-sha2-nistp521".asInstanceOf[typings.sshpk.sshpkStrings.`ecdsa-sha2-nistp521`]
    
    inline def `ssh-curve25519`: typings.sshpk.sshpkStrings.`ssh-curve25519` = "ssh-curve25519".asInstanceOf[typings.sshpk.sshpkStrings.`ssh-curve25519`]
    
    inline def `ssh-dss`: typings.sshpk.sshpkStrings.`ssh-dss` = "ssh-dss".asInstanceOf[typings.sshpk.sshpkStrings.`ssh-dss`]
    
    inline def `ssh-ed25519`: typings.sshpk.sshpkStrings.`ssh-ed25519` = "ssh-ed25519".asInstanceOf[typings.sshpk.sshpkStrings.`ssh-ed25519`]
    
    inline def `ssh-rsa`: typings.sshpk.sshpkStrings.`ssh-rsa` = "ssh-rsa".asInstanceOf[typings.sshpk.sshpkStrings.`ssh-rsa`]
  }
  
  @js.native
  trait Ssh
    extends StObject
       with Format
  
  @js.native
  trait SshPrivate
    extends StObject
       with Format {
    
    def read(buf: String, options: Unit, forceType: pkcs1 | pkcs8): Key = js.native
    def read(buf: String, options: ReadOptions, forceType: pkcs1 | pkcs8): Key = js.native
    def read(buf: Buffer, options: Unit, forceType: pkcs1 | pkcs8): Key = js.native
    def read(buf: Buffer, options: ReadOptions, forceType: pkcs1 | pkcs8): Key = js.native
    
    def readSSHPrivate(`type`: KeyType, buf: Buffer, options: Passphrase): Key = js.native
    
    def write(key: Key, options: ReadOptions): Buffer = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sshpk.sshpkStrings.`3des-cbc`
    - typings.sshpk.sshpkStrings.`blowfish-cbc`
    - typings.sshpk.sshpkStrings.`aes128-cbc`
    - typings.sshpk.sshpkStrings.`aes128-ctr`
    - typings.sshpk.sshpkStrings.`aes128-gcm@opensshDotcom`
    - typings.sshpk.sshpkStrings.`aes192-cbc`
    - typings.sshpk.sshpkStrings.`aes192-ctr`
    - typings.sshpk.sshpkStrings.`aes192-gcm@opensshDotcom`
    - typings.sshpk.sshpkStrings.`aes256-cbc`
    - typings.sshpk.sshpkStrings.`aes256-ctr`
    - typings.sshpk.sshpkStrings.`aes256-gcm@opensshDotcom`
  */
  trait SshPrivateCipher extends StObject
  object SshPrivateCipher {
    
    inline def `3des-cbc`: typings.sshpk.sshpkStrings.`3des-cbc` = "3des-cbc".asInstanceOf[typings.sshpk.sshpkStrings.`3des-cbc`]
    
    inline def `aes128-cbc`: typings.sshpk.sshpkStrings.`aes128-cbc` = "aes128-cbc".asInstanceOf[typings.sshpk.sshpkStrings.`aes128-cbc`]
    
    inline def `aes128-ctr`: typings.sshpk.sshpkStrings.`aes128-ctr` = "aes128-ctr".asInstanceOf[typings.sshpk.sshpkStrings.`aes128-ctr`]
    
    inline def `aes128-gcm@opensshDotcom`: typings.sshpk.sshpkStrings.`aes128-gcm@opensshDotcom` = "aes128-gcm@openssh.com".asInstanceOf[typings.sshpk.sshpkStrings.`aes128-gcm@opensshDotcom`]
    
    inline def `aes192-cbc`: typings.sshpk.sshpkStrings.`aes192-cbc` = "aes192-cbc".asInstanceOf[typings.sshpk.sshpkStrings.`aes192-cbc`]
    
    inline def `aes192-ctr`: typings.sshpk.sshpkStrings.`aes192-ctr` = "aes192-ctr".asInstanceOf[typings.sshpk.sshpkStrings.`aes192-ctr`]
    
    inline def `aes192-gcm@opensshDotcom`: typings.sshpk.sshpkStrings.`aes192-gcm@opensshDotcom` = "aes192-gcm@openssh.com".asInstanceOf[typings.sshpk.sshpkStrings.`aes192-gcm@opensshDotcom`]
    
    inline def `aes256-cbc`: typings.sshpk.sshpkStrings.`aes256-cbc` = "aes256-cbc".asInstanceOf[typings.sshpk.sshpkStrings.`aes256-cbc`]
    
    inline def `aes256-ctr`: typings.sshpk.sshpkStrings.`aes256-ctr` = "aes256-ctr".asInstanceOf[typings.sshpk.sshpkStrings.`aes256-ctr`]
    
    inline def `aes256-gcm@opensshDotcom`: typings.sshpk.sshpkStrings.`aes256-gcm@opensshDotcom` = "aes256-gcm@openssh.com".asInstanceOf[typings.sshpk.sshpkStrings.`aes256-gcm@opensshDotcom`]
    
    inline def `blowfish-cbc`: typings.sshpk.sshpkStrings.`blowfish-cbc` = "blowfish-cbc".asInstanceOf[typings.sshpk.sshpkStrings.`blowfish-cbc`]
  }
  
  trait WriteOptions
    extends StObject
       with ReadOptions {
    
    var comment: js.UndefOr[String] = js.undefined
    
    var hashAlgo: js.UndefOr[sha1 | sha256 | sha512] = js.undefined
  }
  object WriteOptions {
    
    inline def apply(): WriteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WriteOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WriteOptions] (val x: Self) extends AnyVal {
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setHashAlgo(value: sha1 | sha256 | sha512): Self = StObject.set(x, "hashAlgo", value.asInstanceOf[js.Any])
      
      inline def setHashAlgoUndefined: Self = StObject.set(x, "hashAlgo", js.undefined)
    }
  }
  
  @js.native
  trait x509
    extends StObject
       with Format {
    
    def sign(cert: Certificate, key: PrivateKey): Boolean = js.native
    
    def signAsync(
      cert: Certificate,
      signer: js.Function2[
          /* blob */ Buffer, 
          /* done */ js.Function2[/* err */ js.UndefOr[js.Error], /* signature */ Signature, Unit], 
          Unit
        ],
      done: js.Function1[/* err */ js.UndefOr[js.Error], Unit]
    ): Unit = js.native
    
    def verify(cert: Certificate, key: Key): Boolean = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sshpk.sshpkStrings.`2Dot5Dot29Dot35`
    - typings.sshpk.sshpkStrings.`2Dot5Dot29Dot17`
    - typings.sshpk.sshpkStrings.`2Dot5Dot29Dot19`
    - typings.sshpk.sshpkStrings.`2Dot5Dot29Dot15`
    - typings.sshpk.sshpkStrings.`2Dot5Dot29Dot37`
  */
  trait x509ExtsOid extends StObject
  object x509ExtsOid {
    
    inline def `2Dot5Dot29Dot15`: typings.sshpk.sshpkStrings.`2Dot5Dot29Dot15` = "2.5.29.15".asInstanceOf[typings.sshpk.sshpkStrings.`2Dot5Dot29Dot15`]
    
    inline def `2Dot5Dot29Dot17`: typings.sshpk.sshpkStrings.`2Dot5Dot29Dot17` = "2.5.29.17".asInstanceOf[typings.sshpk.sshpkStrings.`2Dot5Dot29Dot17`]
    
    inline def `2Dot5Dot29Dot19`: typings.sshpk.sshpkStrings.`2Dot5Dot29Dot19` = "2.5.29.19".asInstanceOf[typings.sshpk.sshpkStrings.`2Dot5Dot29Dot19`]
    
    inline def `2Dot5Dot29Dot35`: typings.sshpk.sshpkStrings.`2Dot5Dot29Dot35` = "2.5.29.35".asInstanceOf[typings.sshpk.sshpkStrings.`2Dot5Dot29Dot35`]
    
    inline def `2Dot5Dot29Dot37`: typings.sshpk.sshpkStrings.`2Dot5Dot29Dot37` = "2.5.29.37".asInstanceOf[typings.sshpk.sshpkStrings.`2Dot5Dot29Dot37`]
  }
  
  @js.native
  trait x509Pem
    extends StObject
       with Format {
    
    def sign(cert: Certificate, key: PrivateKey): Boolean = js.native
    
    def verify(cert: Certificate, key: Key): Boolean = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sshpk.sshpkStrings.`rsa-md5`
    - typings.sshpk.sshpkStrings.`rsa-sha1`
    - typings.sshpk.sshpkStrings.`rsa-sha256`
    - typings.sshpk.sshpkStrings.`rsa-sha384`
    - typings.sshpk.sshpkStrings.`rsa-sha512`
    - typings.sshpk.sshpkStrings.`dsa-sha1`
    - typings.sshpk.sshpkStrings.`dsa-sha256`
    - typings.sshpk.sshpkStrings.`ecdsa-sha1`
    - typings.sshpk.sshpkStrings.`ecdsa-sha256`
    - typings.sshpk.sshpkStrings.`ecdsa-sha384`
    - typings.sshpk.sshpkStrings.`ecdsa-sha512`
    - typings.sshpk.sshpkStrings.`ed25519-sha512`
  */
  trait x509SignAlgorithm extends StObject
  object x509SignAlgorithm {
    
    inline def `dsa-sha1`: typings.sshpk.sshpkStrings.`dsa-sha1` = "dsa-sha1".asInstanceOf[typings.sshpk.sshpkStrings.`dsa-sha1`]
    
    inline def `dsa-sha256`: typings.sshpk.sshpkStrings.`dsa-sha256` = "dsa-sha256".asInstanceOf[typings.sshpk.sshpkStrings.`dsa-sha256`]
    
    inline def `ecdsa-sha1`: typings.sshpk.sshpkStrings.`ecdsa-sha1` = "ecdsa-sha1".asInstanceOf[typings.sshpk.sshpkStrings.`ecdsa-sha1`]
    
    inline def `ecdsa-sha256`: typings.sshpk.sshpkStrings.`ecdsa-sha256` = "ecdsa-sha256".asInstanceOf[typings.sshpk.sshpkStrings.`ecdsa-sha256`]
    
    inline def `ecdsa-sha384`: typings.sshpk.sshpkStrings.`ecdsa-sha384` = "ecdsa-sha384".asInstanceOf[typings.sshpk.sshpkStrings.`ecdsa-sha384`]
    
    inline def `ecdsa-sha512`: typings.sshpk.sshpkStrings.`ecdsa-sha512` = "ecdsa-sha512".asInstanceOf[typings.sshpk.sshpkStrings.`ecdsa-sha512`]
    
    inline def `ed25519-sha512`: typings.sshpk.sshpkStrings.`ed25519-sha512` = "ed25519-sha512".asInstanceOf[typings.sshpk.sshpkStrings.`ed25519-sha512`]
    
    inline def `rsa-md5`: typings.sshpk.sshpkStrings.`rsa-md5` = "rsa-md5".asInstanceOf[typings.sshpk.sshpkStrings.`rsa-md5`]
    
    inline def `rsa-sha1`: typings.sshpk.sshpkStrings.`rsa-sha1` = "rsa-sha1".asInstanceOf[typings.sshpk.sshpkStrings.`rsa-sha1`]
    
    inline def `rsa-sha256`: typings.sshpk.sshpkStrings.`rsa-sha256` = "rsa-sha256".asInstanceOf[typings.sshpk.sshpkStrings.`rsa-sha256`]
    
    inline def `rsa-sha384`: typings.sshpk.sshpkStrings.`rsa-sha384` = "rsa-sha384".asInstanceOf[typings.sshpk.sshpkStrings.`rsa-sha384`]
    
    inline def `rsa-sha512`: typings.sshpk.sshpkStrings.`rsa-sha512` = "rsa-sha512".asInstanceOf[typings.sshpk.sshpkStrings.`rsa-sha512`]
  }
  
  trait x509Signature extends StObject {
    
    var algo: x509SignAlgorithm
    
    var cache: Buffer
    
    var extras: Exts
    
    var signature: Signature
  }
  object x509Signature {
    
    inline def apply(algo: x509SignAlgorithm, cache: Buffer, extras: Exts, signature: Signature): x509Signature = {
      val __obj = js.Dynamic.literal(algo = algo.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], extras = extras.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[x509Signature]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: x509Signature] (val x: Self) extends AnyVal {
      
      inline def setAlgo(value: x509SignAlgorithm): Self = StObject.set(x, "algo", value.asInstanceOf[js.Any])
      
      inline def setCache(value: Buffer): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setExtras(value: Exts): Self = StObject.set(x, "extras", value.asInstanceOf[js.Any])
      
      inline def setSignature(value: Signature): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
  
  trait x509SignatureExt extends StObject {
    
    var bits: js.UndefOr[String] = js.undefined
    
    var critical: Boolean
    
    var data: js.UndefOr[String] = js.undefined
    
    var oid: x509ExtsOid
    
    var pathLen: js.UndefOr[Double] = js.undefined
  }
  object x509SignatureExt {
    
    inline def apply(critical: Boolean, oid: x509ExtsOid): x509SignatureExt = {
      val __obj = js.Dynamic.literal(critical = critical.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any])
      __obj.asInstanceOf[x509SignatureExt]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: x509SignatureExt] (val x: Self) extends AnyVal {
      
      inline def setBits(value: String): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
      
      inline def setBitsUndefined: Self = StObject.set(x, "bits", js.undefined)
      
      inline def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setOid(value: x509ExtsOid): Self = StObject.set(x, "oid", value.asInstanceOf[js.Any])
      
      inline def setPathLen(value: Double): Self = StObject.set(x, "pathLen", value.asInstanceOf[js.Any])
      
      inline def setPathLenUndefined: Self = StObject.set(x, "pathLen", js.undefined)
    }
  }
}
