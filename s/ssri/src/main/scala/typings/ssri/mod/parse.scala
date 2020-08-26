package typings.ssri.mod

import typings.ssri.anon.Single
import typings.ssri.anon.SingleStrict
import typings.ssri.anon.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssri", "parse")
@js.native
object parse extends js.Object {
  def apply(sri: String): IntegrityMap = js.native
  def apply(sri: String, opts: Single): IntegrityMap | Hash = js.native
  def apply(sri: String, opts: SingleStrict): IntegrityMap = js.native
  def apply(sri: String, opts: `1`): Hash = js.native
  def apply(sri: HashLike): IntegrityMap = js.native
  def apply(sri: HashLike, opts: Single): IntegrityMap | Hash = js.native
  def apply(sri: HashLike, opts: SingleStrict): IntegrityMap = js.native
  def apply(sri: HashLike, opts: `1`): Hash = js.native
  def apply(sri: IntegrityLike): IntegrityMap = js.native
  def apply(sri: IntegrityLike, opts: Single): IntegrityMap | Hash = js.native
  def apply(sri: IntegrityLike, opts: SingleStrict): IntegrityMap = js.native
  def apply(sri: IntegrityLike, opts: `1`): Hash = js.native
}

