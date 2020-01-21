package typings.restling.mod

import typings.bluebird.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restling", "patchJson")
@js.native
object patchJson extends js.Object {
  def apply(url: String): ^[RestlingResult] = js.native
  def apply(url: String, data: js.Any): ^[RestlingResult] = js.native
  def apply(url: String, data: js.Any, options: RestlingOptions): ^[RestlingResult] = js.native
}

