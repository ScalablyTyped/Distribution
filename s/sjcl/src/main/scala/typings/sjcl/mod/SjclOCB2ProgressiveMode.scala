package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SjclOCB2ProgressiveMode extends StObject {
  
  def createDecryptor(prp: SjclCipher, iv: BitArray_): SjclOCB2ProgressiveProcessor = js.native
  def createDecryptor(prp: SjclCipher, iv: BitArray_, adata: Unit, tlen: Double): SjclOCB2ProgressiveProcessor = js.native
  def createDecryptor(prp: SjclCipher, iv: BitArray_, adata: Unit, tlen: Double, premac: Boolean): SjclOCB2ProgressiveProcessor = js.native
  def createDecryptor(prp: SjclCipher, iv: BitArray_, adata: Unit, tlen: Unit, premac: Boolean): SjclOCB2ProgressiveProcessor = js.native
  def createDecryptor(prp: SjclCipher, iv: BitArray_, adata: BitArray_): SjclOCB2ProgressiveProcessor = js.native
  def createDecryptor(prp: SjclCipher, iv: BitArray_, adata: BitArray_, tlen: Double): SjclOCB2ProgressiveProcessor = js.native
  def createDecryptor(prp: SjclCipher, iv: BitArray_, adata: BitArray_, tlen: Double, premac: Boolean): SjclOCB2ProgressiveProcessor = js.native
  def createDecryptor(prp: SjclCipher, iv: BitArray_, adata: BitArray_, tlen: Unit, premac: Boolean): SjclOCB2ProgressiveProcessor = js.native
  
  def createEncryptor(prp: SjclCipher, iv: BitArray_): SjclOCB2ProgressiveProcessor = js.native
  def createEncryptor(prp: SjclCipher, iv: BitArray_, adata: Unit, tlen: Double): SjclOCB2ProgressiveProcessor = js.native
  def createEncryptor(prp: SjclCipher, iv: BitArray_, adata: Unit, tlen: Double, premac: Boolean): SjclOCB2ProgressiveProcessor = js.native
  def createEncryptor(prp: SjclCipher, iv: BitArray_, adata: Unit, tlen: Unit, premac: Boolean): SjclOCB2ProgressiveProcessor = js.native
  def createEncryptor(prp: SjclCipher, iv: BitArray_, adata: BitArray_): SjclOCB2ProgressiveProcessor = js.native
  def createEncryptor(prp: SjclCipher, iv: BitArray_, adata: BitArray_, tlen: Double): SjclOCB2ProgressiveProcessor = js.native
  def createEncryptor(prp: SjclCipher, iv: BitArray_, adata: BitArray_, tlen: Double, premac: Boolean): SjclOCB2ProgressiveProcessor = js.native
  def createEncryptor(prp: SjclCipher, iv: BitArray_, adata: BitArray_, tlen: Unit, premac: Boolean): SjclOCB2ProgressiveProcessor = js.native
}
