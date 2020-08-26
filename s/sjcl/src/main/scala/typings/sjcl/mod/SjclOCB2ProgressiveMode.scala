package typings.sjcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SjclOCB2ProgressiveMode extends js.Object {
  def createDecryptor(prp: SjclCipher, iv: BitArray_): SjclOCB2ProgressiveProcessor = js.native
  def createDecryptor(
    prp: SjclCipher,
    iv: BitArray_,
    adata: js.UndefOr[scala.Nothing],
    tlen: js.UndefOr[scala.Nothing],
    premac: Boolean
  ): SjclOCB2ProgressiveProcessor = js.native
  def createDecryptor(prp: SjclCipher, iv: BitArray_, adata: js.UndefOr[scala.Nothing], tlen: Double): SjclOCB2ProgressiveProcessor = js.native
  def createDecryptor(prp: SjclCipher, iv: BitArray_, adata: js.UndefOr[scala.Nothing], tlen: Double, premac: Boolean): SjclOCB2ProgressiveProcessor = js.native
  def createDecryptor(prp: SjclCipher, iv: BitArray_, adata: BitArray_): SjclOCB2ProgressiveProcessor = js.native
  def createDecryptor(prp: SjclCipher, iv: BitArray_, adata: BitArray_, tlen: js.UndefOr[scala.Nothing], premac: Boolean): SjclOCB2ProgressiveProcessor = js.native
  def createDecryptor(prp: SjclCipher, iv: BitArray_, adata: BitArray_, tlen: Double): SjclOCB2ProgressiveProcessor = js.native
  def createDecryptor(prp: SjclCipher, iv: BitArray_, adata: BitArray_, tlen: Double, premac: Boolean): SjclOCB2ProgressiveProcessor = js.native
  def createEncryptor(prp: SjclCipher, iv: BitArray_): SjclOCB2ProgressiveProcessor = js.native
  def createEncryptor(
    prp: SjclCipher,
    iv: BitArray_,
    adata: js.UndefOr[scala.Nothing],
    tlen: js.UndefOr[scala.Nothing],
    premac: Boolean
  ): SjclOCB2ProgressiveProcessor = js.native
  def createEncryptor(prp: SjclCipher, iv: BitArray_, adata: js.UndefOr[scala.Nothing], tlen: Double): SjclOCB2ProgressiveProcessor = js.native
  def createEncryptor(prp: SjclCipher, iv: BitArray_, adata: js.UndefOr[scala.Nothing], tlen: Double, premac: Boolean): SjclOCB2ProgressiveProcessor = js.native
  def createEncryptor(prp: SjclCipher, iv: BitArray_, adata: BitArray_): SjclOCB2ProgressiveProcessor = js.native
  def createEncryptor(prp: SjclCipher, iv: BitArray_, adata: BitArray_, tlen: js.UndefOr[scala.Nothing], premac: Boolean): SjclOCB2ProgressiveProcessor = js.native
  def createEncryptor(prp: SjclCipher, iv: BitArray_, adata: BitArray_, tlen: Double): SjclOCB2ProgressiveProcessor = js.native
  def createEncryptor(prp: SjclCipher, iv: BitArray_, adata: BitArray_, tlen: Double, premac: Boolean): SjclOCB2ProgressiveProcessor = js.native
}

