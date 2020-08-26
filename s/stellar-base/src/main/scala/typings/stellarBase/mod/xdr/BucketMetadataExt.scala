package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.BucketMetadataExt")
@js.native
class BucketMetadataExt ()
  extends typings.stellarBase.xdrMod.default.BucketMetadataExt

/* static members */
@JSImport("stellar-base", "xdr.BucketMetadataExt")
@js.native
object BucketMetadataExt extends js.Object {
  def `0`(): typings.stellarBase.xdrMod.xdr.BucketMetadataExt = js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.BucketMetadataExt = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.BucketMetadataExt = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.BucketMetadataExt = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.BucketMetadataExt = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.BucketMetadataExt): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.BucketMetadataExt = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.BucketMetadataExt): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.BucketMetadataExt, io: Buffer): Unit = js.native
}

