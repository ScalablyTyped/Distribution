package typings.statMode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stat-mode", "RWX")
@js.native
class RWX protected () extends js.Object {
  def this(stat: StatsMode) = this()
  var stat: js.Any = js.native
  def execute: Boolean = js.native
  def execute_=(v: Boolean): Unit = js.native
  def read: Boolean = js.native
  def read_=(v: Boolean): Unit = js.native
  def write: Boolean = js.native
  def write_=(v: Boolean): Unit = js.native
}

/* static members */
@JSImport("stat-mode", "RWX")
@js.native
object RWX extends js.Object {
  var r: Double = js.native
  var w: Double = js.native
  var x: Double = js.native
}

