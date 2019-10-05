package typings.restling.restlingMod

import typings.bluebird.bluebirdMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restling", "json")
@js.native
object json extends js.Object {
  def apply(url: String): ^[RestlingResult] = js.native
  def apply(url: String, data: js.Any): ^[RestlingResult] = js.native
  def apply(url: String, data: js.Any, options: RestlingOptions): ^[RestlingResult] = js.native
  def apply(url: String, data: js.Any, options: RestlingOptions, method: String): ^[RestlingResult] = js.native
}

