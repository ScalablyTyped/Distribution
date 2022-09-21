package typings.sshpk.mod

import typings.node.bufferMod.global.Buffer
import typings.sshpk.anon.keyinAlgorithmTypeKeyPart
import typings.sshpk.mod.Format.WriteOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sshpk", "Key")
@js.native
open class Key protected () extends StObject {
  def this(opts: KeyOptions) = this()
  
  var comment: js.UndefOr[String] = js.native
  
  def createDH(): DiffieHellman = js.native
  
  def createDiffieHellman(): DiffieHellman = js.native
  
  def createVerify(): Verify = js.native
  def createVerify(algo: AlgorithmHashType): Verify = js.native
  
  var curve: js.UndefOr[String] = js.native
  
  def defaultHashAlgorithm(): ShaHashType = js.native
  
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
  
  def toBuffer(format: KeyFormatType): Buffer = js.native
  def toBuffer(format: KeyFormatType, options: WriteOptions): Buffer = js.native
  
  def toString(format: KeyFormatType): String = js.native
  def toString(format: KeyFormatType, options: WriteOptions): String = js.native
  
  var `type`: AlgorithmTypeWithCurve = js.native
}
object Key {
  
  @JSImport("sshpk", "Key")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  /* Inlined {[ key in sshpk.sshpk.KeyFormatType ]: sshpk.sshpk.Format} */
  object formats {
    
    @JSImport("sshpk", "Key.formats")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sshpk", "Key.formats.auto")
    @js.native
    def auto: Format = js.native
    inline def auto_=(x: Format): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("auto")(x.asInstanceOf[js.Any])
    
    @JSImport("sshpk", "Key.formats.dnssec")
    @js.native
    def dnssec: Format = js.native
    inline def dnssec_=(x: Format): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dnssec")(x.asInstanceOf[js.Any])
    
    @JSImport("sshpk", "Key.formats.openssh")
    @js.native
    def openssh: Format = js.native
    inline def openssh_=(x: Format): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("openssh")(x.asInstanceOf[js.Any])
    
    @JSImport("sshpk", "Key.formats.pem")
    @js.native
    def pem: Format = js.native
    inline def pem_=(x: Format): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pem")(x.asInstanceOf[js.Any])
    
    @JSImport("sshpk", "Key.formats.pkcs1")
    @js.native
    def pkcs1: Format = js.native
    inline def pkcs1_=(x: Format): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pkcs1")(x.asInstanceOf[js.Any])
    
    @JSImport("sshpk", "Key.formats.pkcs8")
    @js.native
    def pkcs8: Format = js.native
    inline def pkcs8_=(x: Format): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pkcs8")(x.asInstanceOf[js.Any])
    
    @JSImport("sshpk", "Key.formats.ppk")
    @js.native
    def ppk: Format = js.native
    inline def ppk_=(x: Format): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ppk")(x.asInstanceOf[js.Any])
    
    @JSImport("sshpk", "Key.formats.putty")
    @js.native
    def putty: Format = js.native
    inline def putty_=(x: Format): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("putty")(x.asInstanceOf[js.Any])
    
    @JSImport("sshpk", "Key.formats.rfc4253")
    @js.native
    def rfc4253: Format = js.native
    inline def rfc4253_=(x: Format): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rfc4253")(x.asInstanceOf[js.Any])
    
    @JSImport("sshpk", "Key.formats.ssh")
    @js.native
    def ssh: Format = js.native
    
    @JSImport("sshpk", "Key.formats.ssh-private")
    @js.native
    def sshPrivate: Format = js.native
    
    inline def sshPrivate_=(x: Format): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ssh-private")(x.asInstanceOf[js.Any])
    
    inline def ssh_=(x: Format): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ssh")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  inline def isKey(obj: Any, ver: Version): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isKey")(obj.asInstanceOf[js.Any], ver.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def parse(data: String): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any]).asInstanceOf[Key]
  inline def parse(data: String, format: Unit, options: String): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Key]
  inline def parse(data: String, format: Unit, options: KeyParseOptions): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Key]
  inline def parse(data: String, format: KeyFormatType): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Key]
  inline def parse(data: String, format: KeyFormatType, options: String): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Key]
  inline def parse(data: String, format: KeyFormatType, options: KeyParseOptions): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Key]
  inline def parse(data: Buffer): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any]).asInstanceOf[Key]
  inline def parse(data: Buffer, format: Unit, options: String): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Key]
  inline def parse(data: Buffer, format: Unit, options: KeyParseOptions): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Key]
  inline def parse(data: Buffer, format: KeyFormatType): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Key]
  inline def parse(data: Buffer, format: KeyFormatType, options: String): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Key]
  inline def parse(data: Buffer, format: KeyFormatType, options: KeyParseOptions): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Key]
}
