package typings.ssri.mod

import typings.ssri.AnonSingle
import typings.ssri.AnonSingleBoolean
import typings.ssri.AnonSingleStrict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssri", "parse")
@js.native
object parse extends js.Object {
  def apply(sri: String): IntegrityMap = js.native
  def apply(sri: String, opts: AnonSingle): IntegrityMap = js.native
  def apply(sri: String, opts: AnonSingleBoolean): IntegrityMap | Hash = js.native
  def apply(sri: String, opts: AnonSingleStrict): Hash = js.native
  def apply(sri: HashLike): IntegrityMap = js.native
  def apply(sri: HashLike, opts: AnonSingle): IntegrityMap = js.native
  def apply(sri: HashLike, opts: AnonSingleBoolean): IntegrityMap | Hash = js.native
  def apply(sri: HashLike, opts: AnonSingleStrict): Hash = js.native
  def apply(sri: IntegrityLike): IntegrityMap = js.native
  def apply(sri: IntegrityLike, opts: AnonSingle): IntegrityMap = js.native
  def apply(sri: IntegrityLike, opts: AnonSingleBoolean): IntegrityMap | Hash = js.native
  def apply(sri: IntegrityLike, opts: AnonSingleStrict): Hash = js.native
}

