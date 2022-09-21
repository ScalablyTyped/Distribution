package typings.sshpk.mod

import typings.node.bufferMod.global.Buffer
import typings.sshpk.anon.keyinSignaturePartTypeSig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sshpk", "Signature")
@js.native
open class Signature protected () extends StObject {
  def this(opts: SignatureOptions) = this()
  
  var curve: js.UndefOr[CurveType] = js.native
  
  var hashAlgorithm: js.UndefOr[AlgorithmHashType] = js.native
  
  var part: keyinSignaturePartTypeSig = js.native
  
  var parts: js.Array[SignaturePart] = js.native
  
  def toBuffer(): Buffer = js.native
  def toBuffer(format: SignatureFormatType): Buffer = js.native
  
  def toString(format: SignatureFormatType): String = js.native
  
  var `type`: AlgorithmType = js.native
}
object Signature {
  
  @JSImport("sshpk", "Signature")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def isSignature(obj: Any, ver: Version): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSignature")(obj.asInstanceOf[js.Any], ver.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def parse(data: String, `type`: AlgorithmType, format: SignatureFormatType): Signature = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Signature]
  inline def parse(data: Buffer, `type`: AlgorithmType, format: SignatureFormatType): Signature = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(data.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Signature]
}
