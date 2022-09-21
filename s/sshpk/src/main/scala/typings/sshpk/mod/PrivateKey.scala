package typings.sshpk.mod

import typings.node.bufferMod.global.Buffer
import typings.sshpk.anon.keyinAlgorithmTypeKeyPart
import typings.sshpk.mod.Format.WriteOptions
import typings.sshpk.sshpkStrings.curve25519
import typings.sshpk.sshpkStrings.ecdsa_
import typings.sshpk.sshpkStrings.ed25519
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sshpk", "PrivateKey")
@js.native
open class PrivateKey protected () extends StObject {
  def this(opts: KeyOptions) = this()
  
  var comment: js.UndefOr[String] = js.native
  
  def createDH(): DiffieHellman = js.native
  
  def createDiffieHellman(): DiffieHellman = js.native
  
  def createSign(hashAlgo: AlgorithmType): Signer = js.native
  
  def createVerify(): Verify = js.native
  def createVerify(algo: AlgorithmHashType): Verify = js.native
  
  var curve: js.UndefOr[String] = js.native
  
  def defaultHashAlgorithm(): ShaHashType = js.native
  
  def derive(newType: ed25519 | curve25519): PrivateKey = js.native
  
  def fingerprint(): Fingerprint = js.native
  def fingerprint(algo: Unit, `type`: FingerprintHashType): Fingerprint = js.native
  def fingerprint(algo: AlgorithmHashType): Fingerprint = js.native
  def fingerprint(algo: AlgorithmHashType, `type`: FingerprintHashType): Fingerprint = js.native
  
  def hash(algo: AlgorithmHashType): Buffer = js.native
  def hash(algo: AlgorithmHashType, `type`: FingerprintHashType): Buffer = js.native
  
  var part: keyinAlgorithmTypeKeyPart = js.native
  
  var parts: js.Array[KeyPart] = js.native
  
  var size: Double = js.native
  
  var source: js.UndefOr[String] = js.native
  
  def toBuffer(format: PrivateKeyFormatType): Buffer = js.native
  def toBuffer(format: PrivateKeyFormatType, options: WriteOptions): Buffer = js.native
  
  def toPublic(): Key = js.native
  
  def toString(format: PrivateKeyFormatType): String = js.native
  def toString(format: PrivateKeyFormatType, options: WriteOptions): String = js.native
  
  var `type`: AlgorithmTypeWithCurve = js.native
}
object PrivateKey {
  
  @JSImport("sshpk", "PrivateKey")
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined {[ key in sshpk.sshpk.PrivateKeyFormatType ]: sshpk.sshpk.Format} */
  object formats {
    
    @JSImport("sshpk", "PrivateKey.formats")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sshpk", "PrivateKey.formats.auto")
    @js.native
    def auto: Format = js.native
    inline def auto_=(x: Format): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("auto")(x.asInstanceOf[js.Any])
    
    @JSImport("sshpk", "PrivateKey.formats.dnssec")
    @js.native
    def dnssec: Format = js.native
    inline def dnssec_=(x: Format): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dnssec")(x.asInstanceOf[js.Any])
    
    @JSImport("sshpk", "PrivateKey.formats.openssh")
    @js.native
    def openssh: Format = js.native
    inline def openssh_=(x: Format): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openssh")(x.asInstanceOf[js.Any])
    
    @JSImport("sshpk", "PrivateKey.formats.pem")
    @js.native
    def pem: Format = js.native
    inline def pem_=(x: Format): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pem")(x.asInstanceOf[js.Any])
    
    @JSImport("sshpk", "PrivateKey.formats.pkcs1")
    @js.native
    def pkcs1: Format = js.native
    inline def pkcs1_=(x: Format): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pkcs1")(x.asInstanceOf[js.Any])
    
    @JSImport("sshpk", "PrivateKey.formats.pkcs8")
    @js.native
    def pkcs8: Format = js.native
    inline def pkcs8_=(x: Format): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pkcs8")(x.asInstanceOf[js.Any])
    
    @JSImport("sshpk", "PrivateKey.formats.rfc4253")
    @js.native
    def rfc4253: Format = js.native
    inline def rfc4253_=(x: Format): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rfc4253")(x.asInstanceOf[js.Any])
    
    @JSImport("sshpk", "PrivateKey.formats.ssh")
    @js.native
    def ssh: Format = js.native
    
    @JSImport("sshpk", "PrivateKey.formats.ssh-private")
    @js.native
    def sshPrivate: Format = js.native
    
    inline def sshPrivate_=(x: Format): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ssh-private")(x.asInstanceOf[js.Any])
    
    inline def ssh_=(x: Format): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ssh")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  inline def generate_ecdsa(`type`: ecdsa_): PrivateKey = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(`type`.asInstanceOf[js.Any]).asInstanceOf[PrivateKey]
  inline def generate_ecdsa(`type`: ecdsa_, options: typings.sshpk.anon.Curve): PrivateKey = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(`type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PrivateKey]
  
  /* static member */
  inline def generate_ed25519(`type`: ed25519): PrivateKey = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(`type`.asInstanceOf[js.Any]).asInstanceOf[PrivateKey]
  
  /* static member */
  inline def isPrivateKey(data: Any, ver: Version): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPrivateKey")(data.asInstanceOf[js.Any], ver.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def parse(data: String): PrivateKey = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any]).asInstanceOf[PrivateKey]
  inline def parse(data: String, format: Unit, options: String): PrivateKey = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PrivateKey]
  inline def parse(data: String, format: Unit, options: KeyParseOptions): PrivateKey = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PrivateKey]
  inline def parse(data: String, format: PrivateKeyFormatType): PrivateKey = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[PrivateKey]
  inline def parse(data: String, format: PrivateKeyFormatType, options: String): PrivateKey = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PrivateKey]
  inline def parse(data: String, format: PrivateKeyFormatType, options: KeyParseOptions): PrivateKey = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PrivateKey]
  inline def parse(data: Buffer): PrivateKey = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any]).asInstanceOf[PrivateKey]
  inline def parse(data: Buffer, format: Unit, options: String): PrivateKey = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PrivateKey]
  inline def parse(data: Buffer, format: Unit, options: KeyParseOptions): PrivateKey = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PrivateKey]
  inline def parse(data: Buffer, format: PrivateKeyFormatType): PrivateKey = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[PrivateKey]
  inline def parse(data: Buffer, format: PrivateKeyFormatType, options: String): PrivateKey = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PrivateKey]
  inline def parse(data: Buffer, format: PrivateKeyFormatType, options: KeyParseOptions): PrivateKey = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PrivateKey]
}
