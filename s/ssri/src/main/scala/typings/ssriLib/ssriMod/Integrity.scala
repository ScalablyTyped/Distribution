package typings
package ssriLib.ssriMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssri", "Integrity")
@js.native
class Integrity () extends js.Object {
  var isIntegrity: scala.Boolean = js.native
  def concat(integrity: java.lang.String): IntegrityMap = js.native
  def concat(integrity: java.lang.String, opts: ssriLib.Anon_Strict): IntegrityMap = js.native
  def concat(integrity: HashLike): IntegrityMap = js.native
  def concat(integrity: HashLike, opts: ssriLib.Anon_Strict): IntegrityMap = js.native
  def concat(integrity: IntegrityLike): IntegrityMap = js.native
  def concat(integrity: IntegrityLike, opts: ssriLib.Anon_Strict): IntegrityMap = js.native
  def hexDigest(): java.lang.String = js.native
  def `match`(integrity: java.lang.String): Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def `match`(integrity: java.lang.String, opts: ssriLib.Anon_Algo1): Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def `match`(integrity: HashLike): Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def `match`(integrity: HashLike, opts: ssriLib.Anon_Algo1): Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def `match`(integrity: IntegrityLike): Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def `match`(integrity: IntegrityLike, opts: ssriLib.Anon_Algo1): Hash | ssriLib.ssriLibNumbers.`false` = js.native
  def pickAlgorithm(): java.lang.String = js.native
  def pickAlgorithm(opts: ssriLib.Anon_Algo1Algo2): java.lang.String = js.native
  def toJSON(): java.lang.String = js.native
  def toString(opts: ssriLib.Anon_Sep): java.lang.String = js.native
}

