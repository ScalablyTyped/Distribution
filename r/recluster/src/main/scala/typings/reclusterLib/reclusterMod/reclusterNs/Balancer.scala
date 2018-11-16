package typings
package reclusterLib.reclusterMod.reclusterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Balancer extends js.Object {
  def activeWorkers(): js.Array[nodeLib.childUnderscoreProcessMod.ChildProcess] = js.native
  def reload(): scala.Unit = js.native
  def reload(cb: js.Function0[scala.Unit]): scala.Unit = js.native
  def run(): scala.Unit = js.native
  def stop(): scala.Unit = js.native
  def workers(): js.Array[nodeLib.childUnderscoreProcessMod.ChildProcess] = js.native
}

