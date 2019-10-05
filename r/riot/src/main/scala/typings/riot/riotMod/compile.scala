package typings.riot.riotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("riot", "compile")
@js.native
object compile extends js.Object {
  def apply(callback: js.Function0[Unit]): Unit = js.native
  def apply(tag: String): String = js.native
  def apply(tag: String, skipExecution: Boolean): String = js.native
  def apply(url: String, callback: js.Function0[Unit]): Unit = js.native
}

