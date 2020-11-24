package typings.ssri.mod

import typings.ssri.anon.Options
import typings.ssri.anon.OptionsSingle
import typings.ssri.anon.OptionsSingleStrict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ssri", "fromHex")
@js.native
object fromHex extends js.Object {
  
  def apply(hexDigest: String, algorithm: String): IntegrityMap = js.native
  def apply(hexDigest: String, algorithm: String, opts: Options): IntegrityMap = js.native
  def apply(hexDigest: String, algorithm: String, opts: OptionsSingle): Hash = js.native
  def apply(hexDigest: String, algorithm: String, opts: OptionsSingleStrict): IntegrityMap | Hash = js.native
}
