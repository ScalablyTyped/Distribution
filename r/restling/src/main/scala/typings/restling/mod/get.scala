package typings.restling.mod

import typings.bluebird.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("restling", "get")
@js.native
object get extends js.Object {
  def apply(url: String): ^[RestlingResult] = js.native
  def apply(url: String, options: RestlingOptions): ^[RestlingResult] = js.native
}

