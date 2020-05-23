package typings.ssri.mod

import typings.ssri.anon.Single
import typings.ssri.anon.SingleBoolean
import typings.ssri.anon.SingleStrict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssri", "parse")
@js.native
object parse extends js.Object {
  def apply(sri: String): IntegrityMap = js.native
  def apply(sri: String, opts: Single): IntegrityMap = js.native
  def apply(sri: String, opts: SingleBoolean): IntegrityMap | Hash = js.native
  def apply(sri: String, opts: SingleStrict): Hash = js.native
  def apply(sri: HashLike): IntegrityMap = js.native
  def apply(sri: HashLike, opts: Single): IntegrityMap = js.native
  def apply(sri: HashLike, opts: SingleBoolean): IntegrityMap | Hash = js.native
  def apply(sri: HashLike, opts: SingleStrict): Hash = js.native
  def apply(sri: IntegrityLike): IntegrityMap = js.native
  def apply(sri: IntegrityLike, opts: Single): IntegrityMap = js.native
  def apply(sri: IntegrityLike, opts: SingleBoolean): IntegrityMap | Hash = js.native
  def apply(sri: IntegrityLike, opts: SingleStrict): Hash = js.native
}

