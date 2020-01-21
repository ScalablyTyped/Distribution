package typings.promptSyncHistory

import typings.promptSync.mod.History
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prompt-sync-history", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(): History = js.native
  def apply(file: String): History = js.native
  def apply(file: String, max: Double): History = js.native
}

