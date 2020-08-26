package typings.sccBrokerClient.hasherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hasher extends js.Object {
  def hashToHex(key: String): String = js.native
  def hashToHex(key: String, algorithm: String): String = js.native
  def hashToIndex(key: js.UndefOr[scala.Nothing], modulo: Double): Double = js.native
  def hashToIndex(key: String, modulo: Double): Double = js.native
  def hashToIndex(key: Null, modulo: Double): Double = js.native
}

