package typings.ssri.mod

import typings.ssri.AnonAlgo1
import typings.ssri.AnonAlgo1Algo2
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
  def `match`(integrity: String, opts: AnonAlgo1): Hash | `false` = js.native
  def `match`(integrity: HashLike): Hash | `false` = js.native
  def `match`(integrity: HashLike, opts: AnonAlgo1): Hash | `false` = js.native
  def `match`(integrity: IntegrityLike): Hash | `false` = js.native
  def `match`(integrity: IntegrityLike, opts: AnonAlgo1): Hash | `false` = js.native
  def pickAlgorithm(): String = js.native
  def pickAlgorithm(opts: AnonAlgo1Algo2): String = js.native
  def toJSON(): String = js.native
  def toString(opts: AnonSep): String = js.native
}

