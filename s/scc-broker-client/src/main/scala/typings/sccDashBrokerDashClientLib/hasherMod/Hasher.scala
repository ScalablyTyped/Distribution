package typings
package sccDashBrokerDashClientLib.hasherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hasher extends js.Object {
  def hashToHex(key: java.lang.String): java.lang.String = js.native
  def hashToHex(key: java.lang.String, algorithm: java.lang.String): java.lang.String = js.native
  def hashToIndex(key: java.lang.String, modulo: scala.Double): scala.Double = js.native
}

