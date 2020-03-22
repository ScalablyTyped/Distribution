package typings.ssri.mod

import typings.ssri.AnonOptions
import typings.ssri.AnonOptionsSingle
import typings.ssri.AnonOptionsSingleStrict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssri", "fromHex")
@js.native
object fromHex extends js.Object {
  def apply(hexDigest: String, algorithm: String): IntegrityMap = js.native
  def apply(hexDigest: String, algorithm: String, opts: AnonOptions): IntegrityMap = js.native
  def apply(hexDigest: String, algorithm: String, opts: AnonOptionsSingle): Hash = js.native
  def apply(hexDigest: String, algorithm: String, opts: AnonOptionsSingleStrict): IntegrityMap | Hash = js.native
}

