package typings.sshpk.mod

import typings.node.bufferMod.global.Buffer
import typings.sshpk.sshpkStrings.base64
import typings.sshpk.sshpkStrings.hex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sshpk", "Fingerprint")
@js.native
open class Fingerprint protected () extends StObject {
  def this(opts: FingerprintOptions) = this()
  
  var algorithm: AlgorithmHashType = js.native
  
  var hash: Buffer = js.native
  
  def matches(other: Certificate): Boolean = js.native
  def matches(other: Key): Boolean = js.native
  def matches(other: PrivateKey): Boolean = js.native
  
  def toString(format: hex | base64): String = js.native
  
  var `type`: FingerprintType = js.native
}
object Fingerprint {
  
  @JSImport("sshpk", "Fingerprint")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def isFingerprint(obj: Any, ver: Version): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFingerprint")(obj.asInstanceOf[js.Any], ver.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def parse(fp: String): Fingerprint = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(fp.asInstanceOf[js.Any]).asInstanceOf[Fingerprint]
  inline def parse(fp: String, options: js.Array[String]): Fingerprint = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(fp.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Fingerprint]
  inline def parse(fp: String, options: FingerprintParseOptions): Fingerprint = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(fp.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Fingerprint]
}
