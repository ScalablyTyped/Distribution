package typings.ssri.mod

import typings.ssri.Anon0
import typings.ssri.AnonPickAlgorithm
import typings.ssri.AnonSep
import typings.ssri.AnonStrict
import typings.ssri.ssriBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssri", "Integrity")
@js.native
class Integrity () extends js.Object {
  var isIntegrity: Boolean = js.native
  def concat(integrity: String): IntegrityMap = js.native
  def concat(integrity: String, opts: AnonStrict): IntegrityMap = js.native
  def concat(integrity: HashLike): IntegrityMap = js.native
  def concat(integrity: HashLike, opts: AnonStrict): IntegrityMap = js.native
  def concat(integrity: IntegrityLike): IntegrityMap = js.native
  def concat(integrity: IntegrityLike, opts: AnonStrict): IntegrityMap = js.native
  def hexDigest(): String = js.native
  def `match`(integrity: String): Hash | `false` = js.native
  def `match`(integrity: String, opts: AnonPickAlgorithm): Hash | `false` = js.native
  def `match`(integrity: HashLike): Hash | `false` = js.native
  def `match`(integrity: HashLike, opts: AnonPickAlgorithm): Hash | `false` = js.native
  def `match`(integrity: IntegrityLike): Hash | `false` = js.native
  def `match`(integrity: IntegrityLike, opts: AnonPickAlgorithm): Hash | `false` = js.native
  def pickAlgorithm(): String = js.native
  def pickAlgorithm(opts: Anon0): String = js.native
  def toJSON(): String = js.native
  def toString(opts: AnonSep): String = js.native
}

