package typings.snykPythonPlugin.subProcessMod

import typings.node.Buffer
import typings.node.childProcessMod.SpawnOptions
import typings.node.childProcessMod.SpawnSyncReturns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("snyk-python-plugin/dist/dependencies/sub-process", "executeSync")
@js.native
object executeSync extends js.Object {
  def apply(command: String, args: js.Array[String]): SpawnSyncReturns[Buffer] = js.native
  def apply(command: String, args: js.Array[String], options: SpawnOptions): SpawnSyncReturns[Buffer] = js.native
}

