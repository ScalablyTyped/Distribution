package typings.ssri.ssriMod

import typings.ssri.Anon_FalseOptions
import typings.ssri.Anon_Options
import typings.ssri.Anon_OptionsSingle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssri", "fromHex")
@js.native
object fromHex extends js.Object {
  def apply(hexDigest: String, algorithm: String): IntegrityMap | Hash = js.native
  def apply(hexDigest: String, algorithm: String, opts: Anon_FalseOptions): IntegrityMap = js.native
  def apply(hexDigest: String, algorithm: String, opts: Anon_Options): Hash = js.native
  def apply(hexDigest: String, algorithm: String, opts: Anon_OptionsSingle): IntegrityMap | Hash = js.native
}

