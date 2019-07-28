package typings.ssri.ssriMod

import typings.ssri.Anon_Algo1
import typings.ssri.Anon_Algo1Algo2
import typings.ssri.Anon_Sep
import typings.ssri.Anon_Strict
import typings.ssri.ssriNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssri", "Integrity")
@js.native
class Integrity () extends js.Object {
  var isIntegrity: Boolean = js.native
  def concat(integrity: String): IntegrityMap = js.native
  def concat(integrity: String, opts: Anon_Strict): IntegrityMap = js.native
  def concat(integrity: HashLike): IntegrityMap = js.native
  def concat(integrity: HashLike, opts: Anon_Strict): IntegrityMap = js.native
  def concat(integrity: IntegrityLike): IntegrityMap = js.native
  def concat(integrity: IntegrityLike, opts: Anon_Strict): IntegrityMap = js.native
  def hexDigest(): String = js.native
  def `match`(integrity: String): Hash | `false` = js.native
  def `match`(integrity: String, opts: Anon_Algo1): Hash | `false` = js.native
  def `match`(integrity: HashLike): Hash | `false` = js.native
  def `match`(integrity: HashLike, opts: Anon_Algo1): Hash | `false` = js.native
  def `match`(integrity: IntegrityLike): Hash | `false` = js.native
  def `match`(integrity: IntegrityLike, opts: Anon_Algo1): Hash | `false` = js.native
  def pickAlgorithm(): String = js.native
  def pickAlgorithm(opts: Anon_Algo1Algo2): String = js.native
  def toJSON(): String = js.native
  def toString(opts: Anon_Sep): String = js.native
}

