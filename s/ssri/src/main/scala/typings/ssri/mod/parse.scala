package typings.ssri.mod

import typings.ssri.anon.Single
import typings.ssri.anon.SingleStrict
import typings.ssri.anon.StrictBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssri", "parse")
@js.native
object parse extends js.Object {
  def apply(sri: String): IntegrityMap = js.native
  def apply(sri: String, opts: Single): IntegrityMap | Hash = js.native
  def apply(sri: String, opts: SingleStrict): IntegrityMap = js.native
  def apply(sri: String, opts: StrictBoolean): Hash = js.native
  def apply(sri: HashLike): IntegrityMap = js.native
  def apply(sri: HashLike, opts: Single): IntegrityMap | Hash = js.native
  def apply(sri: HashLike, opts: SingleStrict): IntegrityMap = js.native
  def apply(sri: HashLike, opts: StrictBoolean): Hash = js.native
  def apply(sri: IntegrityLike): IntegrityMap = js.native
  def apply(sri: IntegrityLike, opts: Single): IntegrityMap | Hash = js.native
  def apply(sri: IntegrityLike, opts: SingleStrict): IntegrityMap = js.native
  def apply(sri: IntegrityLike, opts: StrictBoolean): Hash = js.native
}

