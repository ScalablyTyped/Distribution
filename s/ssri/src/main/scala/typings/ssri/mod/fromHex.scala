package typings.ssri.mod

import typings.ssri.AnonFalseOptions
import typings.ssri.AnonOptions
import typings.ssri.AnonOptionsSingle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssri", "fromHex")
@js.native
object fromHex extends js.Object {
  def apply(hexDigest: String, algorithm: String): IntegrityMap = js.native
  def apply(hexDigest: String, algorithm: String, opts: AnonFalseOptions): IntegrityMap = js.native
  def apply(hexDigest: String, algorithm: String, opts: AnonOptions): Hash = js.native
  def apply(hexDigest: String, algorithm: String, opts: AnonOptionsSingle): IntegrityMap | Hash = js.native
}

