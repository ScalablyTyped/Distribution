package typings.ssri.mod

import typings.ssri.AnonFalse
import typings.ssri.AnonSingle
import typings.ssri.AnonSingleStrict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssri", "parse")
@js.native
object parse extends js.Object {
  def apply(sri: String): IntegrityMap = js.native
  def apply(sri: String, opts: AnonFalse): IntegrityMap = js.native
  def apply(sri: String, opts: AnonSingle): Hash = js.native
  def apply(sri: String, opts: AnonSingleStrict): IntegrityMap | Hash = js.native
  def apply(sri: HashLike): IntegrityMap = js.native
  def apply(sri: HashLike, opts: AnonFalse): IntegrityMap = js.native
  def apply(sri: HashLike, opts: AnonSingle): Hash = js.native
  def apply(sri: HashLike, opts: AnonSingleStrict): IntegrityMap | Hash = js.native
  def apply(sri: IntegrityLike): IntegrityMap = js.native
  def apply(sri: IntegrityLike, opts: AnonFalse): IntegrityMap = js.native
  def apply(sri: IntegrityLike, opts: AnonSingle): Hash = js.native
  def apply(sri: IntegrityLike, opts: AnonSingleStrict): IntegrityMap | Hash = js.native
}

