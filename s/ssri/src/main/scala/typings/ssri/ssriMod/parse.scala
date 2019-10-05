package typings.ssri.ssriMod

import typings.ssri.Anon_False
import typings.ssri.Anon_Single
import typings.ssri.Anon_SingleStrict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssri", "parse")
@js.native
object parse extends js.Object {
  def apply(sri: String): IntegrityMap | Hash = js.native
  def apply(sri: String, opts: Anon_False): IntegrityMap = js.native
  def apply(sri: String, opts: Anon_Single): Hash = js.native
  def apply(sri: String, opts: Anon_SingleStrict): IntegrityMap | Hash = js.native
  def apply(sri: HashLike): IntegrityMap | Hash = js.native
  def apply(sri: HashLike, opts: Anon_False): IntegrityMap = js.native
  def apply(sri: HashLike, opts: Anon_Single): Hash = js.native
  def apply(sri: HashLike, opts: Anon_SingleStrict): IntegrityMap | Hash = js.native
  def apply(sri: IntegrityLike): IntegrityMap | Hash = js.native
  def apply(sri: IntegrityLike, opts: Anon_False): IntegrityMap = js.native
  def apply(sri: IntegrityLike, opts: Anon_Single): Hash = js.native
  def apply(sri: IntegrityLike, opts: Anon_SingleStrict): IntegrityMap | Hash = js.native
}

