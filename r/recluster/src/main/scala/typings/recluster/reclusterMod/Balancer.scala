package typings.recluster.reclusterMod

import typings.node.childUnderscoreProcessMod.ChildProcess
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recluster", "Balancer")
@js.native
class Balancer protected () extends EventEmitter {
  def this(file: String, options: BalancerOptions) = this()
  def activeWorkers(): js.Array[ChildProcess] = js.native
  def reload(): Unit = js.native
  def reload(cb: js.Function0[Unit]): Unit = js.native
  def run(): Unit = js.native
  def stop(): Unit = js.native
  def workers(): js.Array[ChildProcess] = js.native
}

