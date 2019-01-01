package typings
package readableDashStreamLib.readableDashStreamMod.underscoreReadableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferList[D /* <: safeDashBufferLib.safeDashBufferMod.Buffer */] extends js.Object {
  var head: Entry[D]
  var length: scala.Double
  var tail: Entry[D]
  def clear(): scala.Unit
  def concat(n: scala.Double): D
  def join(s: js.Any): java.lang.String
  def push(v: D): scala.Unit
  def shift(): D
  def unshift(v: D): scala.Unit
}

