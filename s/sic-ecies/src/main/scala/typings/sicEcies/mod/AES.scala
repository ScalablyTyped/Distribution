package typings.sicEcies.mod

import org.scalablytyped.runtime.TopLevel
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AES extends js.Object {
  
  def apply(): AES = js.native
  
  def buf2words(buf: Buffer): js.Array[Double] = js.native
  
  def decrypt(encbuf: Buffer, keybuf: Buffer): Buffer = js.native
  
  def encrypt(messagebuf: Buffer, keybuf: Buffer): Buffer = js.native
  
  def words2buf(words: js.Array[Double]): Buffer = js.native
}
@JSImport("sic-ecies", "AES")
@js.native
object AES extends TopLevel[AES]
