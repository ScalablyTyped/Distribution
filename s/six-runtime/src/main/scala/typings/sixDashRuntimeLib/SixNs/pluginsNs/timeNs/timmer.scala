package typings
package sixDashRuntimeLib.SixNs.pluginsNs.timeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait timmer extends js.Object {
  def end(key: java.lang.String): scala.Double = js.native
  def now(): js.Any = js.native
  def serialize(): java.lang.String = js.native
  def serialize(between: java.lang.String): java.lang.String = js.native
  def serialize(between: java.lang.String, end: java.lang.String): java.lang.String = js.native
  def serialize(between: java.lang.String, end: java.lang.String, filter: filter): java.lang.String = js.native
  def start(key: java.lang.String): scala.Unit = js.native
}

